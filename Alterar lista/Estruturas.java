import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Comparator;

public class Estruturas {
    
public static void removerProcessos(ArrayList<Processo> lista){
        Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite uma palavra para remocao: ");
    String descricao = teclado.nextLine().toUpperCase();

    Iterador<Processo> it = lista.iterador();
    while (it.haxNext()){
        Processo p = it.next();
        if (p.descricao.contains(descricao)){
            it.remove(); //remove de forma segura
        }
    }
}
public static void gerarProcessos(ArrayList<Processo> lista){
        int id;
        String descricao;
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();
        Processo tmp;

        while (true) {
        id = gerador.nextInt(5);
        System.out.println("Descricao do precesso: ");
        descricao = teclado.nextLine().toUpperCase();
        if(descricao.equals("SAIR")) {
            break;
        }
        tmp = new Processo(id, descricao);
        if (!lista.contains(tmp)){
            lista.add(tmp);
        }
    }
}    
public static void exibirProcessos(ArrayList<Processo> lista){
System.out.println("Quantidade de processos: "+ lista.size());


         lista.sort((p1, p2) -> p1.descricao.compareTo(p2.descricao));

        //System.out.println(lista);
        for(Processo p : lista) {
                System.out.println(p);
        }
}
public static void localizarProcessos(ArrayList<Processo> lista){
 //rotina para pesquisar parte da descricao na lista de processos
    String descricao;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite palavra ou expressao que deseja lovalizar: ");
    descricao = teclado.nextLine().toUpperCase();

    for (Processo p : lista) {
        if (p.descricao.contains(descricao)) {
                    System.out.println(p);
        }
     }

}





    public static void main(String[] args){
        ArrayList<Processo> lista = new ArrayList<>();
        
        Estruturas.gerarProcessos(lista);
        Estruturas.exibirProcessos(lista);
        Estruturas.localizarProcessos(lista);
        Estruturas.removerProcessos(lista);    
        Estruturas.exibirProcessos(lista);

     }
    }

