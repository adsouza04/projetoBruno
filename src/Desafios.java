import java.util.*;

public class Desafios {

    public static void main(String[] args) {

        desafioUm("");
        desafioDois("");
        desafioTres("");
        desafioQuatro("");
        desafioCinco("");
    }

    public static String desafioUm(String umDesafio) {
        Scanner ler = new Scanner(System.in);

        String[] relacionalOculto = { "Os", "operadores", "relacionais", "comparam", "dois", "valores", "e", "retornam",
                "true", "ou", "false,", "como", "==", "!=", ">", "<", ">=", "e", "<=" };
        String[] operadorRelacional = { "Os", "**********", "***********", "********", "dois", "*******", "e",
                "********", "true", "ou", "false,", "como", "**", "**", "*", "*", "**", "e", "**" };

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
        Menu.limparTerminal("");
        System.out.println("\nParabéns! Você completou:");
        for (String item : operadorRelacional) {
            System.out.print(item + " ");
        }
        System.out.println();

        return umDesafio;

    }

    public static String desafioDois(String doisDesafio) {
        Scanner ler = new Scanner(System.in);

        String[] ifElseOculto = { "O", "if", "else", "em", "Java", "é", "uma", "estrutura", "de", "controle", "que",
                "permite", "executar", "blocos", "de", "código", "diferentes", "com", "base", "em", "uma", "condicao",
                "Se", "a", "condicao", "dentro", "do", "if", "for", "verdadeira", "o", "código", "dentro", "do",
                "bloco", "if", "será", "executado.", "Caso", "contrário", "o", "código", "dentro", "do", "bloco",
                "else", "será", "executado." };
        String[] ifElse = { "O", "**", "****", "em", "Java", "é", "uma", "*********", "de", "********", "que",
                "permite", "********", "******", "de", "código", "diferentes", "com", "****", "em", "uma", "********",
                "Se", "a", "********", "dentro", "do", "**", "for", "**********", "o", "código", "dentro", "do",
                "*****", "**", "será", "executado.", "Caso", "contrário", "o", "código", "dentro", "do", "*****",
                "****", "será", "executado." };

        System.out.println("Deseja continuar jogando?");
        String resposta = ler.nextLine();

        if (resposta.equalsIgnoreCase("Sim")) {
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

                completoDois = true;
                for (int i = 0; i < ifElseOculto.length && i < ifElse.length; i++) {
                    if (ifElse[i].contains("*")) {
                        completoDois = false;
                        break;
                    }
                }

            }

            Menu.limparTerminal("");
            System.out.println("\nParabéns! Você completou:");
            for (String item : ifElse) {
                System.out.print(item + " ");
            }
            System.out.println();
        } else {
            System.out.println("Saindo do jogo... Obrigado por jogar! :)");
        }

        return resposta;
    }

    public static String desafioTres(String tresDesafio) {
        Scanner ler = new Scanner(System.in);

        String[] lacoRepeticaoOculto = { "Um", "laco", "de", "repeticao", "em", "Java", "é", "usado", "para",
                "executar", "um", "bloco", "de", "código", "varias", "vezes", "enquanto", "uma", "condição", "for",
                "verdadeira", "ela", "ajuda", "a", "automatizar", "tarefas", "repetitivas", "como:", "for", "while",
                "e", "do while" };
        String[] lacoRepeticao = { "Um", "****", "de", "*********", "em", "Java", "é", "*****", "para", "executar",
                "um", "*****", "de", "código", "******", "*****", "********", "uma", "condição", "for", "**********",
                "ela", "ajuda", "a", "***********", "tarefas", "***********", "como:", "***", "*****", "e",
                "** *****" };

        System.out.println("Deseja continuar jogando?");
        String desafioTres = ler.nextLine();

        if (desafioTres.equalsIgnoreCase("Sim")) {
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

                completoTres = true;
                for (int i = 0; i < lacoRepeticaoOculto.length && i < lacoRepeticao.length; i++) {
                    if (lacoRepeticao[i].contains("*")) {
                        completoTres = false;
                        break;
                    }
                }
            }

            Menu.limparTerminal("");
            System.out.println("\nParabéns! Você completou:");
            for (String item : lacoRepeticao) {
                System.out.print(item + " ");
            }
            System.out.println();
        } else {
            System.out.println("Saindo do jogo... Obrigado por jogar! :)");

        }

        return desafioTres;
    }

    public static String desafioQuatro(String quatroDesafio) {
        Scanner ler = new Scanner(System.in);

        String[] vetorOculto = { "Um", "vetor", "em", "Java", "é", "uma", "estrutura", "de", "dados", "que", "armazena",
                "uma", "colecao", "de", "elementos", "do", "mesmo", "tipo", "acessados", "por", "um", "indice", "Ele",
                "possui", "um", "tamanho", "fixo", "e", "os", "elementos", "são", "armazenados", "de", "forma",
                "sequencial" };
        String[] vetor = { "Um", "*****", "em", "Java", "é", "uma", "*********", "de", "*****", "que", "********",
                "uma", "*******", "de", "elementos", "do", "*****", "****", "acessados", "por", "um", "******", "Ele",
                "possui", "um", "*******", "****", "e", "os", "elementos", "são", "***********", "de", "forma",
                "**********" };

        System.out.println("Deseja continuar jogando?");
        String desafioQuatro = ler.nextLine();

        if (desafioQuatro.equalsIgnoreCase("Sim")) {
            System.out.println("Este é o desafio 4 ");

            boolean completoQuatro = false;
            while (!completoQuatro) {
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

                completoQuatro = true;
                for (int i = 0; i < vetorOculto.length && i < vetor.length; i++) {
                    if (vetor[i].contains("*")) {
                        completoQuatro = false;
                        break;
                    }
                }
            }

            Menu.limparTerminal("");
            System.out.println("\nParabéns! Você completou:");
            for (String item : vetor) {
                System.out.print(item + " ");
            }
            System.out.println();
        } else {
            System.out.println("Saindo do jogo... Obrigado por jogar! :)");

        }

        return desafioQuatro;
    }

    public static String desafioCinco(String cincoDesafio) {
        Scanner ler = new Scanner(System.in);

        String[] funcaoOculto = { "Uma", "funcao", "em", "Java", "é", "um", "bloco", "de", "código", "que", "realiza",
                "uma", "tarefa", "específica", "e", "pode", "ser", "reutilizado", "várias", "vezes.", "Ela", "é",
                "definida", "com", "um", "nome", "um", "tipo", "de", "retorno", "(como:", "int", "void", "etc.)", "e",
                "pode", "receber", "parametros", "para", "trabalhar", "com", "dados", "Quando", "chamada", "a",
                "funcao", "executa", "sua", "logica", "e", "retorna", "um", "valor", "(se", "necessário)." };
        String[] funcao = { "Uma", "******", "em", "Java", "é", "um", "*****", "de", "código", "que", "*******", "uma",
                "******", "específica", "e", "pode", "ser", "***********", "várias", "vezes.", "Ela", "é", "definida",
                "com", "um", "****", "um", "****", "de", "*******", "(como:", "***", "****", "etc.)", "e", "pode",
                "receber", "**********", "para", "trabalhar", "com", "*****", "Quando", "chamada", "a", "******",
                "executa", "sua", "******", "e", "retorna", "um", "*****", "(se", "necessário)." };

        System.out.println("Deseja continuar jogando?");
        String desafioCinco = ler.nextLine();

        if (desafioCinco.equalsIgnoreCase("Sim")) {
            System.out.println("Este é o desafio 5 ");

            boolean completoCinco = false;
            while (!completoCinco) {
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

                completoCinco = true;
                for (int i = 0; i < funcaoOculto.length && i < funcao.length; i++) {
                    if (funcao[i].contains("*")) {
                        completoCinco = false;
                        break;
                    }
                }
            }

            Menu.limparTerminal("");
            System.out.println("\nParabéns! Você completou:");
            for (String item : funcao) {
                System.out.print(item + " ");
            }
            System.out.println();
        } else {
            System.out.println("Saindo do jogo... Obrigado por jogar! :)");

        }
        return desafioCinco;
    }
}
