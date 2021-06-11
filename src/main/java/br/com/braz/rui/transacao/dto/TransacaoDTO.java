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

    @Deprecated
    public TransacaoDTO() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public void setEfetivadaEm(LocalDateTime efetivadaEm) {
        this.efetivadaEm = efetivadaEm;
    }

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
