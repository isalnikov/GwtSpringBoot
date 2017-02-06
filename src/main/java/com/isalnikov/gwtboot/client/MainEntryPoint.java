package com.isalnikov.gwtboot.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class MainEntryPoint implements EntryPoint {

 
    public MainEntryPoint() {
    }


    @Override
    public void onModuleLoad() {
        final Label label = new Label("Hello, GWT !!!");
        final Button button = new Button("Click me!");
        
        button.addClickHandler((event) -> {
            label.setVisible(!label.isVisible());
        });
        
        RootPanel.get().add(button);
        RootPanel.get().add(label);
    }
}
