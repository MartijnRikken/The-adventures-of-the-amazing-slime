package com.github.hanyaeger.tutorial.entities.TrafficLight;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.tutorial.entities.Slime_Sprite.Health;
import com.github.hanyaeger.tutorial.entities.Slime_Sprite.SlimeSprite;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

import java.util.Set;

public class HitboxGR extends RectangleEntity implements Collided, KeyListener {

    boolean buttonPressed = false;
    Health hp;

    SlimeSprite slime;
    public HitboxGR(Coordinate2D initialLocation, Health hp, SlimeSprite slime) {
        super(initialLocation);
        setWidth(770);
        setHeight(840);
        setFill(Color.TRANSPARENT);
        this.hp = hp;
        this.slime = slime;
    }



    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        if(pressedKeys.contains(KeyCode.LEFT)){
            buttonPressed = true;
        } else if(pressedKeys.contains(KeyCode.RIGHT)){
            buttonPressed = true;
        } else if(pressedKeys.contains(KeyCode.UP)){
            ;buttonPressed = true;
        } else if(pressedKeys.contains(KeyCode.DOWN)){
            buttonPressed = true;

        } else if(pressedKeys.isEmpty()){
            buttonPressed = false;
        }
    }

    @Override
    public void onCollision(Collider collider) {
        if (buttonPressed == true){
            hp.setHealthText();
            slime.setAnchorLocation(new Coordinate2D(0, 500));
        }
    }
}
