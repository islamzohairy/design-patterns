/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.islam.design_patterns;

import org.islam.design_patterns.controllers.CounterController;
import org.islam.design_patterns.models.Counter;
import org.islam.design_patterns.views.CounterView;

/**
 *
 * @author 20114
 */

public class DesignPatterns {


    public static void main(String[] args) {
        Counter model = new Counter();
        CounterView view = new CounterView();
        new CounterController(model, view);

        view.setVisible(true);
        }
}
