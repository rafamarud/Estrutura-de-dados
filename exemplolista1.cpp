#include <iostream>
#include <cstdlib>
#include <string>

#define TAMANHO 10

using namespace std;

#include "Utilidades.h"

int main(){
    string vetorNomes[TAMANHO];
    inicizalizar(vetorNomes);
    int totalNonesInseridos = 0;

    exibir(vetorNomes);

    

    totalNonesInseridos = inserir("Davi", vetorNomes, totalNonesInseridos);
    totalNonesInseridos = inserir("Edurado", vetorNomes, totalNonesInseridos);
    totalNonesInseridos = inserir("Gabriel", vetorNomes, totalNonesInseridos);

    if(totalNonesInseridos > 0){
        exibir(vetorNomes);
    } else {
        cout << "Vetor de nomes vazio\n";
    }

    string nome;
    cout << "Digite um nome: ";
    getline(cin ,nome);

    int posicao;
    posicao = ondeEsta(nome, vetorNomes);

    if(posicao != -1){
        vetorNomes[posicao] = "#";
        totalNonesInseridos--;
        cout << "O removido esta na posicao" << posicao << "\n";
    }
    exibir(vetorNomes);

    return 1;
}