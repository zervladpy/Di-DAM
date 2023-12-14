package org.zervladpy.controller.listener;

import org.zervladpy.controller.event.StringEvent;

import java.util.EventListener;

public interface StringListener extends EventListener {
    void emit(StringEvent event);
}
