package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
  /*      System.out.println("2" == "2");

        String s = new String("2");
        System.out.println("2" == s);
        System.out.println("2".equals(s));*/


        // ==== Desafio ===
        String Senha = "123456";
        System.out.print("informe sua senha : ");

        Scanner senha = new Scanner(System.in);
        String senha1 = senha.nextLine();
        System.out.println(Senha.equals(senha1));

        // == nao compara o conteudo, ele compara a referencia dos objetos

        String x = "123456";
        String y = "123456";

        System.out.println(x == y);

    }
}
