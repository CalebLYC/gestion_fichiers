package cli;

import gestion_fichiers.FichierSimple;

public class CommandeTOUCH extends Commande {

	public CommandeTOUCH(String[] arguments) {
		super(arguments);
	}

	@Override
	public void executer(Navigateur navigateur) {
		if(arguments.length == 0) {
			System.out.println("Aucun nom de fichier spécifié\n");
			System.out.println("  --help\tPour afficher l'aide(la documentation)\n");
			return;
		}
		FichierSimple fic = new FichierSimple(arguments[0], navigateur.getRepertoireCourant());
	}

}
