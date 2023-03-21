package com.github.hanyaeger.tutorial.entities;

import com.github.hanyaeger.tutorial.Slime;

public class ActiveScene {


    Slime slime;

    public ActiveScene( Slime slime){

        this.slime = slime;
    }

    public void isActiveScene(){
        int isCurrentScene= 1;
        if (isCurrentScene == 1){
            slime.setActiveScene(1);
        }
        else if(isCurrentScene == 2){
            slime.setActiveScene(2);
        }
    }
}
