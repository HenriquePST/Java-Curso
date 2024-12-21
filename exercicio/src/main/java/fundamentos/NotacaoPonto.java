package fundamentos;

//uso de notação ponto para manipulação de strings
//
//- Demonstração de métodos da classe String, como replace, toUpperCase e concat.
//- Uso encadeado de métodos para manipulação de strings.
//- Exemplificação do uso de operadores com tipos primitivos (sem o operador '.').

public class NotacaoPonto {

    public static void main(String[] args) {

       String s = "Bom dia X";
        s = s.replace("X", "Senhora"); // Substitui a letra "X" na string s por "Senhora".
        s = s.toUpperCase(); // Converte todos os caracteres da string s para maiúsculas.
        s = s.concat("!!!"); // Concatena a string "!!!" ao final da string s.


        System.out.println(s);

       String x = "leo".toUpperCase();
        System.out.println(x);

       String y = "Bom dia x "
               .replace("x", "gui")
               .toUpperCase()
               .concat("!!!");
        System.out.println(y);

        // Tipos primitivos não tem o operador "."
        int a = 3;
        System.out.println(a);

    }
}
