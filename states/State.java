package states;

import java.util.List;
import java.awt.Graphics;
import java.util.ArrayList;

import entities.Entity;

public class State {

    // Todo estado terá lista de entidade para renderizar e executar
    protected List<Entity> entities = new ArrayList<Entity>();

    public void update(Graphics g) {
        for (Entity entity : entities) {
            entity.update(g);
        }
    }
}
