package org.zervladpy.data.local;

import org.zervladpy.data.model.Person;

import java.io.*;
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

    @Override
    public void save(File file) {
        try (FileOutputStream fos = new FileOutputStream(file)) {

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(data);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void load(File file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            data.clear();
            data = (List<Person>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
