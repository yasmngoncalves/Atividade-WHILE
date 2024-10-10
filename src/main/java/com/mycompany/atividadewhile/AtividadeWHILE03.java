/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadewhile;

import java.util.Scanner;

/**
 *
 * @author yasmn
 */
public class AtividadeWHILE03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0; 
        int maior1 = Integer.MIN_VALUE;  
        int maior2 = Integer.MIN_VALUE;  

        // Loop para solicitar 10 números
        while (contador < 10) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();  

            // Verifica se o número digitado é maior que o maior1
            if (numero > maior1) {
                maior2 = maior1;  
                maior1 = numero;   
            } else if (numero > maior2) {  // Verifica se o número é maior que o segundo maior
                maior2 = numero;  
            }

            contador++;  
        }

        // Exibe os dois maiores números
        System.out.println("Os dois maiores números digitados foram: " + maior1 + " e " + maior2);

        scanner.close(); 
    }
}
