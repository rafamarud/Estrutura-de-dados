import java.util.ArrayList;
import java.util.TreeSet;
 
public class arvore2 {
    public static void main(String[] args) {
        TreeSet<Integer> arvore = new TreeSet<>();
        ArrayList<Integer> lista = new ArrayList<>();
        int quantidade = 10000000;

        // adicionando na árvore
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++) {
            int numero = (int) (Math.random() * quantidade);
            arvore.add(numero);
        }
        long fim = System.currentTimeMillis();
        long tempoDecorrido = fim - inicio;
        System.out.println("Tempo de execução de insercao em arvore: " + tempoDecorrido + " ms");
        
        //adicionando na lista
        inicio = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++) {
            int numero = (int) (Math.random() * quantidade);
            lista.add(numero);
        }
        fim = System.currentTimeMillis();
        tempoDecorrido = fim - inicio;
        System.out.println("Tempo de execução de insercao lista: " + tempoDecorrido + " ms");

        //pesquisando na arvore
        inicio = System.currentTimeMillis();
        System.out.println("Verificando se o numero -9 está presente na lista: "+ lista.contains(-9));

        //pesquisando na lista
        fim = System.currentTimeMillis();
        tempoDecorrido = fim - inicio;
        System.out.println("Tempo de execução de pesquisa em lista: "+ tempoDecorrido + "ms");
    }
}
