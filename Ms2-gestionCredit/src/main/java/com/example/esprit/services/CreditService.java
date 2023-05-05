/* Copyright (C)  Dqlick ™ - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */
package com.example.esprit.services;

import java.util.List;

import com.example.esprit.entity.Credit;

/**
 * {@link } class.
 *
 * @author hbenammar
 * @since 0.1.0
 *
 */
public interface CreditService {
public Credit getCreditById(long id);
public List<Credit> getAllCredit();
}
