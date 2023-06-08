module com.example.tp_note_archilog {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.tp_note_archilog to javafx.fxml;
    exports com.example.tp_note_archilog;
    exports com.example.tp_note_archilog.Modele;
    opens com.example.tp_note_archilog.Modele to javafx.fxml;
    exports com.example.tp_note_archilog.Tests;
    opens com.example.tp_note_archilog.Tests to javafx.fxml;
}