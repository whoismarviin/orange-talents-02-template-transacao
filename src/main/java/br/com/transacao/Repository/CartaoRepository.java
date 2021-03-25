package br.com.transacao.Repository;

import br.com.transacao.Model.Cartao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaoRepository extends CrudRepository<Cartao,Long> {
}
