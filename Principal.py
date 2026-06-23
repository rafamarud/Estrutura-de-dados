from Glicemia import Glicemia
from minhasfuncoes import popular_lista_arquivo, exibir_lista,calcular_media,calcular_mediana

lista = []
nome_base = "../dados.csv"

popular_lista_arquivo(lista, nome_base)

exibir_lista(lista)

media = calcular_media(lista)

print("Media glicêmica: ",media)

mediana = calcular_mediana(lista)
print("Mediana glicêmica: ", mediana)