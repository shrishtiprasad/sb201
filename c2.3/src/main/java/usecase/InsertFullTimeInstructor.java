package usecase;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entity.FullTimeInstructor;

public class InsertFullTimeInstructor {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(null);
		
		EntityManager em = emf.createEntityManager();
		
		FullTimeInstructor f1 = new FullTimeInstructor(1, "name1", 100, "name1@gmail.com");
		FullTimeInstructor f2 = new FullTimeInstructor(2, "name2", 200, "name2@gmail.com");
		FullTimeInstructor f3 = new FullTimeInstructor(3, "name3", 300, "name3@gmail.com");
		FullTimeInstructor f4 = new FullTimeInstructor(4, "name4", 400, "name4@gmail.com");
		
		em.getTransaction().begin();
		
		em.persist(f1);
		em.persist(f2);
		em.persist(f3);
		em.persist(f4);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Done");
	}

}
