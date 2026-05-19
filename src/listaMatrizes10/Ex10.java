package listaMatrizes10;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner Scanner = new Scanner(System.in);

	        int[][] matriz = new int[5][5];

	        int somaDiagonal = 0;

	        
	        for (int i = 0; i < 5; i++) {

	            for (int j = 0; j < 5; j++) {

	                System.out.print("Digite um valor para [" + i + "][" + j + "]: ");
	                matriz[i][j] = Scanner.nextInt();
	            }
	        }

	      
	        for (int i = 0; i < 5; i++) {

	            somaDiagonal += matriz[i][i];
	        }

	        System.out.println("\nSOMA DA DIAGONAL PRINCIPAL = " + somaDiagonal);

	        Scanner.close();
	    }
	}


