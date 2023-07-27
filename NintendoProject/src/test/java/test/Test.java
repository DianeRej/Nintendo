package test;

import java.time.LocalDate;

import model.Adresse;
import model.Boutique;
import model.Client;
import model.Console;
import model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Console c1 = new Console("Switch", 120.0 , LocalDate.parse("2017-03-03"));
		Jeu j1 = new Jeu("Zelda : Breath of the wild", c1);
		Jeu j2 = new Jeu("Zelda : Tears of the kingdom", c1);
		Jeu j3 = new Jeu("Mario Kart 8 Deluxe", c1);
		Jeu j4 = new Jeu("Pokémon : Let's Go, Pikachu", c1);
		Jeu j5 = new Jeu("Pokémon Epée", c1);
		
		Adresse a1 = new Adresse(3, "rue de la vallee", "Barbieland");
		Boutique b1 = new Boutique("Nook Shop", a1);
		Client cli1 = new Client("Even","Manon");
		Client cli2 = new Client("Reja","Diane");
		
	}




}
