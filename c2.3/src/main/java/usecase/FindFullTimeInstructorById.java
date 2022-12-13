package usecase;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.FullTimeInstructor;

public class FindFullTimeInstructorById {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("q3");
		
		EntityManager em = emf.createEntityManager();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter InstructorId to get details of Full Time Instructor");
		
		((javax.persistence.Query) t).setParameter(1, x);
		
		FullTimeInstructor f = (FullTimeInstructor) ((javax.persistence.Query) t);
		
		System.out.println(f);

	}

}
