/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns.factories;

import org.islam.design_patterns.KnifeType;
import org.islam.design_patterns.knives.BudgetKitchenKnife;
import org.islam.design_patterns.knives.BudgetSteakKnife;
import org.islam.design_patterns.knives.Knife;

/**
 *
 * @author 20114
 */
public class BudgetKnifeFactory extends KnifeFactory {

    @Override
    Knife createKnife(KnifeType type) {
        Knife knife;
        switch (type) {
            case KITCHEN ->
                knife = new BudgetKitchenKnife();

            case STEAK ->
                knife = new BudgetSteakKnife();

            default -> {
                return null;
            }

        }

        return knife;
    }

}
