package model;

import java.time.LocalDate;

public class Hybride extends Console {
	
	public Hybride(String nom, Double prix, LocalDate dateSortie) {
		super(nom, prix, dateSortie);
		this.nom = nom;
		this.prix = prix;
		this.dateSortie = dateSortie;
	}
}