/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sandwiches;

/**
 *
 * @author 55649
 */
public class SandwicheBovino extends Builder{

    @Override
    public void Pao() {
        sandwiche.setPão("Brioche");
    }

    @Override
    public void Carne() {
        sandwiche.setCarne("Picanha");
    }

    @Override
    public void Molho() {
        sandwiche.setMolho("Alho");
    }
    
    @Override
    public void QueijoSimples() {
        sandwiche.setQueijoSimples(" ");
    }

    @Override
    public void QueijoDuplo() {
        sandwiche.setQueijoDuplo("Queijo duplo - Mussarela + Cheddar ");
    }
    
    @Override
    public void Salada() {
        sandwiche.setSalada(" ");
    }
}
