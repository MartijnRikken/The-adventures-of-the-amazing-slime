package com.github.hanyaeger.tutorial.entities.puzzleButton.Hitbox;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.tutorial.Slime;
import com.github.hanyaeger.tutorial.entities.Slime_Sprite.SlimeSprite;

public class MainHitbox extends DynamicCompositeEntity {

    Slime slime;
    public MainHitbox(Coordinate2D initialLocation, Slime slime) {
        super(initialLocation);
        this.slime = slime;
    }

    @Override
    protected void setupEntities() {

        var slimeSprite = new SlimeSprite(new Coordinate2D(320, 500), slime);
        var tracker = new Tracker(false, false, false, false, false);
        var hitbox1 = new Hitbox1(new Coordinate2D(10,10), tracker);
        var hitbox2 = new Hitbox2(new Coordinate2D(730,10), tracker, slimeSprite);
        var hitbox3 = new Hitbox3(new Coordinate2D(0,300), tracker, slimeSprite);
        var hitbox4 = new Hitbox4(new Coordinate2D(720,300), tracker, slimeSprite);
        var hitbox5 = new Hitbox5(new Coordinate2D(380,0), tracker, slimeSprite);
        var hitboxRust = new HitboxRust(new Coordinate2D(390,310), tracker, slimeSprite);

        addEntity(hitbox1);
        addEntity(hitbox2);
        addEntity(hitbox3);
        addEntity(hitbox4);
        addEntity(hitbox5);
        addEntity(hitboxRust);
        addEntity(slimeSprite);

    }

}
