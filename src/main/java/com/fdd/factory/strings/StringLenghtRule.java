package com.fdd.factory.strings;

import com.fdd.factory.FieldRule;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class StringLenghtRule implements FieldRule {

    private int min, max;
}
