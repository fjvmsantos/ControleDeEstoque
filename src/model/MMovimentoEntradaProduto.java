package model;

import java.util.Date;

public class MMovimentoEntradaProduto {

    private int id;
    private String lote;
    private String numeroCalcado;
    private String numeroNotaFiscal;
    private MCategoria categoria;
    private MFornecedorPessoaJuridica fornecedor;
    private MFornecedorPessoaFisica fornecedorPf;
    private MProduto produto;
    private Date dataValidade;
    private Date dataNotaFiscal;
    private double margemVenda;
    private double precoCusto;
    private double precoVenda;
    private double quantidade;
    private double total;

    public MMovimentoEntradaProduto() {
    }

    public MMovimentoEntradaProduto(String lote, String numeroCalcado,
            String numeroNotaFiscal, MCategoria categoria,
            MFornecedorPessoaJuridica fornecedor, MFornecedorPessoaFisica fornecedorPf, MProduto produto,
            Date dataValidade, Date dataNotaFiscal, double margemVenda, double precoCusto,
            double precoVenda, double quantidade, double total) {

        this.lote = lote;
        this.numeroCalcado = numeroCalcado;
        this.numeroNotaFiscal = numeroNotaFiscal;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
        this.fornecedorPf = fornecedorPf;
        this.produto = produto;
        this.dataValidade = dataValidade;
        this.dataNotaFiscal = dataNotaFiscal;
        this.margemVenda = margemVenda;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.quantidade = quantidade;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getNumeroCalcado() {
        return numeroCalcado;
    }

    public void setNumeroCalcado(String numeroCalcado) {
        this.numeroCalcado = numeroCalcado;
    }

    public String getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }

    public void setNumeroNotaFiscal(String numeroNotaFiscal) {
        this.numeroNotaFiscal = numeroNotaFiscal;
    }

    public MCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(MCategoria categoria) {
        this.categoria = categoria;
    }

    public MFornecedorPessoaJuridica getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(MFornecedorPessoaJuridica fornecedor) {
        this.fornecedor = fornecedor;
    }

    public MFornecedorPessoaFisica getFornecedorPf() {
        return fornecedorPf;
    }

    public void setFornecedorPf(MFornecedorPessoaFisica fornecedorPf) {
        this.fornecedorPf = fornecedorPf;
    }

    public MProduto getProduto() {
        return produto;
    }

    public void setProduto(MProduto produto) {
        this.produto = produto;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Date getDataNotaFiscal() {
        return dataNotaFiscal;
    }

    public void setDataNotaFiscal(Date dataNotaFiscal) {
        this.dataNotaFiscal = dataNotaFiscal;
    }

    public double getMargemVenda() {
        return margemVenda;
    }

    public void setMargemVenda(double margemVenda) {
        this.margemVenda = margemVenda;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = (precoCusto * margemVenda) / 100 + precoCusto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = (precoVenda)*quantidade;
    }

    @Override
    public String toString() {
        return "MMovimentoEntradaProduto{" + "\n" + "id=" + id + ",\nlote=" + lote
                + ",\nnumeroCalcado=" + numeroCalcado
                + ",\nnumeroNotaFiscal=" + numeroNotaFiscal
                + ",\ncategoria=" + categoria + ",\nfornecedor=" + fornecedor
                + ",\nproduto=" + produto + ",\ndataValidade=" + dataValidade + "\ndataNotaFiscal=" + dataNotaFiscal
                + ",\nmargemVenda=" + margemVenda + ",\nprecoCusto=" + precoCusto
                + ",\nprecoVenda=" + precoVenda + ",\nquantidade=" + quantidade
                + ",\ntotal=" + total + '}';
    } 

}
