package org.vaadin.diego;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
@PWA(name = "Project Base for Vaadin Flow", shortName = "Project Base")
public class MainView extends VerticalLayout {

    public MainView() {
        VerticalLayout content = new VerticalLayout();
        HorizontalLayout header = new HorizontalLayout();
        HorizontalLayout footer = new HorizontalLayout();

        setSizeFull();

        header.setHeight("35px"); header.getStyle().set("background-color","red");
        header.setWidth("100%");

        footer.setHeight("35px"); footer.getStyle().set("background-color","blue");
        footer.setWidth("100%");

        content.setFlexGrow(1); // it does not work
        //content.getStyle().set("flex-grow","1"); // it works

        content.getStyle().set("background-color","yellow");

        add(header, content, footer);
    }
}
