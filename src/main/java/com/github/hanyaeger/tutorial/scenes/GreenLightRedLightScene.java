package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.Slime;
import com.github.hanyaeger.tutorial.entities.TrafficLight.Licht;
import com.github.hanyaeger.tutorial.Slime;
import com.github.hanyaeger.tutorial.entities.TrafficLight.HitboxGR;
import com.github.hanyaeger.tutorial.entities.TrafficLight.Licht;

import java.util.Timer;
import java.util.TimerTask;

public class GreenLightRedLightScene extends DynamicScene {

    Licht trafficlight;

    boolean flicker = false;
    private Slime slime;

    public GreenLightRedLightScene(Slime slime) {
        this.slime = slime;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/RedLightGreenLightScene.jpg");
        setBackgroundAudio("audio/Hyrule_castle.mp3");
    }


    @Override
    public void setupEntities() {
        var hitbox = new HitboxGR(new Coordinate2D(150, 0));

        addEntity(hitbox);
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (flicker == true) {
                    trafficlight = new Licht(new Coordinate2D(400, 0), 1);


                    flicker = false;

                } else {
                    trafficlight = new Licht(new Coordinate2D(400, 0), 2);

                    flicker = true;
                }

                addEntity(trafficlight);

            }
        }, 0, 3500);
    }
}

