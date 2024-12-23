package fundamentos;



public class Wrapper {
    public static void main(String[] args) {

        // Wrappers para tipos primitivos inteiros

        Byte b = 100; // Wrapper para o tipo primitivo byte
        Short s = 1000; // Wrapper para o tipo primitivo short
        Integer i = Integer.parseInt("10000"); // Converte uma String ("10000") para um Integer
        Long l = 100000L; // Wrapper para o tipo primitivo long. O sufixo 'L' indica um valor long

        //byteValue(): Retorna o valor como tipo primitivo byte.
        //toString(): Retorna o valor como uma string.
        //parseBoolean() e parseInt(): Convertem strings para valores primitivos

        // Exibição de valores e uso de métodos dos Wrappers

        System.out.println(b.byteValue()); // Converte o valor de `b` (100) para o tipo primitivo `byte` e o exibe.
        System.out.println(s.toString()); // Converte `s` (1000) para uma string e a exibe.
        System.out.println(i * 3);
        System.out.println(l / 3);

        // Wrappers para tipos primitivos de ponto flutuante
        Float f = 123.0F; // Wrapper para o tipo primitivo float
        System.out.println(f);

        Double d = 123.011; // Wrapper para o tipo primitivo double
        System.out.println(d);

        // Wrapper para tipo booleano
        Boolean bo = Boolean.parseBoolean("true"); // Converte a String "true" para um objeto Boolean
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase()); // Converte o Boolean para uma String, transforma em maiúsculas e exibe

        // Wrapper para tipo caractere
        Character c = '#'; // Wrapper para o tipo primitivo char
        System.out.println(c + "...."); // Concatena o valor do Character com "...." e exibe
    }
}

