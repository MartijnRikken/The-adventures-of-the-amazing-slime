package com.github.hanyaeger.tutorial.entities.Transition;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.tutorial.Slime;

public class Slijmpje extends DynamicSpriteEntity implements Collider {

    Slime slime;
    public Slijmpje(Coordinate2D initialLocation, Slime slime) {
        super("sprites/Hero_slime.png", initialLocation, new Size(100, 100), 1, 4);
        setCurrentFrameIndex(1);
        setMotion(1, 90d);
        this.slime = slime;
    }
}
