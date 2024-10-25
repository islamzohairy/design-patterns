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
        Document document = new Document();
        TextEditingManager manager = new TextEditingManager();

        TextEditingCommand command1 = new AddTextCommand(document, "Hi my name is Islam");
        TextEditingCommand command2 = new AddTextCommand(document, ", I'm a software engineer");

        manager.executeCommand(command1);
        manager.executeCommand(command2);
        System.out.println("Current content: " + document.getContent() + '\n');

        manager.undo();
        System.out.println("After undo: " + document.getContent() + '\n');

        manager.redo();
        System.out.println("After redo: " + document.getContent());

    }
}
