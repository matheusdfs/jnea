package main;

import graphics.GamePanel;
import graphics.GameWindow;

public class Game {
    private GamePanel gamePanel;
    private GameWindow gameWindow;    
    
    public Game() {
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
    }

    public void executeGame() {
        
    }
}
