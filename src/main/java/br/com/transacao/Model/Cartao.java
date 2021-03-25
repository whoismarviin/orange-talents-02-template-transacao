package br.com.transacao.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String numeroCartao;
    private String Email;

    public Cartao(String numeroCartao, String email) {
        this.numeroCartao = numeroCartao;
        Email = email;
    }

    @Deprecated
    public Cartao() {
    }

    public Long getId() {
        return id;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getEmail() {
        return Email;
    }
}
