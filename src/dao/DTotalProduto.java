package dao;

import model.MTotalProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.MProduto;

public class DTotalProduto {

    private Connection con;

    public DTotalProduto(Connection con) {

        setCon(con);

    }

    public Connection getCon() {

        return con;

    }

    public void setCon(Connection con) {

        this.con = con;
    }

    public String salvar(MTotalProduto tot) {

        String sql = "INSERT INTO estoque.total_produto VALUES(?,?,?)";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, tot.getProduto().getId());
            ps.setString(2, tot.getProduto().getCodigoBarra());
            ps.setDouble(3, tot.getTotalProduto());

            if (ps.executeUpdate() > 0) {

                return "Total Salvo com sucesso!";

            } else {

                return "Erro ao Salvar Total de Produtos!";

            }

        } catch (SQLException e) {

            return e.getMessage();

        }

    }

    public void pegaTotalProduto(MTotalProduto tp) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.total_produto where codigoBarra = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, tp.getProduto().getCodigoBarra());
            rs = ps.executeQuery();

            while (rs.next()) {

                tp.setTotalProduto(rs.getDouble("total"));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public String atualizaTotal(MTotalProduto tp) {

        String sql = "UPDATE estoque.total_produto SET total=? "
                + "WHERE produto_id=? and codigoBarra = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setDouble(1, tp.getTotalProduto());
            ps.setInt(2, tp.getProduto().getId());
            ps.setString(3, tp.getProduto().getCodigoBarra());

            if (ps.executeUpdate() > 0) {

                return "Total atualizado com Sucesso!";

            } else {

                return "Erro ao Tentar Atualizar Total";

            }

        } catch (SQLException e) {

            return e.getMessage() + "Exceção ao Alterar Total";
        }

    }
    
    public void pegaTotalProdutoExclusao(MTotalProduto tp) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.total_produto where produto_id = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setInt(1, tp.getProduto().getId());
            rs = ps.executeQuery();

            while (rs.next()) {

                tp.setTotalProduto(rs.getDouble("total"));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public String atualizaTotalExclusao(MTotalProduto tp) {

        String sql = "UPDATE estoque.total_produto SET total=? WHERE "
                + "produto_id = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setDouble(1, tp.getTotalProduto());
            ps.setInt(2, tp.getProduto().getId());

            if (ps.executeUpdate() > 0) {

                return "Total atualizado com Sucesso!";

            } else {

                return "Erro ao Tentar Atualizar Total";

            }

        } catch (SQLException e) {

            return e.getMessage() + "Exceção ao Alterar Total";
        }

    }

}
