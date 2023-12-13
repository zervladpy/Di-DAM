package org.zervladpy;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DateFormatter;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class MainFrame extends JFrame {
    private JLabel jLabelName;
    private JTextField jTextFieldName;
    private JLabel jLabelDNI;
    private JTextField jTextFieldDNI;
    private JLabel jLabelBirthday;
    private JTextField jTextFieldDay;
    private JTextField jTextFieldMonth;
    private JTextField jTextFieldYear;
    private JButton jButtonAccept;
    private JButton jButtonCancel;
    public MainFrame() {
        super("Add User");

        // FORM GRID LAYOUT
        JPanel jPanelForm = new JPanel();
        GridLayout gridLayout = new GridLayout(3, 2);
        gridLayout.setHgap(10);
        gridLayout.setVgap(10);
        jPanelForm.setLayout(gridLayout);

        EmptyBorder emptyBorder = new EmptyBorder(5,5,5,5);

        rootPane.setBorder(emptyBorder);

        // NAME
        jLabelName = new JLabel("Name:");
        jTextFieldName = new JTextField();
        jPanelForm.add(jLabelName);
        jPanelForm.add(jTextFieldName);

        // DNI
        jLabelDNI = new JLabel("DNI:");
        jTextFieldDNI = new JTextField();
        jPanelForm.add(jLabelDNI);
        jPanelForm.add(jTextFieldDNI);

        // DATE
        jLabelBirthday = new JLabel("Birthday Date:");
        jPanelForm.add(jLabelBirthday);
        JPanel jPanelBirthDay = new JPanel(new FlowLayout());
        try {
            jTextFieldDay = new JFormattedTextField(new MaskFormatter("**"));
            jTextFieldDay.setColumns(2);
            jPanelBirthDay.add(jTextFieldDay);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        jPanelBirthDay.add(new JLabel("/"));
        try{
            jTextFieldMonth = new JFormattedTextField(new MaskFormatter("**"));
            jTextFieldMonth.setColumns(2);
            jPanelBirthDay.add(jTextFieldMonth);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        jPanelBirthDay.add(new JLabel("/"));

        try{
            jTextFieldYear = new JFormattedTextField(new MaskFormatter("****"));
            jTextFieldYear.setColumns(4);
            jPanelBirthDay.add(jTextFieldYear);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        jPanelForm.add(jPanelBirthDay);

        // Buttons
        JPanel jPanelButtons = new JPanel();
        jPanelButtons.setLayout(new FlowLayout());
        jButtonCancel = new JButton("Cancel");
        jButtonAccept = new JButton("Accept");

        jPanelButtons.add(jButtonAccept);
        jPanelButtons.add(jButtonCancel);

        add(jPanelForm);
        add(jPanelButtons, BorderLayout.SOUTH);
        setDefaults();
    }

    private void setDefaults() {
        pack();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
