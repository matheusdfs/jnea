package entities;

import java.awt.Color;

import inputs.KeyboardInputsHandler;

public class Player extends Creature {
    // Attributes
    Color color = new Color(0, 255, 0);

    // Variables
    protected boolean isThePlayerWantingToWalk = false;

    // Others
    KeyboardInputsHandler keyboardHandler;

    public Player(KeyboardInputsHandler keyboardH) {
        speed = 2;

        keyboardHandler = keyboardH;
    }

    @Override
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
