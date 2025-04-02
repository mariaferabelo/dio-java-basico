public class Usuario {

    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv ();
        
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal? " + smartTv.canal);
        System.out.println("Volume? " + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarCanal();
        smartTv.alterarCanal(5);

        System.out.println("Resultados após testes:");
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal? " + smartTv.canal);
        System.out.println("Volume? " + smartTv.volume);

    }
}
