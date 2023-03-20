package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.button.QuitButton;
import com.github.hanyaeger.tutorial.button.SettingsButton;
import com.github.hanyaeger.tutorial.button.StartButton;
import com.github.hanyaeger.tutorial.Slime;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class SettingsScene extends StaticScene {

    private Slime slime;

    public SettingsScene(Slime slime){
        this.slime = slime;
    }


    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/settings.jpg");
        setBackgroundAudio("audio/gerudo_valley.mp3");
    }

    @Override
    public void setupEntities() {
        var title = new TextEntity(new Coordinate2D(getWidth() / 2, 170), "Settings");
        title.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        title.setFont(Font.font("Roboto", FontWeight.BOLD, 90));
        addEntity(title);
    }
}
