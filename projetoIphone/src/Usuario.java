public class Usuario {
    public static void main(String[] args) {
        Iphone novoIphone = new Iphone();

        //NAVEGADOR WEB
        novoIphone.abrirNovaAba();
        novoIphone.atualizarPagina("UOL.com");
        novoIphone.exibirPagina("Globo.com");
        novoIphone.fecharAba("Youtube.com");

        //REPRODUTOR MUSICAL
        novoIphone.reproduzir();
        novoIphone.pausar();
        novoIphone.proximaMusica();
        novoIphone.musicaAnterior();
        novoIphone.selecionarMusica("Lemon Tree - Post Malone");

        //APARELHO TELEFONICO
        novoIphone.atenderChamada();
        novoIphone.recusarChamada();
        novoIphone.fazerChamada("42 994883742");
    }
}
