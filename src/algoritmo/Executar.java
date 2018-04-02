//Pacotes
package algoritmo;

//Importes
import Classe.*;
import java.util.ArrayList;
import java.util.List;

public class Executar {
    
    public static void main(String []args){
        
        List<Produto> listaProdutos = new ArrayList<>();
        
        listaProdutos.add(new Produto("Geladeira Dako", 0.751, 999.90));
        listaProdutos.add(new Produto("Iphone 6", 0.000089, 2911.12));
        listaProdutos.add(new Produto("TV 55'", 0.400, 4346.99));
        listaProdutos.add(new Produto("TV 50'", 0.290, 3999.90));
        listaProdutos.add(new Produto("TV 42'", 0.200, 2999.00));
        listaProdutos.add(new Produto("Notebook Dell", 0.00350, 2499.90));
        listaProdutos.add(new Produto("Ventilador Panasonic", 0.496, 199.90));
        listaProdutos.add(new Produto("Microondas Eletrolux", 0.0424, 308.66));
        listaProdutos.add(new Produto("Microondas LG", 0.0544, 429.90));
        listaProdutos.add(new Produto("Microondas Panasonic", 0.0319, 299.29));
        listaProdutos.add(new Produto("Geladeira Brastemp", 0.635, 849.00));
        listaProdutos.add(new Produto("Geladeira Consul", 0.870, 1199.89));
        listaProdutos.add(new Produto("Notebook Lenovo", 0.498, 1999.90));
        listaProdutos.add(new Produto("notebook Asus", 0.527, 3999.00));
        
        
        List nome = new ArrayList<>();
        List espaco = new ArrayList<>();
        List valores = new ArrayList<>();
        
        for(Produto produto: listaProdutos){
            nome.add(produto.getNome());
            espaco.add(produto.getEspaco());
            valores.add(produto.getPreco());
        }
        
        //Espacço disponível no caminhão
        double limite  = 3;
        
        Individuo individuo1 = new Individuo(espaco, valores, limite);
        
        individuo1.avaliacao();
        System.out.println("Individuo 1: " + individuo1.getCromossomo());
        System.out.println("Espaco Total: " + individuo1.getEspacoUsado());
        System.out.println("Valor total: R$ " + individuo1.getNotaAvaliacao());
        
        Individuo individuo2 = new Individuo(espaco, valores, limite);
        
        individuo2.avaliacao();
        System.out.println("\nIndividuo 2: " + individuo2.getCromossomo());
        System.out.println("Espaco Total: " + individuo2.getEspacoUsado());
        System.out.println("Valor total: R$ " + individuo2.getNotaAvaliacao());
        
        individuo1.crossover(individuo2);
        
        individuo1.mutacao(0.01);
        individuo2.mutacao(0.05);
    }
    
}
