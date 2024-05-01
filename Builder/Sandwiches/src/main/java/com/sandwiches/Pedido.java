/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sandwiches;

/**
 *
 * @author 55649
 */
public class Pedido {
    private Builder solicitar;

    public Pedido(Builder solicitar) {
        this.solicitar = solicitar;   
    }

    public SandwicheProduct getSandwiche() {
        return solicitar.getSandwiche();
    }
    
    public void preparacaoSandwicheBovino(){
        solicitar.Pao();
        solicitar.Carne();
        solicitar.Molho();
        solicitar.QueijoDuplo();
    } 
    
    public void preparacaoSandwicheAvina(){
        solicitar.Pao();
        solicitar.Carne();
        solicitar.QueijoSimples();
        solicitar.Salada();
    } 
    
    
    public void preparacaoSandwichePersonalizado(){
        solicitar.Pao();
        solicitar.Carne();
        solicitar.Molho();
        solicitar.QueijoSimples();
        solicitar.QueijoDuplo();
        solicitar.Salada();
    }     
}
