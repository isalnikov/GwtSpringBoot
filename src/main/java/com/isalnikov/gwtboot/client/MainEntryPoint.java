/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isalnikov.gwtboot.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.event.dom.client.ClickEvent;

/**
 * Main entry point.
 *
 * @author Alexander Chuprynov <achuprynov@gmail.com>
 */
public class MainEntryPoint implements EntryPoint {

 
    public MainEntryPoint() {
    }


    @Override
    public void onModuleLoad() {
        final Label label = new Label("Hello, GWT !!!");
        final Button button = new Button("Click me!");
        
        button.addClickHandler((ClickEvent event) -> {
            label.setVisible(!label.isVisible());
        });
        
        RootPanel.get().add(button);
        RootPanel.get().add(label);
    }
}
