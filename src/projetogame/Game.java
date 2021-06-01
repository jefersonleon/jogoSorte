package projetogame;

import java.util.Random;

/**
 * @author Jeferson
 */
public class Game {

    public int valor;
    public boolean achou;
    public int nsorte, x = 1;

    public Game() {
        Random n = new Random();
        achou = false;
        nsorte = n.nextInt(10) + 1;
    }
    int chances;

    public void jogar(int valor, int chance) {

        if (x == 1) {
            chances = chance;

        }
        x++;
        System.out.println("Jogo da Sorte\n=============");
        System.out.println("Informe o numero da sorte - \n"
                + "você tem apenas " + chance + " chances");
        if (valor == nsorte) {
            System.out.println("Você acertou!!!");
            achou = true;//flag
        } else {
            chances--;
            
            System.out.println("Beeehhhh Errou jacaré!!!\n"
                    + "você ainda possui " + chances + " para jogar");
        }

    }
}
