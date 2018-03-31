package Classe;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wellington Nora
 */
public class Produto {
    
    private String nome;
    private double espaco;
    private double preco;

    //Construtor
    public Produto(String nome, double espaco, double preco){
        this.nome = nome;
        this.espaco = espaco;
        this.preco = preco;
    }
    
    //Getters and Setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getEspaco(){
        return espaco;
    }
    public void setEspaco(double espaco){
        this.espaco = espaco;
    }
    
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
}
