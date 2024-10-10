/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadewhile;

import java.util.Scanner;

/**
 *
 * @author yasmn
 */
public class AtividadeWHILE01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta quantidade de alunos na sala
        System.out.print("Quantos alunos há na sala? ");
        int quantidadeAlunos = scanner.nextInt();

        // Inicializa variáveis para controle
        int contador = 0;
        double somaNotas = 0;

        // Loop para pedir as notas dos alunos
        while (contador < quantidadeAlunos) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota; 
            contador++;  
        }

        // Calcula a média aritmética
        double media = somaNotas / quantidadeAlunos;

        // Exibe o resultado
        System.out.println("A média da turma é: " + media);

        scanner.close();  
    }
}
