
public class Ville {
	
	// Attributs de l'objet Ville - variables d'instances
	
	/* AVANT l'h�ritage de la classe fille Capitale : 
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

	// Constructeur par d�fault - sans param�tres
	
	public Ville() {
		// System.out.println("Cr�ation d'une ville !");
		nomVille = "non d�finie";
		nomPays = "non d�finie";
		nbreHabitants = 0;
		this.setCategorieNbH();		// il faudra cr�er la m�thode setCategorie
		nbreInstances++;
		nbreInstancesBis++;
	}
	
	// Constructeur avec param�tres (Surcharge de constructeur)
	
	public Ville(String Nom, int nbre, String Pays) {
		//System.out.println("Cr�ation d'une ville avec param�tres !");
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
	 * @param nomVille le nomVille � d�finir
	 */
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	/**
	 * @param nomPays le nomPays � d�finir
	 */
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	/**
	 * @param nbreHabitants le nbreHabitants � d�finir
	 */
	public void setNbreHabitants(int nbreHabitants) {
		this.nbreHabitants = nbreHabitants;
	}

	/** =======================================================================================================================================================================*/
		// M�thode personnelles :
	
	/**
	 * @param la categorie en fonction du nombre d'habitants
	 */
	private void setCategorieNbH() { // Une m�thode void ne renvoie pas d'informations, il les modifient !!
		int limites [] = {0, 1_000, 10_000, 100_000, 500_000, 1_000_000, 5_000_000, 10_000_000}; 		// tableau de 7 �l�ments
		char cat [] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'}; 		// tableau de 9 �l�ments char (simple cote et non guillemets)
		int i = 0; 			// point de d�part 
		
		while(i < limites.length && this.nbreHabitants >= limites[i]) { 
			/* condition parcourant les �l�ment du tableau ET 
			 comparant le nombre d'habitant de l'objet cr�e avec chaque �l�ment du tableau limites*/ 
			
			i++; // it�ration change la valeur de i(element du tableau) a chaque tour de boucle
			
			this.categorieNbH = cat[i]; // Appliqu� d�s que la condition est vraie
			
		}
	}
	public String decrisToi() {
		return "\t"+this.nomVille+" est une ville de "+this.nomPays+", elle comporte: "+this.nbreHabitants+" et fait partie de la cat�gorie: "+this.categorieNbH;
	}
	
	
	/** =======================================================================================================================================================================*/
	
	public String comparer(Ville v1) {
		String str = new String();
		
		if(v1.getNbreHabitants()>this.nbreHabitants) 
			str = v1.getNomVille()+" est une ville plus peupl�e que "+this.nomVille;
		else
			str = this.nomVille+" est une ville plus peupl�e que "+v1.getNomVille();
			
		return str;
		
	}		
	
	public static int getNbreInstancesBis() {
		return nbreInstancesBis;
	}
}
