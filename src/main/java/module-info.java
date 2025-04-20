module com.example.cod4radiobutton {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.cod4radiobutton to javafx.fxml;
    exports com.example.cod4radiobutton;
}