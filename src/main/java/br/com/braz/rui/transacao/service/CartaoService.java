package br.com.braz.rui.transacao.service;

import br.com.braz.rui.transacao.repository.CartaoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartaoService {

    @Autowired
    CartaoRespository cartaoRespository;

    public boolean doesCartaoExists(String idCartao){
        return cartaoRespository.existsById(idCartao);
    }

}
