package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = "";

        do {
            System.out.println("Digite precisa falar " +
                    "a palavra magica");
            System.out.print(" para  sair : ");
            texto = entrada.nextLine();
        } while (!texto.equalsIgnoreCase("por favor"));

        System.out.println("obrigado");
        entrada.close();
    }
}
