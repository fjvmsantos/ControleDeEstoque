package model;

import enums.TipoFornecedorCliente;
import java.util.Date;

public class MPessoaFisica {

    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String orgaoExpedidor;
    private Date dataExpedicao;
    private String ufExpedicao;
    private Date dataNascimento;
    private String nomeMae;
    private String estadoCivil;
    private TipoFornecedorCliente tipoFornecedor;

    public MPessoaFisica() {
    }

    public MPessoaFisica(int id, String nome, String cpf, String rg,
            String orgaoExpedidor, Date dataExpedicao, String ufExpedicao,
            Date dataNascimento, String nomeMae, String estadoCivil,
            TipoFornecedorCliente tipoFornecedor) {

        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.orgaoExpedidor = orgaoExpedidor;
        this.dataExpedicao = dataExpedicao;
        this.ufExpedicao = ufExpedicao;
        this.dataNascimento = dataNascimento;
        this.nomeMae = nomeMae;
        this.estadoCivil = estadoCivil;
        this.tipoFornecedor = tipoFornecedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaoExpedidor() {
        return orgaoExpedidor;
    }

    public void setOrgaoExpedidor(String orgaoExpedidor) {
        this.orgaoExpedidor = orgaoExpedidor;
    }

    public Date getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(Date dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    public String getUfExpedicao() {
        return ufExpedicao;
    }

    public void setUfExpedicao(String ufExpedicao) {
        this.ufExpedicao = ufExpedicao;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public TipoFornecedorCliente getTipoFornecedor() {
        return tipoFornecedor;
    }

    public void setTipoFornecedor(TipoFornecedorCliente tipoFornecedor) {
        this.tipoFornecedor = tipoFornecedor;
    }
    
    @Override
    public String toString() {
        return nome;
    }

}
