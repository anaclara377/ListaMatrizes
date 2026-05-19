package listaMatrizes09;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);

        int[][] matriz1 = new int[2][5];
        int[][] matriz2 = new int[2][5];
        int[][] matriz3 = new int[2][5];

        
        System.out.println("Matriz 1");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print("Digite um valor para [" + i + "][" + j + "]: ");
                matriz1[i][j] = Scanner.nextInt();
            }
        }

       
        System.out.println("\nMatriz 2");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print("Digite um valor para [" + i + "][" + j + "]: ");
                matriz2[i][j] = Scanner.nextInt();
            }
        }

        
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 5; j++) {

                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

       
        System.out.println("\nMatriz Resultado:");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print(matriz3[i][j] + " ");
            }

            System.out.println();
        }

        Scanner.close();
    }

	}

