package com.example.application.views;

import com.example.application.views.zadaci.Zadatak1View;
import com.example.application.views.zadaci.Zadatak2View;
import com.example.application.views.zadaci.Zadatak3View;
import com.example.application.views.zadaci.Zadatak4View;
import com.example.application.views.zadaci.Zadatak5View;
import com.example.application.views.pocetna.PocetnaView;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.Footer;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.theme.lumo.LumoUtility;
import org.vaadin.lineawesome.LineAwesomeIcon;

public class MainLayout extends AppLayout {

    private H2 viewTitle;

    public MainLayout() {
        setPrimarySection(Section.DRAWER);
        addDrawerContent();
        addHeaderContent();
    }

    private void addHeaderContent() {
        DrawerToggle toggle = new DrawerToggle();
        toggle.setAriaLabel("Prikaži izbornik");

        viewTitle = new H2();
        viewTitle.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);

        addToNavbar(true, toggle, viewTitle);
    }

    private void addDrawerContent() {
        H1 appName = new H1("Radionica");
        appName.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);
        Header header = new Header(appName);

        Scroller scroller = new Scroller(createNavigation());

        addToDrawer(header, scroller, createFooter());
    }

    private SideNav createNavigation() {
        SideNav nav = new SideNav();

        nav.addItem(new SideNavItem("Početna", PocetnaView.class, LineAwesomeIcon.GLOBE_SOLID.create()));
        nav.addItem(new SideNavItem("Zadatak 1", Zadatak1View.class, LineAwesomeIcon.FILE.create()));
        nav.addItem(new SideNavItem("Zadatak 2", Zadatak2View.class, LineAwesomeIcon.FILE.create()));
        nav.addItem(new SideNavItem("Zadatak 3", Zadatak3View.class, LineAwesomeIcon.FILE.create()));
        nav.addItem(new SideNavItem("Zadatak 4", Zadatak4View.class, LineAwesomeIcon.FILE.create()));
        nav.addItem(new SideNavItem("Zadatak 5", Zadatak5View.class, LineAwesomeIcon.FILE.create()));

        return nav;
    }

    private Footer createFooter() {
        Footer layout = new Footer();

        return layout;
    }

    @Override
    protected void afterNavigation() {
        super.afterNavigation();
        viewTitle.setText(getCurrentPageTitle());
    }

    private String getCurrentPageTitle() {
        PageTitle title = getContent().getClass().getAnnotation(PageTitle.class);
        return title == null ? "" : title.value();
    }
}
