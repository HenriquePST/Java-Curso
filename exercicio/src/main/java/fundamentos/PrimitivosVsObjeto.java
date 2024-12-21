package fundamentos;

// criação de String e uso de tipos primitivos e wrappers em Java
//
//- Demonstração de como criar um objeto String com a palavra-chave `new`.
//- Exemplo de tipo primitivo `int` e como ele é impresso diretamente.
//- Introdução aos Wrappers, que são as versões objeto dos tipos primitivos como Integer e Double."

public class PrimitivosVsObjeto {

    public static void main(String[] args) {

        String s = new String("texto"); // Criação de um objeto String. String é uma classe, ou seja, um tipo de objeto em Java.
        s.toUpperCase(); //

        // Wrappers são a versão objeto dos tipos primitivos !
        // Aqui, estamos falando sobre classes que envolvem tipos primitivos, como Integer para int, Double para double, etc.
        int a = 123; // O tipo primitivo 'int' armazena diretamente um valor numérico. Não é um objeto.
        System.out.println(a); // A variável 'a' é de tipo primitivo e é impressa diretamente.
    }
}
