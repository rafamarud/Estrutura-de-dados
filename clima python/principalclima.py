from clima import clima

lista = []

linha = "2020, Janeiro, Quente, muita"
dadosLinha = linha.split(",")

obj_clima = clima(dadosLinha[0], dadosLinha[1], dadosLinha[2], dadosLinha[3])

if obj_clima not in lista:
    lista.append(obj_clima)

linha = "2020, Janeiro, Frio, pouca" 
dadosLinha = linha.split(",")

obj_clima = clima(dadosLinha[0], dadosLinha[1], dadosLinha[2], dadosLinha[3])

if obj_clima not in lista:
    lista.append(obj_clima)


for c in lista:
    print(c)