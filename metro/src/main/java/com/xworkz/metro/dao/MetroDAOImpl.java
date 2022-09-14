package com.xworkz.metro.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.metro.entity.MetroEntity;

public class MetroDAOImpl implements MetroDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	public Boolean save(MetroEntity entity) {
		EntityManager entityManager = factory.createEntityManager();
		try {

			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(entity);
			transaction.commit();

		}

		catch (Exception e) {
			e.printStackTrace();

		} finally {
			entityManager.close();
		}
		return true;

	}

}
