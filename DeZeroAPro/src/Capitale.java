
public class Capitale extends Ville{

	
	/*- La classe capitale h�rite des m�me m�thodes que celle de la classe Ville.
	 *- Un constructeur par d�fault est cr�er par la machine virtuelle de Java(JVM) si et seulement si aucun constructeur n'a �t� cod� dans la Classe
	 *- Pour acc�der aux attributs de la Classe m�re(ici Ville) nous devons les passer en protected 
	 *  car seul les  attributs public et protected peuvent etre r�cup�r� par h�ritage
	 *- En Java, la classe fille ne peut h�riter que d'une seule classe m�re  */
	
	
	// Cr�ation d'un nouvel attribut
	private String monument;
	
	// Constructeur par d�fault
	public Capitale() {
		super(); // Appelle le constructeur de la classe m�re
		monument = "aucun" ;
	}
	
	// Page 104
	
	public String decrisToi() {
		String str = super.decrisToi()+ "\t Ajout de l'attribut monument : "+this.monument;
		System.out.println("Invocation de super.decrisToi()");
		return str;
	}
}
