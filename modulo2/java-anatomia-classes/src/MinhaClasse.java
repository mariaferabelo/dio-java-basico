public class MinhaClasse {

    public static void main (String [] args)  {
        String nome = "Maria";
        String sobrenome = "Rabelo";

        String nomeCompleto = nomeCompleto(nome, sobrenome);
        System.out.println(nomeCompleto);

    }


    public static String nomeCompleto (String primeiroNome, String sobrenome){
        return primeiroNome.concat(" ").concat(sobrenome);
    }
    
}