package com.github.hanyaeger.tutorial.entities.puzzleButton.Hitbox;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.CircleEntity;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import javafx.scene.paint.Color;

public class Hitbox2 extends RectangleEntity implements Collided {
    protected Hitbox2(Coordinate2D initialLocation) {
        super(initialLocation);
        setWidth(80);
        setHeight(80);
        setFill(Color.TRANSPARENT);
    }

    @Override
    public void onCollision(Collider collider) {

    }
}
