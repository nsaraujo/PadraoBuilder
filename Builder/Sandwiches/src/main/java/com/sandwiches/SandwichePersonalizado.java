/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sandwiches;

import java.util.Scanner;

/**
 *
 * @author 55649
 */
public class SandwichePersonalizado extends Builder {

    @Override
    public void Pao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha o tipo de pão: (Ex: integral, Brioche, Amanteigado): ");
        String pao = scanner.nextLine();
        sandwiche.setPão(pao);
    }

    @Override
    public void Carne() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha o tipo de carne: (Ex: Hamburguer, Frango): ");
        String carne = scanner.nextLine();
        sandwiche.setCarne(carne);
    }

    @Override
    public void Molho() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha o tipo de molho: (Ex: Alho, Barbecue, Ketchup): ");
        String molho = scanner.nextLine();
        sandwiche.setMolho(molho);
    }

    @Override
    public void QueijoSimples() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha o tipo de queijo simples (Camada de queijo superior): (Ex: Mussarela, Cheddar, Provolone): ");
        String queijoSimples = scanner.nextLine();
        sandwiche.setQueijoSimples(queijoSimples);
    }

    @Override
    public void QueijoDuplo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha os 2 tipos de queijo: (Ex: Mussarela, Cheddar, Provolone): ");
        String queijoDuplo = scanner.nextLine();
        sandwiche.setQueijoDuplo(queijoDuplo);
    }
    
    @Override
    public void Salada() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha o tipo de salada (Ex: Alface, Tomate): ");
        String salada = scanner.nextLine();
        sandwiche.setSalada(salada);
    }
}
