package com.github.hanyaeger.tutorial.entities.TrafficLight;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class GreenLight extends SpriteEntity {
    public GreenLight(Coordinate2D initialLocation) {
        super("sprites/GreenLightImage.png", initialLocation, new Size(100, 100));
    }
}
