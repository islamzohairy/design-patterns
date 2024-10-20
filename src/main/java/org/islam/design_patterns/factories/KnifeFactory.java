/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns.factories;

import org.islam.design_patterns.KnifeType;
import org.islam.design_patterns.knives.Knife;

/**
 *
 * @author 20114
 */
public abstract class KnifeFactory {

    abstract Knife createKnife(KnifeType type);

    public Knife orderKnife(KnifeType type) {
        Knife knife = createKnife(type);

        if (knife != null) {
            knife.sharpen();
            knife.polish();
            knife.pack();
        }

        return knife;
    }

}
