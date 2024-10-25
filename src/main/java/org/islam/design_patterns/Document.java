/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class Document {

    private final StringBuilder content = new StringBuilder();

    public void add(String text) {
        content.append(text);
        System.out.println("Text after addition: " + content.toString());
    }

    public void remove(String text) {
        int startIndex = content.lastIndexOf(text);

        if (startIndex != -1) {
            content.delete(startIndex, startIndex + text.length());
            System.out.println("Text after removal: " + content.toString());
        }
    }

    public String getContent() {
        return content.toString();
    }
}
