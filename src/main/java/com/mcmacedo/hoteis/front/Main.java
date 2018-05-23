package com.mcmacedo.hoteis.front;

import com.mcmacedo.hoteis.bo.BuscadorPrecos;
import com.mcmacedo.hoteis.exception.DataFimMaiorQueDataInicioException;
import com.mcmacedo.hoteis.model.Cliente;
import com.mcmacedo.hoteis.model.Hotel;
import com.mcmacedo.hoteis.util.DataUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Jose Carlos", false);
        Cliente cliente02 = new Cliente("Renan", false);
        Cliente cliente03 = new Cliente("Rodrigo", true);

        List<Date> datas01 = new ArrayList<Date>();
        datas01.add(DataUtil.obterData(21, 5, 2018));
        datas01.add(DataUtil.obterData(22, 5, 2018));
        datas01.add(DataUtil.obterData(23, 5, 2018));
        List<Date> datas02 = new ArrayList<Date>();
        datas02.add(DataUtil.obterData(25, 5, 2018));
        datas02.add(DataUtil.obterData(26, 5, 2018));
        datas02.add(DataUtil.obterData(27, 5, 2018));
        List<Date> datas03 = new ArrayList<Date>();
        datas03.add(DataUtil.obterData(24, 5, 2018));
        datas03.add(DataUtil.obterData(25, 5, 2018));
        datas03.add(DataUtil.obterData(26, 5, 2018));

        BuscadorPrecos buscador01 = null;
        BuscadorPrecos buscador02 = null;
        BuscadorPrecos buscador03 = null;

        try {
            buscador01 = new BuscadorPrecos(cliente01, datas01);
            buscador02 = new BuscadorPrecos(cliente02, datas02);
            buscador03 = new BuscadorPrecos(cliente03, datas03);

        } catch (DataFimMaiorQueDataInicioException e) {
            e.printStackTrace();
            System.exit(1);
        }

        imprimePrimeiroValor(buscador01.buscarMelhorPrecoNosHoteis());
        imprimePrimeiroValor(buscador02.buscarMelhorPrecoNosHoteis());
        imprimePrimeiroValor(buscador03.buscarMelhorPrecoNosHoteis());
    }

    private static void imprimePrimeiroValor(Map.Entry<Hotel, Double> entry) {
        System.out.println(entry.getKey().getNomeHotel() + ": R$" + entry.getValue());
    }
}
