package org.zervladpy.presentation.panel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPersonFormPanel extends JPanel implements ActionListener {

    private  final JLabel jLabelName;
    private final JTextField jTextFieldName;
    private  final JLabel jLabelOccupation;
    private final JTextField jTextFieldOccupation;
    private final JButton jButtonAdd;

    public AddPersonFormPanel() {
        jLabelName = new JLabel("Name:");
        jTextFieldName = new JTextField();
        jTextFieldName.setColumns(10);
        jLabelOccupation = new JLabel("Occupation:");
        jTextFieldOccupation = new JTextField();
        jTextFieldOccupation.setColumns(10);
        jButtonAdd = new JButton("Add");
        jButtonAdd.addActionListener(this);
        buildUid();
    }

    private void buildUid() {
        // SET BORDER
        Border innerBorder = BorderFactory.createTitledBorder("Add Person");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border compoundBorder = BorderFactory.createCompoundBorder(outerBorder, innerBorder);
        setBorder(compoundBorder);

        // set Layout
        GridBagLayout layout = new GridBagLayout();
        JPanel formPanel = new JPanel(layout);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        // NAME
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        formPanel.add(jLabelName, gbc);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        formPanel.add(jTextFieldName, gbc);
        // OCCUPATION
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(jLabelOccupation, gbc);
        gbc.gridx = 1;
        formPanel.add(jTextFieldOccupation, gbc);

        // ADD BUTTON
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.WEST;
        formPanel.add(jButtonAdd, gbc);


        add(formPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
