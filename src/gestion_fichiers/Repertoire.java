package gestion_fichiers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Repertoire extends Fichier {
	private List<Fichier> fichiers = new ArrayList<Fichier>();
	
	
	public Repertoire(String nom, Date date) {
		super(nom, date);
	}
	
	public Repertoire(String nom) {
		super(nom);
	}
	
	public Repertoire(String nom, Date date, Repertoire r) {
		super(nom, date , r);
	}
	
	public Repertoire(String nom, Repertoire r) {
		super(nom, r);
	}
	

	@Override
	public int getTaille() {
		int taille = 0;
		for(Fichier f : fichiers) {
			taille += f.getTaille();
		}
		return taille;
	}
	
	@Override
	public String toString() {
		String toString = this.nom;
		for(Fichier f: fichiers) {
			toString += "\n" + f.getPrefixe() + f.toString();
		}
		return toString;
	}
	
	
	public void addInRepertoire(Fichier f) {
		this.fichiers.add(f);
	}
	
	public List<Fichier> getFichiers(){
		return fichiers;
	}

}
