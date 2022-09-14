package com.xworkz.metro.runner;

import com.xworkz.metro.dao.MetroDAO;
import com.xworkz.metro.dao.MetroDAOImpl;
import com.xworkz.metro.entity.MetroEntity;

public class MetroRunner {

	public static void main(String[] args) {
		MetroEntity entity = new MetroEntity(1, "nama metro", "Sri Nagar", 30.00, "Sri Nagar", "BTM");
		MetroEntity entity1 = new MetroEntity(2, "nama metro", "BTM", 60.00, "BTM", "JP Nagar");
		MetroEntity entity2 = new MetroEntity(3, "nama metro", "JP Nagar", 50.00, "JP Nagar", "Kengeri");
		MetroEntity entity3 = new MetroEntity(4, "nama metro", "Kengeri", 70.00, "Kengeri", "Majestic");
		MetroEntity entity4 = new MetroEntity(5, "nama metro", "Majestic", 40.00, "Majestic", "KR Nagar");
		MetroDAO dao = new MetroDAOImpl();
		Boolean save = dao.save(entity);
		dao.save(entity1);
		dao.save(entity2);
		dao.save(entity3);
		dao.save(entity4);
		System.out.println(save);
	}

}
