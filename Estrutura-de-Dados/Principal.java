
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Fifo minha;
		minha = new Fifo();
		int opcao, idade, matricula, setor, resultado;
		;
		String entra;

		do {
			entra = JOptionPane.showInputDialog("\tMENU"
												+ "\n\n\t1.INSERIR" 
												+ "\n\t2.RETIRAR" 
												+ "\n\t3.DETONAR"
												+ "\n\t4.MOSTRAR MATRICULAS" 
												+ "\n\t5.MOSTRAR INVERTIDO" 
												+ "\n\t6.MEDIA IDADE " 
												+ "\n\t7.ACHAR SETOR"
												+ "\n\t8.ACHAR IDOSO" 
												+ "\n\t9.QUANTOS SETOR" 
												+ "\n\t10.VAZAR");
			opcao = Integer.parseInt(entra);

			switch (opcao) {
			case 1:
				entra = JOptionPane.showInputDialog(" DIGITE A MATRICULA !!!");
				matricula = Integer.parseInt(entra);
				entra = JOptionPane.showInputDialog(" DIGITE A IDADE!!!");
				idade = Integer.parseInt(entra);
				entra = JOptionPane.showInputDialog(" DIGITE O SETOR!!!");
				setor = Integer.parseInt(entra);
				minha.inserir(matricula, idade, setor);
				break;
			case 2:
				resultado = minha.retirar();
				if (resultado != -99) {
					System.out
							.printf("\n O FUNCIONARIO COM NUMERO DE MATRICULA %d FOI RETIRADO COM SUCESSO!" ,resultado);
				} else {
					System.out.println("\n NÃO FOI POSSIVEL RETIRAR FUNCIONARIO");
				}
				break;
			case 3:
				minha.detonar();
				break;
			case 4:
				minha.mostrarNormal();
				break;
			case 5:
				minha.mostrarContrario();
				break;
			case 6:
				resultado = minha.mediaIdade();
				if (resultado != -99) {
					System.out.printf("\n A MEDIA DE IDADE DOS FUNCIONARIOS É %d ." ,resultado);
				} else {
					System.out.println("\n FILA VAZIA");
				}
				break;
			case 7:
				entra = JOptionPane.showInputDialog(" DIGITE UMA MATRICULA!!!");
				matricula = Integer.parseInt(entra);
				resultado = minha.acharSetor(matricula);
				if (resultado != -99) {
					System.out.printf("\n O SETOR DO FUNCIONARIO É %d ." ,resultado);
				} else {
					System.out.println("\n FILA VAZIA");
				}
				break;
			case 8:
				resultado = minha.acharIdoso();
				if (resultado != -99) {
					System.out.printf("\n A MATRICULA DO FUNCIONARIO MAIS VELHO É %d ." , resultado);
				} else {
					System.out.println("\n FILA VAZIA");
				}
				break;
			case 9:
				entra = JOptionPane.showInputDialog(" DIGITE O SETOR!!!");
				setor = Integer.parseInt(entra);
				resultado = minha.quantoSetor(setor);
				if (resultado != -99) {
					System.out.printf("\n O NUMERO DE FUNCIONARIOS NO SETOR %d É %d." ,setor, resultado);
				} else {
					System.out.println("\n FILA VAZIA");
				}
			}
		} while (opcao != 10);

	}

}