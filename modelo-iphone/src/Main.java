public class Main {
    public static void main(String[] args) {
        Smartphone meuSmartphone = new Smartphone();

        meuSmartphone.selecionarMusica("Imagine - John Lennon");
        meuSmartphone.tocar();
        meuSmartphone.pausar();

        meuSmartphone.ligar("11999998888");
        meuSmartphone.atender();
        meuSmartphone.iniciarCorreioVoz();

        meuSmartphone.exibirPagina("https://www.exemplo.com");
        meuSmartphone.adicionarNovaAba();
        meuSmartphone.atualizarPagina();
    }
}
