/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class KitchenKnife extends Knife {

    public KitchenKnife() {
        super(KnifeType.KITCHEN, 30);
    }

    @Override
    public void sharpen() {
        System.out.println("Sharpening " + KnifeType.KITCHEN);
    }

    @Override
    public void polish() {
        System.out.println("\tPolishing " + KnifeType.KITCHEN);
    }

    @Override
    public void pack() {
        System.out.println("\t\tPacking " + KnifeType.KITCHEN + "\n");
    }
}
