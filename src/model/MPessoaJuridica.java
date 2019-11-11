package model;

import enums.TipoFornecedorCliente;
import java.util.Date;

public class MPessoaJuridica {

    private int id;
    private String cnpj;
    private Date abertura;
    private String nomeEmpresarial;
    private String tituloEstabelecimento;
    private String incricaoMunicipal;
    private String incricaoEstadual;
    private TipoFornecedorCliente tipoFornecedor;

    public MPessoaJuridica() {
    }

    public MPessoaJuridica(int id, String cnpj, Date abertura,
            String nomeEmpresarial, String tituloEstabelecimento,
            String incricaoMunicipal, String incricaoEstadual,
            TipoFornecedorCliente tipoFornecedor) {

        this.id = id;
        this.cnpj = cnpj;
        this.abertura = abertura;
        this.nomeEmpresarial = nomeEmpresarial;
        this.tituloEstabelecimento = tituloEstabelecimento;
        this.incricaoMunicipal = incricaoMunicipal;
        this.incricaoEstadual = incricaoEstadual;
        this.tipoFornecedor = tipoFornecedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Date getAbertura() {
        return abertura;
    }

    public void setAbertura(Date abertura) {
        this.abertura = abertura;
    }

    public String getNomeEmpresarial() {
        return nomeEmpresarial;
    }

    public void setNomeEmpresarial(String nomeEmpresarial) {
        this.nomeEmpresarial = nomeEmpresarial;
    }

    public String getTituloEstabelecimento() {
        return tituloEstabelecimento;
    }

    public void setTituloEstabelecimento(String tituloEstabelecimento) {
        this.tituloEstabelecimento = tituloEstabelecimento;
    }

    public String getIncricaoMunicipal() {
        return incricaoMunicipal;
    }

    public void setIncricaoMunicipal(String incricaoMunicipal) {
        this.incricaoMunicipal = incricaoMunicipal;
    }

    public String getIncricaoEstadual() {
        return incricaoEstadual;
    }

    public void setIncricaoEstadual(String incricaoEstadual) {
        this.incricaoEstadual = incricaoEstadual;
    }

    public TipoFornecedorCliente getTipoFornecedor() {
        return tipoFornecedor;
    }

    public void setTipoFornecedor(TipoFornecedorCliente tipoFornecedor) {
        this.tipoFornecedor = tipoFornecedor;
    }

    @Override
    public String toString() {
        return nomeEmpresarial;
    }

}
