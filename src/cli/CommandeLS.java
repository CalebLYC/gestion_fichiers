package cli;

import gestion_fichiers.Fichier;
import gestion_fichiers.Repertoire;

public class CommandeLS extends Commande {
	
	public CommandeLS() {}
	
	public CommandeLS(String[] arguments){
		super(arguments);
	}

	@Override
	public void executer(Navigateur n) {
		Repertoire rep = n.getRepertoireCourant();
		if(arguments.length != 0) {
			rep = n.getRepertoire(arguments[0]);
			if(rep == null || !rep.isDirectory()) {
				System.out.println(arguments[0] + " est un chemin de dossier invalide\n");
				System.out.println("  --help\tPour afficher l'aide(la documentation)\n");
				return;
			}
		}
		for(Fichier f : rep.getFichiers()) {
			System.out.println(f.getNom() + " | crée le le" + f.getDate());
		}
	}

	public void executer(String[] arguments) {
		
	}

}
