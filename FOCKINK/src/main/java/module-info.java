module org.projeto.fockink {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.projeto.fockink to javafx.fxml;
    exports org.projeto.fockink;
}