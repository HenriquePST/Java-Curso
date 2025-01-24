package controle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog(
                "Digite um valor: ");
        //transforme esse  o valor string em inteiro.
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0) {
            System.out.println("numero é par");
        } else {
            System.out.println("numero impar");
        }
    }
}