package dao;

import model.MDadoBancario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DDadoBancario {

    private Connection con;

    public DDadoBancario(Connection con) {

        setCon(con);

    }

    public Connection getCon() {

        return con;

    }

    public void setCon(Connection con) {

        this.con = con;
    }

    public String salvar(MDadoBancario db) {

        String sql = "INSERT INTO dado_bancario (banco,tpConta,agencia,operacao,"
                + "conta,pessoa_juridica_id,pessoa_fisica_id,tipoPessoa,tpFornecedorCliente)"
                + " VALUES (?,?,?,?,?,?,?,?,?)";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, db.getBanco());
            ps.setString(2, db.getConta());
            ps.setString(3, db.getAg());
            ps.setString(4, db.getOp());
            ps.setString(5, db.getConta());
            ps.setInt(6, db.getPessoaJuridica().getId());
            ps.setInt(7, db.getPessoaFisica().getId());
            ps.setInt(8, db.getTipoPessoa().valorPessoa);
            ps.setInt(9, db.getTipoFornecedor().valorFornecedor);

            if (ps.executeUpdate() > 0) {

                return "Dados bancários salvo com sucesso";

            } else {

                return "Erro ao tentar inserir registro";

            }

        } catch (SQLException e) {

            return e.getMessage();

        }

    }

    public void carregaDadoBancarioPf(MDadoBancario banco) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.dado_bancario where pessoa_fisica_id = ? "
                + "and tipoPessoa = ? and tpFornecedorCliente = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, banco.getPessoaFisica().getId());
            ps.setInt(2, banco.getTipoPessoa().valorPessoa);
            ps.setInt(3, banco.getTipoFornecedor().valorFornecedor);
            rs = ps.executeQuery();

            while (rs.next()) {

                banco.setBanco(rs.getString("banco"));
                banco.setTpConta(rs.getString("tpConta"));
                banco.setAg(rs.getString("agencia"));
                banco.setOp(rs.getString("operacao"));
                banco.setConta(rs.getString("conta"));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public void pegaIdDadoBancarioPf(MDadoBancario b) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.endereco where pessoa_fisica_id = ? "
                + "and tipoPessoa = 2 and tpFornecedorCliente = 1";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, b.getId());
            rs = ps.executeQuery();

            if (rs.next()) {

                b.setId(rs.getInt(1));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public String alteraDadoBancarioPf(MDadoBancario b) {

        String sql = "update estoque.dado_bancario set banco=?, tpConta=?,"
                + "agencia=?,operacao=?,conta=? where id = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, b.getBanco());
            ps.setString(2, b.getTpConta());
            ps.setString(3, b.getAg());
            ps.setString(4, b.getOp());
            ps.setString(5, b.getConta());
            ps.setInt(6, b.getId());

            if (ps.executeUpdate() > 0) {

                return "Dados bancarios alterados com sucesso!";

            } else {

                return "Erro ao alterar dados bancários";

            }

        } catch (SQLException e) {

            return e.getMessage();

        }

    }

    public void carregaDadoBancarioPj(MDadoBancario b) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.dado_bancario where pessoa_juridica_id = ? "
                + "and tipoPessoa = ? and tpFornecedorCliente = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, b.getPessoaJuridica().getId());
            ps.setInt(2, b.getTipoPessoa().valorPessoa);
            ps.setInt(3, b.getTipoFornecedor().valorFornecedor);
            rs = ps.executeQuery();

            while (rs.next()) {

                b.setBanco(rs.getString(2));
                b.setTpConta(rs.getString(3));
                b.setAg(rs.getString(4));
                b.setOp(rs.getString(5));
                b.setConta(rs.getString(6));

            }

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

    }

}
