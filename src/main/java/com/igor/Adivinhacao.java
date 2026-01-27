package com.igor;

import java.util.Scanner;
import java.util.Random;

public class Adivinhacao{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(101);
        int tentativasSobrando = 7;
        int tentativasUsadas = 0;

        System.out.println("Jogo de adivinhação: ");
        System.out.println();

        while (tentativasSobrando > 0){
            System.out.println("Digite um número entre 0 e 100:");

            if(!sc.hasNextInt()){
                System.out.println("Digite apenas números.");
                sc.next();
                System.out.println();
                continue;
            }


            int numeroEscolhido = sc.nextInt();

            if(numeroEscolhido == numeroSecreto){
                System.out.println("Você acertou, o número era:  " + numeroSecreto + ".");
                System.out.println("Vc usou " + tentativasUsadas + " tentativas nessa rodada.");
                System.out.println( "Vc terminou esse jogo com " + tentativasSobrando + " tentativas.");
                break;
            }
            else if (numeroEscolhido > numeroSecreto){
                tentativasUsadas += 1;
                tentativasSobrando -= 1;
                System.out.println("Errou. O número secreto é menor.");
                System.out.println("Vc tem " + tentativasSobrando + " tentativas.");
                System.out.println();
            }
            else if (numeroEscolhido < numeroSecreto){
                tentativasUsadas += 1;
                tentativasSobrando -= 1;
                System.out.println("Errou. O número secreto é maior.");
                System.out.println("Vc tem " + tentativasSobrando + " tentativas.");
                System.out.println();
            }
        }
        if(tentativasSobrando == 0){
            System.out.println("Vc ficou sem tentativas. Perdeu.");
            System.out.println("O número era: " + numeroSecreto + ".");
        }

        sc.close();

    }

}