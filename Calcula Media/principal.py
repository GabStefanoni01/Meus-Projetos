from calcula_media_alunos import CalculaMediaAlunos

if __name__ == "__main__":
    nrAlunos = int(input("Digite o número de alunos"))
    """calculaMedia = CalculaMediaAlunos()
    calculaMedia.calculaPorNumeroAlunos(nrAlunos)
    print(calculaMedia.mediaClasse)
    print(calculaMedia.nrAlunos)"""
    CalculaMedia = CalculaMediaAlunos()
    CalculaMedia.calculaPorNumeroAlunosENrNotas(3,3)

