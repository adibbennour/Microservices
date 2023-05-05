/* Copyright (C)  Dqlick ™ - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */
package com.example.esprit.services;

import java.util.List;

import com.example.esprit.entity.Employee;

/**
 * {@link } class.
 *
 * @author ajlani
 * @since 0.1.0
 *
 */
public interface EmployeeService {
public Employee getEmployeeById(long id);
public List<Employee> getAllEmployees();
}
