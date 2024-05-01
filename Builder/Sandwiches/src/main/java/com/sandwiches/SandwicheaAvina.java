/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sandwiches;

/**
 *
 * @author 55649
 */
public class SandwicheaAvina extends Builder{

    @Override
    public void Pao() {
        sandwiche.setPão("Integral");
    }

    @Override
    public void Carne() {
        sandwiche.setCarne("Frango");
    }

    @Override
    public void Molho() {
        sandwiche.setMolho("Ketchup");
    }

    @Override
    public void QueijoSimples() {
        sandwiche.setQueijoSimples("Mussarela");
    }

    @Override
    public void QueijoDuplo() {
        sandwiche.setQueijoDuplo(" ");
    }
    
    @Override
    public void Salada() {
        sandwiche.setSalada("Alface + tomate ");
    }
    
}
