package com.example.application.views.zadaci;

import com.example.application.model.Kolegij;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.List;

@PageTitle("Zadatak 2")
@Route(value = "zadatak2", layout = MainLayout.class)
public class Zadatak2View extends VerticalLayout {

    private H1 naslovH1;
    private TextField imeKolegijaText;
    private TextField ocjenaText;
    private Button potvrdiButton;
    private Grid<Kolegij> kolegijiGrid;
    private Div prosjekDiv;

    private List<Kolegij> kolegiji = new ArrayList<>();

    public Zadatak2View() {
        createComponents();
        composeView();
    }

    private void createComponents() {
        naslovH1 = new H1("Kolegiji i ocjene - Pohrana sadržaja u Grid");

        imeKolegijaText = new TextField("Ime kolegija:");

        ocjenaText = new TextField("Ocjena (1-5):");

        potvrdiButton = new Button("Potvrdi");
        potvrdiButton.addClickListener(e -> {
            String kolegij = imeKolegijaText.getValue();
            String ocjena = ocjenaText.getValue();

            if (!kolegij.isEmpty() && isOcjenaValid(ocjena)) {
                int ocjenaBroj = Integer.parseInt(ocjena);
                // 3. Nakon što se unese vrijednost u TextField potrebno je u dataset dodati novi kolegij sa unesenim vrjiednostima te postaviti grid sa novim vrijednostima


                updateProsjek();
                imeKolegijaText.clear();
                ocjenaText.clear();
            } else {
                Notification.show("Molimo unesite ispravne podatke.");
            }
        });

        // 1. Inicijalizirajte grid te postavite odgovarajuće stupce i napunite grid vrijednostima




        prosjekDiv = new Div();

        // 2. Proučite metodu za ažuriranje prosjeka te ju pozovite kako bi se nakon dodavanja item-a u grid prosjek ažurirao

    }

    private void composeView() {
        add(naslovH1);
        add(imeKolegijaText);
        add(ocjenaText);
        add(potvrdiButton);
        // 4. Dodajte grid kako bio bio vidljiv na pogledu

        add(prosjekDiv);
    }

    private void updateProsjek() {
        double ukupniProsjek = kolegiji.stream().mapToInt(Kolegij::getOcjena).average().orElse(0.0);
        prosjekDiv.setText("Ukupni prosjek ocjena: " + String.format("%.2f", ukupniProsjek));
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