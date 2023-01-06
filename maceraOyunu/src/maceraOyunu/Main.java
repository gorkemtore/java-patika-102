package maceraOyunu;

import maceraOyunu.game.Game;
import maceraOyunu.obstacles.Bear;
import maceraOyunu.obstacles.Vampire;
import maceraOyunu.obstacles.Zombie;
import java.util.Scanner;
@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		Game game = new Game();
		game.start();
	}
}
