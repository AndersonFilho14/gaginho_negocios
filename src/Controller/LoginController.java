/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Login;

/**
 *
 * @author filho
 */
public class LoginController {

    private final Login view;

    public LoginController(Login view) {
        this.view = view;
    }
    //Todu que aconteça na tela de login, sera aqui
    
    public void verificarUser(){
        //pergar as informações que estão na view
        //Pesquisar o User no banco
        //Se tiver batendo, mandar pra tela de menuprincipal
    }
    
    
    
    public void fiztarefa(){
        System.out.println("Teste de controler ok");
        this.view.exiberMensagem("executei o fiz tarefa");
    }
}
