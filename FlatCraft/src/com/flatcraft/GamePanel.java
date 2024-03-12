package com.flatcraft;

import javax.swing.JPanel;
import com.flatcraft.sprites.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.Graphics;

public class GamePanel extends JPanel{
    Sprite sprite;

    public GamePanel() {
        sprite = new Sprite(100, 100, 50, 50);
        addKeyListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        sprite.drawSprite(g);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used in this example
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                sprite.setY(sprite.getY() - 10); // Move player up
                break;
            case KeyEvent.VK_DOWN:
                sprite.setY(sprite.getY() + 10); // Move player down
                break;
        }
        repaint(); // Redraw the panel with the updated player position
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not used in this example
    }
}
