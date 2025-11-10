package domain.events;

import java.time.Instant;

public interface DomainEvent {
    Instant occurredAt();
    String eventType();
}