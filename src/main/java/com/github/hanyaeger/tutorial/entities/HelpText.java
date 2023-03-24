package com.github.hanyaeger.tutorial.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class HelpText extends TextEntity {

    ActiveScene scherm;
    public HelpText(Coordinate2D initialLocation, ActiveScene scherm) {
        super(initialLocation);
        if (scherm.oldScene == 1){
            setText("look at the notes but don't go to fast for one miscast");
            setFill(Color.LIGHTBLUE);
            setFont(Font.font("Roboto", FontWeight.BOLD, 20));
        }
        else if (scherm.oldScene == 2){
            setText("you can go on red but don't be sad for red will hurt but green is clean");
            setFill(Color.LIGHTBLUE);
            setFont(Font.font("Roboto", FontWeight.BOLD, 20));
        }
    }
}
