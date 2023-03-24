package com.github.hanyaeger.tutorial.entities.puzzleButton.Hitbox;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.CircleEntity;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import com.github.hanyaeger.api.media.SoundClip;
import javafx.scene.paint.Color;

public class Hitbox1 extends RectangleEntity implements Collided {

    Tracker tracker;
    protected Hitbox1(Coordinate2D initialLocation, Tracker tracker) {
        super(initialLocation);
        setWidth(80);
        setHeight(70);
        setFill(Color.TRANSPARENT);
        this.tracker = tracker;
    }

    @Override
    public void onCollision(Collider collider) {

        if (tracker.hitbox1 == false){
            tracker.hitbox1 = true;
            var popSound = new SoundClip("audio/correct.mp3");
            popSound.play();
        }

    }
}
