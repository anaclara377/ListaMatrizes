package listaMatrizes02;

public class Ex2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] letras = {
	            {'a', 'b', 'c', 'd', 'e'},
	            {'f', 'g', 'h', 'i', 'j'},
	            {'l', 'm', 'n', 'o', 'p'},
	            {'q', 'r', 's', 't', 'u'}
	        };

	        for (int i = 0; i < letras.length; i++) {

	            for (int j = 0; j < letras[i].length; j++) {
	                System.out.print(letras[i][j] + " ");
	            }

	            System.out.println();
	        }
	    }
	}
	


