package cli;

import gestion_fichiers.Fichier;

public class CommandeRM extends Commande {
	
	public CommandeRM(String[] arguments) {
		super(arguments);
	}

	@Override
	public void executer(Navigateur navigateur) {
		if(arguments.length == 0) {
			System.out.println("Aucun chemin de fichier ou de repertoire spécifié");
			System.out.println("  --help\tPour afficher l'aide(la documentation)\n");
			return;
		}
		Fichier rep = navigateur.getRepertoire(arguments[0]);
		if(rep == null || !rep.isDirectory()) {
			rep = navigateur.getFichier(arguments[0]);
			if(rep == null) {
				System.out.println("Le fichier ou répertoire spécifié est inexistant");
				return;
			}
		}else {
			if(rep == navigateur.getRepertoireCourant()) {
				if(rep.getRepertoire() == null) {
					System.out.println("Suppression de dossier racine impossible");
					return;
				}
				navigateur.setRepertoireCourant(rep.getRepertoire());
			}
		}
		navigateur.getRepertoireCourant().getFichiers().remove(rep);
		System.gc();
	}
}
