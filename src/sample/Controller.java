package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

    public class Controller implements Initializable {
    public TextArea unos;
    public TextArea rezultat;
    public Button dodajArtikle;

    public Button obracunaj;
    public ChoiceBox<Artikal> cbArtikli;
    public Spinner spArtikli;
    public TextArea artikliRacun;

    private ObservableList<Artikal> observableList = FXCollections.observableArrayList();
    private Racun racun = new Racun();

    private ArrayList<sample.Artikal> artikli = new ArrayList<>();
    public void dodajArtikle(ActionEvent actionEvent){
        String[] artiklStr = unos.getText().split("\n");

        for(String linija: artiklStr) {
            artikli.add(new Artikal(linija));
        }

        Artikal.izbaciDuplikate(artikli);

        String res = "";

        for (sample.Artikal artikal : artikli) {
            res+= artikal + "\n";
        }

        observableList.clear();
        observableList.setAll(artikli);
//        cbArtikli.getSelectionModel().selectFirst();
//        spArtikli.getValue()


        rezultat.setText(res);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        observableList.setAll(artikli);
        cbArtikli.setItems(observableList);
    }

    public void Obracunaj(ActionEvent actionEvent) {
        Artikal trenutni = cbArtikli.getSelectionModel().getSelectedItem();
        int kolicina = spArtikli.getValue();
        racun.dodajStavku(trenutni, kolicina);

        @Override
        public String toString() {
            String str = "";

            for(Stavka s : stavke) {
                str += String.format("%-8s %-4 %.2f\sn", s.artikal.getSifra(), s.kolicina, s.kolicina * s.artikal.getCijena());
            }
            str += String.format("%-12s %.4d ")

            return str;
        }
    }

}
