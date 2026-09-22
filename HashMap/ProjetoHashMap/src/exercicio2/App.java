package exercicio2;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        HashMap<String, Integer> estoque = new HashMap<>();

        estoque.put("Teclado", 10);
        estoque.put("Mouse", 15);
        estoque.put("Monitor", 6);
        estoque.put("Notebook", 4);

        System.out.println("=== ESTOQUE INICIAL ===");
        for (Map.Entry<String, Integer> produto : estoque.entrySet()) {
            System.out.println("Produto: " + produto.getKey() + " | Quantidade: " + produto.getValue());
        }
        String pesquisapdt = "Mouse";
        System.out.println("Produto pesquisado: " + "Mouse\n");
        if (estoque.containsKey(pesquisapdt)) {
            System.out.println("O produto '" + pesquisapdt + "' está disponível. Quantidade: " + estoque.get(pesquisapdt));
        } else {
            System.out.println("O produto '" + pesquisapdt + "' não foi encontrado.");
        }
        System.out.println("Remoção de produto:");
        String remoProduto = "Notebook";
        estoque.remove(remoProduto);
        System.out.println("O produto: " + remoProduto + " foi removido.");
        
        System.out.println("Estoque geral:");
        for (Map.Entry<String, Integer> produto : estoque.entrySet()) {
            System.out.println("Produto: " + produto.getKey() + " | Quantidade: " + produto.getValue());
    } 
}  	
}     
