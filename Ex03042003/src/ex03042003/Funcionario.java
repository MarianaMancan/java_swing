/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03042003;

/**
 *
 * @author Aluno
 */
public class Funcionario extends Pessoa {
    
  
    private double salario;
    private String cargo;
    
    public Funcionario(String nome) {
        super(nome);
         System.out.println("FUNCIONARIO CONSTRUTOR 2 ");
    }

    public Funcionario() {
         System.out.println("FUNCIONARIO CONSTRUTOR");
    }

    public Funcionario(String nome, String endereco) {
        super(nome, endereco);
         System.out.println("FUNCIONARIO CONSTRUTOR 3");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
