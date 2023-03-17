package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;


public class Waterworld extends YaegerGame {

    @Override
    public void setupGame() {
        setGameTitle("The adventures of the amazing Slime");
        setSize(new Size(1600, 900));
    }



    @Override
    public void setupScenes(){

    }

    public static void main(String[] args){
        launch(args);
    }
}

