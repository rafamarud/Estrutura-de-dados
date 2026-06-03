/*Figura:
    nomeSelecao
    numeroFigura
    descricao //nome do jogador, brasao, ou bandeira
    quantidade //opcional, usada nas repetidas
    rara (boolean) */


public class Figurinhas {
    public String nomeSelecao;
    public int numeroFigura;
    public String descricao;
    public int quantidade;
    public boolean rara;

    public Figurinhas(String nomeSelecao, int numeroFigura, String descricao, int quantidade, boolean rara){
        this.nomeSelecao = nomeSelecao;
        this.numeroFigura = numeroFigura;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.rara = rara;
    }

    
}
