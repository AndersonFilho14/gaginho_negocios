/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Cliente;
import Model.Supervisor;

/**
 *
 * @author filho
 */
public class Main {
    
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente(00000, 5214, 0, "Anderson", "anderon@", "senha");
        Cliente c2 = new Cliente(25, 11111, 51265, 1, "catari", "cata@", "senha");
        
        System.out.println(c1.getCep());
        System.out.println(c2.getCpf());
        
        Supervisor s1 = new Supervisor(999, "Zé", "supervisor@", "gaginho");
        System.out.println(s1.getEmail());
        
    }
}
