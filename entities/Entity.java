package entities;

public class Entity {
    // Variables
    protected int positionX;
    protected int positionY;

    public Entity() {
        positionX = 0;
        positionY = 0;
    }

    public Entity(int initialPosX, int initialPosY) {
        positionX = initialPosX;
        positionY = initialPosY;
    }

    public void update() {

    }
}
