package spengergasse.application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class ImageTestController {

    @FXML
    public ImageView imageView;

    @FXML
    public Label yPos;

    @FXML
    public Label xPos;


    public double test(){
        return imageView.getFitWidth();
    }

}