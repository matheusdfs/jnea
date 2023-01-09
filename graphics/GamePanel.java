package graphics;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import entities.Entity;
import entities.Player;
import inputs.KeyboardInputsHandler;

public class GamePanel extends JPanel{
    // TODO: List of entities
    KeyboardInputsHandler keyboardHandler = new KeyboardInputsHandler();

    Player player = new Player(keyboardHandler);

    List<Entity> entities = new ArrayList<Entity>();

    public GamePanel() {
        addKeyListener(keyboardHandler);
        setFocusable(true);

        entities.add((Entity)player);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Entity entity : entities) {
            entity.update(g);
        }

        g.dispose();
    }
}
