public class ExemploInteger {
    public static void main(String[] args) {
        Integer i2 = 10;
        float f1 = i2.floatValue() / 3;
        System.out.println("F1 vale: " + f1);
        System.out.println("F1 vale: " + String.format("%.02f", f1));
    }
}
