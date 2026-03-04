#include <iostream>
#include <cstdlib>
#include <algorithm>
#include <ctime>
#include <vector> //para a lista

using namespace std;

#include "biblioteca.h"

int main(){
    vector<int> listaNumeros;
    int quantidadeNumeros;
    int faixaInicial = 10, faixaFinal = 50;
    vector<int> listaResultado;

    cout << "Digite quantos numeros  quer gerar: ";
    cin >> quantidadeNumeros;

    popularlistaAleatoria(listaNumeros, quantidadeNumeros, faixaInicial, faixaFinal);
    exibirLista(listaNumeros);

    copiarlistasemReplicados(listaNumeros, listaResultado);
    exibirLista(listaResultado);

    return 1;
}