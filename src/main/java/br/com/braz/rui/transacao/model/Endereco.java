package br.com.braz.rui.transacao.model;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

    private String bairro;
    private String rua;
    private String numero;
}
