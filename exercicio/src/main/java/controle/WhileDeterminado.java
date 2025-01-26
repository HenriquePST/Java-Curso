package controle;

// porque while determinado porque eu sei quantas repetições vai acontecer eu determinei quantidade
// de rpetição.

public class WhileDeterminado {
    public static void main(String[] args) {
        int contador = 1; // inicializando a variável com o valor 1
        while (contador <= 10) { // enquanto o número for menor ou igual a 10
            System.out.printf("i = %d\n",contador); // imprimindo
            contador +=2; // incrementando o número de 2 em 2
        }
    }
}
