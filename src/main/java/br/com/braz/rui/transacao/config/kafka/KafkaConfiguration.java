package br.com.braz.rui.transacao.config.kafka;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;

@EnableKafka
@Configuration
class KafkaConfiguration {

    //Kafka: String -> Json -> objeto
    @Bean
    StringJsonMessageConverter jsonMessageConverter() {
        return new StringJsonMessageConverter();
    }

}
