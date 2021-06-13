package br.com.braz.rui.transacao.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cartao {

    @Id
    private String id;
    private String email;

    @Deprecated
    public Cartao(){

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
