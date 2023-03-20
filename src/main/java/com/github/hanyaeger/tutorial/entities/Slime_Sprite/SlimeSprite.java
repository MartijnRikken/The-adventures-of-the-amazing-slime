package com.github.hanyaeger.tutorial.entities.Slime_Sprite;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;
import com.github.hanyaeger.tutorial.Slime;

import java.util.Random;
import java.util.Set;

public class SlimeSprite extends DynamicSpriteEntity implements KeyListener, SceneBorderTouchingWatcher, Newtonian, Collided {

    private Slime slime;
    protected SlimeSprite(Coordinate2D location, Slime slime) {

        super("sprites/HeroSlime.png", location, new Size(20,40), 1, 2);


        setGravityConstant(0.005);
        setFrictionConstant(0.04);
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        if(pressedKeys.contains(KeyCode.LEFT)){
            setMotion(3,270d);
            setCurrentFrameIndex(2);
        } else if(pressedKeys.contains(KeyCode.RIGHT)){
            setMotion(3,90d);
            setCurrentFrameIndex(1);
        } else if(pressedKeys.contains(KeyCode.UP)){
            setMotion(3,180d);
        } else if(pressedKeys.contains(KeyCode.DOWN)){
            setMotion(3,0d);
        } else if(pressedKeys.isEmpty()){
            setSpeed(0);
        }

    }


    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {
        setSpeed(0);

        switch(sceneBorder){
            case TOP:
                setAnchorLocationY(1);
                break;
            case BOTTOM:
                setAnchorLocationY(getSceneHeight() - getHeight() - 1);
                break;
            case LEFT:
                setAnchorLocationX(1);
                break;
            case RIGHT:
                setAnchorLocationX(getSceneWidth() - getWidth() - 1);
            default:
                break;
        }
    }

    @Override
    public void onCollision(Collider collider) {
        setAnchorLocation(new Coordinate2D(0,0));

    }

}
