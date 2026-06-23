/*Figura:
    nomeSelecao
    numeroFigura
    descricao //nome do jogador, brasao, ou bandeira
    quantidade //opcional, usada nas repetidas
    rara (boolean) */


public class Figurinha implements Comparable<Figurinha> {
    String nomeSelecao;
    int numeroFigura;
    String descricao;
    int quantidade;
    boolean rara;

    public Figurinha(String nomeSelecao, int numeroFigura, String descricao, int quantidade, boolean rara) {
        this.nomeSelecao = nomeSelecao;
        this.numeroFigura = numeroFigura;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.rara = rara;
    }

    @Override
    public int compareTo(Figurinha outra) {
        return Integer.compare(this.numeroFigura, outra.numeroFigura);
    }

    @Override
    public String toString() {
        return numeroFigura + " - " + nomeSelecao + " - " + descricao +
               " - qtd: " + quantidade + " - rara: " + rara;
    }

    public String toCSV() {
        return nomeSelecao + "," + numeroFigura + "," + descricao + "," + quantidade + "," + rara;
    }
}