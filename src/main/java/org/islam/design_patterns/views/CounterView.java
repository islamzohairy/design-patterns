/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.islam.design_patterns.views;

import java.awt.BorderLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author 20114
 */
public class CounterView extends JFrame implements PropertyChangeListener{
    private final JLabel counterLabel;
    private final JButton incrementButton;
    private final JButton decrementButton;

    public CounterView(){
        counterLabel = new JLabel("0");
        incrementButton = new JButton("+");
        decrementButton = new JButton("-");

        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.add(decrementButton);
        panel.add(counterLabel);
        panel.add(incrementButton);

        add(panel, BorderLayout.CENTER);

        setTitle("Counter App");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("count".equals(evt.getPropertyName())) {
            counterLabel.setText(String.valueOf(evt.getNewValue()));
        }
    }



    public JLabel getCounterLabel() {
        return counterLabel;
    }

    public JButton getIncrementButton() {
        return incrementButton;
    }

    public JButton getDecrementButton() {
        return decrementButton;
    }

}
