package estudo.utils;

public class ReprodutorMusica {

    public void reproduzirMusica() {
        System.out.println("Reproduzindo música");
    }

    public void pausarMusica() {
        System.out.println("Pausando música");
    }

    public String selecionarMusica(String musica) {
        return "Música Selecionada: " + musica;
    }
}
