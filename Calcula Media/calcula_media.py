class CalculaMediaAlunos():
    """
    Programa que calcula a média de n alunos
    """
 
    def calculaPorNumeroAlunos(nrAlunos):
        """
        Função recebe um numero de alunos e faz os calculos das médias e a exibição
        """
        contadorAprovados = 0
        contadorExame = 0
        contadorReprovados = 0
        somaMedia = 0
 
        for i in range(0,nrAlunos):
            nota1 = float(input("Digite a primeira nota do aluno " + str(i)+ " :"))
            nota2 = float(input("Digite a segunda nota do aluno " + str(i)+ " :"))
            mediaAluno = (nota1 + nota2) / 2
            somaMedia += mediaAluno
            print("Media do Aluno" + str(i) + "=" + str(mediaAluno))
            if mediaAluno <= 3.0:
                print("Aluno " + str(i) + " Reprovado")
            if mediaAluno > 3.0 and mediaAluno <= 7.0:
                print("Aluno " + str(i) + " Exame")
            if mediaAluno > 7.0:
                print("ALuno " + str(i) + " Aprovado")
        mediaTotal = somaMedia / nrAlunos
        print ("Media de todos os alunos: " + str(mediaTotal))