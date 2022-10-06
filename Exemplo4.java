public class Exemplo4 {
    public static void main(String[] args) {
        Integer valor1, valor2, res;
        OperacoesMatematicas optMat = new OperacoesMatematicas();

        if (args.length < 2) {
            System.out.println("O programa precisa de 2 parâmetros");
            System.exit(0);
        }

        valor1 = Integer.parseInt(args[0]);
        valor2 = Integer.parseInt(args[1]);

        System.out.println("Primeiro teste");
        if (valor1 < 5) {
            res = optMat.multiplicar(valor1, valor2);
            System.out.println(valor1 + " * " + valor2 + " = " + res);
        }
    }
}
