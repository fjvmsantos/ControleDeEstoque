package dao;

import model.MMovimentoEntradaProduto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.MProduto;

public class DMovimentoEntradaProduto {

    public List<MMovimentoEntradaProduto> entProduto = new ArrayList<MMovimentoEntradaProduto>();

    private Connection con;

    public DMovimentoEntradaProduto(Connection con) {

        setCon(con);

    }

    public Connection getCon() {

        return con;

    }

    public void setCon(Connection con) {

        this.con = con;
    }

    public String salvar(MMovimentoEntradaProduto ent) {

        String sql = "INSERT INTO estoque.entrada_estoque VALUES"
                + "(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, ent.getLote());
            ps.setDate(2, new Date(ent.getDataValidade().getTime()));
            ps.setString(3, ent.getNumeroCalcado());
            ps.setDouble(4, ent.getPrecoCusto());
            ps.setDouble(5, ent.getMargemVenda());
            ps.setDouble(6, ent.getQuantidade());
            ps.setDouble(7, ent.getPrecoVenda());
            ps.setDouble(8, ent.getTotal());
            ps.setInt(9, ent.getProduto().getId());
            ps.setInt(10, ent.getCategoria().getId());
            ps.setInt(11, ent.getFornecedorPf().getId());
            ps.setInt(12, ent.getFornecedor().getId());
            ps.setString(13, ent.getProduto().getCodigoBarra());
            ps.setString(14, ent.getNumeroNotaFiscal());
            ps.setDate(15, new Date(ent.getDataNotaFiscal().getTime()));

            if (ps.executeUpdate() > 0) {

                return "Movimento salvo com sucesso!";

            } else {

                return "Erro ao salvar Movimento de Estoque!";

            }

        } catch (SQLException e) {

            return e.getMessage();

        }

    }

    public List<MMovimentoEntradaProduto> carregaTabelaEntradaProdutoPf(String ent, String dtNotaFiscal, int f) {

        String sql = "SELECT * FROM produto p join entrada_estoque e on "
                + "e.produto_id = p.id where e.num_nota_fiscal = ? and data_nota_fiscal=? and fornecedor_pf = ?";

        List<MMovimentoEntradaProduto> carregaTabelaEntradaProduto = new ArrayList<MMovimentoEntradaProduto>();

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, ent);
            ps.setString(2, dtNotaFiscal);
            ps.setInt(3, f);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    MProduto p = new MProduto();
                    p.setProduto(rs.getString(2));
                    p.setApresentacao(rs.getString(8));

                    MMovimentoEntradaProduto e = new MMovimentoEntradaProduto();
                    e.setProduto(p);
                    e.setPrecoCusto(rs.getDouble("preco_custo"));
                    e.setMargemVenda(rs.getDouble("margem_venda"));
                    e.setQuantidade(rs.getDouble("quantidade"));
                    e.setPrecoVenda(rs.getDouble("preco_venda"));

                    carregaTabelaEntradaProduto.add(e);

                }

                return carregaTabelaEntradaProduto;

            } else {

                return null;

            }

        } catch (SQLException e) {

            return null;

        }

    }

    public List<MMovimentoEntradaProduto> carregaTabelaEntradaProdutoPj(String ent, String dtNotaFiscal, int f) {

        String sql = "SELECT * FROM produto p join entrada_estoque e on "
                + "e.produto_id = p.id where e.num_nota_fiscal = ? and data_nota_fiscal=? and fornecedor_pj = ?";

        List<MMovimentoEntradaProduto> carregaTabelaEntradaProduto = new ArrayList<MMovimentoEntradaProduto>();

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, ent);
            ps.setString(2, dtNotaFiscal);
            ps.setInt(3, f);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    MProduto p = new MProduto();
                    p.setProduto(rs.getString(2));
                    p.setApresentacao(rs.getString(8));

                    MMovimentoEntradaProduto e = new MMovimentoEntradaProduto();
                    e.setProduto(p);
                    e.setPrecoCusto(rs.getDouble("preco_custo"));
                    e.setMargemVenda(rs.getDouble("margem_venda"));
                    e.setQuantidade(rs.getDouble("quantidade"));
                    e.setPrecoVenda(rs.getDouble("preco_venda"));

                    carregaTabelaEntradaProduto.add(e);

                }

                return carregaTabelaEntradaProduto;

            } else {

                return null;

            }

        } catch (SQLException e) {

            return null;

        }

    }

    public List<MMovimentoEntradaProduto> verificaProdutoCadastradoNaNotaPj(String nota, int forne) {

        String sql = "SELECT * FROM entrada_estoque e JOIN pessoa_juridica p on "
                + "e.fornecedor_pj = p.id where e.num_nota_fiscal = ? "
                + "and e.fornecedor_pj = ?";

        List<MMovimentoEntradaProduto> carregaTabelaEntradaProduto = new ArrayList<MMovimentoEntradaProduto>();

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, nota);
            ps.setInt(2, forne);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    MProduto p = new MProduto();
                    p.setCodigoBarra(rs.getString(14));
                    MMovimentoEntradaProduto e = new MMovimentoEntradaProduto();
                    e.setProduto(p);

                    carregaTabelaEntradaProduto.add(e);

                }

                return carregaTabelaEntradaProduto;

            } else {

                return null;

            }

        } catch (SQLException e) {

            return null;

        }

    }

    public List<MMovimentoEntradaProduto> verificaProdutoCadastradoNaNotaPf(String nota, int forne) {

        String sql = "SELECT * FROM entrada_estoque e JOIN pessoa_fisica p on "
                + "e.fornecedor_pf = p.id where e.num_nota_fiscal = ? and "
                + "e.fornecedor_pf = ?";

        List<MMovimentoEntradaProduto> carregaTabelaEntradaProduto = new ArrayList<MMovimentoEntradaProduto>();

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, nota);
            ps.setInt(2, forne);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    MProduto p = new MProduto();
                    p.setCodigoBarra(rs.getString(14));
                    MMovimentoEntradaProduto e = new MMovimentoEntradaProduto();
                    e.setProduto(p);

                    carregaTabelaEntradaProduto.add(e);

                }

                return carregaTabelaEntradaProduto;

            } else {

                return null;

            }

        } catch (SQLException e) {

            return null;

        }

    }

    public void pegaUltimoPrecoVenda(MMovimentoEntradaProduto pv) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.entrada_estoque WHERE "
                + "codigoBarra = ? ORDER BY id DESC limit 1";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, pv.getProduto().getCodigoBarra());
            rs = ps.executeQuery();

            if (rs.next()) {

                pv.setPrecoCusto(rs.getDouble(5));
                pv.setMargemVenda(rs.getDouble(6));
                pv.setPrecoVenda(rs.getDouble(8));
                pv.getProduto().setId(rs.getInt(10));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public String delataProdutoDaNota(MMovimentoEntradaProduto m) {

        String sql = "delete from estoque.entrada_estoque where id = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, m.getId());

            if (ps.executeUpdate() > 0) {

                return "Produto Excluído da Nota Fiscal com sucesso!";

            } else {

                return "O produto não foi excluído!";

            }

        } catch (SQLException e) {

            return e.getMessage();

        }

    }

    public void pegaIdEntradaProdutoPf(MMovimentoEntradaProduto e) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.entrada_estoque where "
                + "num_nota_fiscal = ? and data_nota_fiscal = ? "
                + "and fornecedor_pf = ? and produto_id = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, e.getNumeroNotaFiscal());
            ps.setDate(2, new Date(e.getDataNotaFiscal().getTime()));
            ps.setInt(3, e.getFornecedorPf().getId());
            ps.setInt(4, e.getProduto().getId());
            rs = ps.executeQuery();

            if (rs.next()) {

                e.setId(rs.getInt(1));

            }

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

    }

    public void pegaIdEntradaProdutoPj(MMovimentoEntradaProduto e) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.entrada_estoque where "
                + "num_nota_fiscal = ? and data_nota_fiscal = ? "
                + "and fornecedor_pj = ? and produto_id = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, e.getNumeroNotaFiscal());
            ps.setDate(2, new Date(e.getDataNotaFiscal().getTime()));
            ps.setInt(3, e.getFornecedor().getId());
            ps.setInt(4, e.getProduto().getId());
            rs = ps.executeQuery();

            if (rs.next()) {

                e.setId(rs.getInt(1));

            }

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

    }

}
