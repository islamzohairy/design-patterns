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

        // Get the only instance of Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance("New Message");

        // Show message using the singleton instance
        singleton1.showMessage();
        singleton2.showMessage();

        // Check if both references point to the same instance
        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same");
        } else {
            System.out.println("Different instances");
        }

        singleton1.updateMessage("New Message");
        singleton2.showMessage();

    }
}
