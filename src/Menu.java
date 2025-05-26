public class Menu {

    public static String MostrarMenu(String msg) {

        System.out.println(TituloJareca(msg));

        System.out.println("\nO objetivo principal do jogo é completar a frase do desafio. Terão 5 desafios. ");
        System.out.println("A partir do terceiro desafio será mostrado uma pergunta caso não queira continuar jogando.");
        System.out.println(" \nA cada 5 tentativas erradas aparecerá a primeira letra da primeira palavra oculta.\n");

        System.out.println("1 - Jogar");
        System.out.println("2 - Sair");

        return msg;

    }

     public static String TituloJareca (String msg) {

        System.out.println();
        System.out.println("                  ______     ______    _______    ______    ______                                          ");
        System.out.println("             |   |      |   |      |  |          |         |      |                      ");
        System.out.println("             |   |      |   |      |  |          |         |      |                     ");           
        System.out.println("             |   |______|   |______|  |______    |         |______|                              "); 
        System.out.println("     |       |   |      |   |    |    |          |         |      |                        ");
        System.out.println("      |______|   |      |   |     |   |_______   |______   |      |                                  ");


        return msg;  
    }

    public static String limparTerminal(String limpar) {

        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }

        return limpar;

    }

}