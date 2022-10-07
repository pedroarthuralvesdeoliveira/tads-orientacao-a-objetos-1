import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LerDados {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        String linha = "";
        System.out.println("Digite alguma coisa ou S para sair: ");
        while (!linha.toUpperCase().equals("S"))
        {
             linha = reader.readLine();
             System.out.println("Digitou: " + linha);
        }

        int[] vetorValores = {4, 7, 5, 8, 1, 3};
        System.out.println(vetorValores[4]);

        int quantidadeMeses = 12;
        String[] meses = new String[12];
        System.out.println("Digite os meses do ano: ");
        for (int iterator = 0; iterator < quantidadeMeses; iterator++)
        {
            meses[iterator] = reader.readLine();
        }

        System.out.println("Informe um mês para visualizá-lo: ");
        int mes = Integer.parseInt(reader.readLine());
        System.out.println("O mês que equivale ao que gostaria é: " + meses[mes - 1]);
    }
}
