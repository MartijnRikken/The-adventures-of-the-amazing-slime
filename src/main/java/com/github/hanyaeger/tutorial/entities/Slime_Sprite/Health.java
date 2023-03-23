package com.github.hanyaeger.tutorial.entities.Slime_Sprite;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.tutorial.Slime;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Health extends TextEntity {

    int healthPoints;
    Slime slime;

    public Health(Coordinate2D initialLocation, int healthPoints, Slime slime) {
        super(initialLocation);

        setFont(Font.font("Roboto", FontWeight.BOLD, 30));
        setFill(Color.DARKBLUE);
        this.healthPoints = healthPoints;
        this.slime = slime;
    }

    public void setHealthText( ){
        healthPoints--;
        setText("Health: " + healthPoints);
        if (healthPoints == 0){
            slime.setActiveScene(4);
        }
    }
}
