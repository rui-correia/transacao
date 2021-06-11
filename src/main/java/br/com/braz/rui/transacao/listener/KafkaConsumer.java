package br.com.braz.rui.transacao.listener;

import br.com.braz.rui.transacao.dto.TransacaoDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "transacoes", groupId = "group_id")
    public void consume(String message) throws JsonProcessingException {
        System.out.println("Consumed message: " + message);
        try {
            TransacaoDTO transacaoDTO = new ObjectMapper().readValue(message, TransacaoDTO.class);
            System.out.println("convertido.");
        } catch (Exception e) {
            System.out.println("Causa: " + e.getCause());
        }
    }
}
