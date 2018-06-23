package br.cesjf.gerador.senha.model;

import model.GeradorSenha;
import org.junit.Assert;
import org.junit.Test;

public class GeradorSenhaTest {
    
  @Test
public void testGerarSenhaComTamanho6DeveRetornarSenhaCom6Digitos(){
    //Arrange
    int tamanhoEsperado = 6;
    GeradorSenha gerador = new GeradorSenha();
    gerador.setTamanho(tamanhoEsperado);

    //Act
    String senha = gerador.gerar();

    //Assert
    Assert.assertEquals(tamanhoEsperado, senha.length());
}
}
