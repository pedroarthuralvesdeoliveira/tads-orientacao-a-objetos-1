public class Exemplo5 {
    public static void main(String[] args) {
        int quantidade = 5;

        System.out.println("Repetição do tipo for: ");
        for (int iterator = 0; iterator < quantidade; iterator++)
        {
            System.out.println(iterator);
        }

        System.out.println("Repetição do tipo while: ");
        int contador = 0;
        while (contador <= quantidade)
        {
            System.out.println(contador);
            contador++;
        }

        System.out.println("Repetição do tipo do while: ");
        contador = 0;
        do {
            System.out.println(contador);
            contador++;
        } while (contador <= quantidade);
    }
}
