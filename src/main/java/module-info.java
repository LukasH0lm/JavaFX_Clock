module com.monkeygang.javafx_clock {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.monkeygang.javafx_clock to javafx.fxml;
    exports com.monkeygang.javafx_clock;
}