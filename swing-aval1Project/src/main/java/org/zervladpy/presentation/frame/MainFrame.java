package org.zervladpy.presentation.frame;

import org.zervladpy.controller.PersonController;
import org.zervladpy.controller.IAppController;
import org.zervladpy.data.local.PersonDAO;
import org.zervladpy.data.model.Person;
import org.zervladpy.presentation.menu.FileMenu;
import org.zervladpy.presentation.menu.WindowMenu;
import org.zervladpy.presentation.panel.AddPersonFormPanel;
import org.zervladpy.presentation.panel.TextPanel;
import org.zervladpy.presentation.toolbar.TopMenuBar;
import org.zervladpy.utils.Constraints;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private final IAppController<Person> controller;
    private final JMenuBar jMenuBar;
    private final TopMenuBar topMenuBar;
    private final TextPanel textPanel;
    private final AddPersonFormPanel addPersonFormPanel;

    public MainFrame() {
        super(Constraints.APP_NAME);

        controller = new PersonController();
        controller.setDao(new PersonDAO());

        jMenuBar = new JMenuBar();
        jMenuBar.add(new FileMenu());
        jMenuBar.add(new WindowMenu());

        topMenuBar = new TopMenuBar();
        textPanel = new TextPanel();
        addPersonFormPanel = new AddPersonFormPanel();

        addPersonFormPanel.setListener(controller::add);
        buildUid();
    }

    private void buildUid() {
        setJMenuBar(jMenuBar);
        add(topMenuBar, BorderLayout.NORTH);
        add(addPersonFormPanel, BorderLayout.LINE_START);
        add(textPanel, BorderLayout.CENTER);

        setDefaults();
    }

    private void setDefaults() {
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(600, 500);
        setResizable(false);
        setVisible(true);
    }

}
