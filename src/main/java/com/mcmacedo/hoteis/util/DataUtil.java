package com.mcmacedo.hoteis.util;

import java.util.Calendar;
import java.util.Date;

public class DataUtil {

    public static boolean ehFimDeSemana(Date diaDaSemana) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(diaDaSemana);

        if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ||
                calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
            return true;

        return false;
    }

    public static Date obterData(int dia, int mes, int ano){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, dia);
        calendar.set(Calendar.MONTH, mes - 1);
        calendar.set(Calendar.YEAR, ano);
        return calendar.getTime();
    }

}
