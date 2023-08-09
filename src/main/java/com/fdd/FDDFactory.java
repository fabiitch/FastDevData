package com.fdd;

import com.fdd.factory.FieldRule;
import com.fdd.factory.FieldRules;

import java.util.ArrayList;
import java.util.List;

public class FDDFactory<T> {

    Class<T> dataClass;
    List<FieldRules> rules = new ArrayList<>();

    public FDDFactory(Class<T> dataClass) {
        this.dataClass = dataClass;
    }


    public FDDFactory addRule(String field, FieldRule... rules) {

    }

    public T get() {
        return null;
    }
}
