package org.zervladpy.controller;

import org.zervladpy.data.local.IDAO;
import org.zervladpy.data.model.Person;
import org.zervladpy.data.model.PersonTableModel;
import org.zervladpy.presentation.event.FormEvent;
import org.zervladpy.utils.AgeCategory;
import org.zervladpy.utils.EmploymentCategory;
import org.zervladpy.utils.Gender;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class PersonController implements IAppController<Person> {
    private IDAO<Person> dao;
    public PersonController() {}

    public void setDao(IDAO<Person> dao) {
        this.dao = dao;
    }

    @Override
    public List<Person> getAll() {
        return dao.getAll();
    }

    @Override
    public void add(FormEvent event) {
        Person model = new Person();

        model.setName(event.getName());
        model.setOccupation(event.getOccupation());
        model.setAgeCategory(AgeCategory.fromIndex(event.getAgeCategory()));
        if (EmploymentCategory.values().length < event.getEmployment() || event.getEmployment() < EmploymentCategory.values().length) {
            model.setEmploymentCategory(EmploymentCategory.values()[event.getEmployment()]);
        }

        if (Gender.values().length < event.getGender() || event.getGender() < Gender.values().length) {
            model.setGender(Gender.values()[event.getGender()]);
        }
        model.setTaxID(event.getTaxId());
        model.setUsCitizen(event.getUsCitizen());

        dao.add(model);
    }

}
