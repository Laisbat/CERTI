package br.com.avaliacaolais.certi.controller;

import br.com.avaliacaolais.certi.service.NumeroExtensoService;
import br.com.avaliacaolais.certi.utils.ConversorNumeroExtensoUtil;
import org.json.JSONObject;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@Ignore
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class NumeroExtensoControllerTest {

    @InjectMocks
    NumeroExtensoController numeroExtensoController;

    @Mock
    NumeroExtensoService numeroExtensoService;

    @Mock
    ConversorNumeroExtensoUtil conversorNumeroExtensoUtil;

    @Test
    public void recuperarNumeroExtensoTest () {
        JSONObject json = new JSONObject();
        json.put("extenso", conversorNumeroExtensoUtil.getExtenso("123"));
        Mockito.when(ResponseEntity.status(HttpStatus.OK).body(numeroExtensoService.conversor("123").toString())).thenReturn(ResponseEntity.status(HttpStatus.OK).body(json.toString()));
        numeroExtensoController.recuperarNumeroExtenso("123");

    }
}
