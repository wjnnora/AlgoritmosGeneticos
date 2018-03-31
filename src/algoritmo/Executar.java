//Pacotes
package algoritmo;

//Importes
import Classe.Produto;
import java.util.ArrayList;
import java.util.List;

public class Executar {
    
    public static void main(String []args){
        
        /*Produto p1 = new Produto("Geladeira Dako", 0.751, 999.90);
        
        System.out.println("Nome do Produto: " + p1.getNome());
        System.out.println("Métros Cúbicos: " + p1.getEspaco());
        System.out.println("Preço Produto: " + p1.getPreco());
        */
        
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
        
        for(Produto p: listaProdutos){
            System.out.println("Nome: " + p.getNome());
            System.out.println("Espaço que ocupa: " + p.getEspaco());
            System.out.println("Preço: R$ " + p.getPreco());
            System.out.println();
        }
    }
    
}
