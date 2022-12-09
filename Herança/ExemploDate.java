import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploDate {
    public static void main(String[] args) {
        Date agora = new Date();
        System.out.println("Data normal: " + agora);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sdf.format(agora);
        System.out.println("\nData formatad: " + dataFormatada);
    }
}
