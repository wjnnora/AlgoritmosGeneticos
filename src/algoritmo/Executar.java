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
        
        int tamanhoPopulacao = 1000000;
        AlgoritmoGenetico ag = new AlgoritmoGenetico(tamanhoPopulacao);
        ag.inicizalizaPopulacao(espaco, valores, limite);
        //Ordena a população pela ordem da nota de avaliação
        ag.ordenacaoPopulacao();
        ag.melhorIndividuo(ag.getPopulacao().get(0));
//        for(int i = 0; i < ag.getTamanhoPopulacao(); i++){
//            System.out.println("Individuo: " + i);
//            System.out.println("Espaços: " + ag.getPopulacao().get(i).getEspacos());
//            System.out.println("Valores: " + ag.getPopulacao().get(i).getValores());
//            System.out.println("Cromossomo: " + ag.getPopulacao().get(i).getCromossomo());
//            System.out.println("Nota Avaliação: " + ag.getPopulacao().get(i).getNotaAvaliacao());
//            System.out.println("Espaço Usado: " + ag.getPopulacao().get(i).getEspacoUsado());
//            System.out.println();
//        }
        System.out.println("Melhor solução:");
        System.out.println("Cromossomo: " + ag.getMelhorSolucao().getCromossomo());
        System.out.println("Nota Avaliação: " + ag.getMelhorSolucao().getNotaAvaliacao());
        System.out.println("Espaço utilizado: " + ag.getMelhorSolucao().getEspacoUsado());
    }
    
}
