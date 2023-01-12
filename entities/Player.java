package entities;

import java.awt.Color;
import java.awt.Graphics;

import inputs.KeyboardInputsHandler;

public class Player extends Creature {
    // Variables
    protected boolean isThePlayerWantingToWalk = false;

    // Others
    KeyboardInputsHandler keyboardHandler;

    public Player(KeyboardInputsHandler keyboardH) {
        speed = 2;

        color = Color.green;

        keyboardHandler = keyboardH;
    }

    @Override
    public void update(Graphics g) {
        resetFlags();
        movePlayer();
        display(g);
    }

    private void resetFlags() {
        isThePlayerWantingToWalk = false;
    }

    private void movePlayer() {
        // TODO: Correct the implementation of movement, because the player
        // is more faster going up than down, i think is because of the
        // rounding when turning the variables to integers
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
