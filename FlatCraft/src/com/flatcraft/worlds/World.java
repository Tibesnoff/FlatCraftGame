package com.flatcraft.worlds;
import java.awt.Graphics;

import static com.flatcraft.constants.*;

public class World {
    Graphics g;
    public World(Graphics g) {
        this.g = g;
    }

    public void drawWorld() {
        g.drawRect(0, 0, WIDTH, HEIGHT);
    }
}
