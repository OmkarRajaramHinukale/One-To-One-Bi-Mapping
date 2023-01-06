package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Omkar");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person p1=new Person();
		p1.setName("Omkar");
		p1.setDob("01-01-2000");
		
		Pan pan=new Pan();
		pan.setPan_no(12323646596l);
		p1.setPan(pan);
		pan.setPerson(p1);
		
		entityTransaction.begin();
		entityManager.persist(p1);
		entityManager.persist(pan);
		entityTransaction.commit();
		System.out.println("all good");
		

	}

}
