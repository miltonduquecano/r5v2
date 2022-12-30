/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.Repositorio;

import java.util.List;
import java.util.Optional;

import com.usa.Modelo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.usa.Interface.MessageInterface;

/**
 *
 * @author USUARIO
 */
@Repository
public class MessageRepositorio {
    @Autowired
    private MessageInterface crud3;
    public List<Message> getAll(){
        return (List<Message>) crud3.findAll();
    }
    public Optional<Message> getMessage(int id){
        return crud3.findById(id);
    }

    public Message save(Message message){
        return crud3.save(message);
    }
     public void delete(Message message){
        crud3.delete(message);
    }
}
