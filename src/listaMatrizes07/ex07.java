package listaMatrizes07;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner Scanner = new Scanner(System.in);

	        int[][] matriz = new int[6][3];

	        // Leitura do primeiro valor
	        System.out.print("Digite um valor para [0][0]: ");
	        matriz[0][0] = Scanner.nextInt();

	        int maior = matriz[0][0];
	        int menor = matriz[0][0];

	        
	        for (int i = 0; i < 6; i++) {

	            for (int j = 0; j < 3; j++) {

	                if (i == 0 && j == 0) {
	                    continue;
	                }

	                System.out.print("Digite um valor para [" + i + "][" + j + "]: ");
	                matriz[i][j] = Scanner.nextInt();

	                if (matriz[i][j] > maior) {
	                    maior = matriz[i][j];
	                }

	                if (matriz[i][j] < menor) {
	                    menor = matriz[i][j];
	                }
	            }
	        }

	        System.out.println("\nMaior elemento = " + maior);
	        System.out.println("Menor elemento = " + menor);

	        Scanner.close();
	    }
	
	}


