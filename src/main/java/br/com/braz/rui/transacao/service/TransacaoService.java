package br.com.braz.rui.transacao.service;

import br.com.braz.rui.transacao.dto.TransacaoDTO;
import br.com.braz.rui.transacao.model.Endereco;
import br.com.braz.rui.transacao.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransacaoService {

    @Autowired
    TransacaoRepository transacaoRepository;


    public void geraTransacao(TransacaoDTO transacao) {
        System.out.println("Gravando no banco");
        transacaoRepository.save(transacao.toModel());
    }
}
