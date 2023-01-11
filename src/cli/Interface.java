package cli;

import java.io.InputStreamReader;
import java.util.Scanner;

import gestion_fichiers.FichierSimple;
import gestion_fichiers.Repertoire;

public class Interface {
	Repertoire root = new Repertoire("C:");
	
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
	
	private Navigateur navigateur = new Navigateur(root);
	private String commande;
	
	public Interface() {}
	
	public void saisir() {
		do {
			Scanner scan = new Scanner(System.in);
			System.out.print(navigateur.getRepertoireCourant().getUrl() + ">");
			commande = scan.nextLine();
			this.executer(commande);
		}while(commande != "q");
	}
	
	public void executer(String commande) {
		Commande cmd = new ParseurDeCommande().parser(commande);
		cmd.traiter(navigateur);
	}
}
