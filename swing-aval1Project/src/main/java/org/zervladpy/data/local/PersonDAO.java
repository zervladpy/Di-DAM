package org.zervladpy.data.local;

import org.zervladpy.data.model.Person;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PersonDAO implements IDAO<Person> {

    private List<Person> data;

    public PersonDAO() {
        data = new LinkedList<>();
    }

    @Override
    public List<Person> getAll() {
        return Collections.unmodifiableList(data);
    }

    @Override
    public void add(Person model) {
        data.add(model);
    }
}
