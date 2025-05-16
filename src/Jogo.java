import java.util.Scanner;

public class Jogo {
    
 public static String[] JogoJereca(String escolha) {
        Scanner ler = new Scanner(System.in);

        String menu = Menu.MostrarMenu("");
        String mensagem = Menu.Mensagem("Deseja continuar jogando?");
        // String limpar = Menu.limparTerminal("");
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
                    
                    //---------------Desafio 2--------------//

                    System.out.println("Deseja continuar jogando?");
                    String desafioDois = ler.nextLine();

                    switch (desafioDois) {
                        case "Sim":
                        System.out.println("Este é o desafio 2 ");

                        boolean completoDois = false;
                        while (!completoDois) {
                            
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

                        case "Não":
                            System.out.println("Saindo do jogo... Obrigado por jogar! :)");
                            break;

                        //---------------Desafio 3--------------//

                        System.out.println(mensagem);
                        String respostaDo = ler.nextLine();

                        switch (respostaDo) {
                            case "Sim":
                            System.out.println("Este é o desafio 3 ");

                            boolean completoTres = false;
                            while (!completoTres) {
                                
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

                            case "Não":
                                System.out.println("Saindo do jogo... Obrigado por jogar! :)");
                                break;

                            //---------------Desafio 4--------------//

                            System.out.println("Deseja continuar jogando?");
                            String desafioQuatro = ler.nextLine();

                            switch (desafioQuatro) {
                                case "Sim":
                                System.out.println("Este é o desafio 4 ");

                                boolean completoQuatro = false;
                                while (!completoQuatro) {
                                    
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

                                case "Não":
                                    System.out.println("Saindo do jogo... Obrigado por jogar! :)");
                                    break;

                                //---------------Desafio 5--------------//

                                System.out.println("Deseja continuar jogando?");
                                String desafioCinco = ler.nextLine();

                                switch (desafioCinco) {
                                    case "Sim":
                                    System.out.println("Este é o desafio 2 ");

                                    boolean completoCinco = false;
                                    while (!completoCinco) {
                                        
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

                                    case "Não":
                                        System.out.println("Saindo do jogo... Obrigado por jogar! :)");
                                        break;
                        
                                } 

                            }

                        }
                    }
                

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
