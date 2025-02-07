package controle;

public class SwitchSemBreak {
    public static void main(String[] args) {

               String faixa = "marrom";

                switch (faixa.toUpperCase()) {
                    case "PRETA":
                        System.out.println("Sei o Bassai-Dai...");
                        break;
                    case "MARROM":
                        System.out.println("Sei o tekki shodan");
                        break;
                    case "VERDE":
                        System.out.println("ok");
                        break;
                    case "LARANJA":
                        System.out.println("Sei o Bassai-Dai...");
                        break;
                    case "VERMELHA":
                        System.out.println("Sei o tekki shodan");
                        break;
                    case "AMARELA":
                        System.out.println("Sei o Bassai-Dai...");
                        break;
                    default:
                        System.out.println("Não sei o Bassai-Dai...");
                }
                System.out.println("FIM");
            }
        }

