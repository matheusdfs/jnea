package entities;

import inputs.KeyboardInputsHandler;

public class Player {
    // Attributes
    private int speed = 5;

    // Variables
    private int positionX;
    private int positionY;

    private boolean isThePlayerWantingToWalk = false;

    // Classes
    KeyboardInputsHandler keyboardHandler;

    public Player(KeyboardInputsHandler keyboardH) {
        positionX = 0;
        positionY = 0;

        keyboardHandler = keyboardH;
    }

    public void update() {
        resetFlags();
        movePlayer();
    }

    private void resetFlags() {
        isThePlayerWantingToWalk = false;
    }

    private void movePlayer() {
        double angleMovement = getKeyboardAngleMovement();

        if (isThePlayerWantingToWalk) {
            positionX += speed * Math.cos(angleMovement);
            positionY += speed * Math.sin(angleMovement);
        }
    }

    private double getKeyboardAngleMovement() {
        int directionX = 0;
        int directionY = 0;

        if (keyboardHandler.upPressed) {
            directionY = -1;
            isThePlayerWantingToWalk = true;
        } else if (keyboardHandler.downPressed) {
            directionY = +1;
            isThePlayerWantingToWalk = true;
        }

        if (keyboardHandler.leftPressed) {
            directionX = -1;
            isThePlayerWantingToWalk = true;
        } else if (keyboardHandler.rightPressed) {
            directionX = +1;
            isThePlayerWantingToWalk = true;
        }

        return Math.atan2(directionY, directionX);
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
}
