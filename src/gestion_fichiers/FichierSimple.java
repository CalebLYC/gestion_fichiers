package gestion_fichiers;

import java.util.Date;

public class FichierSimple extends Fichier {
	private int taille;
	
	
	public  FichierSimple(String nom, Date date) {
		super(nom, date);
	}
	
	public FichierSimple(String nom) {
		super(nom);
	}
	
	public FichierSimple(String nom, Date date, Repertoire r) {
		super(nom, date , r);
	}
	
	public FichierSimple(String nom, Repertoire r) {
		super(nom, r);
	}
	
	public FichierSimple(String nom, Date date, Repertoire r, int taille) {
		this(nom, date, r);
		this.taille = taille;
	}
	
	public FichierSimple(String nom, Repertoire r, int taille) {
		this(nom, r);
		this.taille = taille;
	}
	

	@Override
	public int getTaille() {
		return taille;
	}
	
	@Override
	public String toString() {
		return "-" + nom;
	}

}
