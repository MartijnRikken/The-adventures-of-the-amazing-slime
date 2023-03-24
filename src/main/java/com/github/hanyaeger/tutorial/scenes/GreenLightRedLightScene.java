package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.Slime;
import com.github.hanyaeger.tutorial.entities.TrafficLight.Licht;
import com.github.hanyaeger.tutorial.Slime;
import com.github.hanyaeger.tutorial.entities.ActiveScene;
import com.github.hanyaeger.tutorial.entities.Slime_Sprite.Health;
import com.github.hanyaeger.tutorial.entities.Slime_Sprite.SlimeSprite;

import com.github.hanyaeger.tutorial.entities.TrafficLight.HitboxGR;
import com.github.hanyaeger.tutorial.entities.TrafficLight.HitboxVictory;
import com.github.hanyaeger.tutorial.entities.TrafficLight.Licht;
import com.github.hanyaeger.tutorial.entities.button.PauseButton;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class GreenLightRedLightScene extends DynamicScene {

    Licht trafficlight;

    boolean flicker = false;
    private Slime slime;
    ActiveScene scherm;

    public GreenLightRedLightScene(Slime slime, ActiveScene scherm) {
        this.slime = slime;
        this.scherm = scherm;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/RedLightGreenLightScene.jpg");
        setBackgroundAudio("audio/Hyrule_castle.mp3");
    }


    @Override
    public void setupEntities() {

        var SlimeSprite = new SlimeSprite(new Coordinate2D(0, 500), slime);
        var hp = new Health(new Coordinate2D(10, 10), 6, slime);
        var hitbox = new HitboxGR(new Coordinate2D(150, 0), hp, SlimeSprite);
        var victory = new HitboxVictory(new Coordinate2D(1078, 0), slime);
        var menu = new PauseButton(new Coordinate2D(945, 20), slime, scherm,2 );

        Timer timer = new Timer();
        addEntity(hp);
        addEntity(SlimeSprite);
        addEntity(victory);
        addEntity(menu);
        hp.setHealthText();
        scherm.oldScene = 2;

        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                if (flicker == true) {
                    trafficlight = new Licht(new Coordinate2D(400, 0), 1);
                    hitbox.remove();

                    flicker = false;

                } else {
                    trafficlight = new Licht(new Coordinate2D(400, 0), 2);
                    addEntity(hitbox);
                    flicker = true;
                }

                addEntity(trafficlight);

            }
        }, 0, 2000);
    }
}

