package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class MTabelaEntradaProduto extends AbstractTableModel {

    private ArrayList linhas = null;
    private String[] colunas = null;

    public MTabelaEntradaProduto(ArrayList lin, String[] col) {
        setLinhas(lin);
        setColunas(col);

    }

    public MTabelaEntradaProduto() {
        
    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList dados) {
        this.linhas = dados;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] nomes) {
        this.colunas = nomes;
    }

    public int getColumnCount() {
        return colunas.length;
    }

    public int getRowCount() {

        return linhas.size();

    }

    public String getColumnName(int numCol) {
        return colunas[numCol];

    }

    public Object getValueAt(int numLin, int numCol) {

        Object[] linha = (Object[]) getLinhas().get(numLin);
        return linha[numCol];

    }

}
