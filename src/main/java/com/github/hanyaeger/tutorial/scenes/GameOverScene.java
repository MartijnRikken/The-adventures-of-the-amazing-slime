package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Slime;
import com.github.hanyaeger.tutorial.entities.button.QuitButton;
import com.github.hanyaeger.tutorial.entities.button.StartschermButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class GameOverScene  extends StaticScene {

    Slime slime;
    public GameOverScene(Slime slime){
        this.slime = slime;
    }
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/Defeat.jpg");
        setBackgroundAudio("audio/defeat.mp3");
    }

    @Override
    public void setupEntities() {
        var home = new StartschermButton(new Coordinate2D(820, 570), slime, 40);
        var quitButton = new QuitButton(new Coordinate2D(820, 700), slime, 40);
        var title = new TextEntity(new Coordinate2D(280, 20), "Game over!");
        title.setFont(Font.font("Roboto", FontWeight.BOLD, 90));
        title.setFill(Color.LIGHTBLUE);

        addEntity(home);
        addEntity(quitButton);
        addEntity(title);
    }
}
