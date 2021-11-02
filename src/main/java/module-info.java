module ucf.todoapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens ucf.todoapp to javafx.fxml;
    exports ucf.todoapp;
}