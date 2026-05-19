package listaMatrizes06;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        int[][] matriz = new int[5][2];

        int soma = 0;
        int quantidade = 0;

        
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.print("Digite um valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = Scanner.nextInt();

                soma += matriz[i][j];
                quantidade++;
            }
        }

        double media = (double) soma / quantidade;

        System.out.println("\nMédia dos elementos = " + media);

        Scanner.close();
    }
}