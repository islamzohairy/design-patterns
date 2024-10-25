/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class AddTextCommand implements TextEditingCommand {

    private final Document document;
    private final String text;

    public AddTextCommand(Document document, String text) {
        this.document = document;
        this.text = text;
    }

    @Override
    public void execute() {
        document.add(text);
    }

    @Override
    public void unexecute() {
        document.remove(text);
    }

}
