package com.github.hanyaeger.tutorial.button;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import com.github.hanyaeger.tutorial.Slime;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class StartButton extends TextEntity implements MouseButtonPressedListener, MouseExitListener, MouseEnterListener {

    private Slime slime;

    public StartButton(Coordinate2D location, Slime slime){
        super(location, "Start adventure");
        setFill(Color.LIGHTBLUE);
        setFont(Font.font("Roboto", FontWeight.BOLD, 25));
        this.slime = slime;
    }


    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {

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
