package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Slime;
import com.github.hanyaeger.tutorial.entities.button.StartschermButton;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class SettingsScene extends StaticScene {

    private Slime slime;

    public SettingsScene(Slime slime){
        this.slime = slime;
    }


    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/settings.jpg");
        setBackgroundAudio("audio/gerudo_valley.mp3");
    }

    @Override
    public void setupEntities() {
        var home = new StartschermButton(new Coordinate2D(20, 20), slime, 25);

        var title = new TextEntity(new Coordinate2D(getWidth() / 2, 170), "Settings");
        var pijltjesUitleg = new TextEntity(new Coordinate2D(300, 470), "Use the arrow keys to move the Amazing slime");
        var map = new TextEntity(new Coordinate2D(115, 555), "Map");
        var mapUitleg = new TextEntity(new Coordinate2D(300, 570), "here you can request help and quit game");
        var hp = new TextEntity(new Coordinate2D(90, 690), "Health");
        var hpUitleg   = new TextEntity(new Coordinate2D(300, 700), "you lose if your Health becomes zero");
        title.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        title.setFont(Font.font("Roboto", FontWeight.BOLD, 90));
        pijltjesUitleg.setFont(Font.font("Roboto", FontWeight.BOLD, 25));
        mapUitleg.setFont(Font.font("Roboto", FontWeight.BOLD, 25));
        map.setFont(Font.font("Roboto", FontWeight.BOLD, 40));
        hp.setFont(Font.font("Roboto", FontWeight.BOLD, 40));
        hpUitleg.setFont(Font.font("Roboto", FontWeight.BOLD, 25));
        addEntity(title);
        addEntity(pijltjesUitleg);
        addEntity(map);
        addEntity(mapUitleg);
        addEntity(hp);
        addEntity(hpUitleg);
        addEntity(home);
    }
}
