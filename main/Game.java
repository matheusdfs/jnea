package main;

import graphics.GamePanel;
import graphics.GameWindow;

public class Game {
    private GamePanel gamePanel;
    private GameWindow gameWindow; 
    
    double interpolation = 0;
    final int TICKS_PER_SECOND = 25;
    final int SKIP_TICKS = 1000 / TICKS_PER_SECOND;
    final int MAX_FRAMESKIP = 5;
    
    public Game() {
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
    }

    public void update() {
        double next_game_tick = System.currentTimeMillis();
        int loops;

        while (true) {
            loops = 0;

            while (System.currentTimeMillis() > next_game_tick
                && loops < MAX_FRAMESKIP) {

                gamePanel.update();

                next_game_tick += SKIP_TICKS;
                loops++;
            }
            interpolation = (System.currentTimeMillis() + SKIP_TICKS - next_game_tick 
                / (double) SKIP_TICKS);

            gamePanel.repaint();
        }
    }
}
