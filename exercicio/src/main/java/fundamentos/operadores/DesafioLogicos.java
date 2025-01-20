package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        //trabalho na terça ( V ou F )
        //trabalho na quinta (V ou F)

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;
        boolean comprouSorteve = trabalho1 || trabalho2;

        //Operador Unario!
        boolean maisSaudavel = !comprouSorteve;

        System.out.println("comprou TV 50? " + comprouTV50);
        System.out.println("comprou TV 32 " + comprouTV50);
        System.out.println("comprou Sorvete?" + comprouTV50);
        System.out.println("Mais saudavel? " + maisSaudavel);
    }
}
