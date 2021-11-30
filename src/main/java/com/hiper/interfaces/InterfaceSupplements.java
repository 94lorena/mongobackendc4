/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hiper.interfaces;


import com.hiper.model.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author LORENA NAVAS
 */

public interface InterfaceSupplements extends MongoRepository<Supplements, String> {
    
}
