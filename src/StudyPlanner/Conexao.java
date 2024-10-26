/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudyPlanner;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author iagov
 */
public class Conexao {
    public Connection getConexao(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudyPlanner?useTimezone=true&serverTimezone=UTC", "root", "admin");
            System.out.println ("Conexão realizada");
            return conn;
        }catch (Exception e){
            System.out.println("Erro ao conectar no BD"+e.getMessage());
            return null;
        }
    }
}
