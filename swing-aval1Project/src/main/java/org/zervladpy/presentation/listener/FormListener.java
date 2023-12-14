package org.zervladpy.presentation.listener;

import org.zervladpy.presentation.event.FormEvent;

import java.util.EventListener;

public interface FormListener extends EventListener {
    void emit(FormEvent event);
}
