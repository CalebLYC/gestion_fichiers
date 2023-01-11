package gestion_fichiers;

import cli.Interface;

public class Gestion_fichiers {

	public static void main(String[] args) {
		Repertoire root = new Repertoire("");
		
		FichierSimple f1 = new FichierSimple("Fichier1", root);
		FichierSimple f2 = new FichierSimple("Fichier2", root);
		
		Repertoire r1 = new Repertoire("Dossier1", root);
		FichierSimple f3 = new FichierSimple("Fichier1.1", r1);
		FichierSimple f4 = new FichierSimple("Fichier1.2", r1);
		FichierSimple f5 = new FichierSimple("Fichier1.3", r1);
		
		Repertoire r2 = new Repertoire("Dossier2", root);
		FichierSimple f6 = new FichierSimple("Fichier2.1", r2);
		FichierSimple f7 = new FichierSimple("Fichier2.2", r2);
		Repertoire r3 = new Repertoire("Dossier2.1", r2);
		FichierSimple f8 = new FichierSimple("Fichier2.1.1", r3);
		FichierSimple f9 = new FichierSimple("Fichier2.1.2", r3);
		FichierSimple f10 = new FichierSimple("Fichier2.1.3", r3);
		
		FichierSimple f13 = new FichierSimple("Fichier3", root);
		
		Repertoire r4 = new Repertoire("Dossier3", root);
		FichierSimple f11 = new FichierSimple("Fichier3.1", r4);
		
		Repertoire r5 = new Repertoire("Dossier1.1", r1);
		FichierSimple f12 = new FichierSimple("Fichier1.1.1", r5);
		
		
		//System.out.println(root.toString());
		
		Interface cli = new Interface();
		cli.saisir();
		
	}

}
