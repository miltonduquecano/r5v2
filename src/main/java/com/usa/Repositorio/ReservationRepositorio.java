/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.Repositorio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.usa.Modelo.Client;
import com.usa.Modelo.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.usa.Interface.ReservationInterface;
import com.usa.Report.ClientContador;

/**
 *
 * @author USUARIO
 */
@Repository
public class ReservationRepositorio {
     @Autowired
    private ReservationInterface crud4;
    
    public List<Reservation> getAll(){
        return (List<Reservation>) crud4.findAll();
    }
    public Optional<Reservation> getReservation(int id){
        return crud4.findById(id);
    }
    public Reservation save(Reservation reservation){
        return crud4.save(reservation);
    }
     public void delete(Reservation reservation){
        crud4.delete(reservation);
    }
     
     public List<Reservation> ReservacionStatus (String status){
         return crud4.findAllByStatus(status);
     }
     
     public List<Reservation> ReservacionTiempo (Date a, Date b){
         return crud4.findAllByStartDateAfterAndStartDateBefore(a, b);
     }
   
     public List<ClientContador> getTopClientes(){
         List<ClientContador> res=new ArrayList<>();
         List<Object[]>report = crud4.countTotalReservationsByClient();
         for(int i=0; i<report.size();i++){
             res.add(new ClientContador((Long)report.get(i)[1],(Client) report.get(i)[0]));
         
         }
         return res;
     }
}
