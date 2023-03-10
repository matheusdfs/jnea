package graphics;

import java.awt.Graphics;
import javax.swing.JPanel;

import states.State;
import inputs.KeyboardInputsHandler;

public class GamePanel extends JPanel{
    State currentState;

    KeyboardInputsHandler keyboardHandler = new KeyboardInputsHandler();

    public GamePanel() {
        addKeyListener(keyboardHandler);
        setFocusable(true);
    }

    public KeyboardInputsHandler getKeyboardHandler() {
        return keyboardHandler;
    }

    public void updateCurrentState(State state) {
        currentState = state;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (currentState != null){
            currentState.update(g);
        }
    
        g.dispose();
    }
}
