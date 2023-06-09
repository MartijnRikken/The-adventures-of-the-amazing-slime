package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.entities.ActiveScene;
import com.github.hanyaeger.tutorial.entities.Slime_Sprite.Health;
import com.github.hanyaeger.tutorial.Slime;
import com.github.hanyaeger.tutorial.entities.button.PauseButton;
import com.github.hanyaeger.tutorial.entities.puzzleButton.Figuur;
import com.github.hanyaeger.tutorial.entities.puzzleButton.Hitbox.MainHitbox;

public class AudioScene extends DynamicScene{

    private Slime slime;
    ActiveScene scherm;
    public AudioScene(Slime slime, ActiveScene scherm){
        this.slime = slime;
        this.scherm = scherm;

    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/audioScene.jpg");
        setBackgroundAudio("audio/Hyrule_castle.mp3");
    }

    @Override
    public void setupEntities() {

        var hp = new Health(new Coordinate2D(10, 10), 6, slime);
        var figuren = new Figuur(new Coordinate2D(140, 165));
        var hitbox = new MainHitbox(new Coordinate2D(0, 0), slime, hp);
        var menu = new PauseButton(new Coordinate2D(945, 20), slime, scherm,1 );


        addEntity(menu);
        addEntity(figuren);
        addEntity(hitbox);
        addEntity(hp);
        hp.setHealthText();
        scherm.oldScene = 1;

    }
}
