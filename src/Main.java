import monstros.MonstroDeFogo;
import jogador.Jogador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("      🏆 TORNEIO DE CAMPEÕES 🏆");
        System.out.println("========================================");
        System.out.println("Um mundo dominado por monstros...");
        System.out.println("Apenas os mais fortes chegam ao final.");
        System.out.println();
        System.out.println("Prepare-se para enfrentar 10 chefes");
        System.out.println("E provar que você é o verdadeiro campeão.");
        System.out.println();
        System.out.println(">>> Aperte ENTER para começar <<<");
        sc.nextLine();
        System.out.println();

        System.out.println("Agora iremos criar seu personagem");
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();




        /**
         * ==============================
         *        PAINEL DE BATALHA
         * ==============================
         * Jogador: Igor
         * Monstro: Dragor (Fogo)
         * Vida: 85
         *
         * Inimigo: AquaLord
         * Vida: 60
         * ==============================
         * 1 - Atacar
         * 2 - Usar Poção
         * 3 - Fugir
         */
    }
}
