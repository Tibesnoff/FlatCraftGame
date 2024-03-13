package com.flatcraft.display;

import com.flatcraft.sprites.*;
import com.flatcraft.worlds.*;
import com.flatcraft.inputs.*;

import javax.swing.JPanel;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Graphics;

public class GamePanel extends JPanel {
    private Sprite player;
    
    public GamePanel() {
        this.player = new Sprite(50, 50, 50, 50);;
        addKeyListener(new keyboardInputs(this));
        addMouseListener(new mouseInputs());
        addMouseMotionListener(new mouseMotion());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        World world = new World(g);
        world.drawWorld();

        player.drawSprite(g);
    }

    public Sprite returnPlayer() {
        return player;
    }
}
