package com.flatcraft.sprites;

import java.awt.Graphics;

public class Sprite {
    private int x;
    private int y;
    private int width;
    private int height;

    public Sprite(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void drawSprite(Graphics g) {
        g.drawRect(x, y, width, height);
    }
}
