module com.oop.mid.aarongfinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.mid.aarongfinal to javafx.fxml;
    exports com.oop.mid.aarongfinal;
}