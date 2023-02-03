import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExemploLocalDateTime {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        System.out.println(data);

        LocalTime hora = LocalTime.now();
        System.out.println(hora);

        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // String dataFormatada = dataHora.format(formato);

        LocalDate hoje = LocalDate.now();
        LocalDate amanha = hoje.plusDays(1);
        LocalDate ontem = hoje.minusDays(1);
        System.out.println("\nHoje: " + hoje);
        System.out.println("\nAmanha: " + amanha);
        System.out.println("\nOntem: " + ontem);

        LocalTime horaAtual = LocalTime.now();
        LocalTime menosUmaHora = horaAtual.minusHours(1);
        System.out.println("\nHora atual: " + horaAtual);
        System.out.println("\nMenos uma hora: " + menosUmaHora);

        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime futuro = agora.plusDays(5).plusHours(3).plusMinutes(8);
        System.out.println("\n " + agora.format(formato));
        System.out.println("\n " + futuro.format(formato));

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate minhaData = LocalDate.parse("21/02/2023", formatoData);
        System.out.println("Minha data: " + minhaData);
        System.out.println("Minha data formatada: " + minhaData.format(formatoData));
    }
}
