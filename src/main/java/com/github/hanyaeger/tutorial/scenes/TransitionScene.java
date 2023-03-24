package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.Slime;
import com.github.hanyaeger.tutorial.entities.Transition.Slijmpje;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TransitionScene extends DynamicScene {

    Slime slime;
    public TransitionScene(Slime slime) {

        this.slime = slime;
    }


    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/TransitionScene.jpg");
    }

    @Override
    public void setupEntities() {
        var slijmpje = new Slijmpje(new Coordinate2D(0, 500), slime);
        var gratsText1 = new TextEntity(new Coordinate2D(100, 100), "Congratulations you have found a potion");
        var gratsText2 = new TextEntity(new Coordinate2D(100, 150), "your health has been set to 5");
        gratsText1.setFont(Font.font("Roboto", FontWeight.BOLD, 40));
        gratsText1.setFill(Color.LIGHTBLUE);
        gratsText2.setFont(Font.font("Roboto", FontWeight.BOLD, 40));
        gratsText2.setFill(Color.LIGHTBLUE);

        addEntity(slijmpje);
        addEntity(gratsText1);
        addEntity(gratsText2);
    }
}
