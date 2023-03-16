import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();

		String no = JOptionPane.showInputDialog("Nome: ");
		
		funcionario.setNome(no);
		
		JOptionPane.showMessageDialog(null, funcionario.getNome());

	}
}
