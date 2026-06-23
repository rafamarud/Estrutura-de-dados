#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
    
    char nome[50];
    int boulus; 
    int QuantidadeInsulinaMaxima; 
    int carboidrato;
    int QuantidadeInsulina;
    int QuantidadeCarboidratoMaxima;
    int RestanteInsulinaDia;
    int RestanteCarboidratoDia;

    printf("Informe seus dados\n");

    printf("Nome: ");
    gets(nome);

    printf("Boulus Alimentar: ");
    scanf("%i",&boulus);

    printf("Carboidrato Ingerido: ");
    scanf("%i",&carboidrato);

    printf("Quantidade Insulina Maxima: ");
    scanf("%i",&QuantidadeInsulinaMaxima);

 QuantidadeInsulina = (int)carboidrato / boulus;
 QuantidadeCarboidratoMaxima = boulus * QuantidadeInsulinaMaxima;
 RestanteInsulinaDia = QuantidadeInsulinaMaxima - QuantidadeInsulina;
 RestanteCarboidratoDia = QuantidadeCarboidratoMaxima - carboidrato;

 printf("Quantidade de Insulina necessaria: %i\n", QuantidadeInsulina);
 printf("Quantidade Maxima de Carboidrato: %i\n", QuantidadeCarboidratoMaxima);
 printf("Restante Insulina do dia: %i\n", RestanteInsulinaDia);
 printf("Restante Carboidrato do dia: %i\n", RestanteCarboidratoDia);





    return 0;
}