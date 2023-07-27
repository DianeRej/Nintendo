package model;

import java.time.LocalDate;

public abstract class Console {

	protected String nom;
	protected Double prix;
	protected LocalDate dateSortie;


	public Console(String nom, Double prix, LocalDate dateSortie) {
		this.nom = nom;
		this.prix = prix;
		this.dateSortie = dateSortie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Double getPrix() {
		return prix;
	}

	public LocalDate getDateSortie() {
		return dateSortie;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public void setDateSortie(LocalDate dateSortie) {
		this.dateSortie = dateSortie;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + ", prix=" + prix + ", dateSortie=" + dateSortie + "]";
	}

	
	
}
