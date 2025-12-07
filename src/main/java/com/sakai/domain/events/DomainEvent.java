package com.sakai.domain.events;

import java.time.Instant;

public abstract class DomainEvent {
    Instant occurredAt;
    String eventType;
}