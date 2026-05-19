package listaMatrizes03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner Scanner = new Scanner(System.in);

	        int[][] matriz = new int[3][3];

	      
	        for (int i = 0; i < 3; i++) {

	            for (int j = 0; j < 3; j++) {

	                System.out.print("Digite um valor para [" + i + "][" + j + "]: ");
	                matriz[i][j] = Scanner.nextInt();
	            }
	        }

	        System.out.println();

	     
	        for (int i = 0; i < 3; i++) {

	            int soma = 0;

	            for (int j = 0; j < 3; j++) {
	                soma += matriz[i][j];
	            }

	            System.out.println("Soma Linha " + (i + 1) + " = " + soma);
	        }

	        Scanner.close();
	    }
	}
