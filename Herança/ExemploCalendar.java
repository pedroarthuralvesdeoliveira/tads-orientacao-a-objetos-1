import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExemploCalendar {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        System.out.println("Agora: " + agora);
        Calendar vencimento = agora;
        vencimento.add(Calendar.DATE, 7);
        System.out.println("\nVencimento: " + vencimento);
        vencimento.add(Calendar.MONTH, 1);
        System.out.println("\nNovo vencimento: " + vencimento);

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("\nAno: " + gc.get(Calendar.YEAR));
        System.out.println("\nMês: " + gc.get(Calendar.MONTH));
        System.out.println("\nDia do mês: " + gc.get(Calendar.DAY_OF_MONTH));
        System.out.println("\nDia da semana: " + gc.get(Calendar.DAY_OF_WEEK));
        System.out.println("\nDia do ano: " + gc.get(Calendar.DAY_OF_YEAR));
        System.out.println("\nSemana do mês: " + gc.get(Calendar.WEEK_OF_MONTH));
        System.out.println("\nDia da semana no mês: " + gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("\nHora: " + gc.get(Calendar.HOUR));
        System.out.println("\nAM/PM?: " + gc.get(Calendar.AM_PM));
        System.out.println("\nHora do dia: " + gc.get(Calendar.HOUR_OF_DAY));
        System.out.println("\nMinuto: " + gc.get(Calendar.MINUTE));
        System.out.println("\nSegundo: " + gc.get(Calendar.SECOND));

        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        GregorianCalendar data = new GregorianCalendar();
        data.set(Calendar.YEAR, 2023);
        data.set(Calendar.MONTH, Calendar.MAY);
        data.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println(df.format(data.getTime()));

        String dataNascimento = "02/03/2010";
        String[] vetorDataNascimento = dataNascimento.split("/");
        data.set(Calendar.YEAR, Integer.parseInt(vetorDataNascimento[2]));
        data.set(Calendar.MONTH, Integer.parseInt(vetorDataNascimento[1]) - 1);
        data.set(Calendar.DAY_OF_MONTH, Integer.parseInt(vetorDataNascimento[0]));

        System.out.println(df.format(data.getTime()));
    }
}
