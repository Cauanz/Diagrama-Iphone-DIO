import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorWeb.NavegadorWeb;
import ReprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorWeb, ReprodutorMusical {

    public void atenderChamada() {
        System.out.println("Atendendo chamada");
    }

    public void recusarChamada() {
        System.out.println("Recusando chamada");
    }

    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero);
    }

    public void abrirNovaAba() {
        System.out.println("Abrindo nova aba...");
    }

    public void fecharAba(String abaSelecionada) {
        System.out.println("Fechando aba: " + abaSelecionada);
    }

    public void atualizarPagina(String paginaSelecionada) {
        System.out.println("Atualizando página: " + paginaSelecionada);
    }

    public void exibirPagina(String paginaDesejada) {
        System.out.println("Exibindo página: " + paginaDesejada);
    }

    public void reproduzir() {
        System.out.println("Reproduzindo música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void proximaMusica() {
        System.out.println("Reproduzindo próxima música");
    }

    public void musicaAnterior() {
        System.out.println("Reproduzindo música anterior");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }
}