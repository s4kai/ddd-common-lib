package com.sakai.domain.events;

import com.sakai.domain.entity.AggregateRoot;

public interface DomainEventPublisher {
    void publish(DomainEvent event);
    void publish(AggregateRoot<?> aggregateRoot);
}