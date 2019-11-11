package model;

import enums.TipoFornecedorCliente;
import enums.TipoPessoa;

public class MDadoComplementar {

    private int id;
    private String telefone;
    private String celular;
    private String email;
    private String observacao;
    private MPessoaJuridica pessoaJuridica;
    private MPessoaFisica pessoaFisica;
    private TipoPessoa tipoPessoa;
    private TipoFornecedorCliente tipoFornecedor;

    public MDadoComplementar() {
    }

    public MDadoComplementar(int id, String telefone, String celular,
            String email, String observacao, MPessoaJuridica pessoaJuridica,
            MPessoaFisica pessoaFisica, TipoPessoa tipoPessoa,
            TipoFornecedorCliente tipoFornecedor) {

        this.id = id;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.observacao = observacao;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
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
        return "MDadoComplementar{" + "id=" + id + ", telefone=" + telefone + ", celular=" + celular + ", email=" + email + ", observacao=" + observacao + ", pessoaJuridica=" + pessoaJuridica + ", pessoaFisica=" + pessoaFisica + ", tipoPessoa=" + tipoPessoa + ", tipoFornecedor=" + tipoFornecedor + '}';
    }

}
