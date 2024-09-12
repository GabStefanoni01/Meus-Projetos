class Dividir():
    def dividir(self, a, n):
        divr = a/n
        for n in range (5):
            if n == 0:
                print("Não é possível dividir por zero.")
                n = int(input("digite o numero (n)"))
            divn /= n
        return divr
