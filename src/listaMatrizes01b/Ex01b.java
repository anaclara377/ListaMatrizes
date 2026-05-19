package listaMatrizes01b;

import java.util.Scanner;

public class Ex01b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scanner = new Scanner(System.in);

       

        String[][] clientes = new String[3][4];

        
        for (int i = 0; i < 3; i++) {

            System.out.println("Cliente " + (i + 1));

            System.out.print("Nome: ");
            clientes[i][0] = Scanner.nextLine();

            System.out.print("Endereço: ");
            clientes[i][1] = Scanner.nextLine();

            System.out.print("CPF: ");
            clientes[i][2] = Scanner.nextLine();

            System.out.print("Telefone: ");
            clientes[i][3] = Scanner.nextLine();

            System.out.println();
        }

        
        for (int i = 0; i < 3; i++) {

            System.out.println("Cliente " + (i + 1));
            System.out.println("Nome: " + clientes[i][0]);
            System.out.println("Endereço: " + clientes[i][1]);
            System.out.println("CPF: " + clientes[i][2]);
            System.out.println("Telefone: " + clientes[i][3]);

            System.out.println();
        }

        Scanner.close();
    }
}


