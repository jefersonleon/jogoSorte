package projetogame;

import java.util.Random;
import javax.swing.JOptionPane;

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
            JOptionPane.showMessageDialog(null,
                    "você tem apenas " + chance + " chances");
            chances = chance;

        }
        x++;

        if (valor == nsorte && chances < chance) {
            JOptionPane.showMessageDialog(null, "Você acertou!!!",
                    "Jogo da Sorte", JOptionPane.INFORMATION_MESSAGE);
            achou = true;//flag
        } else if (valor != nsorte) {
            chances--;
            JOptionPane.showMessageDialog(null,
                    "Beeehhhh Errou jacaré!!!", "Jogo da Sorte", JOptionPane.ERROR_MESSAGE);

            if (chances > 0) {
                JOptionPane.showMessageDialog(null, "você ainda possui "
                        + chances + " chances para jogar",
                        "Jogo do Azar", JOptionPane.ERROR_MESSAGE);

            }
        }
        if (chances == 0) {

            JOptionPane.showMessageDialog(null,
                    "SE FERROU MANÉ, A CASA AGRADECE!!! \n O "
                    + "NUMERO DA SORTE ERA " + nsorte,
                    "Jogo da Sorte", JOptionPane.ERROR_MESSAGE);
          
        }

    }

    public int retirarCaracter(String valor) {
        return Integer.parseInt(valor.replace(" ", "").trim());
    }
}
