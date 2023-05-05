/* Copyright (C)  Dqlick ™ - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */
package com.example.esprit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.esprit.entity.Employee;
import com.example.esprit.repositories.EmployeeRepositorie;


/**
 * {@link } class.
 *
 * @author ajlani
 * @since 0.1.0
 *
 */
@Service
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	EmployeeRepositorie EmployeeRepositorie;


	/* (non-Javadoc)
	 * @see com.example.gestioncandidat.services.CondidatService#getCondidatById(long)
	 */
	@Override
	public Employee getEmployeeById(long id) {

		return EmployeeRepositorie.findById(id).get();
	}

	/* (non-Javadoc)
	 * @see com.example.gestioncandidat.services.CondidatService#getAllCondidat()
	 */
	@Override
	public List<Employee> getAllEmployees() {

		return EmployeeRepositorie.findAll();
	}


}
