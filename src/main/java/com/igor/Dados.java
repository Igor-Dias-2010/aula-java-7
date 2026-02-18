package com.igor;

import java.util.Scanner;

public class Dados{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        int senha = sc.nextInt();

        while (true){
            System.out.println("Confirme a senha: ");
            int confirmeSenha = sc.nextInt();

            if (confirmeSenha == senha){
                System.out.println("Acesso liberado");
                break;
            } else {
                System.out.println("Senha incorreta");
            }
        }


        sc.close();
    }
}
