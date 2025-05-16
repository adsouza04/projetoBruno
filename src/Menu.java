
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
