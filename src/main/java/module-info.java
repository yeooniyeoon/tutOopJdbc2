module com.example.tutoopjdbc2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.junit.jupiter.api;


    opens com.example.tutoopjdbc2 to javafx.fxml;
    exports com.example.tutoopjdbc2;
}