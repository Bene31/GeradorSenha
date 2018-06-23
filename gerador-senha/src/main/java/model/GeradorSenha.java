package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeradorSenha {
    private Integer tamanho;
    private Random random = new Random();
    public GeradorSenha(){
    }
    
    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }
    
    public String gerar(){
        String senha = "";
        
        List<Character> letras = new ArrayList<>();
        
        for (char c='A'; c<'Z'; c++){
            letras.add(c);
        } 
        
        for(int i =0; i<tamanho; i++){
            int indice = random.nextInt(letras.size());
            senha += letras.get(indice);
        }
        
        return senha;
    }  
}
