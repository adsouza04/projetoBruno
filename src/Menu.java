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


    public static String Arrays(String msg ) {

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

         String[] ifElse = {"O", "if", "else", "em", "Java",  "é",  "uma", "estrutura", "de", "controle",  "que", "permite", "executar", "blocos", "de", "código", "diferentes", "com","base", "em", "uma", "condição.", "Se", "a", "condição", "dentro", "do","if", "for", "verdadeira,", "o", "código",  "dentro",  "do","bloco", "if", "será", "executado.", "Caso", "contrário", "o", "código",  "dentro",  "do","bloco", "else", "será", "executado."};
        /*O if else em Java é uma estrutura de controle que permite executar blocos de código diferentes com base em uma condição. Se a condição dentro do if for verdadeira, o código dentro do bloco if será executado. Caso contrário, o código dentro do bloco else será executado.*/

         String[] ifElseOculto ={"O", "**", "****", "em", "Java", "é", "uma", "*********", "de","********", "que", "permite", "********", "******", "de", "código", "diferentes", "com", "****", "em", "uma", "********.", "Se", "a", "********", "dentro", "do", "**", "for", "**********", "o", "código", "dentro", "do", "*****", "**", "será", "executado.", "Caso", "contrário,", "o", "código", "dentro", "do", "******", "****", "será", "executado."}



         String[] lacoRepeticao = {"laço", "repetição", "usado", "bloco", "várias", "vezes", "enquanto",  "verdadeira",  "automatizar", "repetitivas", "for","while", "do while"};
        /*Um laço de repetição em Java é usado para executar um bloco de código várias vezes, enquanto uma condição for verdadeira. Ele ajuda a automatizar tarefas repetitivas, como: for, while e do while.
         * 
        */

        String[] lacoRepeticaoOculto = {"Um", "****", "de", "*********", "em", "Java", "é", "*****","para", "executar", "um", "*****", "de", "código", "******", "*****,", "********", "uma", "",  }






        String[] vetor = {"vetor", "estrutura", "dados", "armazena", "coleção", "mesmo", "tipo",  "índice",  "tamanho", "fixo", "armazenados","sequencial"};
        /*Um vetor em Java é uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo, acessados por um índice. Ele possui um tamanho fixo e os elementos são armazenados de forma sequencial.
        */

        String[] funcao = {"função", "bloco", "realiza", "tarefa", "reutilizado", "nome", "tipo",  "retorno",  "int", "void", "parâmetros","dados", "função", "lógica", "valor"};
        /*Uma função em Java é um bloco de código que realiza uma tarefa específica e pode ser reutilizado várias vezes. Ela é definida com um nome, um tipo de retorno (como int, void, etc.), e pode receber parâmetros para trabalhar com dados. Quando chamada, a função executa sua lógica e retorna um valor (se necessário).
         */

        return msg;

    }
}
