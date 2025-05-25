import java.util.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

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

        int indiceDica = -1;
        int letrasReveladas = 0;
        int erros = 0;

        while (true) {
            indiceDica = -1;
            for (int i = 0; i < operadorRelacional.length; i++) {
                if (operadorRelacional[i].contains("*")) {
                    indiceDica = i;
                    break;
                }
            }
            if (indiceDica == -1)
                break;

            String palavraDica = relacionalOculto[indiceDica];

            String dica = "";
            for (int j = 0; j < palavraDica.length(); j++) {
                if (j < letrasReveladas)
                    dica += palavraDica.charAt(j);
                else
                    dica += "*";
            }

            System.out.println("\nFrase atual:");
            for (int i = 0; i < operadorRelacional.length; i++) {
                if (i == indiceDica && operadorRelacional[i].contains("*"))
                    System.out.print(dica + " ");
                else
                    System.out.print(operadorRelacional[i] + " ");
            }
            System.out.println();

            System.out.print("Digite uma palavra para tentar preencher: ");
            String palpite = ler.nextLine();

            boolean acertouAlguma = false;
            boolean acertouDica = false;

            for (int i = 0; i < operadorRelacional.length; i++) {
                if (operadorRelacional[i].contains("*") && relacionalOculto[i].equalsIgnoreCase(palpite)) {
                    operadorRelacional[i] = relacionalOculto[i];
                    acertouAlguma = true;
                    if (i == indiceDica)
                        acertouDica = true;
                }
            }

            if (acertouAlguma) {
                System.out.println("\nPalavra inserida.");
                tocarSom("e:/projeto_bruno/som.wav/bells_2.wav");

                if (acertouDica) {
                    letrasReveladas = 0;
                    erros = 0;
                }
            } else {
                System.out.println("\nNenhuma palavra corresponde ao seu palpite.");
                tocarSom("e:/projeto_bruno/som.wav/error.wav");
                erros++;
                if (erros % 5 == 0 && letrasReveladas < palavraDica.length()) {
                    letrasReveladas++;
                    System.out.println("Dica: " + dica);
                }
            }
        }

        Menu.limparTerminal("");
        System.out.println("\nParabéns! Você completou:");
        tocarSom("e:/projeto_bruno/som.wav/tada.wav");
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

        System.out.println("Este é o desafio 2 ");

        int indiceDica = -1;
        int letrasReveladas = 0;
        int erros = 0;

        while (true) {
            indiceDica = -1;
            for (int i = 0; i < ifElse.length; i++) {
                if (ifElse[i].contains("*")) {
                    indiceDica = i;
                    break;
                }
            }
            if (indiceDica == -1)
                break;

            String palavraDica = ifElseOculto[indiceDica];

            String dica = "";
            for (int j = 0; j < palavraDica.length(); j++) {
                if (j < letrasReveladas)
                    dica += palavraDica.charAt(j);
                else
                    dica += "*";
            }

            System.out.println("\nFrase atual:");
            for (int i = 0; i < ifElse.length; i++) {
                if (i == indiceDica && ifElse[i].contains("*"))
                    System.out.print(dica + " ");
                else
                    System.out.print(ifElse[i] + " ");
            }
            System.out.println();

            System.out.print("Digite uma palavra para tentar preencher: ");
            String palpite = ler.nextLine();

            boolean acertouAlguma = false;
            boolean acertouDica = false;

            for (int i = 0; i < ifElse.length; i++) {
                if (ifElse[i].contains("*") && ifElseOculto[i].equalsIgnoreCase(palpite)) {
                    ifElse[i] = ifElseOculto[i];
                    acertouAlguma = true;
                    if (i == indiceDica)
                        acertouDica = true;
                }
            }

            if (acertouAlguma) {
                System.out.println("\nPalavra inserida.");
                tocarSom("e:/projeto_bruno/som.wav/bells_2.wav");
                if (acertouDica) {
                    letrasReveladas = 0;
                    erros = 0;
                }
            } else {
                System.out.println("\nNenhuma palavra corresponde ao seu palpite.");
                tocarSom("e:/projeto_bruno/som.wav/error.wav");
                erros++;
                if (erros % 5 == 0 && letrasReveladas < palavraDica.length()) {
                    letrasReveladas++;
                    System.out.println("Dica: " + dica);
                }
            }
        }

        Menu.limparTerminal("");
        System.out.println("\nParabéns! Você completou:");
        tocarSom("e:/projeto_bruno/som.wav/tada.wav");
        for (String item : ifElse) {
            System.out.print(item + " ");
        }
        System.out.println();

        return doisDesafio;
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

        System.out.println("Este é o desafio 3 ");

        int indiceDica = -1;
        int letrasReveladas = 0;
        int erros = 0;

        while (true) {
            indiceDica = -1;
            for (int i = 0; i < lacoRepeticao.length; i++) {
                if (lacoRepeticao[i].contains("*")) {
                    indiceDica = i;
                    break;
                }
            }
            if (indiceDica == -1)
                break;

            String palavraDica = lacoRepeticaoOculto[indiceDica];

            String dica = "";
            for (int j = 0; j < palavraDica.length(); j++) {
                if (j < letrasReveladas)
                    dica += palavraDica.charAt(j);
                else
                    dica += "*";
            }

            System.out.println("\nFrase atual:");
            for (int i = 0; i < lacoRepeticao.length; i++) {
                if (i == indiceDica && lacoRepeticao[i].contains("*"))
                    System.out.print(dica + " ");
                else
                    System.out.print(lacoRepeticao[i] + " ");
            }
            System.out.println();

            System.out.print("Digite uma palavra para tentar preencher: ");
            String palpite = ler.nextLine();

            boolean acertouAlguma = false;
            boolean acertouDica = false;

            for (int i = 0; i < lacoRepeticao.length; i++) {
                if (lacoRepeticao[i].contains("*") && lacoRepeticaoOculto[i].equalsIgnoreCase(palpite)) {
                    lacoRepeticao[i] = lacoRepeticaoOculto[i];
                    acertouAlguma = true;
                    if (i == indiceDica)
                        acertouDica = true;
                }
            }

            if (acertouAlguma) {
                System.out.println("\nPalavra inserida.");
                tocarSom("e:/projeto_bruno/som.wav/bells_2.wav");
                if (acertouDica) {
                    letrasReveladas = 0;
                    erros = 0;
                }
            } else {
                System.out.println("\nNenhuma palavra corresponde ao seu palpite.");
                tocarSom("e:/projeto_bruno/som.wav/error.wav");
                erros++;
                if (erros % 5 == 0 && letrasReveladas < palavraDica.length()) {
                    letrasReveladas++;
                    System.out.println("Dica: " + dica);
                }
            }
        }

        Menu.limparTerminal("");
        System.out.println("\nParabéns! Você completou:");
        tocarSom("e:/projeto_bruno/som.wav/tada.wav");
        for (String item : lacoRepeticao) {
            System.out.print(item + " ");
        }
        System.out.println();

        return tresDesafio;
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

        System.out.println("Este é o desafio 4 ");

        int indiceDica = -1;
        int letrasReveladas = 0;
        int erros = 0;

        while (true) {
            indiceDica = -1;
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i].contains("*")) {
                    indiceDica = i;
                    break;
                }
            }
            if (indiceDica == -1)
                break;

            String palavraDica = vetorOculto[indiceDica];

            String dica = "";
            for (int j = 0; j < palavraDica.length(); j++) {
                if (j < letrasReveladas)
                    dica += palavraDica.charAt(j);
                else
                    dica += "*";
            }

            System.out.println("\nFrase atual:");
            for (int i = 0; i < vetor.length; i++) {
                if (i == indiceDica && vetor[i].contains("*"))
                    System.out.print(dica + " ");
                else
                    System.out.print(vetor[i] + " ");
            }
            System.out.println();

            System.out.print("Digite uma palavra para tentar preencher: ");
            String palpite = ler.nextLine();

            boolean acertouAlguma = false;
            boolean acertouDica = false;

            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i].contains("*") && vetorOculto[i].equalsIgnoreCase(palpite)) {
                    vetor[i] = vetorOculto[i];
                    acertouAlguma = true;
                    if (i == indiceDica)
                        acertouDica = true;
                }
            }

            if (acertouAlguma) {
                System.out.println("\nPalavra inserida.");
                tocarSom("e:/projeto_bruno/som.wav/bells_2.wav");
                if (acertouDica) {
                    letrasReveladas = 0;
                    erros = 0;
                }
            } else {
                System.out.println("\nNenhuma palavra corresponde ao seu palpite.");
                tocarSom("e:/projeto_bruno/som.wav/error.wav");
                erros++;
                if (erros % 5 == 0 && letrasReveladas < palavraDica.length()) {
                    letrasReveladas++;
                    System.out.println("Dica: " + dica);
                }
            }
        }

        Menu.limparTerminal("");
        System.out.println("\nParabéns! Você completou:");
        tocarSom("e:/projeto_bruno/som.wav/tada.wav");
        for (String item : vetor) {
            System.out.print(item + " ");
        }
        System.out.println();

        return quatroDesafio;
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

        System.out.println("Este é o desafio 5 ");

        int indiceDica = -1;
        int letrasReveladas = 0;
        int erros = 0;

        while (true) {
            indiceDica = -1;
            for (int i = 0; i < funcao.length; i++) {
                if (funcao[i].contains("*")) {
                    indiceDica = i;
                    break;
                }
            }
            if (indiceDica == -1)
                break;

            String palavraDica = funcaoOculto[indiceDica];

            String dica = "";
            for (int j = 0; j < palavraDica.length(); j++) {
                if (j < letrasReveladas)
                    dica += palavraDica.charAt(j);
                else
                    dica += "*";
            }

            System.out.println("\nFrase atual:");
            for (int i = 0; i < funcao.length; i++) {
                if (i == indiceDica && funcao[i].contains("*"))
                    System.out.print(dica + " ");
                else
                    System.out.print(funcao[i] + " ");
            }
            System.out.println();

            System.out.print("Digite uma palavra para tentar preencher: ");
            String palpite = ler.nextLine();

            boolean acertouAlguma = false;
            boolean acertouDica = false;

            for (int i = 0; i < funcao.length; i++) {
                if (funcao[i].contains("*") && funcaoOculto[i].equalsIgnoreCase(palpite)) {
                    funcao[i] = funcaoOculto[i];
                    acertouAlguma = true;
                    if (i == indiceDica)
                        acertouDica = true;
                }
            }

            if (acertouAlguma) {
                System.out.println("\nPalavra inserida.");
                tocarSom("e:/projeto_bruno/som.wav/bells_2.wav");
                if (acertouDica) {
                    letrasReveladas = 0;
                    erros = 0;
                }
            } else {
                System.out.println("\nNenhuma palavra corresponde ao seu palpite.");
                tocarSom("e:/projeto_bruno/som.wav/error.wav");
                erros++;
                if (erros % 5 == 0 && letrasReveladas < palavraDica.length()) {
                    letrasReveladas++;
                    System.out.println("Dica: " + dica);
                }
            }
        }

        Menu.limparTerminal("");
        System.out.println("\nParabéns! Você completou:");
        tocarSom("e:/projeto_bruno/som.wav/tada.wav");
        for (String item : funcao) {
            System.out.print(item + " ");
        }
        System.out.println();

        return cincoDesafio;
    }

    public static void tocarSom(String caminho) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new java.io.File(caminho));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
