/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.faces.bean.ManagedBean;
import model.GeradorSenha;

@ManagedBean
public class IndexController {
    
    private Integer tamanho;
    
    private String senha;
    
    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
        
    public void gerar(){
        GeradorSenha gerador = new GeradorSenha();
        gerador.setTamanho(tamanho);
        senha = gerador.gerar();
    }
}
