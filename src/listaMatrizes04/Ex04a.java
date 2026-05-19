package listaMatrizes04;

import java.util.Scanner;

public class Ex04a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner Scanner = new Scanner(System.in);

	        int[][] matriz = new int[5][5];

	        int somaImpares = 0;

	        
	        for (int i = 0; i < 5; i++) {

	            for (int j = 0; j < 5; j++) {

	                System.out.print("Digite um valor para [" + i + "][" + j + "]: ");
	                matriz[i][j] = Scanner.nextInt();

	               
	                if (matriz[i][j] % 2 != 0) {
	                    somaImpares += matriz[i][j];
	                }
	            }
	        }

	        System.out.println("\nSoma dos números ímpares = " + somaImpares);

	        
	        System.out.println("\nSoma das colunas:");

	        for (int j = 0; j < 5; j++) {

	            int somaColuna = 0;

	            for (int i = 0; i < 5; i++) {
	                somaColuna += matriz[i][j];
	            }

	            System.out.println("Coluna " + (j + 1) + " = " + somaColuna);
	        }

	        
	        System.out.println("\nSoma das linhas:");

	        for (int i = 0; i < 5; i++) {

	            int somaLinha = 0;

	            for (int j = 0; j < 5; j++) {
	                somaLinha += matriz[i][j];
	            }

	            System.out.println("Linha " + (i + 1) + " = " + somaLinha);
	        }

	        Scanner.close();
	    }

}
