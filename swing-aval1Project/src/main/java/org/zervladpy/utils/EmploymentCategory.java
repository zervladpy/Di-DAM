package org.zervladpy.utils;

public enum EmploymentCategory {
    EMPLOYED, SELF_EMPLOYED, UNEMPLOYED, OTHER;

    public static EmploymentCategory fromIndex(int index) {
        try {
            return EmploymentCategory.values()[index];
        } catch (IndexOutOfBoundsException ignore) {
        }
        return null;
    }
}
