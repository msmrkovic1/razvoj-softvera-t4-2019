package sample;

import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

import java.util.ArrayList;

public class Controller {
    public TextArea unos;
    public TextArea rezultat;
    public Button dodajArtikle;

    private ArrayList<sample.Artikal> artikli = new ArrayList<>();

    public void dodajArtikle(ActionEvent actionEvent){
        String[] artiklStr = unos.getText().split("\n");

        for(String linija: artiklStr) {
            artikli.add(new sample.Artikal(linija));
        }

        artikli=sample.Artikal.izbaciDuplikate(artikli);

        String res = "";

        for (sample.Artikal artikal : artikli) {
            res+= artikal + "\n";
        }

        rezultat.setText(res);
    }

}
