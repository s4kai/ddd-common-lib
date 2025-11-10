package domain.entity;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class AggregateRoot<ID> extends BaseEntity<ID> {
    private final List<Object> domainEvents = new CopyOnWriteArrayList<>();

    protected AggregateRoot(ID id) {
        super(id);
    }

    public void addDomainEvent(Object event) {
        domainEvents.add(event);
    }

    public List<Object> getDomainEvents() {
        return Collections.unmodifiableList(domainEvents);
    }

    public void clearDomainEvents() {
        domainEvents.clear();
    }
}
