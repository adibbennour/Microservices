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


import com.example.esprit.entity.Credit;
import com.example.esprit.services.CreditService;

/**
 * {@link } class.
 *
 * @author hbenammar
 * @since 0.1.0
 *
 */
@RestController
@RequestMapping("/Credit")
public class CreditController {
@Autowired
CreditService CreditService;
@GetMapping("/getCredit/{id}")
public Credit getCredit(@PathVariable ("id") long id) {
	return CreditService.getCreditById(id);
}

@GetMapping("/getAllCredit")
public List<Credit> getAllCredit() {
	return CreditService.getAllCredit();
}



}
