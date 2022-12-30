/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.Repositorio;

import java.util.List;
import java.util.Optional;

import com.usa.Modelo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.usa.Interface.CategoryInterface;

/**
 *
 * @author USUARIO
 */
@Repository
public class CategoryRepositorio {
    @Autowired
    private CategoryInterface crud2;
    
     public List<Category> getAll(){
        return (List<Category>) crud2.findAll();
    }
    
    public Optional <Category> getCategoria(int id){
        return crud2.findById(id);
    }
    
    public Category save(Category category){
        return crud2.save(category);
    }
     public void delete(Category category){
        crud2.delete(category);
    }
}
