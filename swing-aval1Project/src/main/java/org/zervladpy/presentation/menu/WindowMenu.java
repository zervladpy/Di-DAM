package org.zervladpy.presentation.menu;

import javax.swing.*;

public class WindowMenu extends JMenu {
    private final JMenu showMore;

    public WindowMenu() {
        super("Window");
        showMore = new JMenu("Show");

        JCheckBox jCheckBoxShowForm = new JCheckBox("Person Form");
        showMore.add(jCheckBoxShowForm);

        build();
    }

    private void build(){
        add(showMore);
    }

}
