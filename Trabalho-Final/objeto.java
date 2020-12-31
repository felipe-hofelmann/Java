import javax.swing.JOptionPane;

public class objeto {
	public static boolean carregar(int[] colecao) {
		int i;
		String entra;
		for (i = 0; i < colecao.length; i++) {
			entra = JOptionPane.showInputDialog("Informe os numeros da colecao");
			colecao[i] = Integer.parseInt(entra);
		}	return true;
	}
	
	public static void mostrar(int[] colecao) {
		int i;
		
		for (i = 0; i < colecao.length; i++) {
			System.out.print(colecao[i]+" ");
		}
	}
	
	public static boolean inverter(int[] colecao) {
		int i, aux;
		aux = 0;
		for (i = 0; i < 10; i++) {
			aux = colecao[i];
			colecao[i] = colecao[19 - i];
			colecao[19 - i] = aux;
		} return true;
	}
	
	public static boolean ordenarBolha(int[] colecao) {
		int i, j, aux;
		for (i = 0; i < colecao.length; i++) {
			for (j = 0; j < colecao.length - 1; j++) {
				if (colecao[j] > colecao[j + 1]) {
					aux = colecao[j];
					colecao[j] = colecao[j + 1];
					colecao[j + 1] = aux;
				}
			}
		} return true;
	}
	
	public static int contarPrimos(int[] colecao) {
		int i, somaPrimo, aux, ehPrimo;
		somaPrimo = 0;
		for (i = 0; i < colecao.length; i++) {
			ehPrimo = 0;
			if (colecao[i] != 0) {
				ehPrimo = 1;			
				for (aux = colecao[i] - 1; aux > 1; aux--) {
					if ((colecao[i] % aux) == 0) {
						ehPrimo = 0;
						aux  = 1;
					}						
				}
			}
			if (ehPrimo == 1) {
				somaPrimo++;
			}		
		} return somaPrimo;
	}
	
	public static int somarImpares(int[] colecao) {
		int i, somaImpar = 0;
		for (i = 0; i < colecao.length; i++) {
			if ((colecao[i] % 2) != 0) {
				somaImpar+= colecao[i];
			}
		} return somaImpar;
	}
	
	public static boolean detonar(int[] colecao) {
		int i;
		for (i = 0; i < colecao.length; i++) {
			colecao[i] = 0;
		} return true;
	}
	
	public static int menor(int[] colecao) {
		int i, menor = colecao[0];
		for (i = 1; i < colecao.length; i++) {
			if (colecao[i] < menor) {
				menor = colecao[i];
			}
		} return menor;
	}
	
	public static int fatorial(int[] colecao) {
		int fatorial = 1, aux, menor;
		menor = objeto.menor(colecao);
		for (aux = menor; aux > 1; aux--) {
			fatorial = aux * fatorial;
		} return fatorial;
	}

}
