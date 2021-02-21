package br.com.avaliacaolais.certi.service;

import br.com.avaliacaolais.certi.dto.RetornoDTO;
import br.com.avaliacaolais.certi.exception.ParametroException;
import br.com.avaliacaolais.certi.utils.ConversorNumeroExtensoUtil;
import org.springframework.stereotype.Service;

@Service
public class NumeroExtensoService {

    public RetornoDTO conversor (String numero) throws ParametroException{
        verificarParametro(numero);
        RetornoDTO retornoDTO = new RetornoDTO();
        ConversorNumeroExtensoUtil conversorUtil = new ConversorNumeroExtensoUtil();
        retornoDTO.setExtenso(conversorUtil.getExtenso(numero));
        return retornoDTO;
    }

    private void verificarParametro (String numero) throws ParametroException{
        if (!numero.matches("[0-9]+")) {
            if(numero.charAt(0) == '-' && numero.substring(1).matches("[0-9]+")) {
                return;
            }
            throw new ParametroException("Somente número é permitido nessa operação");
        }
    }
}