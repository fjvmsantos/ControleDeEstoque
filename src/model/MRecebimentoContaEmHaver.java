package model;

import java.util.Date;

public class MRecebimentoContaEmHaver {

    private int idLancamento;
    private int numeroCompra;
    private int clientePf;
    private int clientePj;
    private double valorDaConta;
    private double valorPago;
    private double saldoDevedor;
    private Date dataMovimento;

    public MRecebimentoContaEmHaver() {
    }

    public MRecebimentoContaEmHaver(int idLancamento, int numeroCompra, int clientePf, int clientePj, double valorDaConta, double valorPago, double saldoDevedor, Date dataMovimento) {
        this.idLancamento = idLancamento;
        this.numeroCompra = numeroCompra;
        this.clientePf = clientePf;
        this.clientePj = clientePj;
        this.valorDaConta = valorDaConta;
        this.valorPago = valorPago;
        this.saldoDevedor = saldoDevedor;
        this.dataMovimento = dataMovimento;
    }

    public int getIdLancamento() {
        return idLancamento;
    }

    public void setIdLancamento(int idLancamento) {
        this.idLancamento = idLancamento;
    }

    public int getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(int numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public int getClientePf() {
        return clientePf;
    }

    public void setClientePf(int clientePf) {
        this.clientePf = clientePf;
    }

    public int getClientePj() {
        return clientePj;
    }

    public void setClientePj(int clientePj) {
        this.clientePj = clientePj;
    }

    public double getValorDaConta() {
        return valorDaConta;
    }

    public void setValorDaConta(double valorDaConta) {
        this.valorDaConta = valorDaConta;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public void setSaldoDevedor(double saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }

    public Date getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Date dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    @Override
    public String toString() {
        return "MRecebimentoContaEmHaver{" + "idLancamento=" + idLancamento + ", numeroCompra=" + numeroCompra + ", clientePf=" + clientePf + ", clientePj=" + clientePj + ", valorDaConta=" + valorDaConta + ", valorPago=" + valorPago + ", saldoDevedor=" + saldoDevedor + ", dataMovimento=" + dataMovimento + '}';
    }

}
