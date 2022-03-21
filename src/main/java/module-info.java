module com.mycompany.shapeslab {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.shapeslab to javafx.fxml;
    exports com.mycompany.shapeslab;
}
