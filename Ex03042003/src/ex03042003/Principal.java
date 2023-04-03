/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03042003;

/**
 *
 * @author Aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        Cliente cliente = new Cliente();
        Funcionario func2 = new Funcionario("MIGUEL");
        Funcionario func3= new Funcionario("MIGUEL","avenida 133");
        func.setCpf("542302834");
        func.setEndereco("rua das cravinas");
        func.setTelefone("149872373");
        func.setNome("Jose");
        func.setCargo("Gerente");
        func.setSalario(6000);
        
        
        cliente.setCpf("324325435");
        cliente.setCpf("rua floriano");
        cliente.setNome("amelia");
        cliente.setSaldo(1000);
        cliente.setTelefone("3298894");
    }
    
}
