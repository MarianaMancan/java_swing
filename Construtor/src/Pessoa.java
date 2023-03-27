
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Pessoa {
    
    public String nome;
    
    public Pessoa(){
        JOptionPane.showMessageDialog(null, "este é o primeiro construtor");
    }
     public Pessoa(String nome){
        JOptionPane.showMessageDialog(null, "este é o segundo construtor");
        this.nome = nome;
    }
     public Pessoa(String x,int y){
        JOptionPane.showMessageDialog(null, "este é o terceiro construtor");
        
    }
    
    public void setNome(String nome){
     this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
}
