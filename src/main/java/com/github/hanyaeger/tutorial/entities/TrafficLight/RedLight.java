package com.github.hanyaeger.tutorial.entities.TrafficLight;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class RedLight extends SpriteEntity {
    public RedLight(Coordinate2D initialLocation) {
        super("sprites/RedLightImage.png", initialLocation, new Size(100, 100));
    }
}
