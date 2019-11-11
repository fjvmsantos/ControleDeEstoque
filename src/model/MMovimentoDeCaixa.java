package model;

public class MMovimentoDeCaixa {

    private double troco;
    private double saida;
    private MMovimentoSaidaVenda vendas;

    public MMovimentoDeCaixa() {
    }

    public MMovimentoDeCaixa(double troco, double saida, MMovimentoSaidaVenda vendas) {
        this.troco = troco;
        this.saida = saida;
        this.vendas = vendas;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public double getSaida() {
        return saida;
    }

    public void setSaida(double saida) {
        this.saida = saida;
    }

    public MMovimentoSaidaVenda getVendas() {
        return vendas;
    }

    public void setVendas(MMovimentoSaidaVenda vendas) {
        this.vendas = vendas;
    }

    @Override
    public String toString() {
        return "MMovimentoCaixa{" + "troco=" + troco + ", saida=" + saida + ", vendas=" + vendas + '}';
    }

}
