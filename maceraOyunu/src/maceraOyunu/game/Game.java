package maceraOyunu.game;

import javax.swing.JOptionPane;

import maceraOyunu.places.Location;

@SuppressWarnings("unused")
public class Game {
	Player player = new Player();
	Location location;
	
	public void start() {
		player.selectChar();
	}
}
