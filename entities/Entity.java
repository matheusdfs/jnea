package entities;

import java.awt.Color;
import java.awt.Graphics;

public class Entity {
    // Variables
    protected int positionX = 0;
    protected int positionY = 0;

    protected Color color = Color.blue;

    public void update(Graphics g) {
        display(g);
    }

    public void display(Graphics g) {
        g.setColor(color);
        g.fillRect(positionX, positionY, 25, 25);
    }
}
