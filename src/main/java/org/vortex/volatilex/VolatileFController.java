package org.vortex.volatilex;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class VolatileFController {
    @FXML
    private ImageView logoImage;
    @FXML
    private ProgressIndicator loadingIndicator;

    @FXML
    public void initialize() {


        PauseTransition delay = new PauseTransition(Duration.seconds(3));
        delay.setOnFinished(event -> {
            logoImage.setVisible(true);
            loadingIndicator.setVisible(true);
        });
        delay.play();

    }
}