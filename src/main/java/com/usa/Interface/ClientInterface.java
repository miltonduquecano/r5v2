/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.usa.Interface;

import org.springframework.data.repository.CrudRepository;
import com.usa.Modelo.Client;

/**
 *
 * @author USUARIO
 */
public interface ClientInterface extends CrudRepository<Client,Integer>{
    
}
