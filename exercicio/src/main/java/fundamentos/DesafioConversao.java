package fundamentos;

import java.util.Scanner;


//Crie uma classe chamada DesafioConversao. Nessa classe, use o Scanner para capturar três strings
// com o método nextLine() ou next.

// Essas strings representarão os últimos três salários de um funcionário.
//Implemente a lógica para: Converter as strings para números (considerando que
// os valores podem usar vírgula ou ponto como // separador decimal).
//Somar os três salários.
//Calcular a média dos últimos três salários.

//Como você faria para implementar essa conversão e realizar os cálculos?"

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println(" Informe o primeiro salário: ");
        String salario1 = entrada.next().replace(",",".");
        System.out.println(" Informe o segundo salario: ");
        String salario2 = entrada.next().replace(",",".");
        System.out.println(" Informe o terceiro salario: ");
        String salario3 = entrada.next().replace(",",".");


        double numero1 = Double.parseDouble(String.valueOf(salario3));
        double numero2 = Double.parseDouble(String.valueOf(salario2));
        double numero3 = Double.parseDouble(String.valueOf(salario3));

        double media = (numero1 + numero2 + numero3)/3;
        System.out.println("A média dos salários é "+media);

        entrada.close();
    }
}
