/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author filho
 */
public class Supervisor extends User {
    
    public Supervisor(int id, String nome, String email, String senha) {
        super(id, nome, email, senha);
    }

    public void verificarProduto(){
        
    }
    public void removerProduto(){
        
    }

    @Override
    public String toString() {
        return "Supervisor{" + '}';
    }

    
    
    
}
