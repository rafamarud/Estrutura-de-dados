#include <iostream>
#include <cstdlib>
#include <ctime>
#include <algorithm>
#include <vector> //para a lista

using namespace std;

/**
 * @brief método que popula uma lista com números inteiros aleatorórios dentro de uma faixa
 * 
 * @param lista  contém os números aleatórios gerados
 * @param quantidadeNumeros contém quantos números se deseja inserir na lista
 * @param faixaInicial contém o número inicial da faixa
 * @param faixaFinal contém o número final da faixa
 */

void popularlistaAleatoria(vector<int> &lista, int quantidadeNumeros, int faixaInicial, int faixaFinal){
    //observe o simbolo & na frente da variável lista. Isso acontece pq em C++ se houver alteração na lista, é
    //preciso utilizar o símbolo de endereçamento &
    srand(time(NULL));
    int numeroSorteado;
    for(int i = 0; i < quantidadeNumeros; i++){
        numeroSorteado = faixaInicial + (rand() % faixaFinal);
        lista.push_back(numeroSorteado);
    }
}
/**
 * @brief método que exibe o contéudo de uma lista de inteiros, elemento abaixo de elemento
 * 
 * @param lista contém os números inteiros
 */

void exibirLista(vector<int> lista){
    for(int i = 0 ; i < lista.size(); i++){
        cout << lista[i] << "\n";
    }
    cout <<"---------------""\n";
    cout << "Total de elementos: "<< lista.size() << "\n";

}
/**
 * @brief método que copia os nuúmeros da lista origem para a lista destino, exceto os repetidos
 * 
 * @param listaOrigem  contém os números originais da lista
 * @param listaDestino contém os números copiaos da lista original sem ser repetidos
 */

void copiarlistasemReplicados(vector<int> listaOrigem, vector<int> &listaDestino){
    for (int item : listaOrigem){
        if (find(listaDestino.begin(), listaDestino.end(), item) == listaDestino.end()){
            listaDestino.push_back(item);
        }
    }
}      
    

 
    

