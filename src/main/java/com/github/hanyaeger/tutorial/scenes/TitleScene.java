package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.entities.button.QuitButton;
import com.github.hanyaeger.tutorial.entities.button.SettingsButton;
import com.github.hanyaeger.tutorial.entities.button.StartButton;
import com.github.hanyaeger.tutorial.Slime;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TitleScene extends StaticScene {

    private Slime slime;

    public TitleScene(Slime slime){
        this.slime = slime;
    }


    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/TitleScene.jpg");
        setBackgroundAudio("audio/title.mp3");
    }

    @Override
    public void setupEntities() {
        var startbutton = new StartButton(new Coordinate2D(120, 555), slime);
        var settingsButton = new SettingsButton(new Coordinate2D(155, 645), slime);
        var quitButton = new QuitButton(new Coordinate2D(175, 735), slime);


        var title1 = new TextEntity(new Coordinate2D(getWidth() / 2, 160), "The adventures of");
        var title2 = new TextEntity(new Coordinate2D(getWidth() / 2, 210), "Amazing Slime");
        title1.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        title2.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        title1.setFont(Font.font("Roboto", FontWeight.BOLD, 60));
        title2.setFont(Font.font("Roboto", FontWeight.BOLD, 60));

        addEntity(startbutton);
        addEntity(settingsButton);
        addEntity(quitButton);
        addEntity(title1);
        addEntity(title2);

    }
}
