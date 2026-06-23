import java.util.ArrayList;

public class Grafo {
    int matrizADJ[][];
    int qtdVertices;
    ArrayList<String> vertices;

    /**
     * construtor
     * @param qtdVertices para iniciar a quantidade de linhas e colunas da matriz
     */
    public Grafo(ArrayList<String> vertices){
        this.vertices = new ArrayList<>();
        this.vertices.addAll(vertices);
        this.qtdVertices = vertices.size();
        this.matrizADJ = new int[this.qtdVertices][this.qtdVertices];

        //iniciaçizar com 0 a matriz que representa o grafo
        for(int i = 0; i < qtdVertices; i++){
            for(int j = 0; j < qtdVertices; j++){
                this.matrizADJ[i][j] = 0;
            }
        }
    }

    void mostrarMatriz(){
        
        System.out.print("   "); 
        
        
        for(String v : this.vertices){
            System.out.print(v + "    ");
        }
        System.out.println();

        
        for(int i = 0; i < qtdVertices; i++){
            // Nome do vértice na linha + 2 espaços
            System.out.print(this.vertices.get(i) + "  ");
            
            
            for(int j = 0; j < qtdVertices; j++){
                System.out.print(matrizADJ[i][j] + "    ");
            }
            System.out.println();
        }
    }

    void mostrarGrafo(){
        for (int i = 0; i < this.qtdVertices; i++){
            System.out.print(this.vertices.get(i) + ": ");
            for(int j = 0; j < this.qtdVertices; j++){
                if(this.matrizADJ[i][j] != 0){
                    System.out.print(this.vertices.get(j) + "  ");
                }
            }
            System.out.println();
        }
    }
    
    /**
     * dado uma origem e destino é definida um aresta
     * @param origem origem representa a linha
     * @param destino destino representa a coluna
     */
    void inserirAresta(int origem, int destino){
        // CORREÇÃO: Ajustado de '=' para '==' para fazer a comparação correta
        if (this.matrizADJ[origem][destino] == 0){
            this.matrizADJ[origem][destino] = 1;
        }
    }
    /**
     * retorna o indice na lista de vertices de um vertice
     * @param v
     * @return
     */

    int pegarIndice(String v){
        return this.vertices.indexOf(v);
    }
}