package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Slime;
import com.github.hanyaeger.tutorial.entities.HelpText;
import com.github.hanyaeger.tutorial.entities.button.ResumeButton;
import com.github.hanyaeger.tutorial.entities.button.StartschermButton;
import com.github.hanyaeger.tutorial.entities.ActiveScene;
import com.github.hanyaeger.tutorial.entities.button.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class MenuScene extends StaticScene {

    private Slime slime;
    ActiveScene scherm;
    public MenuScene(Slime slime, ActiveScene scherm){
        this.slime = slime;
        this.scherm = scherm;
    }
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/menu.jpg");
        setBackgroundAudio("audio/title.mp3");
    }

    @Override
    public void setupEntities() {

        var resume = new ResumeButton(new Coordinate2D(850, 210), slime,  scherm);
        var home = new StartschermButton(new Coordinate2D(880, 360), slime, 40);
        var help = new HelpButton(new Coordinate2D(890, 500), slime, scherm);
        var quit = new QuitButton(new Coordinate2D(890, 650), slime, 40);
        var title = new TextEntity(new Coordinate2D(300, 60), "Pause");
        var helpText = new HelpText(new Coordinate2D(75, 500), scherm);

        title.setFont(Font.font("Roboto", FontWeight.BOLD, 90));
        title.setFill(Color.LIGHTBLUE);

        addEntity(home);
        addEntity(resume);
        addEntity(title);
        addEntity(help);
        addEntity(quit);
        addEntity(helpText);
    }




}
