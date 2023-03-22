package com.github.hanyaeger.tutorial.entities.puzzleButton.Hitbox;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.tutorial.entities.puzzleButton.Rondje;
import com.github.hanyaeger.tutorial.entities.puzzleButton.Vierkant;

public class MainHitbox extends DynamicCompositeEntity {
    public MainHitbox(Coordinate2D initialLocation) {
        super(initialLocation);
    }

    @Override
    protected void setupEntities() {
        var hitbox1 = new Hitbox1(new Coordinate2D(10,10));
        var hitbox2 = new Hitbox2(new Coordinate2D(730,10));
        var hitbox3 = new Hitbox3(new Coordinate2D(0,300));
        var hitbox4 = new Hitbox4(new Coordinate2D(720,300));
        var hitbox5 = new Hitbox5(new Coordinate2D(380,0));
        var hitboxRust = new HitboxRust(new Coordinate2D(390,310));

        addEntity(hitbox1);
        addEntity(hitbox2);
        addEntity(hitbox3);
        addEntity(hitbox4);
        addEntity(hitbox5);
        addEntity(hitboxRust);

    }

//    var vierkant1 = new Vierkant(new Coordinate2D(0, 0), 0);
//    var vierkant2 = new Vierkant(new Coordinate2D(720, 0), 1);
//    var vierkant3 = new Vierkant(new Coordinate2D(380, 300), 2);
//    var rondje1 = new Rondje(new Coordinate2D(0, 300), 3);
//    var rondje2 = new Rondje(new Coordinate2D(720, 300), 4);
//    var rondje3 = new Rondje(new Coordinate2D(380, 0), 5);
}
