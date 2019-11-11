package model;

public class MCategoria {

    private int id;
    private String categoria;

    public MCategoria() {
    }

    public MCategoria(int id, String categoria) {
        this.id = id;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {

        return categoria;

    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
/*
    @Override
    public String toString() {
        return "MCategoria{" + "id=" + id + ", categoria=" + categoria + '}';
    }*/
    
    
    @Override
    public String toString() {
        return categoria;
    }

}
