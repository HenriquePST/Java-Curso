package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {

//        DOMINGO ->1
//        SEG ->2
//        TERCA ->3
//        QUARTA ->4
//        QUINTA ->5
//        SEXTA ->6
//        SABADO ->7

        Scanner DiaHoje = new Scanner(System.in);

        System.out.println("Que dia da Semana é Hoje");
        String dia = DiaHoje.next();

        if ("domingo".equalsIgnoreCase(dia)) {
            System.out.println("1");
        }else if ("segunda".equalsIgnoreCase(dia)) {
            System.out.println("2");
        }else if ("terca".equalsIgnoreCase(dia)) {
            System.out.println("3");
        }else if ("quarta".equalsIgnoreCase(dia)) {
            System.out.println("4");
        }else if ("quinta".equalsIgnoreCase(dia)) {
            System.out.println("5");
        }else if ("sexta".equalsIgnoreCase(dia)) {
            System.out.println("6");
        }else if ("sabado".equalsIgnoreCase(dia)) {
            System.out.println("7");
        } else  {
            System.out.println("dia invalido");
        }
        DiaHoje.close();
    }
}
