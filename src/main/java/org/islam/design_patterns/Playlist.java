/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

import java.util.ArrayList;

/**
 *
 * @author 20114
 */
public class Playlist implements IComponent {

    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    @Override
    public void play() {
        System.out.println("Playing Playlist: " + playlistName);
        for (IComponent component : playlist) {
            component.play();
        }
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for (IComponent component : playlist) {
            component.setPlaybackSpeed(speed);
        }
    }

    @Override
    public String getName() {
        return this.playlistName;
    }

    public void add(IComponent component) {
        this.playlist.add(component);
    }

    public void remove(IComponent component) {
        this.playlist.remove(component);
    }

}
