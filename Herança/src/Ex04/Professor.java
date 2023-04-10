/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex04;

/**
 *
 * @author Aluno
 */
public class Professor extends Funcionario{
    
    private int numClasse;

    public Professor(String nome, double salario) {
        super(nome, salario);
    }

    public Professor(){
        super();
    }
    
    
    public int getNumClasse() {
        return numClasse;
    }

    public void setNumClasse(int numClasse) {
        this.numClasse = numClasse;
    }
    
    
}
