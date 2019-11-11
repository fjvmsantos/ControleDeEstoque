package model;

import enums.TipoPagamento;
import enums.TipoStatusDaConta;
import java.util.Date;

public class MFormaPagamento {

    private int id;
    private int num_venda;
    private TipoPagamento tipoPagamento;
    private double total_venda;
    private double valorPorFormaPg;
    private MPessoaFisica pessoaFisica;
    private MPessoaJuridica pessoaJuridica;
    private TipoStatusDaConta statusDaConta;
    private Date dataVenda;

    public MFormaPagamento() {
    }

    public MFormaPagamento(int id, int num_venda, TipoPagamento tipoPagamento, double total_venda, double valorPorFormaPg, MPessoaFisica pessoaFisica, MPessoaJuridica pessoaJuridica, TipoStatusDaConta statusDaConta, Date dataVenda) {
        this.id = id;
        this.num_venda = num_venda;
        this.tipoPagamento = tipoPagamento;
        this.total_venda = total_venda;
        this.valorPorFormaPg = valorPorFormaPg;
        this.pessoaFisica = pessoaFisica;
        this.pessoaJuridica = pessoaJuridica;
        this.statusDaConta = statusDaConta;
        this.dataVenda = dataVenda;
    }

    public int getNum_venda() {
        return num_venda;
    }

    public void setNum_venda(int num_venda) {
        this.num_venda = num_venda;
    }

    public double getTotal_venda() {
        return total_venda;
    }

    public void setTotal_venda(double total_venda) {
        this.total_venda = total_venda;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public double getValorPorFormaPg() {
        return valorPorFormaPg;
    }

    public void setValorPorFormaPg(double valorPorFormaPg) {
        this.valorPorFormaPg = valorPorFormaPg;
    }

    public MPessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(MPessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public MPessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(MPessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public TipoStatusDaConta getStatusDaConta() {
        return statusDaConta;
    }

    public void setStatusDaConta(TipoStatusDaConta statusDaConta) {
        this.statusDaConta = statusDaConta;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MFormaPagamento{" + "id=" + id + ", num_venda=" + num_venda + ", tipoPagamento=" + tipoPagamento + ", total_venda=" + total_venda + ", valorPorFormaPg=" + valorPorFormaPg + ", pessoaFisica=" + pessoaFisica + ", pessoaJuridica=" + pessoaJuridica + ", statusDaConta=" + statusDaConta + ", dataVenda=" + dataVenda + '}';
    }

}
