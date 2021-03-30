
public class Fifo {
	private Nodolista inicio;
	private Nodolista fim;

	Fifo() {
		inicio = null;
		fim = null;
	}

	public void inserir(int matricula, int idade, int setor) {
		Nodolista aux;
		aux = new Nodolista(matricula, idade, setor);
		if (inicio == null) {
			inicio = aux;
		} else {
			fim.depois = aux;
			aux.antes = fim;
		}
		fim = aux;
	}

	public int retirar() {
		int aux = -99;

		if (inicio != null) {
			aux = inicio.matricula;

			inicio = inicio.depois;
			inicio.antes = null;
			if (inicio == null) {
				fim = null;
			}
		}
		return aux;
	}

	public void detonar() {
		inicio = null;
		fim = null;
	}

	public void mostrarNormal() {
		Nodolista aux;
		if (inicio == null) {
			System.out.println("\n FILA VAZIA");
			return;
		}

		System.out.println("\n VEJA A FILA NORMAL: ");
		aux = inicio;
		while (aux != null) {
			System.out.println("\n NUM. MATRICULA: " + aux.matricula);
			aux = aux.depois;

		}
	}

	public void mostrarContrario() {
		Nodolista aux;
		if (inicio == null) {
			System.out.println("\n FILA VAZIA");
			return;
		}

		System.out.println("\n VEJA A FILA AO CONTRARIO: ");
		aux = fim;
		while (aux != null) {
			System.out.println("\n NUM. MATRICULA: " + aux.matricula);
			aux = aux.antes;

		}
	}

	public int mediaIdade() {
		Nodolista aux;
		int soma, valor, contador;
		soma = 0;
		contador = 0;
		valor = -99;
		if (inicio == null) {
			return valor;
		}
		aux = inicio;
		while (aux != null) {
			soma += aux.idade;
			contador++;
			aux = aux.depois;
		}
		valor = soma / contador;
		return valor;
	}

	public int acharSetor(int matricula) {
		Nodolista aux;
		int setor;
		setor = -99;
		if (inicio == null) {
			return setor;
		}
		aux = inicio;
		while (aux != null) {
			if (matricula == aux.matricula) {
				return aux.setor;
			}
			aux = aux.depois;
		}
		return setor;

	}

	public int acharIdoso() {
		Nodolista aux;
		int idoso, mat;
		idoso = 0;
		mat = -99;
		if (inicio == null) {
			return mat;
		}
		aux = inicio;
		while (aux != null) {
			if (aux.idade > idoso) {
				idoso = aux.idade;
				mat = aux.matricula;
			}
			aux = aux.depois;
		}
		return mat;

	}

	public int quantoSetor(int set) {
		Nodolista aux;
		int soma, mat;
		soma = 0;
		mat = -99;
		if (inicio == null) {
			return mat;
		}
		aux = inicio;
		while (aux != null) {
			if (aux.setor == set) {
				soma++;
			}
			aux = aux.depois;
		}
		return soma;

	}

}
