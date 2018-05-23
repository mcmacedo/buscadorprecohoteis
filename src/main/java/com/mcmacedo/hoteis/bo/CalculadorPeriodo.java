package com.mcmacedo.hoteis.bo;

import com.mcmacedo.hoteis.model.Diaria;
import com.mcmacedo.hoteis.util.DataUtil;

import java.util.Date;
import java.util.List;

public class CalculadorPeriodo {

    public Double calcular(Diaria diaria, List<Date> datas) {
        Double precoTotal = new Double(0.0);

        for (Date data : datas) {
            precoTotal += getPrecoDiariaParaDia(diaria, data);
        }

        return  precoTotal;
    }

    private Double getPrecoDiariaParaDia(Diaria diaria, Date dia) {
        if (DataUtil.ehFimDeSemana(dia))
            return diaria.getPrecoFimDeSemana();

        return diaria.getPrecoSemanal();
    }
}
