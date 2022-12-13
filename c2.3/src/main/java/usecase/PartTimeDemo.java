package usecase;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import entity.PartTimeInstructor;

public class PartTimeDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("q3");
		
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<PartTimeInstructor> t = em.createQuery("from PartTimeInstructor");
		
		List<PartTimeInstructor> list = t.getResultList();
		
		list.forEach(s -> System.out.println(s));

	}

}
