package com.example.esprit.services;

import java.util.List;

import com.example.esprit.entity.Compte;


public interface CompteService {
public Compte getCompteById(long id);
public List<Compte> getAllCompte();
}
