package br.com.braz.rui.transacao.config;

import br.com.braz.rui.transacao.dto.TransacaoDTO;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.ErrorHandlingDeserializer;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class KafkaConfiguration {

    @Bean
    public ConsumerFactory<String, TransacaoDTO> consumerFactory() {
        Map<String, Object> config = new HashMap<>();

        JsonDeserializer<TransacaoDTO> deserializer = new JsonDeserializer<>(TransacaoDTO.class);
        deserializer.setRemoveTypeHeaders(false);
        deserializer.addTrustedPackages("br.com.braz.rui.transacao.*");
        deserializer.setUseTypeMapperForKey(true);


        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, deserializer);

        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(), new ErrorHandlingDeserializer<>(new JsonDeserializer<>(TransacaoDTO.class)));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, TransacaoDTO> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, TransacaoDTO> factory = new ConcurrentKafkaListenerContainerFactory();
        factory.setConsumerFactory(consumerFactory());
        return factory;
    }

}
