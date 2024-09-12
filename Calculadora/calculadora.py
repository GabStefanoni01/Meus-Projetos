from somar import Somar
from subtrair import Subtrair
from multiplicar import Multiplicar
from dividir import Dividir

class Calculadora():
#Feito por GabrielStefanoni e Victor jose
               def calcular():
                    print("escolha a operação")
                    print("1, para somar")
                    print("2, para subtrair")
                    print("3, para multiplicar")
                    print("4, para dividir")
                    print("5, para sair")
                    escolha = int(input("escolha uma operação: "))
                    a = float(input("digite o valor de a: "))

                    if escolha == 5:
                         print ("acabou o programa")
                    elif escolha == 1:
                        n = int(input("digite o numero (n)"))
                        somar= Somar()
                        print (somar.somar(a, n))
                    elif escolha == 2:
                        n = int(input("digite o numero (n)"))
                        Subtrair().subtrair
                        return Subtrair
                    elif escolha == 3:
                        n = int(input("digite o numero (n)"))
                        Multiplicar().multiplicar
                        return Multiplicar
                    elif escolha == 4:
                        n = int(input("digite o numero (n)"))
                        Dividir().dividir
                        return Dividir

if __name__ == "__main__":
      Calculadora.calcular()
                        