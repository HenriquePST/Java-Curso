package fundamentos;

import javax.swing.*;
import java.math.BigDecimal;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog (
                "Digite o primeiro numero");
        String valor2 = JOptionPane.showInputDialog(
                "Digite o segundo numero");
        System.out.println(valor1 + valor2);
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double resultado = numero1 * numero2;
        System.out.println("soma é " +resultado);
        System.out.println("media é " +resultado/2);

    }
}
