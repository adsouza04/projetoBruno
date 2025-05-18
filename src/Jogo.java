import java.util.Scanner;

public class Jogo {

    public static String[] JogoJereca(String escolha) {
        Scanner ler = new Scanner(System.in);

        String menu = Menu.MostrarMenu("");

        do {
            System.out.print("Escolha uma opção: ");
            escolha = ler.nextLine();
            System.out.println();

            switch (escolha) {
                case "1":
                    Menu.limparTerminal("");
                    // ---------------Desafio 1--------------//

                    String desafioUm = Desafios.desafioUm("");

                    System.out.println(desafioUm);

                    // ---------------Desafio 2--------------//

                    String desafioDois = Desafios.desafioDois("");

                    System.out.println(desafioDois);

                    // ---------------Desafio 3--------------//

                    String desafioTres = Desafios.desafioTres("");

                    System.out.println(desafioTres);

                    // ---------------Desafio 4--------------//

                    String desafioQuatro = Desafios.desafioQuatro("");

                    System.out.println(desafioQuatro);

                    // ---------------Desafio 5--------------//

                    String desafioCinco = Desafios.desafioCinco("");

                    System.out.println(desafioCinco);
                    break;

                case "2":
                    System.out.println("Saindo do jogo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (escolha.equals("3"));

        return null;
    }
}
