package br.com.transacao.kafka;

import br.com.transacao.Model.Transacao;
import br.com.transacao.Model.TransacaoRequest;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class ListenerDeTransacao {
    @PersistenceContext
    EntityManager manager;


    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    private void ouvir(TransacaoRequest request){
        System.out.println("-----------------------");
        System.out.println("Estamos processando sua solicitação aguarde");
        Transacao transacao = request.toModel();
        System.out.println(transacao.toString());
        manager.persist(transacao);

        System.out.println("Okay tudo certo, Obrigado por escolher os nossos serviços");
        System.out.println("----------------------------------------------------------");

    }
}
