public class BuscaCampus {
    public static void main(String[] args) {
        /*
         * Imprima na tela o CEP do campus. CHECK
         * Imprima na tela o Telefone do campus.
         * Converta para inteiro os 4 últimos dígitos do telefone do campus, divida por 2 e imprima na tela.
         * */
        String s1 = "IFPR - Campus Foz do Iguaçu - Avenida Araucária, 780, Bairro Vila A - CEP: 85860-000 - Foz do Iguaçu - Paraná - (45)3422-5348";
        System.out.println(s1.substring(s1.indexOf("CEP"), s1.indexOf("CEP") + 14));
        System.out.println(s1.substring(s1.indexOf("(45)"), s1.indexOf("(45)") + 13));
        int position = s1.length() - 4;
        int lastFourNumbersDividedByTwo = (Integer.parseInt(s1.substring(position, s1.length()))) / 2;
        System.out.println("Os últimos quatro números divididos por 2 equivalem a: " + lastFourNumbersDividedByTwo);
    }
}
