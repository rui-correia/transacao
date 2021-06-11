package br.com.braz.rui.transacao.model;

import javax.persistence.*;

@Entity
public class Estabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Embedded
    private Endereco endereco;



}
