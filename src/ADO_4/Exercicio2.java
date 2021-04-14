/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO_4;

import java.util.Scanner;

/**
 *
 * @author Nathalia
 */
public class Exercicio2 {
    public static void main(String args[]) {
        System.out.println("Qual é o valor binário para o número 8423 na base 10?");
        System.out.println("");
        System.out.println("Informar apenas a letra correspondente");
        System.out.println("");
        System.out.println("a) ‭10 1111 1110 0111‬");
        System.out.println("b) ‭10 1100 1110 0111‬");
        System.out.println("c) ‭10 0110 1110 0101");
        System.out.println("d) ‭10 0000 1110 0111‬");
        System.out.println("e) ‭10 0101 1110 0111‬");
        Scanner sc = new Scanner(System.in);
        String resposta = sc.next();
        switch(resposta) {
            case "d":
                System.out.println("Resposta Correta");
                break;
            default:
                System.out.println("Resposta Incorreta");   
        }
    }   
}