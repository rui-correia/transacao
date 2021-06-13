package br.com.braz.rui.transacao.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Transacao {

    @Id
    private String id;
    private String valor;
    @ManyToOne(cascade = CascadeType.ALL)
    private Estabelecimento estabelecimento;
    @ManyToOne(cascade = CascadeType.ALL)
    private Cartao cartao;
    private LocalDateTime efetivadaEm;

    @Deprecated
    public Transacao() {
    }

    public Transacao(String id, String valor, Estabelecimento estabelecimento, Cartao cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }


}
