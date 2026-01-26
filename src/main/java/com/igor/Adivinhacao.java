package com.igor;

import java.util.Scanner;
import java.util.Random;

public class Adivinhacao{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int NumeroSecreto = rand.nextInt(101);

        System.out.println("Jogo de adivinhação: ");
        System.out.println();

        while (true){
            System.out.println("Digite um número entre 0 e 100:");
            int NumeroEscolhido = sc.nextInt();

            if(NumeroEscolhido == NumeroSecreto){
                System.out.println("Acertou, o número era:  " + NumeroSecreto + ".");
                break;
            }
            else if (NumeroEscolhido > NumeroSecreto){
                System.out.println("O número secreto é menor.");
                System.out.println();
            }
            else if (NumeroEscolhido < NumeroSecreto){
                System.out.println("O número secreto é maior.");
                System.out.println();
            }

        }
    }

}