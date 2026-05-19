package listaMatrizes05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner Scanner = new Scanner(System.in);

	        int[][] matriz = new int[4][3];

	        
	        for (int i = 0; i < 4; i++) {

	            for (int j = 0; j < 3; j++) {

	                System.out.print("Digite um valor para [" + i + "][" + j + "]: ");
	                matriz[i][j] = Scanner.nextInt();
	            }
	        }

	       
	        System.out.print("\nDigite o valor que deseja procurar: ");
	        int valor = Scanner.nextInt();

	        boolean encontrado = false;

	       
	        for (int i = 0; i < 4; i++) {

	            for (int j = 0; j < 3; j++) {

	                if (matriz[i][j] == valor) {
	                    encontrado = true;
	                }
	            }
	        }

	        
	        if (encontrado) {
	            System.out.println("O valor se encontra na matriz");
	        } else {
	            System.out.println("O valor NÃO se encontra na matriz");
	        }

	        Scanner.close();
	    }
	}


