package main;

import graphics.GamePanel;
import graphics.GameWindow;
import states.State;
import states.levels.VariaCity;

import java.util.List;
import java.util.ArrayList;

public class Game {
    private GamePanel gamePanel;
    private GameWindow gameWindow;

    // Todo game terá lista de estados para executar
    protected List<State> states = new ArrayList<State>();

    double interpolation = 0;
    final int TICKS_PER_SECOND = 25;
    final int SKIP_TICKS = 1000 / TICKS_PER_SECOND;
    final int MAX_FRAMESKIP = 5;
    
    public Game() {
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);

        states.add((State)new VariaCity(gamePanel.getKeyboardHandler()));
    }

    public void update() {
        double next_game_tick = System.currentTimeMillis();
        int loops;

        while (true) {
            loops = 0;

            while (System.currentTimeMillis() > next_game_tick
                && loops < MAX_FRAMESKIP) {

                gamePanel.updateCurrentState(
                    states.get(states.size() - 1)
                );

                gamePanel.repaint();

                next_game_tick += SKIP_TICKS;
                loops++;
            }
            
            interpolation = (System.currentTimeMillis() + SKIP_TICKS - next_game_tick 
                / (double) SKIP_TICKS);
        }
    }
}
