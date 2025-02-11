package estudo.utils;

public class SmartPhone {
    public String ligar(String numero) {
        return "Ligando para " + numero;
    }

    public void atender() {
        System.out.println("Atendendo chamada");
    }

    public void desligar() {
        System.out.println("Desligando chamada");
    }

    public void correioVoz() {
        System.out.println("Acessando correio de voz");
    }
}