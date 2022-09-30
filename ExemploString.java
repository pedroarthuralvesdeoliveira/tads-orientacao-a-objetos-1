public class ExemploString {
    public static void main(String[] args) {
        String str1, str2, str3;
        str1 = "Um texto qualquer...    ";
        System.out.println("[" + str1 + "]");
        str1 = str1.trim();
        System.out.println("[" + str1 + "]");
        System.out.println("[" + str1.length() + "]");
        str2 = str1.replace("texto", "teste");
        System.out.println("[" + str2 + "]");
        str2 = str2.replace("t", "re");
        System.out.println("[" + str2 + "]");
        str3 = str1.substring(6, 10);
        System.out.println("[" + str3 + "]");
        str1 = "humberto.beneduzzi@ifpr.edu.br";
        int pos = str1.indexOf("@");
        System.out.println("O @ está na posição: " + pos);
        System.out.println("Usuário " + str1.substring(0, pos));
        System.out.println("Servidor " + str1.substring(pos + 1, str1.length()));

        int valor = 5;
        str3 = String.valueOf(valor);
        System.out.println("[" + str3 + "]");
    }
}
