package controle;

import java.util.Scanner;

public class ExercicioFixacao {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                String sair = ""; // Inicializa a variável
                int contador = 0;

                while (!sair.equalsIgnoreCase("s")) { // Continua enquanto não for "s"
                    System.out.println("Digite um número: ");
                    int num = sc.nextInt();
                    sc.nextLine(); // Consumir a quebra de linha após nextInt()

                    if (num > 0) {
                        System.out.println("positivo");
                    } else if (num < 0) {
                        System.out.println("negativo");
                    } else {
                        System.out.println("número é zero");
                    }

                    contador++;

                    System.out.println("Deseja sair? (não)");
                    sair = sc.nextLine(); // Captura a entrada do usuário
                }

                System.out.println("Loop encerrado após " + contador + " iterações.");
                sc.close(); // Fechar Scanner
            }
        }


