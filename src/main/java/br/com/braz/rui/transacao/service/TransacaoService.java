package br.com.braz.rui.transacao.service;

import br.com.braz.rui.transacao.config.exception.ApiErrorException;
import br.com.braz.rui.transacao.dto.TransacaoDTO;
import br.com.braz.rui.transacao.model.Endereco;
import br.com.braz.rui.transacao.model.Transacao;
import br.com.braz.rui.transacao.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

import java.util.List;

@Service
public class TransacaoService {

    @Autowired
    TransacaoRepository transacaoRepository;

    @Autowired
    CartaoService cartaoService;

    public void geraTransacao(TransacaoDTO transacao) {
        System.out.println("Gravando no banco");
        transacaoRepository.save(transacao.toModel());
    }

    public List<Transacao> listaTransacoesDoCartao(String idCartao) {

        System.out.println("Verificando existencia do cartao: " + idCartao);
        if (!cartaoService.doesCartaoExists(idCartao)) {
            throw new ApiErrorException(HttpStatus.NOT_FOUND, "Cartão não encontrado.");
        }
        System.out.println("Cartão: " + idCartao + " encontado, seguindo para a busca.");
        System.out.println("Listando transacoes para cartão: " + idCartao);
        List<Transacao> transacaos = transacaoRepository.findLastTenTransactions(idCartao);
        System.out.println("Finalizando a busca por transacoes para o cartão: " + idCartao);
        return transacaos;

    }
}
