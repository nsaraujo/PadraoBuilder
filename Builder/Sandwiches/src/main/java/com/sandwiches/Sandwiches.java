/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.sandwiches;

/**
 *
 * @author 55649
 */
public class Sandwiches {

    public static void main(String[] args) {

//        Pedido pedido = new Pedido(new SandwicheBovino());
//        pedido.preparacaoSandwicheBovino();
//        SandwicheProduct sandwicheProduct = pedido.getSandwiche();
//        System.out.println("Sandwiche de carne Bovina: " );
//        System.out.println("Carne: " + sandwicheProduct.getCarne());
//        System.out.println("Molho: " + sandwicheProduct.getMolho());
//        System.out.println("Pão: " + sandwicheProduct.getPão());
//        System.out.println(sandwicheProduct.getQueijoDuplo());
        
//        System.out.println("\n");
//
//        Pedido pedido2 = new Pedido(new SandwicheaAvina());
//        pedido2.preparacaoSandwicheAvina();
//        SandwicheProduct sandwicheProduct2 = pedido2.getSandwiche();
//        System.out.println("Sandwiche de carne Avina: " );
//        System.out.println("Carne: " + sandwicheProduct2.getCarne());
//        System.out.println("Pão: " + sandwicheProduct2.getPão());
//        System.out.println("Queijo Simples: " + sandwicheProduct2.getQueijoSimples());
//        System.out.println("Salada: " + sandwicheProduct2.getSalada());
////        
//        System.out.println("\n");
//
        Pedido pedido3 = new Pedido(new SandwichePersonalizado());
        pedido3.preparacaoSandwichePersonalizado();
        SandwicheProduct sandwicheProduct3 = pedido3.getSandwiche();

        System.out.println("\n");
        System.out.println("Sanduíche Personalizado:");
        System.out.println("Pão: " + sandwicheProduct3.getPão());
        System.out.println("Carne: " + sandwicheProduct3.getCarne());
        System.out.println("Molho: " + sandwicheProduct3.getMolho());
        System.out.println("Queijo simples: " + sandwicheProduct3.getQueijoSimples());
        System.out.println("Queijo duplo: " + sandwicheProduct3.getQueijoDuplo());
        System.out.println("Salada: " + sandwicheProduct3.getSalada());

    }

}
