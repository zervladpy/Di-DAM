package org.zervladpy.presentation.panel;

import org.zervladpy.controller.IAppController;
import org.zervladpy.data.model.Person;
import org.zervladpy.data.model.PersonTableModel;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;

/**
 * Personalized JPanel for textArea
 *
 * @see JPanel
 */
public class TablePanel extends JPanel {
    private final IAppController<Person> controller;
    private final AbstractTableModel tableModel;
    private final JTable table;

    public TablePanel(
            IAppController<Person> controller
    ) {
        this.controller = controller;
        tableModel = new PersonTableModel(controller.getAll());
        table = new JTable(tableModel);
        table.setFillsViewportHeight(true);

        buildUI();
    }

    private void buildUI() {
        // set Layout
        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    public void refresh() {
        tableModel.fireTableDataChanged();
    }

}
