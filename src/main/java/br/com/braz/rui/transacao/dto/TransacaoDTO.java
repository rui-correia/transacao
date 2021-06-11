package br.com.braz.rui.transacao.dto;

import br.com.braz.rui.transacao.model.Cartao;
import br.com.braz.rui.transacao.model.Estabelecimento;

import java.time.LocalDateTime;

public class TransacaoDTO {
    private String id;
    private String valor;
    private Estabelecimento estabelecimento;
    private Cartao cartao;
    private LocalDateTime efetivadaEm;


    @Override
    public String toString() {
        return "TransacaoDTO{" +
                "id='" + id + '\'' +
                ", valor='" + valor + '\'' +
                ", estabelecimento=" + estabelecimento +
                ", cartao=" + cartao +
                ", efetivadaEm=" + efetivadaEm +
                '}';
    }
}
