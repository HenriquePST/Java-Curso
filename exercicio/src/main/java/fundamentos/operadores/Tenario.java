package fundamentos.operadores;

public class Tenario {
    public static void main(String[] args) {
        double media = 7.7;
        // condicao ? expressao_1 : expressao_2
        String resulta = media >= 7.0 ? " aprovado" : "reprovado" ;
        System.out.println( "o aluno está " + resulta );

//        if(media >= 7.0){
//            System.out.println("Aprovado");
//        } else {
//            System.out.println("Reprovado");
//        }
//        System.out.println(resulta);


        double nota = 9.9;
        boolean bomComportamento  =false;
        boolean passouPorMedia = nota >= 9;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? " sim." : " nao.";
        System.out.printf("Tem desconto? %s", resultado);

    }
}
