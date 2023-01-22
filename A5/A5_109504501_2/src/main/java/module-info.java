module com.example.a5_109504501_2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.a5_109504501_2 to javafx.fxml;
    exports com.example.a5_109504501_2;
}