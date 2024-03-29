package com.flatcraft.display;

import static com.flatcraft.constants.*;

import javax.swing.JFrame;

public class GameWindow {
    private JFrame frame;
    private GamePanel panel;

    public GameWindow() {
        frame = new JFrame("FlatCraft");
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Keep this here so the game does not bug
        frame.setVisible(true);
    }

    public void setPanel(GamePanel panel) {
        this.panel = panel;
        frame.add(panel);
    }
}
