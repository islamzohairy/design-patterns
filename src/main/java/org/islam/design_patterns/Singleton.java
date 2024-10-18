/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class Singleton {

    private static Singleton instance;
    private String message;

    private Singleton() {
        this.message = "Default Message";
    }

    private Singleton(String message) {
        this.message = message;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public static Singleton getInstance(String message) {
        if (instance == null) {
            instance = new Singleton(message);
        }

        return instance;
    }

    public void showMessage() {
        System.out.println(this.message);
    }

    public void setMessage(String newMessage) {
        this.message = newMessage;
    }
}
