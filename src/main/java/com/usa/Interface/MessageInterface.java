/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.usa.Interface;

import org.springframework.data.repository.CrudRepository;
import com.usa.Modelo.Message;

/**
 *
 * @author USUARIO
 */
public interface MessageInterface extends CrudRepository<Message,Integer>{
    
}
