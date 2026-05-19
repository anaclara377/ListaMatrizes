package listaMatrizes01;

import java.util.Scanner;

public class Ex01a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner Scanner = new Scanner(System.in);

	        
	        String[][] clientes = new String[3][2];

	        
	        for (int i = 0; i < 3; i++) {

	            System.out.println("Cliente " + (i + 1));

	            System.out.print("Digite o nome: ");
	            clientes[i][0] = Scanner.nextLine();

	            System.out.print("Digite o endereço: ");
	            clientes[i][1] = Scanner.nextLine();

	            System.out.println();
	        }

	       
	        for (int i = 0; i < 3; i++) {
	            System.out.println("Nome: " + clientes[i][0]);
	            System.out.println("Endereço: " + clientes[i][1]);
	            System.out.println();
	        }

	        Scanner.close();
	    }
	}
