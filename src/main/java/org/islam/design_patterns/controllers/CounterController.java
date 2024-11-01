/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.islam.design_patterns.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.islam.design_patterns.models.Counter;
import org.islam.design_patterns.views.CounterView;

/**
 *
 * @author 20114
 */
public class CounterController {
    private Counter model;
    private final CounterView view;

    private final ActionListener incrementListener;
    private final ActionListener decrementListener;

    public CounterController(Counter model, CounterView view){
        this.model = model;
        this.view = view;
        this.model.addPropertyChangeListener(this.view);

        incrementListener = (ActionEvent e) -> {
            this.model.increment();
        };

        decrementListener = (ActionEvent e) -> {
            this.model.decrement();
        };

        this.view.getIncrementButton().addActionListener(incrementListener);

        this.view.getDecrementButton().addActionListener(decrementListener);
    }

    public void removeListeners() {
        view.getIncrementButton().removeActionListener(incrementListener);
        view.getDecrementButton().removeActionListener(decrementListener);
        model.removePropertyChangeListener(view);
    }
}
