import java.util.ArrayList;
import java.util.Random;

class Recursao {

    public static void popular(ArrayList<Integer> lista, int quantidade) {
        Random gerador = new Random();
        for (int i = 0; i < quantidade; i++) {
            int numero = gerador.nextInt(100);
            lista.add(numero);
        }
    }

    public static void exibir(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public static void exibirR(ArrayList<Integer> lista, int n) {
        if (n > 0) {
            exibirR(lista, n - 1);
            System.out.println(lista.get(n - 1));
        }
    }

    public static int contarParesR(ArrayList<Integer> lista, int n) {
        if (n > 0) {
            if (lista.get(n - 1) % 2 == 0) {
                return 1 + contarParesR(lista, n - 1);
            } else {
                return 0 + contarParesR(lista, n - 1);
            }
        }
        return 0;
    }

    public static int somarR(ArrayList<Integer> lista, int n) {
        if (n > 0) {
            return lista.get(n - 1) + somarR(lista, n - 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int quantidade = 3;

        popular(lista, quantidade);

        System.out.println("Elementos da lista: "); 
        
        exibirR(lista, lista.size());

       
        System.out.println("A soma dos elementos da lista eh: " + somarR(lista, lista.size()));
        System.out.println("A quantidade de pares na lista eh: " + contarParesR(lista, lista.size()));
    }
}
