package domain.entity;

import domain.events.DomainEvent;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class AggregateRoot<ID> extends BaseEntity<ID> {
    private final List<DomainEvent> domainEvents = new ArrayList<>();

    protected AggregateRoot(ID id) {
        super(id);
    }

    public void addDomainEvent(DomainEvent event) {
        domainEvents.add(event);
    }
    public void clearDomainEvents() {
        domainEvents.clear();
    }
}
