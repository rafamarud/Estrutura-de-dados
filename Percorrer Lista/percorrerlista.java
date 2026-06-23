import java.util.Iterator;
import java.util.ArrayList;
public class percorrerlista{

    public static void main(String[] args) {
        ArrayList<Integer> lista = new percorrerlista();

       lista.add(45);
       lista.add(9);
       lista.add(20);
       lista.add(12);

        //PERCURSO EM LISTA
        
        //VIA INDICE
        System.out.println("Percorrend via indice...");
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i)); //lista[i];
        }

        //PERCURSO VIA OBJETO
        System.out.println("Percorrendo via objeto...");
        for(int p : lista) {
            System.out.println(p);
        }
        //PERCUSO POR UM ITERADOR
        System.out.println("Percorrer por um iterador...");
        Iterator<Integer> it = lista.Iterador();
        while (it.hasNext()) {
            int num = it.next();
            System.out.println(num);
        }
    }

        
        
}