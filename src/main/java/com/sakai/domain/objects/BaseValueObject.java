package com.sakai.domain.objects;

import java.lang.reflect.Field;
import java.util.Arrays;

public abstract class BaseValueObject {

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(getFieldValues(), ((BaseValueObject) obj).getFieldValues());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getFieldValues());
    }

    private Object[] getFieldValues() {
        Field[] fields = this.getClass().getDeclaredFields();
        Object[] values = new Object[fields.length];
        for (int i = 0; i < fields.length; i++) {
            try {
                fields[i].setAccessible(true);
                values[i] = fields[i].get(this);
            } catch (IllegalAccessException e) {
                values[i] = null;
            }
        }
        return values;
    }
}
