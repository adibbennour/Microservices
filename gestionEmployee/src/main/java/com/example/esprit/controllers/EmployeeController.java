/* Copyright (C)  Dqlick ™ - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */
package com.example.esprit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.esprit.entity.Employee;
import com.example.esprit.services.EmployeeService;

/**
 * {@link } class.
 *
 * @author ajlani
 * @since 0.1.0
 *
 */
@RestController
@RequestMapping("/Employee")
public class EmployeeController {
@Autowired
EmployeeService employeeService;
@GetMapping("/getEmployee/{id}")
public Employee getEmployee(@PathVariable ("id") long id) {
	return employeeService.getEmployeeById(id);
}

@GetMapping("/getAllEmployee")
public List<Employee> getAllEmployees() {
	return employeeService.getAllEmployees();
}



}
