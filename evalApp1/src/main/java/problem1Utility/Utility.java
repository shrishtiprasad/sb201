package problem1Utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Utility {

	private static EntityManagerFactory emf;
	
	static {
		emf=Persistence.createEntityManagerFactory("problemOne");
	}
	
	public static EntityManager provideConnection() {
		
		return emf.createEntityManager();
	}
}
