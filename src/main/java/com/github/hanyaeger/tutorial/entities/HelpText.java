package com.github.hanyaeger.tutorial.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class HelpText extends TextEntity {
    public HelpText(Coordinate2D initialLocation, int actief) {
        super(initialLocation);
        if (actief == 1){
            setText("look at the notes");
            setFill(Color.LIGHTBLUE);
            setFont(Font.font("Roboto", FontWeight.BOLD, 30));

            setText("but don't go to fast for one miscast");
            setAnchorLocation(new Coordinate2D(30, 0));
        }
        else if (actief == 2){
            setText("you can go on red but don't be sad for red will hurt but green is clean");
            setFill(Color.LIGHTBLUE);
            setFont(Font.font("Roboto", FontWeight.BOLD, 30));
        }
    }
}
