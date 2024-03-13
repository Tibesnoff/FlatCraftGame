package com.flatcraft;

import com.flatcraft.display.*;

public class Game {
    private GameWindow window;
    private GamePanel panel;

    public Game() {
        window = new GameWindow();
        panel = new GamePanel();
        
        window.setPanel(panel);

        panel.requestFocus();
    }
}
