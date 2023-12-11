package org.zervladpy;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swing Empty App");

            frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

            frame.setSize(500, 600);
            frame.setVisible(true);
        });

    }
}