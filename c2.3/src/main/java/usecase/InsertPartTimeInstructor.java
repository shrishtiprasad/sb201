package usecase;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.PartTimeInstructor;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertPartTimeInstructor {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("q3");
			
		EntityManager em = emf.createEntityManager();
		
		PartTimeInstructor p1 = new PartTimeInstructor(5, "name5", 500, "name5@gmail.com");
		PartTimeInstructor p2 = new PartTimeInstructor(6, "name6", 600, "name6@gmail.com");
		PartTimeInstructor p3 = new PartTimeInstructor(7, "name7", 700, "name7@gmail.com");
		PartTimeInstructor p4 = new PartTimeInstructor(8, "name8", 800, "name8@gmail.com");
		
		em.getTransaction().begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Done");

	}

}
