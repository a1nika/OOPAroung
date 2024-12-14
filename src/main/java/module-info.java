module com.oop.mid {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.mid to javafx.fxml;
    exports com.oop.mid;
}