public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        System.out.println("Testando o Reprodutor Musical:");
        iphone.selecionarMusica("Música 1");
        iphone.tocar();
        iphone.pausar();

        System.out.println("\nTestando o Aparelho Telefônico:");
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\nTestando o Navegador na Internet:");
        iphone.exibirPagina("https://www.teste.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.sairModoNavegacao();
    }
}
