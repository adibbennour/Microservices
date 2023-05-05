package com.example.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.esprit.entity.Compte;


@Repository
public interface CompteRepositorie extends JpaRepository<Compte, Long> {

}
