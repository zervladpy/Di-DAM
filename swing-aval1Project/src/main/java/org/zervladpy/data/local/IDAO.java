package org.zervladpy.data.local;

import org.zervladpy.Main;

import java.util.List;

public interface IDAO<T> {
    List<T> getAll();
    void add(T model);
}
