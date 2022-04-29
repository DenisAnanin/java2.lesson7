module com.example.java2lesson7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java2lesson7 to javafx.fxml;
    exports com.example.java2lesson7;
}