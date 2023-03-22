package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.entities.Slime_Sprite.SlimeSprite;
import com.github.hanyaeger.tutorial.Slime;
import com.github.hanyaeger.tutorial.entities.button.PauseButton;
import com.github.hanyaeger.tutorial.entities.puzzleButton.Figuur;

public class AudioScene extends DynamicScene {

    private Slime slime;


    public AudioScene(Slime slime){
        this.slime = slime;

    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/audioScene.jpg");
        setBackgroundAudio("audio/Hyrule_castle.mp3");
    }

    @Override
    public void setupEntities() {

        var figuren = new Figuur(new Coordinate2D(140, 165));

        var slimeSprite = new SlimeSprite(new Coordinate2D(490, 700), slime);
        var menu = new PauseButton(new Coordinate2D(945, 20), slime);


        addEntity(menu);
        addEntity(figuren);
        addEntity(slimeSprite);

    }
}
