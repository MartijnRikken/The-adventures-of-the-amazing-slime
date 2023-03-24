package com.github.hanyaeger.tutorial.entities.Transition;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import com.github.hanyaeger.tutorial.Slime;
import javafx.scene.paint.Color;

public class HitboxTR extends RectangleEntity implements Collided {

    Slime slime;
    public HitboxTR(Coordinate2D initialLocation, Slime slime) {
        super(initialLocation);
        this.slime = slime;
        setWidth(1);
        setHeight(840);
        setFill(Color.TRANSPARENT);
    }

    @Override
    public void onCollision(Collider collider) {
      slime.setActiveScene(2);
    }
}
