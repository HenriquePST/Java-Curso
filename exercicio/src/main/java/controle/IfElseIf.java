package controle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite a nota: ");
        double nota = entrada.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("numero invalido");
        } else if (nota >= 8.1) {
            System.out.println("Conceito A");
        } else if (nota >= 6.1) {
            System.out.println("conceito B");
        } else if (nota >= 4.1) {
            System.out.println("conceito C");
        } else if (nota >= 2.1) {
            System.out.println("conceito D");
        } else {
            System.out.println("conceito E");
        }
        System.out.println("fim");
        entrada.close();

    }
}