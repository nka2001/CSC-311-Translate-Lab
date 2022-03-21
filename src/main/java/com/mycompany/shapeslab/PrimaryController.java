package com.mycompany.shapeslab;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Translate;

public class PrimaryController {

    @FXML
    private Button rectRight;
    @FXML
    private Button allRight;
    @FXML
    private Circle Circ;
    @FXML
    private Rectangle Rect;
    @FXML
    private Button RectRot;
    @FXML
    private Button scaleCirc;
    @FXML
    private Button optScale;
    @FXML
    private Button optRot;

 
    @FXML
    private void moveRectToRight(ActionEvent event) {
        
        Translate t = new Translate();
        t.setX(100);
        
        Rect.getTransforms().add(t);
        
        
    }

    @FXML
    private void moveAllToRight(ActionEvent event) {
        
        Translate t = new Translate();
        t.setX(100);
        
        Rect.getTransforms().add(t);
        Circ.getTransforms().add(t);
        
        
        
        
    }

    @FXML
    private void rotateRect(ActionEvent event) {
        
        Rotate r = new Rotate();
        r.setAngle(60);
        
        Rect.getTransforms().add(r);
        
        
        
        
    }

    @FXML
    private void makeCircleBig(ActionEvent event) {
        
        Scale s = new Scale();
        
        s.setX(2);
        s.setY(2);
        
        
        Circ.getTransforms().add(s);
        
    }

    @FXML
    private void optionalScale(ActionEvent event) {
        
        Scale s = new Scale();
        
        s.setX(2);
        s.setY(2);
        
       
        
        
        
        
        
        
    }

    @FXML
    private void optionalRotate(ActionEvent event) {
        
        Rotate r = new Rotate();
        
        r.setPivotX(Rect.getX() / 2);
        r.setPivotY(Rect.getY() / 2);
        
        Rect.getTransforms().add(r);
        
        
        
    }
}
