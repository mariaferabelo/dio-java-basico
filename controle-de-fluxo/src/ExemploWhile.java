public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0 ){
            double valorDoce = 5.0;
            mesada -=valorDoce;
            System.out.println("mesada: " + mesada);
        }
        System.out.println("Vish! Joaozinho gastou toda a mesada com doces.");
    }
}