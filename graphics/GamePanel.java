package graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import inputs.KeyboardInputs;

public class GamePanel extends JPanel{
    public GamePanel() {

        addKeyListener(new KeyboardInputs());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.red);
        g.fillRect(300, 300, 300, 200);

        g.setColor(Color.green);
        g.fillRect(150, 150, 300, 200);
    }
}
