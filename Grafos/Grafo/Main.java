//Fazer uma classe
//Ler o csv
//Adcionasse os vérticies localizados na lista de vérticies(sem duplicação)
//


import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> vertices = new ArrayList<>();
        //populando vertices
        // vertices.add("a");
        // vertices.add("b");
        // vertices.add("c");
        // vertices.add("d");
        // vertices.add("e");

        //TRABALHO AQUI
            //ler quivo csv, chamando mapa.csv do tipo
            // a,b
            // b,c
            // b,d
            // d,a
            // d,b
            // d,c
            // e,d
        //extrar os vértices presentes no csv e aciona-los na lista de vértices(lembrar de ordenar)


        Grafo gAssimetrico = new Grafo(vertices);

        //Ambos métodos funcionam

        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("a"), gAssimetrico.pegarIndice("b"));
        //a,b

        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("b"), gAssimetrico.pegarIndice("c"));
        //b,c

        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("b"), gAssimetrico.pegarIndice("d"));
        //b,d

        gAssimetrico.inserirAresta(2,4);
        //c,e

        gAssimetrico.inserirAresta(3,0);
        //d,a

        gAssimetrico.inserirAresta(3,1);
        //d,b

        gAssimetrico.inserirAresta(3,2);
        //d,c

        gAssimetrico.inserirAresta(4,3);
        //e,d 
        
        gAssimetrico.mostrarMatriz();
        
        System.out.println();

        gAssimetrico.mostrarGrafo();
    }
}
