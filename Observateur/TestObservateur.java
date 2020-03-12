package tpObservateur;
/**
 * 
 * @author 11607156 CHEKINI Hakima
 *
 */
public class TestObservateur {

	public static void main(String[] args) {
		
		// Creation de l'arbre de la question 1
		NoeudSujet noeudSujet = new NoeudSujet("no", 0, 2);
		NoeudObservateur n1 = new NoeudObservateur(noeudSujet, "n1", 0, 1);
		NoeudObservateur n2 = new NoeudObservateur(noeudSujet, "n2", 0, 4);
		NoeudObservateur n3 = new NoeudObservateur(noeudSujet, "n3", 0, 5);
		
		System.out.println("Arbre de la question 1 avant le changement de la valeur du neoud en racine");
		System.out.println(noeudSujet);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		System.out.println("Arbre de la question 1 après le changement de la valeur du neoud en racine\"");
		noeudSujet.changementValeur(1);
		System.out.println(noeudSujet);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		// Cration de l arbre complet
		NoeudSujet noeudSujet2 = new NoeudSujet("no", 0, 2);
		NoeudSujetObservateur no1 = new NoeudSujetObservateur(noeudSujet2, "n1", 1, 1);
		NoeudSujetObservateur no2 = new NoeudSujetObservateur(noeudSujet2, "n2", 3, 4);
		
		NoeudObservateur no3 = new NoeudObservateur(no1, "n3", 2, 1);
		NoeudObservateur no4 = new NoeudObservateur(no1, "n4", 5, 3);
		NoeudObservateur no5 = new NoeudObservateur(no1, "n5", 1, 4);
		NoeudObservateur no6 = new NoeudObservateur(no2, "n6", 2, 3);
		
		System.out.println("affichage de l'abre complet");
		System.out.println(noeudSujet2);
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		System.out.println(no4);
		System.out.println(no5);
		System.out.println(no6);
		
		// Changement de la valeur du noeud racine
		noeudSujet2.changementValeur(1);
		
		System.out.println("affichage de l'abre complet après ajout de 1 pour le premier noeud");
		System.out.println(noeudSujet2);
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		System.out.println(no4);
		System.out.println(no5);
		System.out.println(no6);
		// On remarque que le changement a bien été fait 
		

	}

}
