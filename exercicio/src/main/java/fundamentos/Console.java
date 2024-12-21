package fundamentos;

import java.util.Scanner;

//- Uso da classe Scanner para capturar informações do usuário.
//- Formatação de saída com System.out.printf, incluindo:
//  - Inteiros (%d)
//  - Ponto flutuante com precisão (%.1f)
//  - Strings (%s)
//  - Quebras de linha com \n e %n.
//- Exercícios práticos de interação com o usuário (nome, sobrenome e idade).

public class Console {
    public static void main(String[] args) {
        System.out.print("bom");
        System.out.print("dia!\n\n"); //quebra de linha

        System.out.printf("MegaSena : %d %d %d %d %d",
                1,2,3,4,5);
        System.out.printf("Salario : %.1f%n",1234.3235);
        System.out.printf("Nome: %s%n", "joao");


        Scanner entrada = new Scanner(System.in);

        System.out.print("digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("digite seu sobrenome: ");
        String Sobrenome = entrada.nextLine();
        System.out.print("digite sua idade :");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos.%n", nome, Sobrenome,idade);

        entrada.close();

        System.out.println("Nome: " + nome);

    }
}
