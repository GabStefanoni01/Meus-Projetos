package Empregados;

public class Empregado {
    private double salario;
    private double comissao;
    private double bonus;
    private int qtd_horas;
    private double valorHora;
    
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora( double valorHora) {
        this.valorHora = valorHora;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public int getQtd_horas() {
        return qtd_horas;
    }
    public void setQtd_horas(int qtd_horas) {
        this.qtd_horas = qtd_horas;
    }

    
}
