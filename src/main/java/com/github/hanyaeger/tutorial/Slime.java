package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.tutorial.scenes.*;
import javafx.scene.Node;

import java.util.Optional;

public class Slime extends YaegerGame   {

    @Override
    public void setupGame() {
        setGameTitle("Slime");
        setSize(new Size(1080, 840));
    }



    @Override
    public void setupScenes(){

        addScene(0, new TitleScene(this));
        addScene(1, new AudioScene(this));
        addScene(2, new GreenLightRedLightScene());
        addScene(3, new VictoryScene(this));
        addScene(4, new GameOverScene(this));
        addScene(5, new MenuScene(this));
        addScene(6, new SettingsScene(this));
    }

    public static void main(String[] args){
        launch(args);
    }

}

