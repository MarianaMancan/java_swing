/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03042003;

/**
 *
 * @author Aluno
 */
public class Pessoa {

    public Pessoa() {
         System.out.println("PESSOA CONSTRUTOR");
    }
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    
    private String nome;
    private String endereco;
    private String cpf;
    private String telefone;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getEndereco(){
        return this.endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
