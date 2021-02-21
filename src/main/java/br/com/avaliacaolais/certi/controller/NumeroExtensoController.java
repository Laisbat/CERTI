package br.com.avaliacaolais.certi.controller;

import br.com.avaliacaolais.certi.dto.RetornoDTO;
import br.com.avaliacaolais.certi.service.NumeroExtensoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
    @RestController
//    @RequestMapping("/v1/requisicao")
    @Api("Serviços relacionados a requisição")
    public class NumeroExtensoController {

       @Autowired
       NumeroExtensoService numeroExtensoService;

        @GetMapping("/{numero}")
        public ResponseEntity<RetornoDTO> recuperarNumeroExtenso(@PathVariable final String numero){
            return ResponseEntity.status(HttpStatus.OK).body(numeroExtensoService.conversor(numero));
        }
    }

