package Classes;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class MainScreenController {

    public void openAddScreen(MouseEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("AddScreen.fxml"));
        Main.stage.getScene().setRoot(root);
    }
    public void openPlayScreen(MouseEvent event) throws  IOException{
        Parent root= FXMLLoader.load(getClass().getResource("PlayScreen.fxml"));
        Main.stage.getScene().setRoot(root);

    }
}
