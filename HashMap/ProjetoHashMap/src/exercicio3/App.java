package exercicio3;

import java.util.HashMap;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Produto> produtos = new HashMap<>();
		
		produtos.put(1, new Produto("Teclado", 120.00, 10));
		produtos.put(2, new Produto("Mouse", 70.00, 10));
		produtos.put(3, new Produto("Monitor", 320.00, 10));
		produtos.put(4, new Produto("Memória ram(16Gb)", 490.00, 10));
		
		System.out.println("Informe o código do produto: ");
		int cdg = Integer.parseInt(sc.nextLine());
		
		if(produtos.containsKey(cdg)) {
		    produtos.get(cdg).exibirDados();
		}else {
			System.out.println("Produto não encontrado.");
		}
		sc.close();
		}
	}
