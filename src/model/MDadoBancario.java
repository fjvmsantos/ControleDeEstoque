package model;

import enums.TipoFornecedorCliente;
import enums.TipoPessoa;

public class MDadoBancario {

    private int id;
    private String banco;
    private String tpConta;
    private String ag;
    private String op;
    private String conta;
    private MPessoaJuridica pessoaJuridica;
    private MPessoaFisica pessoaFisica;
    private TipoPessoa tipoPessoa;
    private TipoFornecedorCliente tipoFornecedor;

    public MDadoBancario() {
    }

    public MDadoBancario(int id, String banco, String tpConta, String ag,
            String op, String conta, MPessoaJuridica pessoaJuridica,
            MPessoaFisica pessoaFisica, TipoPessoa tipoPessoa,
            TipoFornecedorCliente tipoFornecedor) {

        this.id = id;
        this.banco = banco;
        this.tpConta = tpConta;
        this.ag = ag;
        this.op = op;
        this.conta = conta;
        this.pessoaJuridica = pessoaJuridica;
        this.pessoaFisica = pessoaFisica;
        this.tipoPessoa = tipoPessoa;
        this.tipoFornecedor = tipoFornecedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getTpConta() {
        return tpConta;
    }

    public void setTpConta(String tpConta) {
        this.tpConta = tpConta;
    }

    public String getAg() {
        return ag;
    }

    public void setAg(String ag) {
        this.ag = ag;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public MPessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(MPessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public MPessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(MPessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public TipoFornecedorCliente getTipoFornecedor() {
        return tipoFornecedor;
    }

    public void setTipoFornecedor(TipoFornecedorCliente tipoFornecedor) {
        this.tipoFornecedor = tipoFornecedor;
    }

    @Override
    public String toString() {
        return "MDadoBancario{" + "id=" + id + ", banco=" + banco + ", tpConta=" + tpConta + ", ag=" + ag + ", op=" + op + ", conta=" + conta + ", pessoaJuridica=" + pessoaJuridica + ", pessoaFisica=" + pessoaFisica + ", tipoPessoa=" + tipoPessoa + ", tipoFornecedor=" + tipoFornecedor + '}';
    }

}
