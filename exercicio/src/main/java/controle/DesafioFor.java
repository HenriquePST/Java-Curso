package controle;

public class DesafioFor {
    public static void main(String[] args) {

        String valor = "#";
        for(int i=0; i<5; i++){
            System.out.println(valor);
            valor += "#";
        }

        // versao do desafio
        //nao pode usar valor numerico para controlar o laço "

        for(String v = "#"; !v.equals("#####"); v += "#"){
            System.out.println(v);
        }
    }

}

