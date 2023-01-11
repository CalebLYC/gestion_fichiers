package cli;

import gestion_fichiers.Fichier;
import gestion_fichiers.Repertoire;

public class Navigateur {
	private Repertoire repertoireCourant;
    
    public Navigateur(Repertoire r){
        this.repertoireCourant = r;
    }
    
    public Repertoire getRepertoireCourant(){
        return this.repertoireCourant;
    }
    public void setRepertoireCourant(Repertoire r){
        this.repertoireCourant = r;
    }
    
    public Repertoire getRepertoire(String path) {
        Repertoire current = getRepertoireCourant();
        String[] folders = path.split("/");
        for (String folder : folders) {
            if (folder.equals(".")) {
                continue;
            }
            if (folder.equals("..")) {
                current = current.getRepertoire();
                if(current == null) return null; // current est le dossier racine
                continue;
            }
            Repertoire next = null;
            for (Fichier f : current.getFichiers()) {
                if (f.getNom().equals(folder) && f.isDirectory()) {
                    next = (Repertoire) f;
                    break;
                }
            }
            if (next == null) {
                return null; //cas de répertoire inexistant
            }
            current = next;
        }
        return current;
    }
    
    public Fichier getFichier(String path) {
    	String file = path.split("/")[0];
    	for(Fichier f : getRepertoireCourant().getFichiers()) {
    		if(f.getNom().equals(file) && !f.isDirectory()) {
    			return f;
    		}
    	}
    	return null;
    }
}
