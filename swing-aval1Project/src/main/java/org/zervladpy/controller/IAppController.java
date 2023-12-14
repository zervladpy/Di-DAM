package org.zervladpy.controller;

import org.zervladpy.data.local.IDAO;
import org.zervladpy.presentation.event.FormEvent;

import java.util.List;

public interface IAppController<T> {

    void setDao(IDAO<T> dao);
    List<T> getAll();

    void add(FormEvent event);

}
