/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns.factories;

import org.islam.design_patterns.KnifeType;
import org.islam.design_patterns.knives.KitchenKnife;
import org.islam.design_patterns.knives.Knife;
import org.islam.design_patterns.knives.SteakKnife;

/**
 *
 * @author 20114
 */
public class NormalKnifeFactory extends KnifeFactory {

    @Override
    Knife createKnife(KnifeType type) {
        Knife knife;
        switch (type) {
            case KITCHEN ->
                knife = new KitchenKnife();

            case STEAK ->
                knife = new SteakKnife();

            default -> {
                return null;
            }

        }

        return knife;
    }
}
