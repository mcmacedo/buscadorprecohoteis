package com.mcmacedo.hoteis.bo;

import com.mcmacedo.hoteis.exception.DataFimMaiorQueDataInicioException;
import com.mcmacedo.hoteis.model.Cliente;
import com.mcmacedo.hoteis.model.Hotel;

import java.util.*;

public class BuscadorPrecos {

    private Cliente cliente;
    private List<Date> datas;
    private List<Hotel> redeDeHoteis;
    private CalculadorPeriodo calculadorPeriodo = new CalculadorPeriodo();

    public BuscadorPrecos(Cliente cliente, List<Date> datas) throws DataFimMaiorQueDataInicioException {
        this.cliente = cliente;
        this.datas = datas;

        this.redeDeHoteis = Hotel.criaListaDeHoteis();
    }

    public Map.Entry<Hotel, Double> buscarMelhorPrecoNosHoteis() {
        Map<Hotel, Double> diariasDosHoteis = new HashMap<Hotel, Double>();

        for (Hotel hotel: this.redeDeHoteis) {
            Double valor;

            if (this.cliente.getVip())
                valor = this.calculadorPeriodo.calcular(hotel.getDiariaVip(), this.datas);
            else
                valor = this.calculadorPeriodo.calcular(hotel.getDiariaRegular(), this.datas);

            diariasDosHoteis.put(hotel, new Double(valor));
        }

        Map.Entry<Hotel, Double> entry = ordenarListaPorMelhorPreco(diariasDosHoteis).entrySet().iterator().next();

        return entry;
    }

    private Map<Hotel, Double> ordenarListaPorMelhorPreco(Map<Hotel, Double> listaAtual) {
        Map<Hotel, Double> diariasDosHoteisOrdenadas = new LinkedHashMap<Hotel, Double>();
        listaAtual.entrySet().stream()
                .sorted(Map.Entry.<Hotel, Double>comparingByValue().thenComparing(
                        Map.Entry.comparingByKey()
                ))
                .forEachOrdered(valor -> diariasDosHoteisOrdenadas.put(valor.getKey(), valor.getValue()));

        return diariasDosHoteisOrdenadas;
    }
}
