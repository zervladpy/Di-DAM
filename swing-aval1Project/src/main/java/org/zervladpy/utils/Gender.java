package org.zervladpy.utils;

public enum Gender {
    MALE, FEMALE;

    public static Gender fromIndex(int index) {
        try {
            return Gender.values()[index];
        } catch (IndexOutOfBoundsException ignored) {
            return null;
        }
    }
}
