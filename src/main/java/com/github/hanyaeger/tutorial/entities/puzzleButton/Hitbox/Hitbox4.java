package com.github.hanyaeger.tutorial.entities.puzzleButton.Hitbox;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.CircleEntity;
import javafx.scene.paint.Color;

public class Hitbox4 extends CircleEntity implements Collided {
    protected Hitbox4(Coordinate2D initialLocation) {
        super(initialLocation);
        setRadius(50);
        setFill(Color.TRANSPARENT);
    }

    @Override
    public void onCollision(Collider collider) {

    }
}
