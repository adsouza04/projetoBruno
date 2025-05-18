public class Menu {

    public static String MostrarMenu(String msg) {

        System.out.println("---JARECA---");
        System.out.println("Este é o jogo Jareca. \nO objetivo principal do jogo é descobrir o tema do texto e\ndescobrir a saída do código. ");
        System.out.println(" \nA cada 5 tentativas terá um aviso caso queira desistir do desafio.\n");
        System.out.println("Atente-se aos acentos das palavras.");

        System.out.println("1 - Jogar");
        System.out.println("2 - Sair");

        return msg;

    }

    public static String limparTerminal(String limpar) {

        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }

        return limpar;

    }

}