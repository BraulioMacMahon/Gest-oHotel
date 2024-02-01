/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelproject;

import java.sql.*;
/**
 *
 * @author Braulio MacMahon
 */
public class Conection {
    public static Connection conexao(){
 Connection conexao = null;
         
         try{
          
              
         Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
         conexao =  DriverManager.getConnection("jdbc:mysql://localhost/hotelaria_imetro","root","");
        
             System.out.println("Conexao Bem Sucedida Com a Base dedados");
         }
         catch(Exception ex){
         System.out.println("Nao Houve Conexao Porcausa do Erro: "+ex);
         }
         
         return conexao;
    
    }
}

