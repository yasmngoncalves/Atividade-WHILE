/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadewhile;

import java.util.Scanner;

/**
 *
 * @author yasmn
 */
public class AtividadeWHILE02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pede que o usuário digite o número inteiro N
        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();

        // Loop para imprimir os números de 1 até N
        System.out.println("Números de 1 até " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
