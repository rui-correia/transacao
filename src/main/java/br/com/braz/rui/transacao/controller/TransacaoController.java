package br.com.braz.rui.transacao.controller;

import br.com.braz.rui.transacao.config.exception.ApiErrorException;
import br.com.braz.rui.transacao.model.Transacao;
import br.com.braz.rui.transacao.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/transacoes")
public class TransacaoController {

    @Autowired
    TransacaoService transacaoService;


    @GetMapping("cartao/{idCartao}")
    public ResponseEntity<?> buscarTransacoesPorCartao(@PathVariable String idCartao){
        List<Transacao> transacoes = new ArrayList<>();

        if (idCartao.isBlank() || idCartao.isEmpty()){
            return ResponseEntity.badRequest().build();
        }

        try {
            transacoes = transacaoService.listaTransacoesDoCartao(idCartao);
        }catch (ApiErrorException exception){
            return ResponseEntity.status(exception.getHttpStatus()).body(exception.getReason());
        }

        return ResponseEntity.status(HttpStatus.OK).body(transacoes);

    }
}
