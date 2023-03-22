package com.github.hanyaeger.tutorial.entities.puzzleButton;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;

public class Figuur extends DynamicCompositeEntity {
    public Figuur(Coordinate2D initialLocation) {
        super(initialLocation);
    }

    @Override
    protected void setupEntities() {
        var vierkant1 = new Vierkant(new Coordinate2D(0, 0), 0);
        var vierkant2 = new Vierkant(new Coordinate2D(720, 0), 1);
        var vierkant3 = new Vierkant(new Coordinate2D(380, 300), 2);
        var rondje1 = new Rondje(new Coordinate2D(0, 300), 3);
        var rondje2 = new Rondje(new Coordinate2D(720, 300), 4);
        var rondje3 = new Rondje(new Coordinate2D(380, 0), 5);

        addEntity(vierkant1);
        addEntity(vierkant2);
        addEntity(vierkant3);
        addEntity(rondje1);
        addEntity(rondje2);
        addEntity(rondje3);

    }
}
