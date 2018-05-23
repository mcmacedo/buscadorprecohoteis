package com.mcmacedo.hoteis.exception;

public class DataFimMaiorQueDataInicioException extends Exception {
    public DataFimMaiorQueDataInicioException(){
        super("Data inicial maior que data final.");
    }
}
