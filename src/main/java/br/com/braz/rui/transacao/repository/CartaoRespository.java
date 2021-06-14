package br.com.braz.rui.transacao.repository;

import br.com.braz.rui.transacao.model.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaoRespository extends JpaRepository<Cartao, String> {
}
