/* Copyright (C)  Dqlick ™ - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */
package com.example.esprit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.esprit.entity.Credit;
import com.example.esprit.repositories.CreditRepositorie;


/**
 * {@link } class.
 *
 * @author hbenammar
 * @since 0.1.0
 *
 */
@Service
public class CreditServiceImp implements CreditService {
	@Autowired
	CreditRepositorie CreditRepositori;


	/* (non-Javadoc)
	 * @see com.example.gestioncandidat.services.CreditService#getCreditById(long)
	 */
	@Override
	public Credit getCreditById(long id) {

		return CreditRepositori.findById(id).get();
	}

	/* (non-Javadoc)
	 * @see com.example.gestioncandidat.services.CreditService#getAllCredit()
	 */
	@Override
	public List<Credit> getAllCredit() {

		return CreditRepositori.findAll();
	}


}
