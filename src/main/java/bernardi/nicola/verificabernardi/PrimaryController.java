package bernardi.nicola.verificabernardi;

import bernardi.nicola.verificabernardi.model.Autonoleggio;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class PrimaryController implements Initializable {
    Autonoleggio a = new Autonoleggio();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        a.ordinaPerVeicolo();
        display.setText(a.arrayListToString());
    }
    
    @FXML
    private TextArea display;

    @FXML
    void importoDaFatturare(ActionEvent event) {
        display.setText(a.getImportoDaFatturare());
    }

    @FXML
    void visualizzaInGiorni(ActionEvent event) {
        a.ordinaPerGiorni();
        display.setText(a.arrayListToString());
    }

    @FXML
    void visualizzaInKm(ActionEvent event) {
        a.ordinaPerKm();
        display.setText(a.arrayListToString());
    }

    
}
