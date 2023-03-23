package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Slime;
import com.github.hanyaeger.tutorial.entities.TrafficLight.Licht;
import javafx.scene.effect.Light;

import java.util.Timer;
import java.util.TimerTask;

public class GreenLightRedLightScene extends DynamicScene {

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
        boolean flicker = true;
        var trafficlight = new Licht(new Coordinate2D(0, 0), flicker);
        addEntity(trafficlight);

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(flicker == false) {
                    flicker = true;
                }else if(flicker == true){
                    flicker = false;
                }
            }
        }, 0, 700);
        }
    }


