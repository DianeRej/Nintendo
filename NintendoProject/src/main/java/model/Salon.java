package model;

import java.time.LocalDate;

public class Salon extends Console {
	
	public Salon(String nom, Double prix, LocalDate dateSortie) {
		super(nom, prix, dateSortie);
		this.nom = nom;
		this.prix = prix;
		this.dateSortie = dateSortie;
		
	}
}