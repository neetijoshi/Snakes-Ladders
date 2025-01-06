module com.example.snakesladders1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.snakesladders1 to javafx.fxml;
    exports com.example.snakesladders1;
}