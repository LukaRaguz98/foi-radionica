package com.example.application.views.pocetna;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Početna")
@Route(value = "pocetna", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class PocetnaView extends VerticalLayout {

    private H3 zadatak1Naslov;
    private Label zadatak1Opis;

    private H3 zadatak2Naslov;
    private Label zadatak2Opis;

    private H3 zadatak3Naslov;
    private Label zadatak3Opis;

    private H3 zadatak4Naslov;
    private Label zadatak4Opis;

    private H3 zadatak5Naslov;
    private Label zadatak5Opis;

    private H3 zadatakBonusNaslov;
    private Label zadatakBonusOpis;

    public PocetnaView() {
        createComponents();
        composeView();
    }

    private void createComponents() {
        zadatak1Naslov = new H3("Zadatak 1: Kolegiji i ocjene - Kreiranje komponenti");
        zadatak1Opis = new Label("Kreirajte komponente za unos imena kolegija i ocjene iz tog kolegija. Nakon unosa podataka, treba se ispisati poruka kolegija i ocjene u obliku notifikacije. Prije nego što se prikažu podaci potrebno je obaviti provjeru ispravnosti ocjene.");

        zadatak2Naslov = new H3("Zadatak 2: Kolegiji i ocjene - Pohrana sadržaja u Grid");
        zadatak2Opis = new Label("Nadogradite pogled iz zadatka 1 tako da se vaš kolegij i ocjena unose u grid. Nakon unosa zapisa u Grid, ispod grida se ažurira prosjek ocjena s kolegija. Prije unosa ocjene potrebno je obaviti provjeru ispravnosi ocjene.");

        zadatak3Naslov = new H3("Zadatak 3: Kolegiji i ocjene - Dodavanje ComboBox-a i izmjena layout-a");
        zadatak3Opis = new Label("Nadogradite pogled iz zadatka 2 tako da se kolegiji i ocjene unose iz combobox-a sa određenim vrijednostima. Izmjenite vaš layout tako da kolegij, ocjena i gumb budu smješteni horizontalno jedno do drugoga.");

        zadatak4Naslov = new H3("Zadatak 4: Kolegiji i ocjene - Ograničenje unosa");
        zadatak4Opis = new Label("Nadogradite pogled iz zadatka 3 tako da se prilikom unosa ograniči da se jedan kolegij ne može unesti 2 puta.");

        zadatak5Naslov = new H3("Zadatak 5: Kolegiji i ocjene - Ažuriranje i brisanje kolegija");
        zadatak5Opis = new Label("Nadogradite pogled iz zadatka 4 tako da nadodate brisanje i uređivanje kolegija iz grid-a.");

        zadatakBonusNaslov = new H3("Bonus zadatak: CSS stilizacija");
        zadatakBonusOpis = new Label("Ukoliko ostane vremena, poigrajte se sa uređivanjem komponenti preko CSS-a.");
    }

    private void composeView() {
        add(zadatak1Naslov);
        add(zadatak1Opis);
        add(new Hr());

        add(zadatak2Naslov);
        add(zadatak2Opis);
        add(new Hr());

        add(zadatak3Naslov);
        add(zadatak3Opis);
        add(new Hr());

        add(zadatak4Naslov);
        add(zadatak4Opis);
        add(new Hr());

        add(zadatak5Naslov);
        add(zadatak5Opis);
        add(new Hr());

        add(zadatakBonusNaslov);
        add(zadatakBonusOpis);
    }
}
