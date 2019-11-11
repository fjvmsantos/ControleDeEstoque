package dao;

import model.MCategoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DCategoria {

    private Connection con;

    public DCategoria(Connection con) {

        setCon(con);

    }

    public Connection getCon() {

        return con;

    }

    public void setCon(Connection con) {

        this.con = con;
    }

    public String salvar(MCategoria c) {

        String sql = "INSERT INTO estoque.categoria(categoria)VALUES(?)";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, c.getCategoria());

            if (ps.executeUpdate() > 0) {

                return "Categoria Salvar com sucesso!";

            } else {

                return "Erro ao salvar categoria!";

            }

        } catch (SQLException e) {

            return e.getMessage();

        }

    }

    public Vector<MCategoria> carregaComboBox() throws SQLException {

        Vector<MCategoria> descricao = new Vector<MCategoria>();
        String sql = "SELECT * FROM estoque.categoria order by id asc";

        PreparedStatement ps = getCon().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            MCategoria c = new MCategoria();
            c.setId(rs.getInt("id"));
            c.setCategoria(rs.getString("categoria"));
            descricao.add(c);

        }

        return descricao;

    }

    public void pegaIdCategoria(MCategoria idCategoria) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.categoria where Categoria = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, idCategoria.getCategoria());
            rs = ps.executeQuery();

            if (rs.next()) {

                idCategoria.setId(rs.getInt(1));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public List<MCategoria> carregaListaCategoria(String c) {

        String sql = "SELECT * FROM estoque.categoria where categoria like ?";
        List<MCategoria> listCat = new ArrayList<MCategoria>();

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, "%" + c + "%");
            ResultSet rs = ps.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    MCategoria cat = new MCategoria();
                    cat.setId(rs.getInt("id"));
                    cat.setCategoria(rs.getString("categoria"));

                    listCat.add(cat);

                }

                return listCat;

            } else {

                return null;

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return null;

    }

    public void carregaDadosCategoria(MCategoria cat) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.categoria where id = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, cat.getId());
            rs = ps.executeQuery();

            while (rs.next()) {

                cat.setId(rs.getInt("id"));
                cat.setCategoria(rs.getString("categoria"));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public String alteraCategoria(MCategoria c) {

        String sql = "update estoque.categoria set categoria=? where id = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, c.getCategoria());
            ps.setInt(2, c.getId());

            if (ps.executeUpdate() > 0) {

                return "Categoria alterada com sucesso!";

            } else {

                return "Falha ao alterar Categoria!";

            }

        } catch (SQLException e) {

            return e.getMessage();

        }

    }

    public void verificaSeCategoriaEstaCadastrado(MCategoria c) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.categoria where categoria = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, c.getCategoria());
            rs = ps.executeQuery();

            if (rs.next()) {

                c.setId(rs.getInt(1));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

}
