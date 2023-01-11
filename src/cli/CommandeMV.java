package cli;

import gestion_fichiers.Fichier;
import gestion_fichiers.Repertoire;

public class CommandeMV extends Commande {

	public CommandeMV(String[] arguments) {
		super(arguments);
	}

	@Override
	public void executer(Navigateur navigateur) {
		if(arguments.length == 0) {
			System.out.println("Argument invalide\n");
			System.out.println("  --help\tPour afficher l'aide(la documentation)\n");
			return;
		}else if(arguments.length == 1) {
			System.out.println("Nouveau nom non spécifié\n");
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
					System.out.println("Modification du dossier racine impossible");
					return;
				}
				navigateur.setRepertoireCourant(rep.getRepertoire());
			}
		}
		Repertoire rep2 = navigateur.getRepertoire(arguments[1]);
		if(rep2 == null || !rep2.isDirectory()) {
			rep.setNom(arguments[1]);
		}else {
			rep2.addInRepertoire(rep);
			rep.getRepertoire().getFichiers().remove(rep);
			System.gc();
			rep.setRepertoire(rep2);
		}
	}

}
