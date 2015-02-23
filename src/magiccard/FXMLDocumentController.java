package magiccard;

import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FXMLDocumentController {

    @FXML
    private Label domanda, percentuale, risultato;
    @FXML
    private Button carta1, carta2, carta3, start_continue;
    @FXML
    private ImageView img1, img2, img3;
    private String value_Carta1;
    private String value_Carta2;
    private String value_Carta3;
    private int punteggioVinto = 0;
    private int punteggioPerso = 0;
    private int partiteTotale = 0;

    @FXML
    /*
     *settare il bottone start-confinua
     *settare il testo di tre bottone
     */
    public void changeTxtButton() {
        start_continue.setText("Continua");
        carta1.setText("1) Carta");
        carta2.setText("2) Carta");
        carta3.setText("3) Carta");
    }

    /*
     *settare il bottone che non si puo clicare
     */
    private void setButtonDisable(boolean b) {
        carta1.setDisable(b);
        carta2.setDisable(b);
        carta3.setDisable(b);
    }

    /*
     *settare le tre immagine come default
     */
    private void resetImg() {
        img1.setImage(new Image("default.jpg"));
        img2.setImage(new Image("default.jpg"));
        img3.setImage(new Image("default.jpg"));
    }

    /*
     *Calcola la percentuale di vittoria
     */
    private int calcolaPercentuale() {
        partiteTotale = punteggioVinto + punteggioPerso;
        int percentualeVinto = (punteggioVinto * 100) / partiteTotale;
        return percentualeVinto;
    }

    /*
     *settare le immagine di altre due carte per PRIMO bottone
     */
    private void controllaCartaF1() {
        if (value_Carta1.equalsIgnoreCase("2")) {
            img1.setImage(new Image("2.jpg"));
        }
        if (value_Carta1.equalsIgnoreCase("3")) {
            img1.setImage(new Image("3.jpg"));
        }
        if (value_Carta2.equalsIgnoreCase("A")) {
            img2.setImage(new Image("1.jpg"));
        }
        if (value_Carta2.equalsIgnoreCase("2")) {
            img2.setImage(new Image("2.jpg"));
        }
        if (value_Carta2.equalsIgnoreCase("3")) {
            img2.setImage(new Image("3.jpg"));
        }
        if (value_Carta3.equalsIgnoreCase("A")) {
            img3.setImage(new Image("1.jpg"));
        }
        if (value_Carta3.equalsIgnoreCase("2")) {
            img3.setImage(new Image("2.jpg"));
        }
        if (value_Carta3.equalsIgnoreCase("3")) {
            img3.setImage(new Image("3.jpg"));
        }
    }
    /*
     *settare le immagine di altre due carte per SECONDO bottone
     */

    private void controllaCartaF2() {
        if (value_Carta1.equalsIgnoreCase("A")) {
            img1.setImage(new Image("1.jpg"));
        }
        if (value_Carta1.equalsIgnoreCase("2")) {
            img1.setImage(new Image("2.jpg"));
        }
        if (value_Carta1.equalsIgnoreCase("3")) {
            img1.setImage(new Image("3.jpg"));
        }
        if (value_Carta2.equalsIgnoreCase("2")) {
            img2.setImage(new Image("2.jpg"));
        }
        if (value_Carta2.equalsIgnoreCase("3")) {
            img2.setImage(new Image("3.jpg"));
        }
        if (value_Carta3.equalsIgnoreCase("A")) {
            img3.setImage(new Image("1.jpg"));
        }
        if (value_Carta3.equalsIgnoreCase("2")) {
            img3.setImage(new Image("2.jpg"));
        }
        if (value_Carta3.equalsIgnoreCase("3")) {
            img3.setImage(new Image("3.jpg"));
        }
    }

    /*
     *settare le immagine di altre due carte per TERZO bottone
     */
    private void controllaCartaF3() {
        if (value_Carta1.equalsIgnoreCase("A")) {
            img1.setImage(new Image("1.jpg"));
        }
        if (value_Carta1.equalsIgnoreCase("2")) {
            img1.setImage(new Image("2.jpg"));
        }
        if (value_Carta1.equalsIgnoreCase("3")) {
            img1.setImage(new Image("3.jpg"));
        }
        if (value_Carta2.equalsIgnoreCase("A")) {
            img2.setImage(new Image("1.jpg"));
        }
        if (value_Carta2.equalsIgnoreCase("2")) {
            img2.setImage(new Image("2.jpg"));
        }
        if (value_Carta2.equalsIgnoreCase("3")) {
            img2.setImage(new Image("3.jpg"));
        }
        if (value_Carta3.equalsIgnoreCase("2")) {
            img3.setImage(new Image("2.jpg"));
        }
        if (value_Carta3.equalsIgnoreCase("3")) {
            img3.setImage(new Image("3.jpg"));
        }
    }

    @FXML
    /**
     * Main: viene eseguito quando clicca il bottone start-continua generazione
     * delle carte
     */
    public void reset() {
        changeTxtButton();
        domanda.setText("Dov'è la carta A ?");
        setButtonDisable(false);
        resetImg();
        Random random = new Random();
        int r = random.nextInt(5);
        if (r == 0) {
            value_Carta1 = "A";
            value_Carta2 = "2";
            value_Carta3 = "3";
        }
        if (r == 1) {
            value_Carta1 = "2";
            value_Carta2 = "A";
            value_Carta3 = "3";
        }
        if (r == 2) {
            value_Carta1 = "2";
            value_Carta2 = "3";
            value_Carta3 = "A";
        }
        if (r == 3) {
            value_Carta1 = "3";
            value_Carta2 = "2";
            value_Carta3 = "A";
        }
        if (r == 4) {
            value_Carta1 = "3";
            value_Carta2 = "A";
            value_Carta3 = "2";
        }
        if (r == 5) {
            value_Carta1 = "A";
            value_Carta2 = "3";
            value_Carta3 = "2";
        }
    }

    @FXML
    /*
     *funzione1 viene eseguito quando clicca il PRIMO bottone
     */
    public void f1() {
        if (value_Carta1.equalsIgnoreCase("A")) {
            punteggioVinto++;
            risultato.setText("Hai vinto!");
            img1.setImage(new Image("1.jpg"));
            if (value_Carta2.equalsIgnoreCase("2")) {
                img2.setImage(new Image("2.jpg"));
            }
            if (value_Carta2.equalsIgnoreCase("3")) {
                img2.setImage(new Image("3.jpg"));
            }
            if (value_Carta3.equalsIgnoreCase("2")) {
                img3.setImage(new Image("2.jpg"));
            }
            if (value_Carta3.equalsIgnoreCase("3")) {
                img3.setImage(new Image("3.jpg"));
            }
        } else {
            punteggioPerso++;
            risultato.setText("Hai perso! Hai scelto la carta: " + value_Carta1);
            controllaCartaF1();
        }
        carta1.setText(value_Carta1);
        carta2.setText(value_Carta2);
        carta3.setText(value_Carta3);
        percentuale.setText("Vinto: " + punteggioVinto + " Perso: " + punteggioPerso + " Percentuale: " + calcolaPercentuale() + "%");
        setButtonDisable(true);
    }

    @FXML
    /*
     *funzione1 viene eseguito quando clicca il SECONDO bottone
     */
    public void f2() {
        if (value_Carta2.equalsIgnoreCase("A")) {
            punteggioVinto++;
            risultato.setText("Hai vinto!");
            img2.setImage(new Image("1.jpg"));
            if (value_Carta1.equalsIgnoreCase("2")) {
                img1.setImage(new Image("2.jpg"));
            }
            if (value_Carta1.equalsIgnoreCase("3")) {
                img1.setImage(new Image("3.jpg"));
            }
            if (value_Carta3.equalsIgnoreCase("2")) {
                img3.setImage(new Image("2.jpg"));
            }
            if (value_Carta3.equalsIgnoreCase("3")) {
                img3.setImage(new Image("3.jpg"));
            }
        } else {
            punteggioPerso++;
            risultato.setText("Hai perso! Hai scelto la carta: " + value_Carta2);
            controllaCartaF2();
        }
        carta1.setText(value_Carta1);
        carta2.setText(value_Carta2);
        carta3.setText(value_Carta3);
        percentuale.setText("Vinto: " + punteggioVinto + " Perso: " + punteggioPerso + " Percentuale: " + calcolaPercentuale() + "%");
        setButtonDisable(true);
    }

    @FXML
    /*
     *funzione1 viene eseguito quando clicca il TERZO bottone
     */
    public void f3() {
        if (value_Carta3.equalsIgnoreCase("A")) {
            punteggioVinto++;
            risultato.setText("Hai vinto!");
            img3.setImage(new Image("1.jpg"));
            if (value_Carta1.equalsIgnoreCase("2")) {
                img1.setImage(new Image("2.jpg"));
            }
            if (value_Carta1.equalsIgnoreCase("3")) {
                img1.setImage(new Image("3.jpg"));
            }
            if (value_Carta2.equalsIgnoreCase("2")) {
                img2.setImage(new Image("2.jpg"));
            }
            if (value_Carta2.equalsIgnoreCase("3")) {
                img3.setImage(new Image("3.jpg"));
            }
        } else if (!value_Carta3.equalsIgnoreCase("A")) {
            punteggioPerso++;
            risultato.setText("Hai perso! Hai scelto la carta: " + value_Carta3);
            controllaCartaF3();
        }

        carta1.setText(value_Carta1);
        carta2.setText(value_Carta2);
        carta3.setText(value_Carta3);
        percentuale.setText("Vinto: " + punteggioVinto + "Perso: " + punteggioPerso + " Percentuale: " + calcolaPercentuale() + "%");
        setButtonDisable(true);
    }

}
