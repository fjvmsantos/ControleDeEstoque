package model;

public class MVenda {

    private double quantidadeVenda;
    private double totalVenda;
    private MMovimentoEntradaProduto entradaProduto;

    public MVenda() {
    }

    public MVenda(double quantidadeVenda, double totalVenda,
            MMovimentoEntradaProduto entradaProduto) {
        this.quantidadeVenda = quantidadeVenda;
        this.totalVenda = totalVenda;
        this.entradaProduto = entradaProduto;
    }

    public double getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public void setQuantidadeVenda(double quantidadeVenda) {
        this.quantidadeVenda = quantidadeVenda;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = entradaProduto.getQuantidade() - quantidadeVenda;
    }

    public MMovimentoEntradaProduto getEntradaProduto() {
        return entradaProduto;
    }

    public void setEntradaProduto(MMovimentoEntradaProduto entradaProduto) {
        this.entradaProduto = entradaProduto;
    }

}
