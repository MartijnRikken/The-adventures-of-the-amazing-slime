package com.github.hanyaeger.tutorial.entities.puzzleButton;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class Rondje extends SpriteEntity {
    protected Rondje(Coordinate2D location, int index) {
        super("sprites/Buttons.png", location, new Size(100,100), 1, 6);
        setCurrentFrameIndex(index);
    }
}
