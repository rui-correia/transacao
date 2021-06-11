package br.com.braz.rui.transacao.listener;

import br.com.braz.rui.transacao.dto.TransacaoDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "transacoes", groupId = "group_id")
    public void consume(TransacaoDTO transacao) {
        System.out.println("Consumed message: " + transacao);

    }
}
