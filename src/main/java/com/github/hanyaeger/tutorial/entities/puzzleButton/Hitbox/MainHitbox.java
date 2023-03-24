package com.github.hanyaeger.tutorial.entities.puzzleButton.Hitbox;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.tutorial.Slime;
import com.github.hanyaeger.tutorial.entities.Slime_Sprite.Health;
import com.github.hanyaeger.tutorial.entities.Slime_Sprite.SlimeSprite;

public class MainHitbox extends DynamicCompositeEntity {

    Slime slime;
    Health hp;
    public MainHitbox(Coordinate2D initialLocation, Slime slime, Health hp) {
        super(initialLocation);
        this.slime = slime;
        this.hp = hp;
    }

    @Override
    protected void setupEntities() {

        var slimeSprite = new SlimeSprite(new Coordinate2D(460, 665), slime);
        var tracker = new Tracker(false, false, false, false, false);
        var hitbox1 = new Hitbox1(new Coordinate2D(150,175), tracker);
        var hitbox2 = new Hitbox2(new Coordinate2D(870,175), tracker, slimeSprite, hp);
        var hitbox3 = new Hitbox3(new Coordinate2D(150,465), tracker, slimeSprite, hp);
        var hitbox4 = new Hitbox4(new Coordinate2D(870,465), tracker, slimeSprite, hp);
        var hitbox5 = new Hitbox5(new Coordinate2D(530,165), tracker, slimeSprite, hp, slime);
        var hitboxRust = new HitboxRust(new Coordinate2D(530,475), tracker, slimeSprite, hp);

        addEntity(hitbox1);
        addEntity(hitbox2);
        addEntity(hitbox3);
        addEntity(hitbox4);
        addEntity(hitbox5);
        addEntity(hitboxRust);
        addEntity(slimeSprite);

    }

}
