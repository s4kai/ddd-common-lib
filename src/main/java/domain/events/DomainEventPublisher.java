package domain.events;

import domain.entity.AggregateRoot;

public interface DomainEventPublisher {
    void publish(DomainEvent event);
    void publish(AggregateRoot<?> aggregateRoot);
}