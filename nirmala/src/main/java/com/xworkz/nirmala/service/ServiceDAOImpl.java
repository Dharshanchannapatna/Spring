package com.xworkz.nirmala.service;

import java.util.Set;

import javax.persistence.Persistence;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.nirmala.dao.NirmalaDAO;
import com.xworkz.nirmala.dao.NirmalaDAOImpl;
import com.xworkz.nirmala.entity.NirmalaEntity;

public class ServiceDAOImpl implements ServiceDAO {
	NirmalaDAO nirmalaDAO = new NirmalaDAOImpl();

	@Override
	public Boolean save(NirmalaEntity entity) {
		ValidatorFactory factory =  javax.validation.Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<NirmalaEntity>> violations = validator.validate(entity);
		if (violations.size() > 0) {
			System.out.println("Invalid Detais");
			for (ConstraintViolation<NirmalaEntity> violation2 : violations) {
				System.out.println(violation2.getMessage());
			}
		} else {
			System.out.println("Valid Object");
			nirmalaDAO.save(entity);
		}

		return true;
	}

}
