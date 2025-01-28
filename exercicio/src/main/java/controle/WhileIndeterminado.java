package controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String texto = "";

        while (!texto.equalsIgnoreCase("sair")) { // Repete enquanto o texto não for "sair"
            System.out.println("O que você quer hoje?");
            texto = entrada.nextLine();
        }
        System.out.println("Encerrando o programa. Até mais!");

        entrada.close();
    }
}

