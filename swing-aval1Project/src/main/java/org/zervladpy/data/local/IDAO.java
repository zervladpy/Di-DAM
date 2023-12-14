package org.zervladpy.data.local;

import java.io.File;
import java.util.List;

public interface IDAO<T> {
    List<T> getAll();

    void add(T model);

    void save(File file);

    void load(File file);

}
