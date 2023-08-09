package com.fdd.factory.strings;

public class StringRules {


    public StringLenghtRule size(int min, int max) {
        return new StringLenghtRule(min, max);
    }

    public StringLenghtRule max(int max) {
        return new StringLenghtRule(0, max);
    }

    public StringLenghtRule min(int min) {
        return new StringLenghtRule(min, 0);
    }

    public StringLenghtRule noSpecialChars() {
    }

    public StringLenghtRule noDigit() {
    }

    public StringLenghtRule onlyDigit() {
    }

    public StringLenghtRule floatValue() {
    }
}
