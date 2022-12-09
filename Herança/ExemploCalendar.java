import java.util.Calendar;

public class ExemploCalendar {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        System.out.println("Agora: " + agora);
        Calendar vencimento = agora;
        vencimento.add(Calendar.DATE, 7);
        System.out.println("\nVencimento: " + vencimento);
        vencimento.add(Calendar.MONTH, 1);
        System.out.println("\nNovo vencimento: " + vencimento);
    }
}
