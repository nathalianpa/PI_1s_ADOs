/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO_09;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nathalia Pereira Alves
 * @author Miriã Oliveira Machado
 * @author Patrícia Faustino Ferreira
 */
public class Jogo {
    public static void main(String[] args) {
        Random gerador = new Random();
        int numeroGerado = gerador.nextInt((100 - 1) + 1) + 1;
        boolean venceu = false;
        
        System.out.println("O computador escolheu um número entre 1 e 100, tente adivinhar! (você tem cinco tentativas)");
        
        for (int i = 1; i <= 5; i++){
            System.out.println("Digite seu número:");
            Scanner sc = new Scanner (System.in);
            String stringNumeroDigitado = sc.next();
            int numeroDigitado = Integer.parseInt(stringNumeroDigitado);
            
            if(numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você ganhou o jogo!");
                i = 6;
                venceu = true;
            } else if((numeroDigitado + 1) == numeroGerado || (numeroDigitado - 1) == numeroGerado) {
                System.out.println("TÁ QUENTE!");
            } else if(i < 5) {
                System.out.println("Tente novamente.");
            }
        }
        if(!venceu) {
            System.out.println("As tentativas acabaram, você perdeu!");
        } 
    }   
}
