package alunos;

import javax.swing.JOptionPane;

public class Aluno {

	 String nome;
	 double media;
	 
	 public void preencher_dados() {
		 nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
		 media = Double.parseDouble(JOptionPane.showInputDialog("Digite a média do aluno: "));
	 }
	 
	 public void exibir_dados() {
		 JOptionPane.showMessageDialog(null, "O aluno " + nome + " teve como média " + media);
	 }
			 
}
