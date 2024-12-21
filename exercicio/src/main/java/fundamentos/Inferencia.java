package fundamentos;


//demonstração de inferência de tipo em Java
//
//- Uso de inferência de tipo com a palavra-chave 'var'.
//- Demonstração de declaração, inicialização e uso de variáveis de tipos primitivos e objetos.
//- Exemplo de alteração de valor de variável de tipo String.
//- Demonstração de uma variável não inicializada e posterior inicialização.

public class Inferencia {
    public static void main(String[] args) {

        double a = 4.5;
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "texto";
        c = "outro texto";
        System.out.println(c);

       // c = 4.5

        double d; // variável foi declarada
        d = 123.3; // variável foi inicializada
        System.out.println(d); //usada!

        var e = 123.3;
        System.out.println(e);


    }
}
