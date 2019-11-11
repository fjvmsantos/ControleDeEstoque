package model;

public class MTotalProduto {

    private MProduto produto;
    private double totalProduto;

    public MTotalProduto() {
    }

    public MTotalProduto(MProduto produto, double totalProduto) {
        this.produto = produto;
        this.totalProduto = totalProduto;
    }

    public MProduto getProduto() {
        return produto;
    }

    public void setProduto(MProduto produto) {
        this.produto = produto;
    }

    public double getTotalProduto() {
        return totalProduto;
    }

    public void setTotalProduto(double totalProduto) {
        this.totalProduto = totalProduto;
    }

    @Override
    public String toString() {
        return "MTotalProduto{" + "produto=" + produto + ", totalProduto=" + totalProduto + '}';
    }

}
