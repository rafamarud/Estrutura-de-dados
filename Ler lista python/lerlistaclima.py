from clima import clima

lista = []
nome_base = "base.csv"

try:

    #abrindo o arquivo em modo leitura
    leitor = open(nome_base, "r",encoding="utf-8")

    for linha in leitor:    
        dados_linha = linha.split(",")
        obj_clima = clima(dados_linha[0], dados_linha[1], dados_linha[2], dados_linha[3])
        if obj_clima not in lista:
            lista.append(obj_clima)

    print("TODOS OS REGISTROS")
    for item in lista:
        print(item)

    print("==============================================================================")
    print("\n")
    print("REGISTROS COM MAIOR PRECIPITACAO")
    print("\n")

    for item in lista:
        if item.precipitacao.strip() == "muita":
            print(item)

    #fechando o arquivo
    leitor.close()

except Exception as e:
    print("Ocoreu algum erro...",e)