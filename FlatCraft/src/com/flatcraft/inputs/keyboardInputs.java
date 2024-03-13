package com.flatcraft.inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.flatcraft.display.GamePanel;
import com.flatcraft.sprites.Sprite;

public class keyboardInputs implements KeyListener{
    private GamePanel panel;
    private Sprite player;
    
    public keyboardInputs(GamePanel panel) {
        this.panel = panel;
        this.player = panel.returnPlayer();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case KeyEvent.VK_W:
                player.moveUp();
                panel.repaint();
                break;
            case KeyEvent.VK_A:
                player.moveLeft();
                panel.repaint();
                break;
            case KeyEvent.VK_S:
                player.moveDown();
                panel.repaint();
                break;
            case KeyEvent.VK_D:
                player.moveRight();
                panel.repaint();
                break;
        }
        System.out.println("X: " + player.getX() + " Y: " + player.getY());
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
