package graphics;

import javax.swing.JFrame;

public class GameWindow extends JFrame{
    public GameWindow(GamePanel gamePanel) {
        // Setting some window properties
        setTitle("Jnea");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        add(gamePanel);
        setVisible(true);
    }
}
