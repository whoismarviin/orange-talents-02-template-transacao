package br.com.transacao.Repository;

import br.com.transacao.Model.Transacao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface TransacaoRepository extends CrudRepository<Transacao,Long> {

    Page<Transacao> findAllByCartaoId(Long cartaoId, Pageable page);

}
