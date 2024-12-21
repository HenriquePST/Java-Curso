package fundamentos;

//manipulação e formatação de strings em Java
//
//- Demonstração de uso de métodos da classe String como charAt(), concat(), startsWith(), endsWith(), length(), equals() e equalsIgnoreCase().
//- Exemplificação de formatação de strings usando printf() e String.format().
//- Concatenação de strings utilizando o operador '+' e o método concat().

public class TipoString {

    public static void main(String[] args) {
        System.out.println( "olá, pessoal".charAt(0)); // qual a letra no indice 0, "o"

        String s = "Boa tarde";

        // Adicionando "!!!" ao final da string de duas formas diferentes
        System.out.println(s.concat("!!!")); // Utilizando o metodo concat()
        System.out.println(s + "!!!"); // Utilizando o operador de concatenação (+)

        // Verificando se a string começa com "boa" ou "Boa"
        System.out.print(s.startsWith("boa")); // Verifica se inicia com "boa" (minúsculas)
        System.out.print(s.startsWith("Boa")); // Verifica se inicia com "Boa" (maiúscula)

        // Convertendo a string para letras minúsculas antes de verificar início ou término
        System.out.print(s.toLowerCase().startsWith("boa")); // Inicia e converte "boa"
        System.out.print(s.toLowerCase().endsWith("tarde")); // Termina e converte "tarde"

        // Obtendo o comprimento da string (quantidade de caracteres)
        System.out.print(s.length()); // Retorna um valor inteiro

        // Comparação de igualdade entre strings
        System.out.print(s.equals("boa tarde")); // Verifica igualdade, considerando maiúsculas/minúsculas

        // Comparação de igualdade ignorando diferenças entre maiúsculas e minúsculas
        System.out.print(s.equalsIgnoreCase("boa tarde"));

        String nome = "João";
        String sobrenome = "Silva";
        int idade = 30;
        double salario = 2500.50;

        // Concatenação utilizando "+" para formar a frase
        String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome +
                "\nIdade: " + idade + "\nSalário: R$" + salario + "\n";
        System.out.print(maisUmaFrase);

        // Formatação com printf
        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f\n",
                nome, sobrenome, idade, salario);

        // Formataçao com String.format
        String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario);
        System.out.print(frase);
    }
}
