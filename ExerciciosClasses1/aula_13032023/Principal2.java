package aula_13032023;

public class Principal2 {

	public static void main(String[] args) {

		Funcionario f[] = new Funcionario[5];

		// for(int cont = 0; cont<5 ; cont++) {
		// f[cont] = new Funcionario();
		// f[cont].preencher();
		// }

		for (int cont = 0; cont < 5; cont++) {
			Funcionario fun = new Funcionario();
			fun.preencher();
			f[cont] = fun;
		}

		for (int cont = 0; cont < 5; cont++) {

			f[cont].exibir();
		}

	}
}
