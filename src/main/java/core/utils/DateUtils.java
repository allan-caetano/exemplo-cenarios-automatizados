package core.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
    public static final String HORA = "hhmmss";
    public static final String DATA = "ddMMyyyy";
    public static final String HORA_MOLDADA = "hh:mm:ss";
    public static final String DATA_MOLDADA = "dd/MM/yyyy";
    public static final String DATA_HORA_MOLDADA = "dd/MM/yyyy, hh:mm:ss";

    public static Date obterDataAtual() {
        return new Date(System.currentTimeMillis());
    }

    public static String formatarData(Date data, String format) {
        return new SimpleDateFormat(format).format(data);
    }

    public static Date alterarData(Date dataBase, int dias) {
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(dataBase);
        calendario.add(Calendar.DATE, +dias);
        return calendario.getTime();
    }

    public void datas() {
        Date d = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        DateFormat df = DateFormat.getDateInstance(DateFormat.HOUR_OF_DAY1_FIELD);
        System.out.println( df.format(c.getTime()) );

        Date d2 = new Date();
        Calendar c2 = Calendar.getInstance();
        c.add(Calendar.DAY_OF_YEAR,5 );//adicionamos 5 dias a data aual
        c.add(Calendar.MONTH,3 );//adicionamos 3 mêses a data atual
        c.add(Calendar.YEAR,1 );//adicionamos 1 ano a data atual

        System.out.println(c2.getTime());

    }

    public static String obterDataEHoraAtualFormatada() {
        return formatarData(obterDataAtual(), "dd-MM-YY hh-mm");
    }

    public static  String dataAtualMMDDYYY(){return formatarData(obterDataAtual(), "MM/-dd/-YYYY");}
}

