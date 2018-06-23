package model;

import java.util.Random;

public class GeradorSenha {
  
    private Integer tamanho;

    public GeradorSenha() {
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }
    
    public String gerar(){
        String senha = "";
        for (int i=0; i < tamanho; i++){
            senha += "a"; 
        }        
        return senha;
    }
    
}
