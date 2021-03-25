package br.com.transacao.Controllers;

import br.com.transacao.Model.Cartao;
import br.com.transacao.Model.Transacao;
import br.com.transacao.Repository.CartaoRepository;
import br.com.transacao.Repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.Optional;

@RestController
@Transactional
@RequestMapping("api/cartoes")
public class TransactionController {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @Autowired
    private CartaoRepository cartaoRepository;


    @GetMapping("id/transacoes")
    private ResponseEntity<Page<Transacao>> listar(@PathVariable("id") Long cartaoId,
                                                   @PageableDefault(size = 10) Pageable page) {

        Optional<Cartao> cartao = cartaoRepository.findById(cartaoId);

        if (!cartao.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Page<Transacao> transacoes = transacaoRepository.findAllByCartaoId(cartaoId,page);

        return ResponseEntity.ok().body(transacoes);

    }
}
