package com.xworkz.nirmala;

import java.time.LocalDate;

import com.xworkz.nirmala.entity.NirmalaEntity;
import com.xworkz.nirmala.service.ServiceDAO;
import com.xworkz.nirmala.service.ServiceDAOImpl;

public class NirmalaRunner {
	public static void main(String[] args) {
		NirmalaEntity entity = new NirmalaEntity("BTM", "male", "public", 22.00, "10min", "kalyan", LocalDate.now(),
				"manoj", LocalDate.now());
		ServiceDAO dao = new ServiceDAOImpl();
		dao.save(entity);
	}

}
