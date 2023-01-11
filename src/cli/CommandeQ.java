package cli;

import java.util.concurrent.TimeUnit;

public class CommandeQ extends Commande {

	@Override
	public void executer(Navigateur navigateur) {
		System.out.println("Arrêt du programme en cours...");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("*************Fin du programme*********************");
		System.exit(1);
	}

}
