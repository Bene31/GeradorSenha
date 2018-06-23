package controler;

import javax.faces.bean.ManagedBean;
import model.GeradorSenha;

@ManagedBean
public class IndexBean {
    private Integer tamanho;
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }
    
    public void gerar(){
        GeradorSenha gerador = new GeradorSenha();
        gerador.setTamanho(tamanho);
        senha = gerador.gerar();
    }
}
