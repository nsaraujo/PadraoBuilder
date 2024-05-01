/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sandwiches;

/**
 *
 * @author 55649
 */
public abstract class Builder {
    
    protected SandwicheProduct sandwiche;
    
    public Builder(){
        this.sandwiche = new SandwicheProduct();
    }
    
    public abstract void Pao();
    public abstract void Carne();
    public abstract void Molho();
    public abstract void QueijoSimples();
    public abstract void QueijoDuplo();
    public abstract void Salada();
    
    public SandwicheProduct getSandwiche(){
        return sandwiche;
    } 
}
