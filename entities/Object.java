package entities;

import java.awt.Color;

public class Object extends Entity {
    public Object() {
        color = Color.red;
    }

    public Object(int initialX, int initialY) {
        color = Color.red;

        positionX = initialX;
        positionY = initialY;
    }
}
