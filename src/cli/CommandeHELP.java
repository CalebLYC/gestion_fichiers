package cli;

public class CommandeHELP extends Commande {

	@Override
	public void executer(Navigateur navigateur) {
		System.out.println("  --cd <chemin valide de dossier>\tPour ouvrir le dossier spécifié\n");
		System.out.println("  --ls <chemin valide de dossier>\tPour lister le contenu du dossier spécifié\n");
		System.out.println("  --lr\tPour afficher un apperçu global du système de fichier\n");
		System.out.println("  --mkdir <nom de dossier>\tPour céer un dossier dans le dossier courant\n");
		System.out.println("  --touch <nom de fichier>\tPour céer un fichier dans le dossier courant\n");
		System.out.println("  --rm <nom de fichier ou dossier>\tPour supprimer un fichier ou dossier\n");
		System.out.println("  --mv <nom de dossier ou fichier> <nom de dossier ou fichier>\tPour changer le nom d'un fichier ou dossier\n\t\t ou le déplacer dans le dossier en second argument au cas ou il serait un chemin de dossier valide\n");
		System.out.println("\tPour tous les arguments les valeurs . et .. désignent\n\t respectivement le dossier courant et le dossier parent\n");
		System.out.println("  --q\tPour quitter le programme\n");
		System.out.println("  --help\tPour afficher l'aide(la documentation)\n");
	}

}
