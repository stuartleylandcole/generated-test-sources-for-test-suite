package com.example;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ComponentTestPojo {

    public static Builder builder() {
        return new AutoValue_ComponentTestPojo.Builder();
    }

    public abstract String id();

    @AutoValue.Builder
    public static abstract class Builder {

        public abstract Builder id(final String id);

        public abstract ComponentTestPojo build();
    }
}
