/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class DesignPatterns {

    public static void main(String[] args) {
        final KnifeFactory factory = new KnifeFactory();

        Knife knife1 = factory.createKnife(KnifeType.KITCHEN);
        Knife knife2 = factory.createKnife(KnifeType.STEAK);

        System.out.println(knife1.getPrice() + "$");
        System.out.println(knife2.getPrice() + "$");

        knife1.setPrice(10);

        System.out.println(knife1.getPrice() + "$");
    }
}
