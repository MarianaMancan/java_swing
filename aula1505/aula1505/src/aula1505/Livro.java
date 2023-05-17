/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1505;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
/**
 *
 * @author Aluno
 */
public class Livro {
    
    private String nome;
    private String issn;
    private String  autor;
    private String editora;
    private int ano;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
   private boolean gravarLivro() throws SQLException{
           Connection con = new Conexao().conectar();
           if(con != null){
               PreparedStatement ps;
               String sql = "insert into livros(Nome,issn,autor,editora,ano) values (?,?,?,?,?)";
               ps = con.prepareStatement(sql);
               ps.setString(1, getNome());
               ps.setString(2, getIssn());
               ps.setString(3, getAutor());
               ps.setString(4, getEditora());
               ps.setInt(5, getAno());
               
               int resultado = ps.executeUpdate();
               con.close();
                if(resultado != 0){
                    return true;
                }
               
             
           }
        return false;
    

}
}

