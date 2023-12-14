package org.zervladpy.presentation.frame;

import org.zervladpy.controller.PersonController;
import org.zervladpy.data.local.PersonDAO;
import org.zervladpy.presentation.menu.FileMenu;
import org.zervladpy.presentation.menu.WindowMenu;
import org.zervladpy.presentation.panel.AddPersonFormPanel;
import org.zervladpy.presentation.panel.TablePanel;
import org.zervladpy.presentation.toolbar.TopMenuBar;
import org.zervladpy.utils.Constraints;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private final PersonController controller;
    private final JMenuBar jMenuBar;
    private final TopMenuBar topMenuBar;
    private final TablePanel tablePanel;

    private final AddPersonFormPanel addPersonFormPanel;

    public MainFrame() {
        super(Constraints.APP_NAME);

        controller = new PersonController();
        controller.setDao(new PersonDAO());
        jMenuBar = new JMenuBar();
        jMenuBar.add(new FileMenu());
        jMenuBar.add(new WindowMenu());

        topMenuBar = new TopMenuBar();

        tablePanel = new TablePanel(controller);
        addPersonFormPanel = new AddPersonFormPanel();

        addPersonFormPanel.setListener(event -> {
            controller.add(event);
            tablePanel.refresh();
        });
        buildUid();
    }

    private void buildUid() {
        setJMenuBar(jMenuBar);
        add(topMenuBar, BorderLayout.NORTH);
        add(addPersonFormPanel, BorderLayout.LINE_START);
        add(tablePanel, BorderLayout.CENTER);

        setDefaults();
    }

    private void setDefaults() {
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}
