package com.example.esprit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.esprit.entity.Compte;
import com.example.esprit.repositories.CompteRepositorie;




@Service
public class CompteServiceImp implements CompteService {
	@Autowired
	CompteRepositorie compteRepositorie;


	
	@Override
	public Compte getCompteById(long id) {

		return compteRepositorie.findById(id).get();
	}

	
	@Override
	public List<Compte> getAllCompte() {

		return compteRepositorie.findAll();
	}


}
