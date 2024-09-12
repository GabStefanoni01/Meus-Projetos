class CalculaMediaAlunos():
    """
    Programa que calcula a média de n alunos
    """
    nrAlunos=0
    nrNotas = 0
    mediaClasse = 0.0

    def calculaPorNumeroAlunos(self,nrAlunos):
        """
        Função que recebe um numero de alunos e 
        faz o calculo das médias e a exibição
        """
        self.nrAlunos = nrAlunos
        contadorAprovados=0
        contadorExame=0
        contadorReprovados=0
        somaMedias=0
        for i in range(0,nrAlunos):
            nota1 = float(input("Digite a primeira nota do aluno " + str(i) +":"))
            nota2 = float(input("Digite a segunda nota do aluno " + str(i) +":"))
            mediaAluno = (nota1 + nota2) / 2
            somaMedias+=mediaAluno
            print("Média do aluno " + str(i) + "=" + str(mediaAluno))
            if mediaAluno <= 3.0:
                print("Aluno " + str(i) + " reprovado")
            if mediaAluno > 3.0 and mediaAluno <= 7.0:
                print("Aluno " + str(i) + " exame")
            if mediaAluno > 7.0:
                print("Aluno " + str(i) + " aprovado")
        mediaTotal = somaMedias / nrAlunos
        print("Média de todos os alunos: " + str(mediaTotal))
        self.mediaClasse = mediaTotal

    def calculaPorNumeroAlunosENrNotas(self,nrAlunos,nrNotas):
        self.nrAlunos = nrAlunos
        self.nrNotas = nrNotas
        contadorAprovados=0
        contadorExame=0
        contadorReprovados=0
        somaMedias=0
        for i in range(0,nrAlunos):
            somaNotas = 0.0
            for j in range(0,nrNotas):
                nota = float(input("Digite a nota do" + str(j+1) + "do aluno " + str(i+1) +":"))
                somaNotas+=nota
            mediaAluno = somaNotas / nrNotas
            somaMedias+=mediaAluno
            print("Média do aluno " + str(i) + "=" + str(mediaAluno))
            if mediaAluno <= 3.0:
                contadorReprovados+=1
                print("Aluno " + str(i) + " reprovado")
            if mediaAluno > 3.0 and mediaAluno <= 7.0:
                contadorExame+=1
                print("Aluno " + str(i) + " exame")
            if mediaAluno > 7.0:
                contadorAprovados+=1
                print("Aluno " + str(i) + " aprovado")
        print("Foram reprovados " +str(contadorReprovados) + "Alunos")
        print("Foram aprovados " +str(contadorAprovados) + "Alunos")
        print(+str(contadorExame) + "é o número de alunos em exame")
        mediaTotal = somaMedias / nrAlunos
        print("Média de todos os alunos: " + str(mediaTotal))
        

        pass