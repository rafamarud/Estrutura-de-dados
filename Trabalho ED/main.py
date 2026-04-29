from aluno import aluno

lista = []
nome_base = "alunos.csv"

try:
    leitor = open(nome_base, "r", encoding="utf-8")

    for linha in leitor:
        dados_aluno = linha.split(",")
        obj_aluno = aluno(dados_aluno[0], dados_aluno[1], dados_aluno[2], dados_aluno[3])
        if obj_aluno not in lista:
            lista.append(obj_aluno)

    leitor.close()

    
    print("TODOS OS REGISTROS (ordenados por ano):")
    for item in aluno.ordenar_por_ano(lista):
        print(item)

    print("=" * 60)

    
    print("TODOS OS REGISTROS (ordenados por nome):")
    for item in aluno.ordenar_por_nome(lista):
        print(item)

    print("=" * 60)

    
    nome_busca = input("Digite o nome do aluno que deseja buscar: ")
    resultado = aluno.buscar_por_nome(lista, nome_busca)

    if resultado:
        print("Aluno encontrado:")
        print(resultado)
    else:
        print("Aluno não encontrado.")

except Exception as e:
    print("Ocorreu algum erro...", e)