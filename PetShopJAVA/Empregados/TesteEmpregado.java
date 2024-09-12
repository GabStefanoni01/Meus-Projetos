package Empregados;

import java.util.Random;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado[] empregados = new Empregado[10];
        Random rand = new Random();

        for (int i = 0;i<empregados.length;i++){
            int tipo = rand.nextInt(4)+1;
            Empregado empregado = new Empregado();
            empregado.setTipoEmpregado(tipo);
            if (tipo == 1) {
                double salario = rand.nextDouble()*2000;
                empregado.setSalario(salario);
            }else if ( (tipo ==2)) {
                empregado.setSalario(rand.nextDouble()*1200 + 800);
                empregado.setComissao(empregado.getSalario()*.20);
                
            }else if ( (tipo ==3)) {
                empregado.setSalario(rand.nextDouble()*1200 + 800);
                empregado.setComissao(empregado.getSalario()*.10);
                empregado.setBonus(empregado.getSalario()*3);
        } else if ( (tipo ==4)) {
            empregado.setValorHora(rand.nextDouble() *30 + 10);
            empregado.setQtd_horas(rand.nextInt(8));

            }   
            empregados[i]=empregado;
        }
    }
}
