package fundamentos;


//conversão de temperatura de Fahrenheit para Celsius
//
//- Implementação do cálculo de conversão de Fahrenheit para Celsius.
//- Uso de constantes para o fator de conversão e ajuste.
//- Exibição de resultados para diferentes temperaturas (86, 150 e 0 graus Fahrenheit).

public class Temperatura {
    public static void main(String[] args) {
        // (ºF - 32) x 5/9 = ºC
        final double FATOR = 5.0 /9.0;
        final double AJUSTE = 32;

        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius + "C.");

        fahrenheit = 150;
        celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius + "C.");

        fahrenheit = 0;
        celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius + "C.");
    }
}
