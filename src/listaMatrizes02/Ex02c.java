package listaMatrizes02;

public class Ex02c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] valores = {
	            {1.9, 2.5, 10.0},
	            {1.0, 7.8, 2.5},
	            {3.5, 2.2, 4.7}
	        };

	        for (int i = 0; i < valores.length; i++) {

	            for (int j = 0; j < valores[i].length; j++) {
	                System.out.print(valores[i][j] + " ");
	            }

	            System.out.println();
	        }
	    }
	}


