package controle;

import java.util.Scanner;

public class DesafioCalculadora {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int repeticoes;

            // Solicita quantos cálculos o usuário deseja realizar
            System.out.print("Quantos cálculos deseja realizar? ");
            repeticoes = scanner.nextInt();

            for (int i = 0; i < repeticoes; i++) {
                System.out.println("\nEscolha uma operação:");
                System.out.println("[1] Adição");
                System.out.println("[2] Subtração");
                System.out.println("[3] Multiplicação");
                System.out.println("[4] Divisão");
                System.out.print("Opção: ");

                int opcao = scanner.nextInt();

                // Solicitar números ao usuário
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = 0;
                boolean operacaoValida = true;

                // Estrutura de decisão com if else
                if (opcao == 1) {
                    resultado = num1 + num2;
                } else if (opcao == 2) {
                    resultado = num1 - num2;
                } else if (opcao == 3) {
                    resultado = num1 * num2;
                } else if (opcao == 4) {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Erro: Divisão por zero não permitida.");
                        operacaoValida = false;
                    }
                } else {
                    System.out.println("Opção inválida!");
                    operacaoValida = false;
                }

                if (operacaoValida) {
                    System.out.println("Resultado: " + resultado);
                }
            }

            System.out.println("\nCalculadora encerrada.");
            scanner.close();
        }
    }
