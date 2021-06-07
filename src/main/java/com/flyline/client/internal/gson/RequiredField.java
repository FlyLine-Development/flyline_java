package com.flyline.client.internal.gson;

public final class RequiredField<T> {
    private final T value;

    private static final RequiredField<Object> EMPTY = new RequiredField<>(null);

    private RequiredField(T value) {
        this.value = value;
    }

    @SuppressWarnings("unchecked")
    public static <T> RequiredField<T> empty() {
        return (RequiredField<T>) EMPTY;
    }

    public static <T, S extends T> RequiredField<T> of(S value) {
        return new RequiredField<T>(value);
    }

    public boolean isPresent() {
        return value != null;
    }

    public T get() {
        return value;
    }
}
