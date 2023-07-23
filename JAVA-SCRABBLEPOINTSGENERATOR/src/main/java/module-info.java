module com.msd7781.javascrabblepointsgenerator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.msd7781.javascrabblepointsgenerator to javafx.fxml;
    exports com.msd7781.javascrabblepointsgenerator;
}