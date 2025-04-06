module org.vortex.volatilex {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;

    opens org.vortex.volatilex to javafx.fxml;
    exports org.vortex.volatilex;
}