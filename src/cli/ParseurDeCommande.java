package cli;

import java.util.Arrays;

public class ParseurDeCommande {
	public ParseurDeCommande(){}
    
    public Commande parser(String chaine){
    	return this.parser(chaine.split(" "));
    }
    
    public Commande parser(String[] mots){
        if(mots.length == 0) {
        	System.out.println("Aucune commande entée\n");
        	System.out.println("  --help\tPour afficher l'aide(la documentation)\n");
        	return new CommandeCD();
        }
        String nom = mots[0];
        String[] arguments = Arrays.copyOfRange(mots, 1, mots.length);
        switch(nom){
            case "ls" : 
                return new CommandeLS(arguments);
            case "cd":
            	return new CommandeCD(arguments);
            case "mkdir":
            	return new CommandeMKDIR(arguments);
            case "q":
            	return new CommandeQ();
            case "touch":
            	return new CommandeTOUCH(arguments);
            case "rm":
            	return new CommandeRM(arguments);
            case "lr":
            	return new CommandeLR();
            case "help":
            	return new CommandeHELP();
            case "mv":
            	return new CommandeMV(arguments);
            default:
                System.out.println(nom + " : commande introuvable\n");
                System.out.println("  --help\tPour afficher l'aide(la documentation)\n");
                return new CommandeCD();
        }
    }

}
