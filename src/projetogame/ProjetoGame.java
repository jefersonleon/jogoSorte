/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetogame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
public class ProjetoGame {
    public static void main(String[] args) {
     Game jogo = new Game();
     Random n = new Random(); //foi instanciado um objeto jogo (criado)
     int chances, chance;
     Scanner ler = new Scanner(System.in);
     chance=1;
     chances = n.nextInt(10)+1;
        System.out.println("você acaba de entrar no super jogo do Azar!!!");
     while(chance <= chances && !jogo.achou){
        
         System.out.println("Para jogar, basta digitar um numero - de 1 até 10:");
         jogo.jogar(ler.nextInt(), chances);
         chance++;
         
     }
    
        
     
        
    }
    
}
