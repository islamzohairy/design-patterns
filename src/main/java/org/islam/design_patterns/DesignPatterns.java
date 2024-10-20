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

        knife1.sharpen();
        knife1.polish();
        knife1.pack();

        knife2.sharpen();
        knife2.polish();
        knife2.pack();

        System.out.println("Kitchen Knife: " + knife1.getPrice() + "$");
        System.out.println("Steak Knife: " + knife2.getPrice() + "$");

        knife1.setPrice(10);

        System.out.println("Kitchen Knife after sale: " + knife1.getPrice() + "$");
    }
}
