package com.github.hanyaeger.tutorial.entities.puzzleButton.Hitbox;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.CircleEntity;

public class hitbox4 extends CircleEntity implements Collided {
    protected hitbox4(Coordinate2D initialLocation) {
        super(initialLocation);
    }

    @Override
    public void onCollision(Collider collider) {

    }
}