package Classe;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;


public class Individuo {
    
    //Valores dos espacos ucupados no caminhao
    private List espacos = new ArrayList<>();
    //Valores dos produtos
    private List valores = new ArrayList<>();
    //Combinacao dos produtos que irao no caminhao
    private List cromossomo = new ArrayList<>();
    //Espaco total do caminhao
    private double limiteEspaco;
    //Nota do individuo, que é representado pela soma total dos espaco ocupado no caminhao
    private double notaAvaliacao;
    //Espaco que a combinacao utilizou
    private double espacoUsado;
    //Numero da utilizacao atual
    private int geracao;
    
    public Individuo(List espacos, List valores, double limiteEspaco){
        this.espacos = espacos;
        this.valores = valores; 
        this.limiteEspaco = limiteEspaco;
        this.geracao = 0;
        this.notaAvaliacao = 0;
        this.espacoUsado = 0;
        
        for(int i = 0; i < this.espacos.size(); i++){
            if(Math.random() < 0.5){
                this.cromossomo.add("0");
            }
            else {
                this.cromossomo.add("1");
            }
        }        
    }
    
    //Getters and Setters
    public List getEspacos(){
        return espacos;
    }
    public void setEspacos(List espacos){
        this.espacos = espacos;
    }
    
    public List getValores (){
        return valores;
    }
    public void setValores(List valores){
        this.valores = valores;
    }
    
    public List getCromossomo(){
        return cromossomo;
    }
    public void setCromossomo(List cromossomo){
        this.cromossomo = cromossomo;
    }
    
    public double getLimiteEspaco(){
        return limiteEspaco;
    }
    public void setLimiteEspaco(double limiteEspaco){
        this.limiteEspaco = limiteEspaco;
    }
    
    public int getGeracao(){
        return geracao;
    }
    public void setGeracao(int geracao){
        this.geracao = geracao;
    }
    
    public double getNotaAvaliacao(){
        return notaAvaliacao;
    }
    public void setNotaAvaliacao(double notaAvaliacao){
        this.notaAvaliacao = notaAvaliacao;
    }

    public double getEspacoUsado(){
        return espacoUsado;
    }
    public void setEspacoUsado(double espacoUsado){
        this.espacoUsado = espacoUsado;
    }
    
    public void avaliacao(){
        
        double nota = 0;
        double somaEspaco = 0;
        
        for(int i = 0; i < this.cromossomo.size(); i++){
            if(this.cromossomo.get(i).equals("1")){
                nota += (double)this.valores.get(i);
                somaEspaco += (double)this.espacos.get(i);
            }
        }
        
        if(somaEspaco > limiteEspaco){
            nota = 1;
        }
        
        this.notaAvaliacao = nota;
        this.espacoUsado = somaEspaco;
    }
    
    public List crossover(Individuo outroIndividuo){
        //Gera o numero de corte do cromossomo
        int corte = (int) Math.round(Math.random() * this.cromossomo.size());
        
        List filho1 = new ArrayList<>();
        filho1.addAll(outroIndividuo.getCromossomo().subList(0, corte));
        filho1.addAll(this.cromossomo.subList(corte, this.cromossomo.size()));
        
        List filho2 = new ArrayList<>();
        filho2.addAll(this.cromossomo.subList(0, corte));
        filho2.addAll(outroIndividuo.getCromossomo().subList(corte, this.cromossomo.size()));
        
        List<Individuo> filhos = new ArrayList<>();
        filhos.add(new Individuo(this.espacos, this.valores, this.limiteEspaco));
        filhos.add(new Individuo(this.espacos, this.valores, this.limiteEspaco));
        
        filhos.get(0).setCromossomo(filho1);
        filhos.get(0).setGeracao(this.geracao + 1);
        
        filhos.get(1).setCromossomo(filho2);
        filhos.get(1).setGeracao(geracao + 1);
        
        return filhos;
    }
    
    public Individuo mutacao(double taxaMutacao) {
        System.out.println("Antes da mutação: " + this.cromossomo);
        for(int i = 0; i < this.cromossomo.size(); i++) {
            if(Math.random() < taxaMutacao){
                if(this.cromossomo.get(i).equals("1")){
                    this.cromossomo.set(i, "0");
                }
                else {
                    this.cromossomo.set(i, "1");
                }
            }
        }
        System.out.println("Depois da mutação: " + this.cromossomo);
        return this;
    }
}
