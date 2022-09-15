package com.xworkz.nirmala.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.nirmala.entity.NirmalaEntity;

public class NirmalaDAOImpl implements NirmalaDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public Boolean save(NirmalaEntity entity) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(entity);
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

		return true;
	}

}
