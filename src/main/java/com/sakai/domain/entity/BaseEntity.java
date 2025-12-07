package com.sakai.domain.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(of = "id")
public abstract class BaseEntity<ID> {
    protected final ID id;
    protected BaseEntity(ID id) { this.id = id; }
}