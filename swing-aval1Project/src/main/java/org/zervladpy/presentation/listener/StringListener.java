package org.zervladpy.presentation.listener;

import org.zervladpy.presentation.event.StringEvent;

import java.util.EventListener;

public interface StringListener extends EventListener {
    void emit(StringEvent event);
}
