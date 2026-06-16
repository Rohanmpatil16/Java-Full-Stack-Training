package com.sit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class studentTest {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("MyJPA");

        EntityManager em = emf.createEntityManager();

        EntityTransaction trans = em.getTransaction();

        Student student1 = new Student();
        student1.setRollNumber(123);
        student1.setStudentName("Vivek");
        student1.setMarks(90.45f);

        Student student2 = new Student();
        student2.setRollNumber(456);
        student2.setStudentName("Rohan");
        student2.setMarks(95.45f);

        trans.begin();

        em.persist(student1);
        em.persist(student2);

        trans.commit();

        em.close();
        emf.close();

        System.out.println("Data inserted successfully.");
    }
}