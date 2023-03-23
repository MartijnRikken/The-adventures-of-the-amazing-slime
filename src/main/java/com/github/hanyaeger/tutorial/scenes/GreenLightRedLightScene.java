package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.Slime;

import java.util.Timer;
import java.util.TimerTask;

public class GreenLightRedLightScene extends DynamicScene {

    private Slime slime;

    public GreenLightRedLightScene(Slime slime) {
        this.slime = slime;
    }

    @Override
    public void setupScene() {

    }


        @Override
        public void setupEntities () {

            final int[] test = {1};

            Timer timer = new Timer();

            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    int flicker = 1;
                    if (flicker == 1) {
                        flicker = 2;
                    } else {
                        flicker = 1;
                    }


                    switch (flicker) {
                        case '1':

                            test[0] = 1;
                            break;

                        case '2':
                            test[0] = 2;
                            break;


                    }

                }
            }, 0, 7);
            //var trafficlight = new Licht(new Coordinate2D(0, 0), test[0]);
            //addEntity(trafficlight);
        }
    }
}
