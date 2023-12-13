package org.zervladpy.controller.listener;

import java.util.EventListener;

public interface StringListener extends EventListener {
    void emit(String text);
}
