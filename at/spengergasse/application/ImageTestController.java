package spengergasse.application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.image.ImageView;

public class ImageTestController {

    @FXML
    public ImageView imageView;

    @FXML
    public Label yPos;

    @FXML
    public Label xPos;

    @FXML
    public Button importButton;

    @FXML
    public Button saveButton;

    @FXML
    public SplitPane splitPane;


    public double test(){
        return imageView.getFitWidth();
    }

}
