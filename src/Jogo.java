import java.util.Scanner;

public class Jogo {
    
 public static String[] JogoJereca(String escolha) {
        Scanner ler = new Scanner(System.in);

        String menu = Menu.MostrarMenu("");
        // String arrays = Menu.Arrays("");
        
        String[] relacionalOculto = {"Os","operadores",  "relacionais", "comparam", "dois", "valores", "e", "retornam", "true", "ou", "false,", "como", "==",  "!=",  ">", "<", ">=", "e", "<="};
        /*
        * Os operadores relacionais comparam dois valores e retornam true ou false, como == (igual), != (diferente), > (maior), < (menor), >=      
        * (maior ou igual) e <= (menor ou igual).
        */

        String[] operadorRelacional = {"Os", "**********", "***********", "********", "dois", "*******", "e", "********", "true", "ou", "false,", "como",  "**",  "**",  "*", "*", "**", "e", "**"};
        /*
        * Os operadores relacionais comparam dois valores e retornam true ou false, como == (igual), != (diferente), > (maior), < (menor), >=      
        * (maior ou igual) e <= (menor ou igual).
        */

        do {
            System.out.print("Escolha uma opção: ");
            escolha = ler.nextLine();
            System.out.println();
            switch (escolha) {
                case "1":
                    System.out.println("Este é o desafio 1 ");
                    boolean completo = false;
                    while (!completo) {
                        
                        System.out.println("\nFrase atual:");
                        for (String item : operadorRelacional) {
                            System.out.print(item + " ");
                        }
                        System.out.println();

                        System.out.print("Digite uma palavra para tentar preencher: ");
                        String palpite = ler.nextLine();

                        boolean acertou = false;
                        for (int i = 0; i < relacionalOculto.length && i < operadorRelacional.length; i++) {
                            if ((operadorRelacional[i].contains("*")) && relacionalOculto[i].equalsIgnoreCase(palpite)) {
                                operadorRelacional[i] = relacionalOculto[i];
                                acertou = true;
                            }
                        }

                        if (acertou) {
                            System.out.println("\nPalavra inserida.");
                        } else {
                            System.out.println("\nNenhuma palavra corresponde ao seu palpite.");
                        }

                        
                        completo = true;
                        for (int i = 0; i < relacionalOculto.length && i < operadorRelacional.length; i++) {
                            if (operadorRelacional[i].contains("*")) {
                                completo = false;
                                break;
                            }
                        }
                    }

                  
                    System.out.println("\nParabéns! Você completou:");
                    for (String item : operadorRelacional) {
                        System.out.print(item + " ");
                    }
                    System.out.println();
                    break;
                case "2":
                    System.out.println("Saindo do jogo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            

        } while (escolha == "3");


        return operadorRelacional;

    }

}
