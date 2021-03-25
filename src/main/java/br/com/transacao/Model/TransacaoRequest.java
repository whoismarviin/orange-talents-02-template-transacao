package br.com.transacao.Model;


import java.math.BigDecimal;
import java.time.LocalDate;

public class TransacaoRequest {
    private String id;
    private BigDecimal valor;
    private Estabelecimento estabelecimento;
    private Cartao cartao;
    private LocalDate efetivadaEm;

    public Transacao toModel(){
        return new Transacao(id,valor,estabelecimento,cartao,efetivadaEm);
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public LocalDate getEfetivadaEm() {
        return efetivadaEm;
    }
}
