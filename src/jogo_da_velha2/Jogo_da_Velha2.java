/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogo_da_velha2;

import static jogo_da_velha2.Entrada.*;

/**
 *
 * @author henri
 */
public class Jogo_da_Velha2 {

    public static String jogador1;
    public static String jogador2;
    public static String xo;
    public static int x;
    public static int y;
    public static String primJogar;
    public static String[][] jogo = new String[3][3];

    public static boolean empate() {
        int nulo = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (jogo[i][j] == " ") {
                    nulo++;
                }
            }
        }
        if (nulo > 0) {
            return (false);
        } else {
            return (true);
        }
    }

    public static void exibir() {
        System.out.println("   0 1 2");
        System.out.println("0 |" + jogo[0][0] + "|" + jogo[0][1] + "|" + jogo[0][2] + "|");
        System.out.println("1 |" + jogo[1][0] + "|" + jogo[1][1] + "|" + jogo[1][2] + "|");
        System.out.println("2 |" + jogo[2][0] + "|" + jogo[2][1] + "|" + jogo[2][2] + "|");
    }

    ;
    public static boolean ganhador() {
        for (int i = 0; i <= 2; i++) {
            if (jogo[0][i] == "x" & jogo[1][i] == "x" & jogo[2][i] == "x") {
                return (true);
            }
            if (jogo[0][i] == "o" & jogo[1][i] == "o" & jogo[2][i] == "o") {
                return (true);
            }

        }
        for (int i = 0; i <= 2; i++) {
            if (jogo[i][0] == "x" & jogo[i][1] == "x" & jogo[i][2] == "x") {
                return (true);
            }
            if (jogo[i][0] == "o" & jogo[i][1] == "o" & jogo[i][2] == "o") {
                return (true);
            }

        }
        if (jogo[0][0] == "x" & jogo[1][1] == "x" & jogo[2][2] == "x") {
            return (true);
        }
        if (jogo[0][0] == "o" & jogo[1][1] == "o" & jogo[2][2] == "o") {
            return (true);
        }
        if (jogo[0][2] == "x" & jogo[1][1] == "x" & jogo[2][0] == "x") {
            return (true);
        }
        if (jogo[0][2] == "o" & jogo[1][1] == "o" & jogo[2][0] == "o") {
            return (true);
        }
        return (false);
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                jogo[i][j] = " ";
            }
        }
        jogador1 = entradaTexto("Digite o nome do Primeiro jogador: ");
        jogador2 = entradaTexto("Digite o nome do Segundo jogador: ");
        primJogar = jogador1;
        xo = "x";

        do {
            exibir();
            System.out.println("Agora é a vez do " + primJogar);
            do {
                x = entradaInteiro("Digite a linha que deseja jogar: ");
                y = entradaInteiro("Digite a coluna que deseja jogar: ");
                if (jogo[x][y] != " ") {
                    System.out.println("este espaço está preenchido");
                }
            } while (jogo[x][y] != " ");
            jogo[x][y] = xo;
            if (xo == "x") {
                xo = "o";
                primJogar = jogador2;
            } else {
                xo = "x";
                primJogar = jogador1;
            };
        } while (ganhador() == false & empate() == false);

        exibir();
        if (xo == "x") {
            xo = "o";
            primJogar = jogador2;
        } else {
            xo = "x";
            primJogar = jogador1;
        }
        if (ganhador() == true) {
            System.out.println("Parabens! voce ganhou " + primJogar);
        } else if (empate() == true) {
            System.out.println("Deu empate.");
        }

    }

}
