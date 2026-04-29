class aluno:
    def __init__(self, nome, curso, sexo, ano):

        self.nome =  nome
        self.curso = curso
        self.sexo = sexo
        self.ano = ano

    
    def __str__(self):
        return f"Nome:{self.nome}. Curso:{self.curso}. Sexo:{self.sexo}. Ano de ingresso:{self.ano}"
    
    
    def ordenar_por_ano(lista):
        return sorted(lista, key=lambda a: a.ano)

    
    def ordenar_por_nome(lista):
        return sorted(lista, key=lambda a: a.nome)

    
    def buscar_por_nome(lista, nome):
        for a in lista:
            if a.nome.strip().lower() == nome.strip().lower():
                return a
        return None




    