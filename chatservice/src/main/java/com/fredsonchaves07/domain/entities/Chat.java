package com.fredsonchaves07.domain.entities;

import java.util.List;
import java.util.UUID;

public class Chat {

    public record ChatConfig(
            Model model,
            double temperature,
            double topP,
            int n,
            List<String> stop,
            int maxTokens,
            double presencePenalty,
            double frequencyPenalty
    ){}

    private UUID id;

    private String userId;

    private Message initialSystemMessage;

    private List<Message> messages;

    private List<Message> erasedMessages;

    private String status;

    private int tokenUsage;

    private ChatConfig chatConfig;
}
