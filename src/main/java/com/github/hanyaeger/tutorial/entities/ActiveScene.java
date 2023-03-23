package com.github.hanyaeger.tutorial.entities;

import com.github.hanyaeger.tutorial.Slime;

public class ActiveScene {

    Slime slime;

    public int scene;
    public ActiveScene( Slime slime){

        this.slime = slime;
    }

    public void isActiveScene(){

        if (scene == 1){// hey anne
            slime.setActiveScene(1);
        }
        else if(scene == 2){
            slime.setActiveScene(2);
        }
        else if(scene == 4){
            slime.setActiveScene(4);
        }
    }
}
