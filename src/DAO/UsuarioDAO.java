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
import java.util.HashSet;
import java.util.Set;
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
    
    public Usuario getUsuario(String cpf){
        String sql = "SELECT * FROM Usuarios WHERE cpf = ?";
        try{
            PreparedStatement stmt = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            Usuario u = new Usuario();
            
            rs.first();
            u.setCpf(cpf);
            u.setSenha(rs.getString("senha"));
            return u;
        }catch (SQLException ex){
            System.out.println ("Usuario não encontrado");
            return null;
        }
    }
}
