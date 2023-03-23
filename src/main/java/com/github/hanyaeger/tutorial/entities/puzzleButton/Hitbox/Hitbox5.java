package com.github.hanyaeger.tutorial.entities.puzzleButton.Hitbox;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.CircleEntity;
import com.github.hanyaeger.api.media.SoundClip;
import com.github.hanyaeger.tutorial.entities.Slime_Sprite.Health;
import com.github.hanyaeger.tutorial.entities.Slime_Sprite.SlimeSprite;
import javafx.scene.paint.Color;

public class Hitbox5 extends CircleEntity implements Collided {
    SlimeSprite slime;
    Tracker tracker;
    Health hp;
    protected Hitbox5(Coordinate2D initialLocation, Tracker tracker, SlimeSprite slime, Health hp) {
        super(initialLocation);
        setRadius(50);
        setFill(Color.TRANSPARENT);
        this.tracker = tracker;
        this.slime  = slime;
        this.hp = hp;
    }

    @Override
    public void onCollision(Collider collider) {
        if (tracker.hitbox5 == false) {
            if (tracker.hitbox1 == true && tracker.hitbox2 == true && tracker.hitbox3 == true && tracker.hitbox4 == true) {
                tracker.hitbox5 = true;
                var popSound = new SoundClip("audio/correct.mp3");
                popSound.play();
            } else {
                tracker.hitbox1 = false;
                tracker.hitbox2 = false;
                tracker.hitbox3 = false;
                tracker.hitbox4 = false;
                tracker.hitbox5 = false;
                var popSound = new SoundClip("audio/incorrect.mp3");
                popSound.play();
                hp.setHealthText();
                slime.setAnchorLocation(new Coordinate2D(320, 500));
            }
        }
    }
}
