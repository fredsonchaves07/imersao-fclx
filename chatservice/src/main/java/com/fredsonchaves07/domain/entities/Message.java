package com.fredsonchaves07.domain.entities;

import com.fredsonchaves07.domain.entities.exceptions.ContentEmptyException;
import com.fredsonchaves07.domain.entities.exceptions.InvalidRoleException;
import com.knuddels.jtokkit.Encodings;
import com.knuddels.jtokkit.api.Encoding;
import com.knuddels.jtokkit.api.EncodingRegistry;
import com.knuddels.jtokkit.api.ModelType;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

public class Message {

    private UUID id;

    private String role;

    private String content;

    private int tokens;

    private Model model;

    private LocalDateTime createdAt;

    public Message(String role, String content, Model model) {
        Encoding encoding = Encodings.newDefaultEncodingRegistry().getEncodingForModel(ModelType.valueOf(model.getName()));
        this.id = UUID.randomUUID();
        this.role = role;
        this.content = content;
        this.tokens = encoding.countTokens(content);
        this.model = model;
        this.createdAt = LocalDateTime.now();
        validate();
    }

    private void validate() {
        if (!role.equals("user") && !role.equals("system") && !role.equals("assistante"))
            throw new InvalidRoleException();
        if (content.equals(""))
            throw new ContentEmptyException();
    }
}
