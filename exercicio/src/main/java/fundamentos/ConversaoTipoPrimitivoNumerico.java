package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1; //implicita
        System.out.println(a);

        float b = (float) 1.1112345678; //explicita [Cast]
        System.out.println(b);

        int c = 128; // até 127
        byte d = (byte) c; //explicita [Cast]
        System.out.println(d);

        double e = 1.000009999;
        int f = (int) e; //explicita [Cast]
        System.out.println(f);


    }
}
