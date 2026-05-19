package listaMatrizes08;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int[][] invertida = new int[3][3];

        
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Digite um valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = Scanner.nextInt();
            }
        }

        
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                invertida[j][i] = matriz[i][j];
            }
        }

        System.out.println("\nMatriz Invertida:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(invertida[i][j] + " ");
            }

            System.out.println();
        }

        Scanner.close();
    }
}


