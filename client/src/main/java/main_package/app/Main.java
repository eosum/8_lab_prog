package main_package.app;

import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import main_package.util.*;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage stage) {
        try {
            SceneSwitch.setStage(stage);
            SceneSwitch.setScene("../../fxml/authorization.fxml", "../../css/authorization_style.css");
            SceneSwitch.show();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}