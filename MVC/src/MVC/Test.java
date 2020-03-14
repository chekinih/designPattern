package MVC;


public class Test {

	public static void main(String[] args) {
		ModelMorpion morpion = new ModelMorpion();
		VueMorpionTextuelle vue = new VueMorpionTextuelle(morpion);
		ControleurMorpionTextuel controlleur = new ControleurMorpionTextuel(morpion);
		vue.setControlleur(controlleur);
		controlleur.setVue(vue);
		vue.activerVue();
		//controlleur.gererSaisirCoup();
	}

}
