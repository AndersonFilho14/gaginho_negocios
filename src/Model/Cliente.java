/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
/**
 *
 * @author filho
 */
public class Cliente extends User {
    private int idade;
    private int cpf;
    private int cep;

    public Cliente(int cpf, int cep, int id, String nome, String email, String senha) {
        super(id, nome, email, senha);
        this.cpf = cpf;
        this.cep = cep;
    }

    public Cliente(int idade, int cpf, int cep, int id, String nome, String email, String senha) {
        super(id, nome, email, senha);
        this.idade = idade;
        this.cpf = cpf;
        this.cep = cep;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getCep() {
        return cep;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }

    
}
