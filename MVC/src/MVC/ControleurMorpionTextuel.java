package MVC;

public class ControleurMorpionTextuel implements InterfaceControleurMorpion{
	
	private InterfaceModelMorpion monModel;
	private InterfaceVueMorpion maVue;
	
	public ControleurMorpionTextuel(InterfaceModelMorpion unModel)
	{
		super();
		this.monModel = unModel;
	}
	@Override
	public void gererSaisirCoup() {
		while (this.monModel.partieFinie() == false) {
			boolean x = true ;
			while(x)
			try {
				int ligne = this.maVue.saisirLigne();
				int colonne = this.maVue.saisirColonne();
				this.monModel.jouerCoup(ligne, colonne);
				x=false;
			}
			catch (Exception e) {
				this.maVue.afficherErreurCoupPropose();
			}
		
			if (this.monModel.partieFinie()) {
				this.maVue.afficherFinDePartie();
				
			}
			else {
				this.maVue.afficherGrille();
				this.monModel.changerJActif();

			}
		}
		
	}

	@Override
	public void setVue(InterfaceVueMorpion uneVue) {
		// TODO Auto-generated method stub
		
	}

}
