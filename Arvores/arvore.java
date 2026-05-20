import java.util.TreeSet;

public class arvore {
    public static void main(String[] args){
        
        TreeSet<String> arvore = new TreeSet<>();
        arvore.add("Laranja");
        arvore.add("Banana");
        arvore.add("Maça");
        arvore.add("Uva");
        arvore.add("Abacaxi");
        arvore.add("Morango");
        arvore.add("Pera");
    
    System.out.println("Elementos na Treeset: ");
    for (String fruta: arvore) {
        System.out.println(fruta);
    }

    if (arvore.contains("Caqui")){
        System.out.println("A TreeSet contém Caqui.");
    }else{
        System.out.println("A TreeSet não contém Caqui.");
    }

    arvore.clear();

    System.out.println("Tamanho da TreeSet após limpar: " +arvore.size());
    }
}