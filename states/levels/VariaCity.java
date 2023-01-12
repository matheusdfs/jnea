package states.levels;

import entities.Entity;
import entities.Player;
import entities.Object;
import inputs.KeyboardInputsHandler;

public class VariaCity extends Level {
    public VariaCity(KeyboardInputsHandler keyboardHandler) {
        player = new Player(keyboardHandler);

        entities.add((Entity)player);
        entities.add((Entity)new Object(40, 40));
        entities.add((Entity)new Object(60, 60));
        entities.add((Entity)new Object());
    }
}
