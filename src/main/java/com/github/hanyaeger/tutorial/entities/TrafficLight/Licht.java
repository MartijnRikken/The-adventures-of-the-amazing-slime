package com.github.hanyaeger.tutorial.entities.TrafficLight;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;

public class Licht extends DynamicCompositeEntity {

    boolean switchen;

    public Licht(Coordinate2D initialLocation, boolean switchen) {
        super(initialLocation);
        this.switchen = switchen;
    }

    @Override
    public void setupEntities() {
    if(switchen == true) {
        var redlight = new RedLight(new Coordinate2D(0, 0));
        addEntity(redlight);
        }else if(switchen == false){
        var greenlight = new GreenLight(new Coordinate2D(0, 0));
        addEntity(greenlight);
    }
    }
}
