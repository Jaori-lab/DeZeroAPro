
public class Ville {
	
	// Attributs de l'objet Ville - variables d'instances
	
	/* AVANT l'héritage de la classe fille Capitale : 
	 * private String nomVille;
	private String nomPays;
	private int nbreHabitants;
	private char categorieNbH;
	
	public static int nbreInstances = 0;
	private static int nbreInstancesBis = 0;*/
	
	protected String nomVille;
	protected String nomPays;
	protected int nbreHabitants;
	protected char categorieNbH;
	
	public static int nbreInstances = 0;
	protected static int nbreInstancesBis = 0;
	
	/** =======================================================================================================================================================================*/

	// Constructeur par défault - sans paramètres
	
	public Ville() {
		// System.out.println("Création d'une ville !");
		nomVille = "non définie";
		nomPays = "non définie";
		nbreHabitants = 0;
		this.setCategorieNbH();		// il faudra créer la méthode setCategorie
		nbreInstances++;
		nbreInstancesBis++;
	}
	
	// Constructeur avec paramètres (Surcharge de constructeur)
	
	public Ville(String Nom, int nbre, String Pays) {
		//System.out.println("Création d'une ville avec paramètres !");
		nomVille = Nom;
		nbreHabitants = nbre;
		nomPays = Pays;
		this.setCategorieNbH();
		nbreInstances++;
		nbreInstancesBis++;
	}
	
	/** =======================================================================================================================================================================*/

	
	// Accesseurs et Mutateurs (Getters PUIS Setters)
	
	/**
	 * @return le nomVille
	 */
	public String getNomVille() {
		return nomVille;
	}

	/**
	 * @return le nomPays
	 */
	public String getNomPays() {
		return nomPays;
	}

	/**
	 * @return le nbreHabitants
	 */
	public int getNbreHabitants() {
		return nbreHabitants;
	}

	/**
	 * @return la categorie en fonction du nombre d'habitants
	 */
	public char getCategorieNbH() {
		return this.categorieNbH;
	}
	/** =======================================================================================================================================================================*/
	
	/**
	 * @param nomVille le nomVille à définir
	 */
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	/**
	 * @param nomPays le nomPays à définir
	 */
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	/**
	 * @param nbreHabitants le nbreHabitants à définir
	 */
	public void setNbreHabitants(int nbreHabitants) {
		this.nbreHabitants = nbreHabitants;
	}

	/** =======================================================================================================================================================================*/
		// Méthode personnelles :
	
	/**
	 * @param la categorie en fonction du nombre d'habitants
	 */
	private void setCategorieNbH() { // Une méthode void ne renvoie pas d'informations, il les modifient !!
		int limites [] = {0, 1_000, 10_000, 100_000, 500_000, 1_000_000, 5_000_000, 10_000_000}; 		// tableau de 7 éléments
		char cat [] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'}; 		// tableau de 9 éléments char (simple cote et non guillemets)
		int i = 0; 			// point de départ 
		
		while(i < limites.length && this.nbreHabitants >= limites[i]) { 
			/* condition parcourant les élément du tableau ET 
			 comparant le nombre d'habitant de l'objet crée avec chaque élément du tableau limites*/ 
			
			i++; // itération change la valeur de i(element du tableau) a chaque tour de boucle
			
			this.categorieNbH = cat[i]; // Appliqué dès que la condition est vraie
			
		}
	}
	public String decrisToi() {
		return "\t"+this.nomVille+" est une ville de "+this.nomPays+", elle comporte: "+this.nbreHabitants+" et fait partie de la catégorie: "+this.categorieNbH;
	}
	
	
	/** =======================================================================================================================================================================*/
	
	public String comparer(Ville v1) {
		String str = new String();
		
		if(v1.getNbreHabitants()>this.nbreHabitants) 
			str = v1.getNomVille()+" est une ville plus peuplée que "+this.nomVille;
		else
			str = this.nomVille+" est une ville plus peuplée que "+v1.getNomVille();
			
		return str;
		
	}		
	
	public static int getNbreInstancesBis() {
		return nbreInstancesBis;
	}
}
