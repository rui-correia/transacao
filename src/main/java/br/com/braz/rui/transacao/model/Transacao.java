package br.com.braz.rui.transacao.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Transacao {

    @Id
    private String id;
    private String valor;
    @ManyToOne
    private Estabelecimento estabelecimento;
    @ManyToOne
    private Cartao cartao;
    private LocalDateTime efetivadaEm;

}
