module com.example.test22 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test22 to javafx.fxml;
    exports com.example.test22;
}