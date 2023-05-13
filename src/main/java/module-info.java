module bernardi.nicola.verificabernardi {
    requires javafx.controls;
    requires javafx.fxml;

    opens bernardi.nicola.verificabernardi to javafx.fxml;
    exports bernardi.nicola.verificabernardi;
}
