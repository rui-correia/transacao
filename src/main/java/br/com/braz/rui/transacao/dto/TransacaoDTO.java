package br.com.braz.rui.transacao.dto;

import br.com.braz.rui.transacao.model.Estabelecimento.Estabelecimento;

import java.time.LocalDateTime;

public class TransacaoDTO {
    private String id;
    private String valor;
    private Estabelecimento estabelecimento;
    private Cartao cartao;
    private LocalDateTime efetivadaEm;
}
