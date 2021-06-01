/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetogame;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson
 */
public class ProjetoGame {
    public static void main(String[] args) {
     Game jogo = new Game();
     Random n = new Random(); //foi instanciado um objeto jogo (criado)
     int chances, chance,valor;
     chance=1;
     chances = n.nextInt(5)+1;
        JOptionPane.showMessageDialog(null, "você acaba de entrar no super jogo do Azar!!!",
                "Jogo do Azar", JOptionPane.DEFAULT_OPTION);
     while(chance <= chances && !jogo.achou){
        
         valor = Integer.parseInt(
                 JOptionPane.showInputDialog("Para jogar, basta digitar um numero"
                         + " de 1 até 10:"));
         jogo.jogar(valor, chances);
         chance++;
         
     }
    
        
     
        
    }
    
}
