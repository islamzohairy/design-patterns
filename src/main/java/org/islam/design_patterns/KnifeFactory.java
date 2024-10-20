/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class KnifeFactory {

    public Knife createKnife(KnifeType type) {
        Knife knife;

        if (type == KnifeType.KITCHEN) {
            knife = new KitchenKnife();
        } else {
            knife = new SteakKnife();
        }

        return knife;
    }
}
