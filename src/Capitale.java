
public class Capitale extends Ville{

	
	/*- La classe capitale hérite des même méthodes que celle de la classe Ville.
	 *- Un constructeur par défault est créer par la machine virtuelle de Java(JVM) si et seulement si aucun constructeur n'a été codé dans la Classe
	 *- Pour accéder aux attributs de la Classe mère(ici Ville) nous devons les passer en protected 
	 *  car seul les  attributs public et protected peuvent etre récupéré par héritage
	 *- En Java, la classe fille ne peut hériter que d'une seule classe mère  */
	
	
	// Création d'un nouvel attribut
	private String monument;
	
	// Constructeur par défault
	public Capitale() {
		super(); // Appelle le constructeur de la classe mère
		monument = "aucun" ;
	}
	
	// Constructeur de Capitale
	public Capitale(String nom, int hab, String pays, String monument) {
		super(nom,hab,pays);
		this.monument = monument;
	}
	
	public String decrisToi() {
		String str = super.decrisToi()+ "\t Ajout de l'attribut monument : "+this.monument;
		System.out.println("Invocation de super.decrisToi()");
		return str;
	}

	/**
	 * @return le monument
	 */
	public String getMonument() {
		return monument;
	}

	/**
	 * @param monument le monument à définir
	 */
	public void setMonument(String monument) {
		this.monument = monument;
	}
	
}
