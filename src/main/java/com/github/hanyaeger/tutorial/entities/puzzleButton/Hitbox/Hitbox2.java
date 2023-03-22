package com.github.hanyaeger.tutorial.entities.puzzleButton.Hitbox;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import com.github.hanyaeger.tutorial.entities.Slime_Sprite.SlimeSprite;
import javafx.scene.paint.Color;

public class Hitbox2 extends RectangleEntity implements Collided {

    SlimeSprite slime;
    Tracker tracker;
    protected Hitbox2(Coordinate2D initialLocation, Tracker tracker, SlimeSprite slime) {
        super(initialLocation);
        setWidth(80);
        setHeight(80);
        setFill(Color.TRANSPARENT);
        this.tracker = tracker;
        this.slime  = slime;
    }

    @Override
    public void onCollision(Collider collider) {
        if (tracker.hitbox1 == true){
            tracker.hitbox2 = true;
        }
        else{
            tracker.hitbox1 = false;
            tracker.hitbox2 = false;
            tracker.hitbox3 = false;
            tracker.hitbox4 = false;
            tracker.hitbox5 = false;

            slime.setAnchorLocation(new Coordinate2D(320, 500));
        }
    }
}
