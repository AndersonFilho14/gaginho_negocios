/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;
/**
 *
 * @author filho
 */
public class ConexaoDao {
    public Connection conectorBd(){
        Connection conn = null;
        
        try {
            String  url = "jdbc:mysql://localhost:3306/gaginho?user=root&password=mysql";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ConexaoDao"+ e.getMessage());
        }return conn;
    }
}
