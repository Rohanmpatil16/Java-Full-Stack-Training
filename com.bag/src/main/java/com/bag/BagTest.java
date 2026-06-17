package com.bag;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BagTest {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("MyJPA");

        EntityManager em = emf.createEntityManager();

        EntityTransaction transaction = em.getTransaction();

        Bag bag = new Bag();
        bag.setBagId(1);
        bag.setBrand("Skybags");
        bag.setPrice(1999.99f);

        transaction.begin();

        em.persist(bag);

        transaction.commit();

        em.close();
        emf.close();

        System.out.println("Bag inserted successfully.");
    }
}