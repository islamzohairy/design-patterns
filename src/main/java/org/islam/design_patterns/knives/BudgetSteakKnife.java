/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns.knives;

import org.islam.design_patterns.KnifeType;

/**
 *
 * @author 20114
 */
public class BudgetSteakKnife extends Knife {

    public BudgetSteakKnife() {
        super(KnifeType.STEAK, 10);
    }

    @Override
    public void sharpen() {
        System.out.println("Sharpening " + KnifeType.STEAK);
    }

    @Override
    public void polish() {
        System.out.println("Polishing " + KnifeType.STEAK);
    }

    @Override
    public void pack() {
        System.out.println("Packing " + KnifeType.STEAK);
    }
}
