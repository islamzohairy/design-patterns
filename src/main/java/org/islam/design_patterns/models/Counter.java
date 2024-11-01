/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.islam.design_patterns.models;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author 20114
 */
public class Counter {
    private int count;
    private final PropertyChangeSupport support;

    public Counter() {
        this.count = 0;
        this.support = new PropertyChangeSupport(this);
    }

    public int getCount(){
        return count;
    }

    private void setCount(int newCount){
        int oldCount = this.count;
        this.count = newCount;
        support.firePropertyChange("count", oldCount, newCount);
    }

    public void increment(){
        setCount(getCount() + 1);
    }

    public void decrement(){
        setCount(getCount() - 1);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener){
        support.removePropertyChangeListener(listener);
    }
}
