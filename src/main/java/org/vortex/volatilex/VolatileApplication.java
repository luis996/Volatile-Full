package org.vortex.volatilex;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class VolatileApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VolatileApplication.class.getResource("first-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 480);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("Volatile Updater");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}