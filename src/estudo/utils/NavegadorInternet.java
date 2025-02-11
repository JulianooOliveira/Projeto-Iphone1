package estudo.utils;

public class NavegadorInternet {

    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public String pesquisar(String url){
        return "Pesquisando " + url;
    }

    public void fecharAba() {
        System.out.println("Fechando aba");
    }

}
