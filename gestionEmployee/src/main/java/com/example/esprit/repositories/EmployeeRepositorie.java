/* Copyright (C)  Dqlick ™ - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */
package com.example.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.esprit.entity.Employee;

/**
 * {@link } class.
 *
 * @author ajlani
 * @since 0.1.0
 *
 */
@Repository
public interface EmployeeRepositorie extends JpaRepository<Employee, Long> {

}
