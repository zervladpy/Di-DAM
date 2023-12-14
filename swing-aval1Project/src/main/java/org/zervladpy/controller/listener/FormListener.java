package org.zervladpy.controller.listener;

import org.zervladpy.controller.event.FormEvent;

import java.awt.event.ActionListener;
import java.util.EventListener;

public interface FormListener extends EventListener {
    void emit(FormEvent event);
}
