package com.example;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class MainPojo {

    public static Builder builder() {
        return new AutoValue_MainPojo.Builder();
    }

    public abstract String id();

    @AutoValue.Builder
    public static abstract class Builder {

        public abstract Builder id(final String id);

        public abstract MainPojo build();
    }
}
