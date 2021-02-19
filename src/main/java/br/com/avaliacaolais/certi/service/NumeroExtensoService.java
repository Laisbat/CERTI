package br.com.avaliacaolais.certi.service;

import br.com.avaliacaolais.certi.utils.ConversorNumeroExtensoUtil;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class NumeroExtensoService {

    public JSONObject conversor (String numero){
        ConversorNumeroExtensoUtil conversor = new ConversorNumeroExtensoUtil();
        JSONObject json = new JSONObject();
        json.put("extenso", conversor.getExtenso(numero));

        return json;
    }
}
