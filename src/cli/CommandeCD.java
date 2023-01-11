package cli;

import gestion_fichiers.Fichier;
import gestion_fichiers.Repertoire;

public class CommandeCD extends Commande{
	
	public CommandeCD() {
		String[] s = {"."};
		this.setArguments(s);
	}
	
	public CommandeCD(String[] arguments){
		super(arguments);
	}

	@Override
	public void executer(Navigateur n) {
	    if(arguments.length == 0) {
	        System.out.println("Aucun chemin spécifié\n");
	        System.out.println("  --help\tPour afficher l'aide(la documentation)\n");
	        return;
	    }
	    String path = arguments[0];
	    Repertoire newRep = n.getRepertoire(path);
	    if (newRep == null || !newRep.isDirectory()) {
	        System.out.println(path + " n'est pas un chemin de dossier valide");
	        return;
	    }
	    n.setRepertoireCourant(newRep);
	}


	public void executer() {
		return;
	}
}
