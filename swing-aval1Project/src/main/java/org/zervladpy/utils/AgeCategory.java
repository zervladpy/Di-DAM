package org.zervladpy.utils;

import org.zervladpy.data.model.Age;

public enum AgeCategory {
    CHILD, ADULT, SENIOR;

    public static AgeCategory fromIndex(int index) {
        try {
            return AgeCategory.values()[index];
        } catch (IndexOutOfBoundsException ignore) {
        }
        return null;
    }
}
