module org.projeto.telainicial {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.projeto.telainicial to javafx.fxml;
    exports org.projeto.telainicial;
}