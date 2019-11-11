package dao;

import model.MMovimentoSaidaVenda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.MProduto;

public class DMovimentoSaidaVenda {

    public List<MMovimentoSaidaVenda> venda = new ArrayList<MMovimentoSaidaVenda>();
    private Connection con;

    public DMovimentoSaidaVenda(Connection con) {

        setCon(con);

    }

    public Connection getCon() {

        return con;

    }

    public void setCon(Connection con) {

        this.con = con;
    }

    public String salvar(MMovimentoSaidaVenda saidaVenda) {

        String sql = "INSERT INTO estoque.saida_venda"
                + "(codigoBarra,produto_id,unidade,preco_unitario,"
                + "quantidade_venda,desconto,total_por_produto,data_hora_venda,num_venda,item_venda_produto)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?)";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, saidaVenda.getProduto().getCodigoBarra());
            ps.setInt(2, saidaVenda.getProduto().getId());
            ps.setString(3, saidaVenda.getProduto().getUnidade());
            ps.setDouble(4, saidaVenda.getPrecoVenda());
            ps.setDouble(5, saidaVenda.getQuantidadeVenda());
            ps.setDouble(6, saidaVenda.getDesconto());
            ps.setDouble(7, saidaVenda.getTotal());
            ps.setDate(8, new Date(saidaVenda.getDataVenda().getTime()));
            ps.setInt(9, saidaVenda.getNum_venda());
            ps.setInt(10, saidaVenda.getItemProduto());

            if (ps.executeUpdate() > 0) {

                return "Venda salva com sucesso!";

            } else {

                return "Erro ao salvar categoria!";

            }

        } catch (SQLException e) {

            return e.getMessage();

        }

    }

    public void pegaNumeroDaUltimaComra() {

        ResultSet rs = null;

        try {

            PreparedStatement ps = getCon().prepareStatement("SELECT * FROM "
                    + "estoque.saida_venda ORDER BY id DESC limit 1");

            rs = ps.executeQuery();

            while (rs.next()) {

                MMovimentoSaidaVenda msv = new MMovimentoSaidaVenda();
                msv.setNum_venda(rs.getInt(10));
                venda.add(msv);

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public List<MMovimentoSaidaVenda> tabelaProdutoVendido(String numVenda) {

        String sql = "SELECT * FROM produto p join saida_venda s on "
                + "s.produto_id = p.id where s.num_Venda = ?";

        List<MMovimentoSaidaVenda> carregaProdutoVendido = new ArrayList<MMovimentoSaidaVenda>();

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, numVenda);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    MProduto p = new MProduto();
                    p.setCodigoBarra(rs.getString(4));
                    p.setProduto(rs.getString("produto"));

                    MMovimentoSaidaVenda nv = new MMovimentoSaidaVenda();
                    nv.setProduto(p);
                    nv.setItemProduto(rs.getInt("item_venda_produto"));
                    nv.setQuantidadeVenda(rs.getDouble("quantidade_venda"));
                    nv.setPrecoVenda(rs.getDouble("preco_unitario"));
                    nv.setDesconto(rs.getDouble("desconto"));
                    nv.setTotal(rs.getDouble("total_por_produto"));

                    carregaProdutoVendido.add(nv);
                }

                return carregaProdutoVendido;

            } else {

                return null;

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return null;

    }

    public List<MMovimentoSaidaVenda> carregaVendaDoDia(Date venda) {

        String sql = "SELECT * FROM estoque.saida_venda where data_hora_venda = ?";
        List<MMovimentoSaidaVenda> carregaVendaDoDia = new ArrayList<MMovimentoSaidaVenda>();

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setDate(1, venda);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    MMovimentoSaidaVenda e = new MMovimentoSaidaVenda();
                    e.setDataVenda(rs.getDate(8));

                    carregaVendaDoDia.add(e);

                }

                return carregaVendaDoDia;

            } else {

                return null;

            }

        } catch (SQLException e) {

            return null;

        }

    }

    public void carregaPrecoVenda(MMovimentoSaidaVenda precoVenda) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.saida_venda where num_venda = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setDouble(1, precoVenda.getNum_venda());
            rs = ps.executeQuery();

            while (rs.next()) {

                precoVenda.setPrecoVenda(rs.getDouble(5));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public void pegaIdVendaProduto(MMovimentoSaidaVenda m) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.saida_venda where codigoBarra = ? "
                + "and num_venda = ? and item_venda_produto = ? and data_hora_venda = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, m.getProduto().getCodigoBarra());
            ps.setInt(2, m.getNum_venda());
            ps.setInt(3, m.getItemProduto());
            ps.setDate(4, new Date(m.getDataVenda().getTime()));
            rs = ps.executeQuery();

            if (rs.next()) {

                m.setId(rs.getInt(1));

            }

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

    }

    public String deletaItemDaVenda(MMovimentoSaidaVenda m) {

        String sql = "delete from estoque.saida_venda where id = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, m.getId());

            if (ps.executeUpdate() > 0) {

                return "Item da venda excluído com sucesso!";

            } else {

                return "Item não excluído!";

            }

        } catch (SQLException ex) {

            return ex.getMessage();

        }

    }

    public void pegaVendaParaRecibo(MMovimentoSaidaVenda v) {

        ResultSet rs = null;

        try {

            PreparedStatement ps = getCon().prepareStatement("SELECT * FROM "
                    + "estoque.saida_venda where num_venda = ?");
            ps.setInt(1, v.getNum_venda());
            rs = ps.executeQuery();

            while (rs.next()) {

                MMovimentoSaidaVenda msv = new MMovimentoSaidaVenda();
                msv.setQuantidadeVenda(rs.getDouble(6));
                venda.add(msv);

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
    
    public List<MMovimentoSaidaVenda> carregaVendaDoDia(int venda) {

        String sql = "SELECT * FROM estoque.saida_venda where num_venda = ?";
        
        List<MMovimentoSaidaVenda> carregaVendaDoDia = new ArrayList<MMovimentoSaidaVenda>();

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, venda);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    MMovimentoSaidaVenda e = new MMovimentoSaidaVenda();
                    e.setId(rs.getInt(1));

                    carregaVendaDoDia.add(e);

                }

                return carregaVendaDoDia;

            } else {

                return null;

            }

        } catch (SQLException e) {

            return null;

        }

    }

}
