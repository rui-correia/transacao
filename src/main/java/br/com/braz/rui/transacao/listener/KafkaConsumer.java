package br.com.braz.rui.transacao.listener;

import br.com.braz.rui.transacao.dto.TransacaoDTO;
import br.com.braz.rui.transacao.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @Autowired
    TransacaoService transacaoService;

    @KafkaListener(topics = "transacoes", groupId = "group_id")
    public void consume(TransacaoDTO transacao) {
        System.out.println("Transacao recebida id: " + transacao.getId());
        transacaoService.geraTransacao(transacao);
        System.out.println("Transacao: " + transacao.getId() + " salva com sucesso!");
    }
}
