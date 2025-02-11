package estudo.core;

import estudo.utils.NavegadorInternet;
import estudo.utils.ReprodutorMusica;
import estudo.utils.SmartPhone;   

public class Iphone1 {

    public static void main(String[] args) throws Exception {
        NavegadorInternet navegadorInternet = new NavegadorInternet();
        ReprodutorMusica reprodutorMusica = new ReprodutorMusica();
        SmartPhone smartPhone = new SmartPhone();

        System.out.println("Abrindo navegador de internet");
        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.pesquisar("https://www.google.com");
        System.out.println("Fechando navegador de internet");

        System.out.println("Abrindo reprodutor de música");
        reprodutorMusica.selecionarMusica("One by Metallica");
        reprodutorMusica.reproduzirMusica();
        reprodutorMusica.pausarMusica();
        System.out.println("Fechando reprodutor de música");

        smartPhone.ligar("41999999999");
        smartPhone.atender();
        smartPhone.desligar();
        smartPhone.correioVoz();
    }
}
