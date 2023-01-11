package cli;

import gestion_fichiers.Repertoire;

public class CommandeLR extends Commande {

	@Override
	public void executer(Navigateur navigateur) {
		Repertoire root = navigateur.getRepertoireCourant();
		while(root.getRepertoire() != null) {
			root = root.getRepertoire();
		}
		System.out.println(root.toString());
	}

}
