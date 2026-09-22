package exercicio_1;

import java.util.HashMap;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> capitais = new HashMap<>();

        capitais.put("Rio de Janeiro", "Rio de Janeiro");
        capitais.put("São Paulo", "São Paulo");
        capitais.put("Minas Gerais", "Belo Horizonte");
        capitais.put("Bahia", "Salvador");
        capitais.put("Paraná", "Curitiba");

        System.out.println("Informe o estado: ");
        String estado = sc.nextLine();

        if (capitais.containsKey(estado)) {
            String capital = capitais.get(estado);
            System.out.println("Capital encontrada: " + capital);
        } else {
            System.out.println("Capital não encontrada.");
        } 

        sc.close(); 
    }
}
