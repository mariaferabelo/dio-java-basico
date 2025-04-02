import java.util.Random;

public class ExemploDowhile{
    public static void main(String[] args) {
        System.out.println("Discando...");

        do{
            System.out.println("Tocando!");
        }while(tocar());

        System.out.println("Alô?");
    }
    private static boolean tocar (){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu; //se atendeu, não irá tocar mais
    }
}