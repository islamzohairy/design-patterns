/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

import java.util.Stack;

/**
 *
 * @author 20114
 */
public class TextEditingManager {

    private final Stack<TextEditingCommand> undoCommands = new Stack<>();
    private final Stack<TextEditingCommand> redoCommands = new Stack<>();

    public void executeCommand(TextEditingCommand command) {
        command.execute();

        undoCommands.push(command);
        redoCommands.clear();
    }

    public void undo() {
        if (!undoCommands.isEmpty()) {
            TextEditingCommand command = undoCommands.pop();
            command.unexecute();
            redoCommands.push(command);
        }
    }

    public void redo() {
        if (!redoCommands.isEmpty()) {
            TextEditingCommand command = redoCommands.pop();
            command.execute();
            undoCommands.push(command);
        }
    }
}
