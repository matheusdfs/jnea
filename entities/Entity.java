package entities;

import java.awt.Color;
import java.awt.Graphics;

public class Entity {
    // Variables
    protected int positionX;
    protected int positionY;

    protected Color color = Color.gray;

    public Entity() {
        positionX = 0;
        positionY = 0;
    }

    public Entity(int initialPosX, int initialPosY) {
        positionX = initialPosX;
        positionY = initialPosY;
    }

    public void update(Graphics g) {

    }

    public void display(Graphics g) {
        g.setColor(color);
        g.fillRect(positionX, positionY, 25, 25);
    }
}
