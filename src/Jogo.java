import java.util.Scanner;

public class Jogo {
    
 public static String JogoJereca(String escolha) {
        Scanner ler = new Scanner(System.in);

        do {
            String menu = Menu.MostrarMenu("");
            String arrays = Menu.Arrays("");
            
            String[] relacionalOculto = {"operadores", "relacionais", "comparam", "valores", "retornam", "==",  "!=",  ">", "<", ">=","<="};
            /*
            * Os operadores relacionais comparam dois valores e retornam true ou false, como == (igual), != (diferente), > (maior), < (menor), >=      
            * (maior ou igual) e <= (menor ou igual).
            */

            String[] operadorRelacional = {"Os", "**********", "***********", "********", "dois", "*******", "e", "********", "true", "ou", "false", "como",  "**",  "**",  "*", "*", "**", "e", ""};
            /*
            * Os operadores relacionais comparam dois valores e retornam true ou false, como == (igual), != (diferente), > (maior), < (menor), >=      
            * (maior ou igual) e <= (menor ou igual).
            */

            System.out.println(menu);
    
            escolha = ler.nextLine();

            switch (escolha) {
                case 1:
                    
                    while (escolha == 1) {
                        System.out.println("Este é o desafio 1 ");
                        
                        for (String item : operadorRelacional) {
                            System.out.println(item);
                        }
                    }

                    break;
            
                default:
                    break;
            }
            

        } while (escolha => 3);


        return escolha;







    }

}
