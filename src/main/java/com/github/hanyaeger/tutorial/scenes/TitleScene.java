package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Waterworld;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class TitleScene extends StaticScene {

    public TitleScene(){
    }


    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background1.jpg");
        setBackgroundAudio("audio/ocean.mp3");
    }

    @Override
    public void setupEntities() {



    }
}
