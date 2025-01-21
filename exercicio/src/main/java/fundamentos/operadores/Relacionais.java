package fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {
        int a = 97;
        int b = 'a';


        System.out.println(a == b);  // Igual: Verifica se a é igual a b
        System.out.println(3 > 5);   // Maior: Verifica se 3 é maior que 5
        System.out.println(3 >= 3);  // Maior ou igual: Verifica se 3 é maior ou igual a 3
        System.out.println(3 < 7);   // Menor: Verifica se 3 é menor que 7
        System.out.println(30 <= 7); // Menor ou igual: Verifica se 30 é menor ou igual a 7
        System.out.println(30 != 7); // Diferente: Verifica se 30 é diferente de 7

        double nota 7.3;

        boolean bomComportamento = true;
        boolean passouPorMedia = nota >=7;

        boolean temDesconto = bomComportamento && passouPorMedia;
        System.out.println("possui desconto:" + temDesconto);
    }
}
