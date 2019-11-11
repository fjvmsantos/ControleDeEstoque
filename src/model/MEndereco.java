package model;

import enums.TipoFornecedorCliente;
import enums.TipoPessoa;

public class MEndereco {

    private int id;
    private String cep;
    private String logradouro;
    private String numero;
    private String bairro;
    private String complemento;
    private String ufLog;
    private String cidade;
    private MPessoaJuridica pessoaJuridica;
    private MPessoaFisica pessoaFisica;
    private TipoPessoa tipoPessoa;
    private TipoFornecedorCliente tipoFornecedor;

    public MEndereco() {
    }

    public MEndereco(int id, String cep, String logradouro, String numero,
            String bairro, String complemento, String ufLog, String cidade,
            MPessoaJuridica pessoaJuridica, MPessoaFisica pessoaFisica,
            TipoPessoa tipoPessoa, TipoFornecedorCliente tipoFornecedor) {

        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.ufLog = ufLog;
        this.cidade = cidade;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getUfLog() {
        return ufLog;
    }

    public void setUfLog(String ufLog) {
        this.ufLog = ufLog;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
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
        return "MEndereco{" + "id=" + id + ", cep=" + cep + ", logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", complemento=" + complemento + ", ufLog=" + ufLog + ", cidade=" + cidade + ", pessoaJuridica=" + pessoaJuridica + "\npessoaFisica=" + pessoaFisica + ", tipoPessoa=" + tipoPessoa + ", tipoFornecedor=" + tipoFornecedor + '}';
    }

}
