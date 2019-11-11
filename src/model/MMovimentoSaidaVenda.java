package model;

import enums.TipoPagamento;
import java.util.Date;

public class MMovimentoSaidaVenda {

    private int id;
    private int num_venda;
    private int itemProduto;
    private double quantidadeVenda;
    private double total;
    private double desconto;
    private double precoVenda;
    private Date dataVenda;
    private MMovimentoEntradaProduto entradaProduto;
    private MProduto produto;
    private TipoPagamento tipoPagamento;

    public MMovimentoSaidaVenda() {
    }

    public MMovimentoSaidaVenda(int id, int num_venda, int itemProduto, double quantidadeVenda, double total, double desconto, double precoVenda, Date dataVenda, MMovimentoEntradaProduto entradaProduto, MProduto produto, TipoPagamento formaPagamento) {
        this.id = id;
        this.num_venda = num_venda;
        this.itemProduto = itemProduto;
        this.quantidadeVenda = quantidadeVenda;
        this.total = total;
        this.desconto = desconto;
        this.precoVenda = precoVenda;
        this.dataVenda = dataVenda;
        this.entradaProduto = entradaProduto;
        this.produto = produto;
        this.tipoPagamento = tipoPagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum_venda() {
        return num_venda;
    }

    public void setNum_venda(int num_venda) {
        this.num_venda = num_venda;
    }

    public int getItemProduto() {
        return itemProduto;
    }

    public void setItemProduto(int itemProduto) {
        this.itemProduto = itemProduto;
    }

    public double getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public void setQuantidadeVenda(double quantidadeVenda) {
        this.quantidadeVenda = quantidadeVenda;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public MMovimentoEntradaProduto getEntradaProduto() {
        return entradaProduto;
    }

    public void setEntradaProduto(MMovimentoEntradaProduto entradaProduto) {
        this.entradaProduto = entradaProduto;
    }

    public MProduto getProduto() {
        return produto;
    }

    public void setProduto(MProduto produto) {
        this.produto = produto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public TipoPagamento getFormaPagamento() {
        return tipoPagamento;
    }

    public void setFormaPagamento(TipoPagamento formaPagamento) {
        this.tipoPagamento = formaPagamento;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    

    @Override
    public String toString() {
        return "MMovimentoSaidaVenda{" + "id=" + id + ", num_venda=" + num_venda + ","
                + "\n itemProduto=" + itemProduto + ", quantidadeVenda=" + quantidadeVenda + ","
                + "\n total=" + total + ", desconto=" + desconto + ", precoVenda=" + precoVenda + ","
                + "\n dataVenda=" + dataVenda + ", entradaProduto=" + entradaProduto + ","
                + "\n produto=" + produto + ", formaPagamento=" + tipoPagamento + '}';
    }

}
