
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Teste {
    
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Nome");
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa(nome);
        Pessoa p3 = new Pessoa("",1);
        JOptionPane.showMessageDialog(null, p2.getNome());
    }
}
