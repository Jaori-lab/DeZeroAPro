

public class Main {

	public static void main(String[] args) {
		// System.out.println("Saloperie de git !!\n");
		// System.out.println("Je vais bien finir par y arriver , Bordel de merde !!\n");
		// System.out.println("Ca y'est !! Enfin ..L'authentification par mot de passe \nest finie, il faut cr�er un token !");
		
		
		// Ville vTest = new Ville(000); 
		// R�sultat : Exception in thread "main" java.lang.Error: Probl�me de compilation non r�solu : Le constructeur Ville(int) n�est pas d�fini
		
		Ville v = new Ville();
		Ville v1 = new Ville("Paris",15_000_000,"France");  // l'ordre des param�tres du constructeur doit etre respect� ainsi que le type.
		Ville v2 = new Ville("Marseille", 12_000_000, "France");
		Ville v3 = new Ville("Milan", 3_368_590, "Italie");
		
		System.out.println("\n Premier exemple : ");
		
		System.out.println("\n v = "+v.getNomVille()+" ville de "+v.getNbreHabitants()+" habitants se situant dans le pays de "+v.getNomPays());
		System.out.println("\n v1 = "+v1.getNomVille()+" ville de "+v1.getNbreHabitants()+" habitants se situant dans le pays de "+v1.getNomPays());
		System.out.println("\n v2 = "+v2.getNomVille()+" ville de "+v2.getNbreHabitants()+" habitants se situant dans le pays de "+v2.getNomPays());
		
		// Interchange de ville v1 et v2 par le biais d'un autre objet Ville(temp)
		
		Ville temp = new Ville();
		temp = v1;
		v1 = v2;
		v2 = temp;
		
		System.out.println("\n Deuxi�me exemple : ");
		
		System.out.println("\n v = "+v.getNomVille()+" ville de "+v.getNbreHabitants()+" habitants se situant dans le pays de "+v.getNomPays());
		System.out.println("\n v1 = "+v1.getNomVille()+" ville de "+v1.getNbreHabitants()+" habitants se situant dans le pays de "+v1.getNomPays());
		System.out.println("\n v2 = "+v2.getNomVille()+" ville de "+v2.getNbreHabitants()+" habitants se situant dans le pays de "+v2.getNomPays());
		
		System.out.println("\n Troisi�me exemple : ");
		// Nous utilisons les getters(mutateurs) pournchanger la valeur des param�tres
		
		v1.setNomVille("Hong-Kong");
		v1.setNomPays("Chine");
		v1.setNbreHabitants(45_000_000);
		v2.setNbreHabitants(9_999_999);
		
		// System.out.println("\n v = "+v.getNomVille()+" ville de "+v.getNbreHabitants()+" habitants se situant dans le pays de "+v.getNomPays());
		System.out.println("\n v1 = "+v1.getNomVille()+" ville de "+v1.getNbreHabitants()+" habitants se situant dans le pays de "+v1.getNomPays());
		System.out.println("\n v2 = "+v2.getNomVille()+" ville de "+v2.getNbreHabitants()+" habitants se situant dans le pays de "+v2.getNomPays());
		
		// Quatri�me exemple avec l'ajout de la cat�gorie en fonction du nombre d'habitants
		
		System.out.println("\n v = "+v.getNomVille()+" ville de "+v.getNbreHabitants()+" habitants se situant dans le pays de "+v.getNomPays()+" fait partie de la cat�gorie: "+v.getCategorieNbH());
		System.out.println("\n v1 = "+v1.getNomVille()+" ville de "+v1.getNbreHabitants()+" habitants se situant dans le pays de "+v1.getNomPays()+" fait partie de la cat�gorie: "+v1.getCategorieNbH());
		System.out.println("\n v2 = "+v2.getNomVille()+" ville de "+v2.getNbreHabitants()+" habitants se situant dans le pays de "+v2.getNomPays()+" fait partie de la cat�gorie: "+v2.getCategorieNbH());
		System.out.println("\n v3 = "+v3.getNomVille()+" ville de "+v3.getNbreHabitants()+" habitants se situant dans le pays de "+v3.getNomPays()+" fait partie de la cat�gorie: "+v3.getCategorieNbH());
		
		// Utilisation de la m�thode comparer()
		
		//Ville v5 = new Ville("Lyon", 654, "France");
		// Ville v9 = new Ville("Marseille", 765, "France");
		
		System.out.println("\n \t Comparaisons : \n");
		
		System.out.println(v1.comparer(v2));  
		
		// Nbre d'instance - variable de Classe
		
		Ville v9 = new Ville();
		System.out.println(Ville.nbreInstances);
		System.out.println(Ville.getNbreInstancesBis());
		
		// H�ritage de classe
		
		Capitale c = new Capitale();
		System.out.println(c.decrisToi());
		
		
		Capitale cap = new Capitale("Paris",6789567,"France", "Tour Effeil");
				System.out.println("Appel de la m�thode d�cris-toi de la classe Capitale "+ cap.decrisToi());
	}

}
