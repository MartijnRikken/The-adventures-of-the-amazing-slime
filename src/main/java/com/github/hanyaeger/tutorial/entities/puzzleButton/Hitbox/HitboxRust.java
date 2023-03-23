package com.github.hanyaeger.tutorial.entities.puzzleButton.Hitbox;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import com.github.hanyaeger.api.media.SoundClip;
import com.github.hanyaeger.tutorial.entities.Slime_Sprite.Health;
import com.github.hanyaeger.tutorial.entities.Slime_Sprite.SlimeSprite;
import javafx.scene.paint.Color;

public class HitboxRust extends RectangleEntity implements Collided {

    Tracker tracker;
    SlimeSprite slime;
    Health hp;
    protected HitboxRust(Coordinate2D initialLocation, Tracker tracker, SlimeSprite slime, Health hp) {
        super(initialLocation);
        setWidth(80);
        setHeight(80);
        setFill(Color.TRANSPARENT);
        this.tracker = tracker;
        this.slime  = slime;
        this.hp = hp;
    }

    @Override
    public void onCollision(Collider collider) {
        tracker.hitbox1 = false;
        tracker.hitbox2 = false;
        tracker.hitbox3 = false;
        tracker.hitbox4 = false;
        tracker.hitbox5 = false;
        var popSound = new SoundClip("audio/incorrect.mp3");
        popSound.play();
        hp.setHealthText();
        slime.setAnchorLocation(new Coordinate2D(460, 665));
    }
}
