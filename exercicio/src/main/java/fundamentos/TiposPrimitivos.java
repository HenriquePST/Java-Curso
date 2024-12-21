package fundamentos;

// Utilização de tipos primitivos em Java
//
//- Uso de tipos numéricos inteiros como byte, short, int e long.
//- Uso de tipos numéricos reais com float e double.
//- Exemplos de tipos booleano e caractere para representar estado lógico e alfanumérico.
//- Cálculos simples com variáveis primitivos para demonstrar operações.

public class TiposPrimitivos {
    public static void main(String[] args) {
        // tipos numerios inteiros
        byte anosDeEmpresa = 23;
        short numerodeVoos = 234;
        int id = 45393;
        long pontoAcumulados = 2345432234L;

        //tipos numericos reais
        float salario = 45393.3f;
        double vendasAcumuladas = 234.34;

        //Tipo booleano
        boolean estaDeFerias = false;
        boolean estaDeVoos = true;

        //tipo caractere
        char status = 'A'; //Ativo

        //Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //numero de viagens
        System.out.println(numerodeVoos * 2);

        //Pontos por real
        System.out.println(pontoAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha : " + salario);
        System.out.println("Férias " + estaDeFerias);
        System.out.println("Voos " + estaDeVoos);
        System.out.println("Status " + status);
    }
}
