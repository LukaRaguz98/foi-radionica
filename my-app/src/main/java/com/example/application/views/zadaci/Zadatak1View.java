package com.example.application.views.zadaci;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Zadatak 1")
@Route(value = "zadatak1", layout = MainLayout.class)
public class Zadatak1View extends VerticalLayout {

    private H1 naslovH1;
    private TextField imeKolegijaText;
    private TextField ocjenaText;
    private Button potvrdiButton;

    public Zadatak1View() {
        createComponents();
        composeView();
    }

    private void createComponents() {
        naslovH1 = new H1("Kolegiji i ocjene - Kreiranje komponenti");

        // 1. Inicijalizirajte dva TextField-a imeKolegijaText i ocjenaText te im dodajte pripadajuće labele



        potvrdiButton = new Button("Potvrdi");
        potvrdiButton.addClickListener(e -> {
            // 2. Dovršite sljedeći dio koda tako da varijablama predmet i ocjena, umjesto praznog string-a, dodjelite vrijednost iz TextField-a koji ste definirali ranije
            String predmet = "";
            String ocjena = "";

            // 3. Proširite uvjet tako da se provjerava da li je unesena vrijednost između 1 i 5 (Koristite gotovu metodu isOcjenaValid)
            if (!predmet.isEmpty()) {
                // 4. Parsirajte ocjenu u Integer te ju probajte ispisati na ekranu u obliku notifikacije


            } else {
                Notification.show("Molimo unesite ispravne podatke.");
            }
        });
    }

    private void composeView() {
        add(naslovH1);
        // 5. Dodajte 3 kreirane komponente kako bi se prikazali na pogledu kao što je to napravljeno sa naslovom



    }

    private boolean isOcjenaValid(String ocjenaText) {
        try {
            int ocjena = Integer.parseInt(ocjenaText);
            return ocjena >= 1 && ocjena <= 5;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
