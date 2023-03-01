package com.blu.reactive.rsocket.server.data;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private String origin;
    private String interaction;
    private long index;
    private long created = Instant.now().getEpochSecond();

    public Message(String origin, String interaction, long index) {
        this.origin = origin;
        this.interaction = interaction;
        this.index = index;
    }

    public Message(String origin, String interaction) {
        this.origin = origin;
        this.interaction = interaction;
    }
}
