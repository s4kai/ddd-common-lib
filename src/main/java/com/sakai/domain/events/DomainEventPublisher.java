package com.sakai.domain.events;

import java.util.List;

public interface DomainEventPublisher {
    void publish(DomainEvent event);
    void publishAllEvents(List<DomainEvent> events);
}