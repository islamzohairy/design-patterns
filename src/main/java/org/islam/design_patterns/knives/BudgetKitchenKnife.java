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
public class BudgetKitchenKnife extends Knife {

    public BudgetKitchenKnife() {
        super(KnifeType.KITCHEN, 15);
    }

    @Override
    public void sharpen() {
        System.out.println("Sharpening " + KnifeType.KITCHEN);
    }

    @Override
    public void polish() {
        System.out.println("Polishing " + KnifeType.KITCHEN);
    }

    @Override
    public void pack() {
        System.out.println("Packing " + KnifeType.KITCHEN + "\n");
    }
}
