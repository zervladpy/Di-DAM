package org.zervladpy.presentation.panel;

import org.zervladpy.controller.listener.FormListener;
import org.zervladpy.controller.model.*;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class AddPersonFormPanel extends JPanel implements ActionListener {
    private  final JLabel jLabelName;
    private final JTextField jTextFieldName;
    private  final JLabel jLabelOccupation;
    private final JTextField jTextFieldOccupation;
    private final JLabel jLabelAge;
    private final JList<Age> jListAge;
    private final JLabel jLabelEmployment;
    private final JComboBox<Employment> jComboBoxEmployment;
    private final JLabel jLabelUSCitizen;
    private final JCheckBox jCheckBoxUSCitizen;
    private final JLabel jLabelTaxID;
    private final JTextField jTextFieldTaxID;
    private final JLabel jLabelGender;
    private final ButtonGroup buttonGroupGender ;
    private final JRadioButton jRadioButtonMale;
    private final JRadioButton jRadioButtonFemale;
    private final JButton jButtonAdd;
    private FormListener listener;
    public AddPersonFormPanel() {
        // NAME
        jLabelName = new JLabel("Name:");
        jTextFieldName = new JTextField();
        jTextFieldName.setColumns(10);

        // OCCUPATION
        jLabelOccupation = new JLabel("Occupation:");
        jTextFieldOccupation = new JTextField();
        jTextFieldOccupation.setColumns(10);

        // AGE LIST
        jLabelAge = new JLabel("Age:");
        DefaultListModel<Age> listModel = new DefaultListModel<>();
        listModel.add(0, new Age(0, "Under 18"));
        listModel.add(0, new Age(1, "18 to 65"));
        listModel.add(0, new Age(2, "65 or over"));
        jListAge = new JList<>(listModel);
        // EMPLOYMENT
        jLabelEmployment = new JLabel("Employment:");
        DefaultComboBoxModel<Employment> comboBoxModel = new DefaultComboBoxModel<>();
        comboBoxModel.addAll(List.of(
                new Employment(0, "employed"),
                new Employment(1, "unemployed")
        ));
        jComboBoxEmployment = new JComboBox<>(comboBoxModel);
        jComboBoxEmployment.setSelectedIndex(0);

        // US CITIZEN
        jLabelUSCitizen = new JLabel("US Citizen");
        jCheckBoxUSCitizen = new JCheckBox();
        jCheckBoxUSCitizen.setBorderPainted(false);

        // TAX ID
        jLabelTaxID = new JLabel("Tax ID:");
        jTextFieldTaxID = new JTextField();
        jTextFieldTaxID.setEditable(false);
        jTextFieldTaxID.setColumns(10);

        // GENDER
        jLabelGender = new JLabel("Gender:");
        buttonGroupGender = new ButtonGroup();
        jRadioButtonMale = new JRadioButton("Male");
        jRadioButtonFemale = new JRadioButton("Female");
        buttonGroupGender.add(jRadioButtonMale);
        buttonGroupGender.add(jRadioButtonFemale);

        // ADD BUTTON
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
        gbc.insets = new Insets(0, 5, 0, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;

        // NAME
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        formPanel.add(jLabelName, gbc);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;
        formPanel.add(jTextFieldName, gbc);

        // OCCUPATION
        gbc.gridx = 0;
        gbc.gridy += 1;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        gbc.fill = GridBagConstraints.NONE;
        formPanel.add(jLabelOccupation, gbc);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        formPanel.add(jTextFieldOccupation, gbc);

        // AGE LIST
        gbc.gridx = 0;
        gbc.gridy += 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        formPanel.add(jLabelAge, gbc);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;
        JScrollPane jScrollPaneAge = new JScrollPane(jListAge);
        jScrollPaneAge.setPreferredSize(new Dimension(0, 50));
        formPanel.add(jScrollPaneAge, gbc);

        // EMPLOYMENT
        gbc.gridx = 0;
        gbc.gridy += 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        formPanel.add(jLabelEmployment, gbc);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;
        formPanel.add(jComboBoxEmployment, gbc);

        // US CITIZEN
        gbc.gridx = 0;
        gbc.gridy += 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        formPanel.add(jLabelUSCitizen, gbc);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;
        formPanel.add(jCheckBoxUSCitizen, gbc);

        // TAX ID
        gbc.gridx = 0;
        gbc.gridy += 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        formPanel.add(jLabelTaxID, gbc);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;
        formPanel.add(jTextFieldTaxID, gbc);

        // GENDER
        gbc.gridx = 0;
        gbc.gridy += 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        formPanel.add(jLabelGender, gbc);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;
        formPanel.add(jRadioButtonMale, gbc);
        gbc.gridy += 1;
        formPanel.add(jRadioButtonFemale, gbc);

        // ADD BUTTON
        gbc.gridx = 1;
        gbc.gridy += 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.WEST;
        formPanel.add(jButtonAdd, gbc);

        add(formPanel);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource() instanceof JButton jButton) {
            String name = jTextFieldName.getText();
            String occupation = jTextFieldOccupation.getText();
            if (listener != null) {
            }
        }
    }

    public void setListener(FormListener listener) {
        this.listener = listener;
    }
}
