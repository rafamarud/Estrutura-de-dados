import java.util.ArrayList;

public class Recursao{
    static void mostrarSequenciaCrescente(int numero){
        for(int i = 0; i <= numero; i++){
            System.out.println(i);
        }
    }

    static void mostrarSequenciaDecrescente(int numero){
        for( ; numero >= 0; numero--){
            System.out.println(numero);
        }
    }

    static void mostrarSequenciaDecrescenteR(int numero){
        if(numero >= 0){
            System.out.println(numero);
            mostrarSequenciaDecrescenteR(numero - 1); // ponto de recursao
        }
    }

    static void mostrarSequenciaCrescenteR(int numero){
        if(numero >= 0){
            mostrarSequenciaCrescenteR(nunero - 1);
            System.out.println(numero);
        }
    }

    static void mostrarIntervalo(int ini, int fim){
        for( ; ini <= fim; ini++){
            System.out.println(ini);
        }
    }

    static void mostrarIntervaloR(int ini, int fim){
        if(ini <= fim){
            System.out.println(ini);
            mostrarIntervaloR(ini + 1, fim);
        }
    }

    static void mostrarLista(ArrayList<Integer> lista){
        //for(int i = 0; i < lista.size(); i++){
            //System.out.println(lista);
        //}
        for(Integer i :lista){
            System.out.println(i);
        }
    }

    static void mostrarListaR(ArrayList<Integer> lista, int n){
        if(n > 0){
            System.out.println(lista.get(n - 1));
            mostrarListaR(lista, n - 1);
        }
    }

    static void mostarParesListaR(ArrayList<Integer> lista, int n){
        if(n > 0){
            mostrarListaRPares(lista, n - 1);
            if(lista.get(n-1) % 2 == 0){
                System.out.println(lista.get(n - 1));
            }
        }
    }

    ///static void substituirR(ArrayList <Integer> lista, int n, int n1, int n2)



    public static void main(String[] args) {
        int numero = 3;
        //mostrarSequenciaCrescente(numero); // mostrar a sequencia de 0 ate numero
        //mostrarSequenciaDecrescente(numero);
        //mostrarSequenciaDecrescenteR(numero);

        //mostrarIntervalo(3,6);
        //mostrarIntervaloR(3, 6);

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(20);
        lista.add(30);
        lista.add(40);

        //mostrarLista(lista);
        //mostrarListaR(lista, lista.size());
        mostarParesListaR(lista, lista.size());
        ///substituirR(lista, lista.size(), 30, 100);
    }

}