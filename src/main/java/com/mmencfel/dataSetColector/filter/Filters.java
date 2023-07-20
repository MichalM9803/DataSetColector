package com.mmencfel.dataSetColector.filter;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public enum Filters {
    ALL, LED, OTHER;


    public static Set<Integer> getClassList(Filters param) {
        switch (param) {
            case ALL:
                return new HashSet<>(Arrays.asList(0, 1));

            case LED:
                return new HashSet<>(Collections.singletonList(1));
            case OTHER:
                return new HashSet<>(Collections.singletonList(0));

            default:
                return new HashSet<>(Collections.singletonList(-1));

        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
