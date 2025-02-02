package controle;


//o aluno digita as notas e o sistema calcula a média, você pode seguir a lógica abaixo. O programa deve:
//
//Continuar pedindo as notas enquanto o aluno não digitar -1 para sair.
//Validar se a nota está entre 0 e 10 (se a nota for maior que 10 ou menor que 0, o programa pedirá a nota novamente).
//Calcular a média ao final com base nas notas válidas.

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

                Scanner entrada = new Scanner(System.in);

                int quantidadeDeNotas = 0;
                double nota = 0;
                double total = 0;

                while (nota != -1) { // Corrigido para sair com -1
                    System.out.print("Digite sua nota (-1 para sair): ");
                    nota = entrada.nextDouble();

                    if (nota <= 10 && nota >= 0) {
                        total += nota;
                        quantidadeDeNotas++;
                    } else if( nota!= -1) {
                        System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                    }
                }

                // calcular a media
        double media = total / quantidadeDeNotas;
        System.out.println("media: " + media);
                entrada.close();
            }
        }

