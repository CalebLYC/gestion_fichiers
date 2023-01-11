package cli;

import java.util.Arrays;

public abstract class Commande {
	protected String nom;
	protected String[] arguments;
	
    
    public abstract void executer(Navigateur navigateur);
   
    public Commande(){}
    public Commande(String _nom, String[] _arguments){
        this.nom = _nom;
        this.arguments = _arguments;
    }
    
    public Commande(String[] arguments) {
		this.arguments = arguments;
	}

	public void traiter(Navigateur navigateur){
        this.executer(navigateur);
    }
    
    
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public String[] getArguments(){
        return this.arguments;
    }
    public void setArguments(String[] arguments){
        this.arguments = arguments;
    }
    
    @Override
    public String toString(){
        return "Commande " + nom + ", arguments " + Arrays.toString(arguments);
    }
    
    
}
