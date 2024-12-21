package fundamentos;


//cálculo da área da circunferência
//
//- Implementação de cálculo da área de uma circunferência com base no raio.
//- Uso de uma constante para o valor de PI.
//- Exemplo prático com dois valores de raio (3.4 e 10).

public class AreaCircunferencia {
    public static void main(String[] args) {

        double raio = 3.4;
        final double PI = 3.14159265358979323846;

        double area = PI * raio * raio;
        System.out.println(area);

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Area: " + area);
    }
}