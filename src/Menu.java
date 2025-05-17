
import java.util.Scanner;


public class Menu {
    
    public static String MostrarMenu(String msg ) {

        System.out.println("---JARECA---");
        System.out.println("Este é o jogo Jareca. \nO objetivo principal do jogo é descobrir o tema do texto e\ndescobrir a saída do código. ");
        System.out.println(" \nA cada 5 tentativas terá um aviso caso queira desistir do desafio.\n");
        System.out.println("Atente-se aos acentos das palavras.");

        System.out.println("1 - Jogar");
        System.out.println("2 - Sair");

        return msg;

    }

        public static String Mensagem(String msg ) {

        return msg;

    }

    public static String desafioDois(String escolha){
        Scanner ler = new Scanner(System.in);

        String[] ifElseOculto = {"O", "if", "else", "em", "Java", "é", "uma", "estrutura", "de","controle", "que", "permite", "executar", "blocos", "de", "código", "diferentes", "com", "base", "em", "uma", "condicao", "Se", "a", "condicao", "dentro", "do", "if", "for", "verdadeira", "o", "código", "dentro", "do", "bloco", "if", "será", "executado.", "Caso", "contrário", "o", "código", "dentro", "do", "bloco", "else", "será", "executado."};
        String[] ifElse =       {"O", "**", "****", "em", "Java", "é", "uma", "*********", "de","********", "que", "permite", "********", "******", "de", "código", "diferentes", "com", "****", "em", "uma", "********", "Se", "a", "********", "dentro", "do", "**", "for", "**********", "o", "código", "dentro", "do", "*****", "**", "será", "executado.", "Caso", "contrário", "o", "código", "dentro", "do", "*****", "****", "será", "executado."};
        
        System.out.println("Este é o desafio 2 ");

        boolean completoDois = false;
        while (!completoDois) {
            
            System.out.println("\nFrase atual:");
            for (String item : ifElse) {
                System.out.print(item + " ");
            }
            System.out.println();

            System.out.print("Digite uma palavra para tentar preencher: ");
            String palpite = ler.nextLine();

           boolean acertou = false;
            for (int i = 0; i < ifElseOculto.length && i < ifElse.length; i++) {
                if ((ifElse[i].contains("*")) && ifElseOculto[i].equalsIgnoreCase(palpite)) {
                    ifElse[i] = ifElseOculto[i];
                    acertou = true;
                }
            }

            if (acertou) {
                System.out.println("\nPalavra inserida.");
            } else {
                System.out.println("\nNenhuma palavra corresponde ao seu palpite.");
            }

            
            boolean completo = true;
            for (int i = 0; i < ifElseOculto.length && i < ifElse.length; i++) {
                if (ifElse[i].contains("*")) {
                    completoDois = false;
                    break;
                }
            }
        }

      
        System.out.println("\nParabéns! Você completou:");
        for (String item : ifElse) {
            System.out.print(item + " ");
        }
        System.out.println(); 

        return escolha;
    }

    public static String desafioTres(String escolha ) {
        Scanner ler = new Scanner(System.in);

        String[] lacoRepeticaoOculto =  {"Um", "laco", "de", "repeticao", "em", "Java", "é", "usado", "para", "executar", "um", "bloco", "de", "código", "varias", "vezes", "enquanto", "uma", "condição", "for", "verdadeira", "ela", "ajuda", "a", "automatizar", "tarefas", "repetitivas", "como:", "for", "while", "e", "do while"};
        String[] lacoRepeticao =        {"Um", "****", "de", "*********", "em", "Java", "é", "*****", "para", "executar", "um", "*****", "de", "código", "******", "*****", "********", "uma", "condição", "for", "**********", "ela", "ajuda", "a", "***********", "tarefas", "***********", "como:", "***", "*****", "e", "** *****" };

        System.out.println("Este é o desafio 3 ");

        boolean completoTres = false;
        while (!completoTres) {
            
            System.out.println("\nFrase atual:");
            for (String item : lacoRepeticao) {
                System.out.print(item + " ");
            }
            System.out.println();

            System.out.print("Digite uma palavra para tentar preencher: ");
            String palpite = ler.nextLine();

            boolean acertou = false;
            for (int i = 0; i < lacoRepeticaoOculto.length && i < lacoRepeticao.length; i++) {
                if ((lacoRepeticao[i].contains("*")) && lacoRepeticaoOculto[i].equalsIgnoreCase(palpite)) {
                    lacoRepeticao[i] = lacoRepeticaoOculto[i];
                    acertou = true;
                }
            }

            if (acertou) {
                System.out.println("\nPalavra inserida.");
            } else {
                System.out.println("\nNenhuma palavra corresponde ao seu palpite.");
            }

            
            boolean completo = true;
            for (int i = 0; i < lacoRepeticaoOculto.length && i < lacoRepeticao.length; i++) {
                if (lacoRepeticao[i].contains("*")) {
                    completo = false;
                    break;
                }
            }
        }

    
        System.out.println("\nParabéns! Você completou:");
        for (String item : lacoRepeticao) {
            System.out.print(item + " ");
        }
        System.out.println(); 

        return escolha;

    }

    public static String desafioQuatro(String escolha ) {
        Scanner ler = new Scanner(System.in);

        String[] vetorOculto = {"Um", "vetor", "em", "Java", "é", "uma", "estrutura", "de", "dados", "que", "armazena", "uma", "colecao", "de", "elementos", "do", "mesmo", "tipo", "acessados", "por", "um", "indice", "Ele", "possui", "um", "tamanho", "fixo", "e", "os", "elementos", "são", "armazenados", "de", "forma", "sequencial"};
        String[] vetor =       {"Um", "*****", "em", "Java", "é", "uma", "*********", "de", "*****", "que", "********", "uma", "*******", "de", "elementos", "do", "*****", "****", "acessados", "por", "um", "******", "Ele", "possui", "um", "*******", "****", "e", "os", "elementos", "são", "***********", "de", "forma", "**********"};


        System.out.println("Este é o desafio 4 ");

        boolean completoTres = false;
        while (!completoTres) {
            
            System.out.println("\nFrase atual:");
            for (String item : vetor) {
                System.out.print(item + " ");
            }
            System.out.println();

            System.out.print("Digite uma palavra para tentar preencher: ");
            String palpite = ler.nextLine();

            boolean acertou = false;
            for (int i = 0; i < vetorOculto.length && i < vetor.length; i++) {
                if ((vetor[i].contains("*")) && vetorOculto[i].equalsIgnoreCase(palpite)) {
                    vetor[i] = vetorOculto[i];
                    acertou = true;
                }
            }

            if (acertou) {
                System.out.println("\nPalavra inserida.");
            } else {
                System.out.println("\nNenhuma palavra corresponde ao seu palpite.");
            }

            
            boolean completo = true;
            for (int i = 0; i < vetorOculto.length && i < vetor.length; i++) {
                if (vetor[i].contains("*")) {
                    completo = false;
                    break;
                }
            }
        }

    
        System.out.println("\nParabéns! Você completou:");
        for (String item : vetor) {
            System.out.print(item + " ");
        }
        System.out.println(); 

        return escolha;

    }

    public static String desafioCinco(String escolha ) {
        Scanner ler = new Scanner(System.in);

        String[] funcaoOculto = {"Uma", "funcao", "em", "Java", "é", "um", "bloco", "de", "código", "que", "realiza", "uma", "tarefa", "específica", "e", "pode", "ser", "reutilizado", "várias", "vezes.", "Ela", "é", "definida", "com", "um", "nome", "um", "tipo", "de", "retorno", "(como:", "int", "void", "etc.)", "e", "pode", "receber", "parametros", "para", "trabalhar", "com", "dados", "Quando", "chamada", "a", "funcao", "executa", "sua", "logica", "e", "retorna", "um", "valor", "(se", "necessário)."};
        String[] funcao =       {"Uma", "******", "em", "Java", "é", "um", "*****", "de", "código", "que", "*******", "uma", "******", "específica", "e", "pode", "ser", "***********", "várias", "vezes.", "Ela", "é", "definida", "com", "um", "****", "um", "****", "de", "*******", "(como:", "***", "****", "etc.)", "e", "pode", "receber", "**********", "para", "trabalhar", "com", "*****", "Quando", "chamada", "a", "******", "executa", "sua", "******", "e", "retorna", "um", "*****", "(se", "necessário)."};


        System.out.println("Este é o desafio 5 ");

        boolean completoTres = false;
        while (!completoTres) {
            
            System.out.println("\nFrase atual:");
            for (String item : funcao) {
                System.out.print(item + " ");
            }
            System.out.println();

            System.out.print("Digite uma palavra para tentar preencher: ");
            String palpite = ler.nextLine();

            boolean acertou = false;
            for (int i = 0; i < funcaoOculto.length && i < funcao.length; i++) {
                if ((funcao[i].contains("*")) && funcaoOculto[i].equalsIgnoreCase(palpite)) {
                    funcao[i] = funcaoOculto[i];
                    acertou = true;
                }
            }

            if (acertou) {
                System.out.println("\nPalavra inserida.");
            } else {
                System.out.println("\nNenhuma palavra corresponde ao seu palpite.");
            }

            
            boolean completo = true;
            for (int i = 0; i < funcaoOculto.length && i < funcao.length; i++) {
                if (funcao[i].contains("*")) {
                    completo = false;
                    break;
                }
            }
        }

    
        System.out.println("\nParabéns! Você completou:");
        for (String item : funcao) {
            System.out.print(item + " ");
        }
        System.out.println(); 

        return escolha;

    }


    // public static String limparTerminal(String msg ) {

    //     for ( int i = 0; i < 50; i++ ){
    //          System.out.println("");
    //     }

    //     return msg;

    // }

    public static String Arrays(String msg ) {

        String[] relacionalOculto = {"Os","operadores",  "relacionais", "comparam", "dois", "valores", "e", "retornam", "true", "ou", "false,", "como", "==",  "!=",  ">", "<", ">=", "e", "<="};
        /*Os operadores relacionais comparam dois valores e retornam true ou false, como == (igual), != (diferente), > (maior), < (menor), >= (maior ou igual) e <= (menor ou igual).*/

         String[] operadorRelacional = {"Os", "**********", "***********", "********", "dois", "*******", "e", "********", "true", "ou", "false", "como",  "**",  "**",  "*", "*", "**", "e", ""};
        /*Os operadores relacionais comparam dois valores e retornam true ou false, como == (igual), != (diferente), > (maior), < (menor), >= (maior ou igual) e <= (menor ou igual).*/



        String[] ifElse = {"O", "if", "else", "em", "Java",  "é",  "uma", "estrutura", "de", "controle",  "que", "permite", "executar", "blocos", "de", "código", "diferentes", "com","base", "em", "uma", "condição.", "Se", "a", "condição", "dentro", "do","if", "for", "verdadeira,", "o", "código",  "dentro",  "do","bloco", "if", "será", "executado.", "Caso", "contrário", "o", "código",  "dentro",  "do","bloco", "else", "será", "executado."};
        /*O if else em Java é uma estrutura de controle que permite executar blocos de código diferentes com base em uma condição. Se a condição dentro do if for verdadeira, o código dentro do bloco if será executado. Caso contrário, o código dentro do bloco else será executado.*/

        String[] ifElseOculto ={"O", "**", "****", "em", "Java", "é", "uma", "*********", "de","********", "que", "permite", "********", "******", "de", "código", "diferentes", "com", "****", "em", "uma", "********.", "Se", "a", "********", "dentro", "do", "**", "for", "**********", "o", "código", "dentro", "do", "*****", "**", "será", "executado.", "Caso", "contrário,", "o", "código", "dentro", "do", "******", "****", "será", "executado."};



        String[] lacoRepeticao = {"Um","laço", "de", "repetição", "em", "Java", "é", "usado", "para", "executar", "um", "bloco", "de", "código", "várias", "vezes", "enquanto", "uma", "condição", "for",  "verdadeira", "ela", "ajuda", "a",  "automatizar", "tarefas", "repetitivas", "como:","for","while", "e", "do while"};
        /*Um laço de repetição em Java é usado para executar um bloco de código várias vezes, enquanto uma condição for verdadeira. Ele ajuda a automatizar tarefas repetitivas, como: for, while e do while.*/

        String[] lacoRepeticaoOculto = {"Um", "****", "de", "*********", "em", "Java", "é", "*****","para", "executar", "um", "*****", "de", "código", "******", "*****,", "********", "uma", "condição",  "for", "**********.", "ela", "ajuda", "a", "***********", "tarefas", "***********,", "como:", "***", "*****", "e", "** *****" };



        String[] vetor = {"Um","vetor", "em", "Java", "é", "uma", "estrutura", "de", "dados", "que", "armazena", "uma", "coleção", "de", "elementos", "do","mesmo", "tipo,", "acessados", "por", "um", "índice.", "Ele", "possui", "um", "tamanho", "fixo", "e", "os", "elementos", "são", "armazenados", "de", "forma","sequencial"};
        /*Um vetor em Java é uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo, acessados por um índice. Ele possui um tamanho fixo e os elementos são armazenados de forma sequencial.*/

        String[] vetorOculto = {"Um", "*****", "em", "Java", "é", "uma", "********", "de","*****", "que", "********", "uma", "*******", "de", "elementos", "do", "*****", "****,", "acessados", "por", "um", "******.", "Ele", "possui", "um", "*******", "****", "e", "os", "elementos", "são", "***********", "de", "forma", "**********"};



        String[] funcao = {"Uma","função", "em", "Java", "é", "um", "bloco", "de", "código", "que", "realiza", "uma", "tarefa", "específica", "e", "pode", "ser", "reutilizado", "várias", "vezes.", "Ela", "é", "definida", "com", "um", "nome,", "um", "tipo", "de", "retorno", "(como:", "int", "void", "etc.)", "e", "pode", "receber", "parâmetros", "para", "trabalhar", "com", "dados.", "Quando", "chamada", "a", "função", "executa", "sua", "lógica", "e", "retorna", "um", "valor", "(se", "necessário)."};
        /*Uma função em Java é um bloco de código que realiza uma tarefa específica e pode ser reutilizado várias vezes. Ela é definida com um nome, um tipo de retorno (como int, void, etc.), e pode receber parâmetros para trabalhar com dados. Quando chamada, a função executa sua lógica e retorna um valor (se necessário).*/

        String[] funcaoOculto = {"Uma", "******", "em", "Java", "é", "um", "*****", "de", "código", "que", "*******", "uma", "******", "específica", "e", "pode", "ser", "***********", "várias", "vezes.", "Ela", "é", "definida", "com", "um", "****,", "um", "****", "de", "*******", "(como:", "***", "****", "etc.)", "e", "pode", "receber", "**********", "para", "trabalhar", "com", "*****.", "Quando", "chamada", "a", "******", "executa","sua", "******", "e", "retorna", "um", "*****", "(se", "necessário)."};

        return msg;

    }
}
