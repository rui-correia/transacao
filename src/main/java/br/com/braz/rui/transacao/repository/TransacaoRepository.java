package br.com.braz.rui.transacao.repository;

import br.com.braz.rui.transacao.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, String> {
}
