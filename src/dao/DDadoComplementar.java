package dao;

import model.MDadoComplementar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.MEndereco;

public class DDadoComplementar {

    private Connection con;

    public DDadoComplementar(Connection con) {

        setCon(con);

    }

    public Connection getCon() {

        return con;

    }

    public void setCon(Connection con) {

        this.con = con;
    }

    public String salvar(MDadoComplementar dc) {

        String sql = "INSERT INTO dado_complementar (telefone,celular,email,"
                + "observacao,pessoa_juridica_id,pessoa_fisica_id,tipoPessoa,tpFornecedorCliente)"
                + "VALUES (?,?,?,?,?,?,?,?);";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, dc.getTelefone());
            ps.setString(2, dc.getCelular());
            ps.setString(3, dc.getEmail());
            ps.setString(4, dc.getObservacao());
            ps.setInt(5, dc.getPessoaJuridica().getId());
            ps.setInt(6, dc.getPessoaFisica().getId());
            ps.setInt(7, dc.getTipoPessoa().valorPessoa);
            ps.setInt(8, dc.getTipoFornecedor().valorFornecedor);

            if (ps.executeUpdate() > 0) {

                return "Dado Complementar salvo com sucesso!";

            } else {

                return "Erro ao tentar inserir Dado Complementar!";

            }

        } catch (SQLException e) {

            return e.getMessage();

        }

    }

    public void carregaDadoComplementarPf(MDadoComplementar dado) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.dado_complementar where pessoa_fisica_id = ? "
                + "and tipoPessoa = ? and tpFornecedorCliente = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, dado.getPessoaFisica().getId());
            ps.setInt(2, dado.getTipoPessoa().valorPessoa);
            ps.setInt(3, dado.getTipoFornecedor().valorFornecedor);
            rs = ps.executeQuery();

            while (rs.next()) {

                dado.setTelefone(rs.getString(2));
                dado.setCelular(rs.getString(3));
                dado.setEmail(rs.getString(4));
                dado.setObservacao(rs.getString(5));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public String alteraDadoComplementarPf(MDadoComplementar com) {

        String sql = "update estoque.dado_complementar set telefone=?,celular=?,"
                + "email=?,observacao=? where id = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, com.getTelefone());
            ps.setString(2, com.getCelular());
            ps.setString(3, com.getEmail());
            ps.setString(4, com.getObservacao());
            ps.setInt(5, com.getId());

            if (ps.executeUpdate() > 0) {

                return "Dados complementare alterados com sucesso!";

            } else {

                return "Erro ao alterar dados Complementares";

            }

        } catch (SQLException e) {

            return e.getMessage();

        }

    }

    public void carregaDadoComplementarPj(MDadoComplementar c) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.dado_complementar where pessoa_juridica_id = ? "
                + "and tipoPessoa = ? and tpFornecedorCliente = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, c.getPessoaJuridica().getId());
            ps.setInt(2, c.getTipoPessoa().valorPessoa);
            ps.setInt(3, c.getTipoFornecedor().valorFornecedor);
            rs = ps.executeQuery();

            while (rs.next()) {

                c.setTelefone(rs.getString(2));
                c.setCelular(rs.getString(3));
                c.setEmail(rs.getString(4));
                c.setObservacao(rs.getString(5));

            }

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

    }

    public String alteraDadoComplementarPj(MDadoComplementar dc) {

        String sql = "update estoque.dado_complementar set telefone=?,celular=?,"
                + "email=?,observacao=? where id = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, dc.getTelefone());
            ps.setString(2, dc.getCelular());
            ps.setString(3, dc.getEmail());
            ps.setString(4, dc.getObservacao());
            ps.setInt(5, dc.getId());

            if (ps.executeUpdate() > 0) {

                return "Endereço pessoa Juridica alterada com sucesso!";

            } else {

                return "Falha ao alterar Endereço pessoa Juridica!";

            }

        } catch (SQLException ex) {

            return ex.getMessage();

        }

    }

}
