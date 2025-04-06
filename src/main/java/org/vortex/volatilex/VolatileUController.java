package org.vortex.volatilex;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class VolatileUController {
    @FXML
    private ImageView logoImage;
    @FXML
    private ProgressIndicator loadingIndicator;

    @FXML
    public void initialize() {
        // Fade-in effect
        FadeTransition fade = new FadeTransition(Duration.seconds(1.2), logoImage);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.setInterpolator(Interpolator.EASE_OUT);


        TranslateTransition translate = new TranslateTransition(Duration.seconds(1), logoImage);
        translate.setByY(-55); // Move image up by 20 pixels
        translate.setInterpolator(new Interpolator() {
            @Override
            protected double curve(double t) {
                // Simple ease-both: slow start, fast mid, slow end
                return t < 0.5 ? 4 * t * t * t : 1 - Math.pow(-2 * t + 2, 3) / 2;
            }
        });




        // Sequential transition: Fade-in, then move along the path
        SequentialTransition sequence = new SequentialTransition(fade, translate);
        sequence.setOnFinished(event -> {
            // Show the loading indicator after transition
            loadingIndicator.setVisible(true);
        });
        sequence.play();
    }
}