package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Slime;
import com.github.hanyaeger.tutorial.entities.button.ResumeButton;
import com.github.hanyaeger.tutorial.entities.button.StartschermButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class MenuScene extends StaticScene {

    private Slime slime;

    public MenuScene(Slime slime){
        this.slime = slime;
    }
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/menu.jpg");
        setBackgroundAudio("audio/title.mp3");
    }

    @Override
    public void setupEntities() {

        var resume = new ResumeButton(new Coordinate2D(850, 210), slime);
        var home = new StartschermButton(new Coordinate2D(850, 310), slime, 40);
        var title = new TextEntity(new Coordinate2D(300, 60), "Pause");

        title.setFont(Font.font("Roboto", FontWeight.BOLD, 90));
        title.setFill(Color.LIGHTBLUE);

        addEntity(home);
        addEntity(resume);
        addEntity(title);
    }
}
