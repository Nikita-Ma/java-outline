module com.example.morepractice {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.morepractice to javafx.fxml;
    exports com.example.morepractice;
}