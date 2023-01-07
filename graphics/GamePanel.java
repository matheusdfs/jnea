package graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import entities.Player;
import inputs.KeyboardInputsHandler;

public class GamePanel extends JPanel{
    // TODO: List of entities
    KeyboardInputsHandler keyboardHandler = new KeyboardInputsHandler();

    Player player = new Player(keyboardHandler);

    public GamePanel() {
        addKeyListener(keyboardHandler);
        setFocusable(true);
    }

    public void update() {

        player.update();

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.green);
        g.fillRect(player.getPositionX(), player.getPositionY(), 25, 25);

        g.dispose();
    }
}
