/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1505;

import java.sql.*;

/**
 *
 * @author Aluno
 */
public class Conexao {
   private final String bd;
   private final String usuario;
   private final String senha;
    
    
    public Conexao(){
        this.bd = "java";
        this.usuario = "root";
        this.senha = "";
         
    }
        
      public Connection conectar(){
          
        try{
           Class.forName("com.mysql.cj.jbc.Driver");
             return DriverManager.getConnection("jdbc:mysql//localhost/" + this.bd +this.usuario + this.senha);
         }catch(ClassNotFoundException | SQLException erro){
          System.out.print(erro);
          return null;
      }
      }
       
        
        

}
