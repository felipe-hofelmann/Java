import javax.swing.JOptionPane;

public class TFinal {

	public static void main(String[] args) {
		int opcao, colecao[];
		colecao = new int[20];
		String entra;		
		
		do {
			entra = JOptionPane.showInputDialog("\n\t\tMENU\n\n\t1. POPULAR\n\t2. MOSTRAR\n\t3. INVERTER\n\t4. ORDENAR CRESCENTE\n\t5. CONTAR PRIMOS\n\t6. SOMATORIO IMPARES\n\t7. DETONAR\n\t8. FATORIAL DO MENOR\n\n\t9. VAZAR");
			opcao = Integer.parseInt(entra);
			
			switch (opcao) {
				case 1: objeto.carregar(colecao);					
					break;
				case 2: objeto.mostrar(colecao);
					break;
				case 3: objeto.inverter(colecao);
					break;
				case 4: objeto.ordenarBolha(colecao);
					break;
				case 5: System.out.print(" EXISTEM "+objeto.contarPrimos(colecao)+" NUMEROS PRIMOS NA COLECAO");						
					break;
				case 6: System.out.print(" SOMA DOS NUMEROS IMPARES DA COLECAO EH IGUAL A "+objeto.somarImpares(colecao));
					break;
				case 7: objeto.detonar(colecao);
					break;
				case 8: System.out.print(" O FATORIAL DO MENOR NUMERO DA COLECAO EH IGUAL A "+objeto.fatorial(colecao));
					break;
			}
		} while (opcao != 9);			
		
	}
	
}
