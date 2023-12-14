package org.zervladpy.data.model;

public class Age {
    private final int id;
    private final String value;
    public Age(int id, String value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

}
