package model;

public class MProduto {

    private int id;
    private String codigoBarra;
    private String marca;
    private String modelo;
    private String produto;
    private String unidade;
    private String apresentacao;
    private double estoqueMinimo;
    private MCategoria categoria;

    public MProduto() {
    }

    public MProduto(int id, String codigoBarra, String marca, String modelo,
            String produto, String unidade, String apresentacao,
            double estoqueMinimo, MCategoria categoria) {

        this.id = id;
        this.codigoBarra = codigoBarra;
        this.marca = marca;
        this.modelo = modelo;
        this.produto = produto;
        this.unidade = unidade;
        this.apresentacao = apresentacao;
        this.estoqueMinimo = estoqueMinimo;
        this.categoria = categoria;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public double getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(double estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public String getApresentacao() {
        return apresentacao;
    }

    public void setApresentacao(String apresentacao) {
        this.apresentacao = apresentacao;
    }

    public MCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(MCategoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "MProduto{" + "id=" + id + ", codigoBarra=" + codigoBarra + ", marca=" + marca + ", modelo=" + modelo + ", produto=" + produto + ", unidade=" + unidade + ", apresentacao=" + apresentacao + ", estoqueMinimo=" + estoqueMinimo + ", categoria=" + categoria + '}';
    }

}
