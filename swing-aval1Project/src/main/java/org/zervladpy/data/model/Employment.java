package org.zervladpy.data.model;

public class Employment {

    private final int id;
    private final String value;

    public Employment(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
