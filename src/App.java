import iPhone.iPhone;

public class App {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        //Aparelho Telefonico
        iphone.ligar("09210921");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //Reprodutor de Musica
        iphone.tocar("xamuel");
        iphone.pausar();
        iphone.selecionarMusica();

        //Navegar na internet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}