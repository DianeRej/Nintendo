package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Achat;
import model.Adresse;
import model.Boutique;
import model.Client;
import model.Jeu;
import model.Portable;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adresse a1 = new Adresse(3, "rue de la vallee", "Barbieland");
		Boutique b1 = new Boutique("Nook Shop", a1);
		Client cli1 = new Client("Even","Manon");
		Client cli2 = new Client("Reja","Diane");
		
		Portable c1 = new Portable("Switch", 120.0 , LocalDate.parse("2017-03-03"));
		Jeu j1 = new Jeu("Zelda : Breath of the wild", c1, b1);
		Jeu j2 = new Jeu("Zelda : Tears of the kingdom", c1, b1);
		Jeu j3 = new Jeu("Mario Kart 8 Deluxe", c1, b1);
		Jeu j4 = new Jeu("Pokémon : Let's Go, Pikachu", c1, b1);
		Jeu j5 = new Jeu("Pokémon Epée", c1, b1);
		
		Achat ac1 = new Achat(j4, LocalDate.now(), 45.5);
		Achat ac2 = new Achat(j1, LocalDate.now(), 60.0);
		
		List<Achat> achats = new ArrayList<Achat>();
		Collections.addAll(achats, ac1, ac2);
		cli1.setAchats(achats);
		
	}




}
