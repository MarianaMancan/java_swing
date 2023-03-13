package aula_13032023;

import javax.swing.JOptionPane;

public class Funcionario {

	String nome;
	String registro;
	String cargo;
	double salario;
	
	
	public void preencher() {
		nome = JOptionPane.showInputDialog("Nome: ");
		registro = JOptionPane.showInputDialog("Registro: ");
		cargo = JOptionPane.showInputDialog("Cargo: ");
		salario = Double.parseDouble(JOptionPane.showInputDialog("Salario: "));
	}
	
	
	public void exibir() {
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nRegistro: " + registro +
				"\nCargo: " + cargo + "\nSalario: " + salario);
	}
	
}
