package gestion_fichiers;

import java.util.Date;

public abstract class Fichier {
	protected String nom;
	protected Date date;
	protected Date dateModification;
	private Repertoire repertoire;
	
	
	public Fichier() {}
	
	public Fichier(String nom, Date date) {
		this.nom = nom;
		this.date = date;
	}
	
	public Fichier(String nom) {
		this(nom, new Date());
	}
	
	public Fichier(String nom, Date date, Repertoire r){
		this(nom, date);
		this.repertoire = r;
		r.addInRepertoire(this);
	}
	
	public Fichier(String nom, Repertoire r) {
		this(nom, new Date(), r);
	}
	
	public Fichier(Fichier f) {
		this.nom = f.nom;
		this.date = f.date;
		if(f.repertoire != null) {
			this.repertoire = f.repertoire;
		}
	}
	
	
	public abstract int getTaille();
	
	public String getUrl() {
		if(this.repertoire == null) {
			return this.nom;
		}
		return this.repertoire.getUrl() + "/" + this.nom;
	}
	
	@Override
	public abstract String toString();
	
	public String getPrefixe() {
		if(this.repertoire == null) {
			return "";
		}
		return this.repertoire.getPrefixe() + "|" + "\t";
	}
	
	public boolean isDirectory(){
		return this instanceof Repertoire;
	}

	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public Repertoire getRepertoire() {
		return repertoire;
	}
	public void setRepertoire(Repertoire repertoire) {
		this.repertoire = repertoire;
	}
	
}
