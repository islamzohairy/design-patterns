/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class SteakKnife extends Knife {

    public SteakKnife() {
        super(KnifeType.STEAK, 20);
    }

    @Override
    public void sharpen() {
        System.out.println("\t\tSharpening " + KnifeType.STEAK);
    }

    @Override
    public void polish() {
        System.out.println("\tPolishing " + KnifeType.STEAK);
    }

    @Override
    public void pack() {
        System.out.println("Packing " + KnifeType.STEAK);
    }
}
