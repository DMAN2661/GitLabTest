module com.example.gitlabtest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gitlabtest to javafx.fxml;
    exports com.example.gitlabtest;
}