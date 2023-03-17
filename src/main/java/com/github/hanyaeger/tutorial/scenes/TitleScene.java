package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.scenes.StaticScene;


public class TitleScene extends StaticScene {

    public TitleScene(){
    }


    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background1.jpg");
        setBackgroundAudio("audio/title.mp3");
    }

    @Override
    public void setupEntities() {



    }
}
