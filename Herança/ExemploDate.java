import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploDate {
    public static void main(String[] args) {
        Date agora = new Date();
        System.out.println("Data normal: " + agora);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sdf.format(agora);
        System.out.println("\nData formatada: " + dataFormatada);
        Date data = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("\nShort: " + df.format(data));
        df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("\nMedium: " + df.format(data));
        df = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("\nLong: " + df.format(data));
        df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("\nFull: " + df.format(data));
    }
}
