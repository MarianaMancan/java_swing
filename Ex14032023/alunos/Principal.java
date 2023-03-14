package alunos;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno1.preencher_dados();
		aluno2.preencher_dados();
		
		if(aluno1.media > aluno2.media) {
			aluno1.exibir_dados();
		}
		if(aluno2.media > aluno1.media) {
			aluno2.exibir_dados();
		}
		else {
			System.out.print("AS MEDIAS SAO IGUAIS");
		}
	}
}
