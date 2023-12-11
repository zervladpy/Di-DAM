package org.zervladpy;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JButton pageStart;
    private JButton lineStart;
    private JButton lineCenter;
    private JButton lineEnd;
    private JButton pageEnd;

    public MainFrame() {

        super("Border Layout");

        pageStart = new JButton("PAGE START");
        pageEnd = new JButton("PAGE END");

        lineStart = new JButton("LINE START");
        lineCenter = new JButton("LINE CENTER");
        lineEnd = new JButton("LINE END");

        add(pageStart, BorderLayout.PAGE_START);
        add(pageEnd, BorderLayout.PAGE_END);
        add(lineStart, BorderLayout.LINE_START);
        add(lineCenter, BorderLayout.CENTER);
        add(lineEnd, BorderLayout.LINE_END);

        setSize(400, 200);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setVisible(true);

    }

}
