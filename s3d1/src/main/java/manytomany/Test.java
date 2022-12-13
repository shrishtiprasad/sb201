package manytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("day1");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Course c1 = new Course();
		c1.setCname("JAVA");
		
		Course c2 = new Course();
		c2.setCname("CPP");
		
		Course c3 = new Course();
		c3.setCname("PYTHON");
		
		Student s1 = new Student();
		s1.setSname("Shrishti");
		
		Student s2 = new Student();
		s2.setSname("Abhiraj");
		
		Set<Course> sc = new HashSet<Course>();
		sc.add(c1);
		sc.add(c2);
		sc.add(c3);
		
		Set<Student> ss = new HashSet<Student>();
		ss.add(s1);
		ss.add(s2);
		
		//associating student with courses
		c1.setStudents(ss);
		c2.setStudents(ss);
		c3.setStudents(ss);
		
		//associating course with student
		s1.setCourses(sc);
		s2.setCourses(sc);
		
		em.persist(s1);
		em.persist(s2);
		
		em.getTransaction().commit();
		
		//Student can access course
		
		em.getTransaction().begin();
		
		Student s = em.find(Student.class, 1);
		System.out.println("id : " + s.getSid());
		System.out.println("name : " + s.getSname());
		
		Set<Course> courses = s.getCourses();
		for(Course c : courses) {
			System.out.println("Course : " + c.getCname());
		}
		
		//Course can access student
		
		Course c = em.find(Course.class, 1);
		System.out.println("id : " + c.getCid());
		System.out.println("name : " + c.getCname());
		
		Set<Student> students = c.getStudents();
		for(Student student : students) {
			System.out.println("Student name : " + s.getSname());
		}
	}
}







