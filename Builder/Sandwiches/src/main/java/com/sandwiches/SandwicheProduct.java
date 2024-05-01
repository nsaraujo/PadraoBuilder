/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sandwiches;

/**
 *
 * @author 55649
 */
public class SandwicheProduct {
    private String pão;
    private String carne;
    private String molho;
    private String queijoSimples;
    private String queijoDuplo;
    private String salada;

    public String getPão() {
        return pão;
    }

    public void setPão(String pão) {
        this.pão = pão;
    }

    public String getCarne() {
        return carne;
    }

    public String getQueijoSimples() {
        return queijoSimples;
    }

    public String getQueijoDuplo() {
        return queijoDuplo;
    }

    public String getSalada() {
        return salada;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public void setQueijoSimples(String queijoSimples) {
        this.queijoSimples = queijoSimples;
    }

    public void setQueijoDuplo(String queijoDuplo) {
        this.queijoDuplo = queijoDuplo;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    @Override
    public String toString() {
        return "Sandwiche: ";
    }
}
