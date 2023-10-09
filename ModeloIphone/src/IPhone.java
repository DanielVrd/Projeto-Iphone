
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}
interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}
interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private boolean musicaTocando;
    private boolean ligacaoAtiva;
    private boolean modoNavegacao;

    public IPhone() {
        this.musicaTocando = false;
        this.ligacaoAtiva = false;
        this.modoNavegacao = false;
    }
    @Override
    public void tocar() {
        this.musicaTocando = true;
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        this.musicaTocando = false;
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }
    @Override
    public void ligar(String numero) {
        this.ligacaoAtiva = true;
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        this.ligacaoAtiva = true;
        System.out.println("Atendendo chamada telefônica...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    @Override
    public void exibirPagina(String url) {
        this.modoNavegacao = true;
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba do navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
    public void sairModoNavegacao() {
        this.modoNavegacao = false;
    }
}
