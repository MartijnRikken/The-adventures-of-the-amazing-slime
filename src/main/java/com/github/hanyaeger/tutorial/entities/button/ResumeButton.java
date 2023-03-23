package com.github.hanyaeger.tutorial.entities.button;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import com.github.hanyaeger.tutorial.Slime;
import com.github.hanyaeger.tutorial.entities.ActiveScene;
import com.github.hanyaeger.tutorial.scenes.MenuScene;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ResumeButton extends TextEntity implements MouseButtonPressedListener, MouseExitListener, MouseEnterListener {

    private Slime slime;
    ActiveScene activeScene;
    public ResumeButton(Coordinate2D initialLocation, Slime slime, ActiveScene activeScene) {
        super(initialLocation, "Continue");
        setFill(Color.LIGHTBLUE);
        setFont(Font.font("Roboto", FontWeight.BOLD, 40));
        this.slime = slime;
        this.activeScene = activeScene;
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        slime.setActiveScene(1);
    }

    @Override
    public void onMouseEntered() {
        setFill(Color.DARKBLUE);
        setCursor(Cursor.HAND);
    }

    @Override
    public void onMouseExited() {
        setFill(Color.LIGHTBLUE);
        setCursor(Cursor.HAND);
    }
}
