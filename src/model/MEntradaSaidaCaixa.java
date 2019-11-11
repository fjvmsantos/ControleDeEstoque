package model;

import java.util.Date;

public class MEntradaSaidaCaixa {

    private double valorEntrada;
    private double valorRetirada;
    private double saldo;
    private Date dataMovimento;
    private String descricao;

    public MEntradaSaidaCaixa() {
    }

    public MEntradaSaidaCaixa(double valorEntrada, double valorRetirada, double saldo, Date dataMovimento, String descricao) {
        this.valorEntrada = valorEntrada;
        this.valorRetirada = valorRetirada;
        this.saldo = saldo;
        this.dataMovimento = dataMovimento;
        this.descricao = descricao;
    }

    public double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public double getValorRetirada() {
        return valorRetirada;
    }

    public void setValorRetirada(double valorRetirada) {
        this.valorRetirada = valorRetirada;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = getValorEntrada() - getValorRetirada();
    }

    public Date getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Date dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "MEntradaSaidaCaixa{" + "valorEntrada=" + valorEntrada + ", valorRetirada=" + valorRetirada + ", saldo=" + saldo + ", dataMovimento=" + dataMovimento + ", descricao=" + descricao + '}';
    }

}
