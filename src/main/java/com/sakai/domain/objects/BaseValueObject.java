package com.sakai.domain.objects;

import lombok.Getter;

import java.util.Objects;

public abstract class BaseValueObject {

    @Override
    public boolean equals(Object obj) {
        return obj != null
                && this.getClass() == obj.getClass()
                && Objects.equals(this.toString(), obj.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.toString());
    }
}
