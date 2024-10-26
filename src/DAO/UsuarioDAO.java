/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import beans.Usuario;
import java.sql.PreparedStatement;
import java.sql.Connection;
import StudyPlanner.Conexao;
import java.sql.SQLException;
import java.sql.ResultSet; 
/*
 *
 * @author iagov
 */
public class UsuarioDAO {
    private Conexao conexao;
    private Connection conn;
    public UsuarioDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    
}
