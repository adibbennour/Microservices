package com.example.esprit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.esprit.entity.Compte;
import com.example.esprit.services.CompteService;


@RestController
@RequestMapping("/Compte")
public class CompteController {
@Autowired
CompteService compteService;
@GetMapping("/getcompte/{id}")
public Compte getcompte(@PathVariable ("id") long id) {
	return compteService.getCompteById(id);
}

@GetMapping("/getAllcompte")
public List<Compte> getAllcompte() {
	return compteService.getAllCompte();
}



}
