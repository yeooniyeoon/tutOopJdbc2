module com.example.tutoopjdbc2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.tutoopjdbc2 to javafx.fxml;
    exports com.example.tutoopjdbc2;
}