package com.sakai.domain.events;

import java.io.Serializable;
import java.time.Instant;

public abstract class DomainEvent  implements Serializable {
    Instant occurredAt;
    String eventType;
}
