package com.github.hanyaeger.tutorial.entities.TrafficLight;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Licht extends DynamicSpriteEntity {

    boolean switchen;

    public Licht(Coordinate2D initialLocation, int columns) {
        super("sprites/Lichten.png",initialLocation, new Size(200, 200), 1, 2);

        setCurrentFrameIndex(columns);
    }
}
