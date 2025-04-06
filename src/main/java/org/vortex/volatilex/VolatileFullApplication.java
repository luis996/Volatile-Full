package org.vortex.volatilex;

import javafx.animation.*;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;

public class VolatileFullApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, InterruptedException {
        FXMLLoader fxmlLoader = new FXMLLoader(VolatileFullApplication.class.getResource("first-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 480);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("Volatile 1.0.0-SNAPSHOT");
        stage.setScene(scene);
        stage.show();
        stage.setWidth(800);
        stage.centerOnScreen();
    }

    public static void main(String[] args) {
        launch();
    }
}