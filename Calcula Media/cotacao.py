
cotacao_dolar = float(input("Digite a cotação atual do dólar em reais: "))


quantidade_dolares = float(input("Digite a quantidade de dólares: "))


valor_em_reais = quantidade_dolares * cotacao_dolar


print(f"{quantidade_dolares} dólares equivalem a {valor_em_reais:.2f} reais, com a cotação do dólar a {cotacao_dolar:.2f} reais por dólar.")