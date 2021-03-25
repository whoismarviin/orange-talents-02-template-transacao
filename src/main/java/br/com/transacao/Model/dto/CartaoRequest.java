package br.com.transacao.Model.dto;

import br.com.transacao.Model.Cartao;

import javax.validation.constraints.Email;

public class CartaoRequest {
    private String numeroCartao;
    private @Email String email;

    public Cartao toModel(){
        return new Cartao(numeroCartao,email);
    }
}
