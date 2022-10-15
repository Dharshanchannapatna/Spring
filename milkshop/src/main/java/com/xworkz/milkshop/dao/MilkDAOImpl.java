package com.xworkz.milkshop.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.milkshop.dto.MilkShopDTO;

@Repository
public class MilkDAOImpl implements MilkShopDAO {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public void Save(MilkShopDTO milk) {
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		try {

			EntityTransaction transaction = createEntityManager.getTransaction();
			transaction.begin();
			createEntityManager.persist(milk);
			transaction.commit();

		} catch (PersistenceException e) {
			System.out.println("exception in save dao" + e.getMessage());
		} finally {
			createEntityManager.close();
		}

	}

}
