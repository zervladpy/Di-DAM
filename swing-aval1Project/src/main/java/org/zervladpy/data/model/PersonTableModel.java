package org.zervladpy.data.model;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class PersonTableModel extends AbstractTableModel {
    private final String[] columnNames;
    private final List<Person> data;

    public PersonTableModel(List<Person> data) {
        this.columnNames = new String[]{
                "Name",
                "Occupation",
                "Age",
                "Employment",
                "US Citizen",
                "Tax ID",
                "Gender",
        };
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> data.get(rowIndex).getName();
            case 1 -> data.get(rowIndex).getOccupation();
            case 2 -> data.get(rowIndex).getAgeCategory();
            case 3 -> data.get(rowIndex).getEmploymentCategory();
            case 4 -> data.get(rowIndex).isUsCitizen();
            case 5 -> data.get(rowIndex).getTaxID();
            case 6 -> data.get(rowIndex).getGender();
            default -> null;
        };
    }
}
