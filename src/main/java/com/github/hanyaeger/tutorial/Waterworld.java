package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.tutorial.scenes.TitleScene;
import javafx.scene.Scene;

public class Waterworld extends YaegerGame {

    @Override
    public void setupGame() {
        setGameTitle("the adventures of the amazing Slime");
        setSize(new Size(1600, 900));
    }



    @Override
    public void setupScenes(){
        addScene(0, new TitleScene());
    }

    public static void main(String[] args){
        launch(args);
    }
}

