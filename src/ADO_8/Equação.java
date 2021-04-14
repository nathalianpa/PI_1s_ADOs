/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO_8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nathalia Pereira Alves
 * @author Patricia Faustino Ferreiro
 * @author Miriã Oliveira Machado
 */
public class Equação {
    public static void main(String[] args) {
        System.out.println("Escreva um número minimo");
        Scanner sc = new Scanner (System.in);
        String stringNumeroMinimo = sc.next();
        int numeroMinimo = Integer.parseInt(stringNumeroMinimo);
        System.out.println("Escreva um número máximo");
        Scanner sc1 = new Scanner (System.in);
        String stringNumeroMaximo = sc.next();
        int numeroMaximo = Integer.parseInt(stringNumeroMaximo);
        
        Random gerador = new Random();        
        int numeroA = gerador.nextInt((numeroMaximo - numeroMinimo) + 1) + numeroMinimo;
        int numeroB = gerador.nextInt((numeroMaximo - numeroMinimo) + 1) + numeroMinimo;
        
        System.out.printf("%dx + %d = 0\n", numeroA, numeroB);
        int resultado = (-numeroB/numeroA);
        System.out.printf("Resultado: %d", resultado);
    }  
}
