package com.github.hanyaeger.tutorial.entities.TrafficLight;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import javafx.scene.paint.Color;

public class HitboxGR extends RectangleEntity {
    public HitboxGR(Coordinate2D initialLocation) {
        super(initialLocation);
        setWidth(770);
        setHeight(840);
        setFill(Color.TRANSPARENT);
    }
}
