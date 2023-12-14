package org.zervladpy.controller.event;

import org.zervladpy.controller.listener.StringListener;

import java.util.EventObject;

public class FormEvent extends EventObject {

    private String name;
    private String occupation;

    public FormEvent(Object source) {
        super(source);
    }

    public FormEvent(Object source, String name, String occupation) {
        super(source);
        this.name = name;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }
}
