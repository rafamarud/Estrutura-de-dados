package Grafos.Desafio;

public class Estrada {
    String destino;

    public Estrada(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return destino;
    }
}