module org.vortex.volatilexfull {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;

    opens org.vortex.volatilexfull to javafx.fxml;
    exports org.vortex.volatilexfull;
}