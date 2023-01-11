package cli;

import gestion_fichiers.Repertoire;

public class CommandeMKDIR extends Commande {
	
	public CommandeMKDIR() {}
	
	public CommandeMKDIR(String[] arguments){
		super(arguments);
	}

	@Override
	public void executer(Navigateur n) {
		if(arguments.length == 0) {
			System.out.println("Aucun nom de dossier spécifié\n");
			System.out.println("  --help\tPour afficher l'aide(la documentation)\n");
			return;
		}
		Repertoire rep = new Repertoire(arguments[0], n.getRepertoireCourant());
		n.setRepertoireCourant(rep);
	}

	public void executer(String[] arguments) {
		
	}

}
