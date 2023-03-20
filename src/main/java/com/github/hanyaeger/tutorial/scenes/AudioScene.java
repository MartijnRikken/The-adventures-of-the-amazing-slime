package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.scenes.StaticScene;

public class AudioScene extends StaticScene {
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/audioScene.jpg");
        setBackgroundAudio("audio/Hyrule_castle.mp3");
    }

    @Override
    public void setupEntities() {

    }
}
