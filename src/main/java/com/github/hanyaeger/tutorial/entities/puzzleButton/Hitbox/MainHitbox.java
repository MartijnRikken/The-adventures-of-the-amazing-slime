package com.github.hanyaeger.tutorial.entities.puzzleButton.Hitbox;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;

public class MainHitbox extends DynamicCompositeEntity {
    protected MainHitbox(Coordinate2D initialLocation) {
        super(initialLocation);
    }

    @Override
    protected void setupEntities() {
        var hitbox1 = new Hitbox1(new Coordinate2D(0,0));
    }
}
