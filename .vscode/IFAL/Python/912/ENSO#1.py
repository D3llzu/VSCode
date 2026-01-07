class Pessoa:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    def apresentar(self):
        print(f"\n\nOlá, meu nome é {self.nome} e tenho {self.idade} anos.")


class Atleta:
    def __init__(self, esporte, tempoTreino):
        self.esporte = esporte
        self.tempoTreino = tempoTreino

    def treinar(self):
        print(f"Estou treinando {self.tempoTreino} horas por semana no esporte {self.esporte}.")

class AlunoAtleta(Pessoa, Atleta):
    def __init__(self, nome, idade, esporte, tempoTreino, matricula, curso):
        Pessoa.__init__(self, nome, idade)
        Atleta.__init__(self, esporte, tempoTreino)
        self.matricula = matricula
        self.curso = curso

    def mostrarDados(self):
        print("\nDados do aluno-atleta:")
        print(f"Nome: {self.nome}")
        print(f"Idade: {self.idade}")
        print(f"Esporte: {self.esporte}")
        print(f"Treino semanal: {self.tempoTreino}h")
        print(f"Matrícula: {self.matricula}")
        print(f"Curso: {self.curso}")

nome = input("Digite o nome: ")
idade = int(input("Digite a idade: "))
esporte = input("Digite o esporte: ")
tempoTreino = int(input("Horas de treino por semana: "))
matricula = input("Digite a matrícula: ")
curso = input("Digite o curso: ")

aluno = AlunoAtleta(nome, idade, esporte, tempoTreino, matricula, curso)
aluno.apresentar()
aluno.treinar()
aluno.mostrarDados()