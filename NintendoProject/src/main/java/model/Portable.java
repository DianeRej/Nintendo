package model;

import java.time.LocalDate;

public class Portable extends Console {
	
	public Portable(String nom, Double prix, LocalDate dateSortie) {
		super(nom, prix, dateSortie);
		this.nom = nom;
		this.prix = prix;
		this.dateSortie = dateSortie;
		

	}
}
