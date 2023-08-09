package com.fdd;

public class FDD {

    public static void setKey(String apiKey) {
    }

    public static <T> T fill(T data) {
        return null;
    }

    public static <T> T reset(T data) {
        return null;
    }

    public static <T> FDDFactory<T> factory(Class<T> dataClass) {
        return new FDDFactory<>(dataClass);
    }
}
