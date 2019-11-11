package dao;

import model.MEndereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.MPessoaFisica;

public class DEndereco {

    private Connection con;

    public DEndereco(Connection con) {

        setCon(con);

    }

    public Connection getCon() {

        return con;

    }

    public void setCon(Connection con) {

        this.con = con;
    }

    public String salvar(MEndereco end) {

        String sql = "INSERT INTO estoque.endereco(cep,logradouro,numero,"
                + "bairro,complemento,uf,cidade,pessoa_juridica_id,pessoa_fisica_id,tipoPessoa,tpFornecedorCliente)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, end.getCep());
            ps.setString(2, end.getLogradouro());
            ps.setString(3, end.getNumero());
            ps.setString(4, end.getBairro());
            ps.setString(5, end.getComplemento());
            ps.setString(6, end.getUfLog());
            ps.setString(7, end.getCidade());
            ps.setInt(8, end.getPessoaJuridica().getId());
            ps.setInt(9, end.getPessoaFisica().getId());
            ps.setInt(10, end.getTipoPessoa().valorPessoa);
            ps.setInt(11, end.getTipoFornecedor().valorFornecedor);

            if (ps.executeUpdate() > 0) {
                return "Endereço salvo com sucesso!";
            } else {
                return "Erro ao tentar inserir registro";
            }

        } catch (SQLException e) {

            return e.getMessage();

        }

    }

    public void carregaEnderecoPf(MEndereco end) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.endereco where pessoa_fisica_id = ? "
                + "and tipoPessoa = ? and tpFornecedorCliente = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, end.getPessoaFisica().getId());
            ps.setInt(2, end.getTipoPessoa().valorPessoa);
            ps.setInt(3, end.getTipoFornecedor().valorFornecedor);
            rs = ps.executeQuery();

            while (rs.next()) {

                end.setCep(rs.getString("cep"));
                end.setLogradouro(rs.getString("logradouro"));
                end.setNumero(rs.getString("numero"));
                end.setBairro(rs.getString("bairro"));
                end.setComplemento(rs.getString("complemento"));
                end.setUfLog(rs.getString("uf"));
                end.setCidade(rs.getString("cidade"));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public String alteraEnderecoClientePf(MEndereco e) {

        String sql = "update estoque.endereco set cep=?,logradouro=?,numero=?,"
                + "bairro=?,complemento=?,uf=?,cidade=? where id = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, e.getCep());
            ps.setString(2, e.getLogradouro());
            ps.setString(3, e.getNumero());
            ps.setString(4, e.getBairro());
            ps.setString(5, e.getComplemento());
            ps.setString(6, e.getUfLog());
            ps.setString(7, e.getCidade());
            ps.setInt(8, e.getId());

            if (ps.executeUpdate() > 0) {

                return "Endereço pessoa fisica alterada com sucesso!";

            } else {

                return "Falha ao alterar Endereço pessoa Fisica!";

            }

        } catch (SQLException ex) {

            return ex.getMessage();

        }

    }

    public void carregaEnderecoPj(MEndereco e) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.endereco where pessoa_juridica_id = ? "
                + "and tipoPessoa = ? and tpFornecedorCliente = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, e.getPessoaJuridica().getId());
            ps.setInt(2, e.getTipoPessoa().valorPessoa);
            ps.setInt(3, e.getTipoFornecedor().valorFornecedor);
            rs = ps.executeQuery();

            while (rs.next()) {

                e.setCep(rs.getString("cep"));
                e.setLogradouro(rs.getString("logradouro"));
                e.setNumero(rs.getString("numero"));
                e.setBairro(rs.getString("bairro"));
                e.setComplemento(rs.getString("complemento"));
                e.setUfLog(rs.getString("uf"));
                e.setCidade(rs.getString("cidade"));

            }

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

    }

    public String alteraEnderecoClientePj(MEndereco e) {

        String sql = "update estoque.endereco set cep=?,logradouro=?,numero=?,"
                + "bairro=?,complemento=?,uf=?,cidade=? where id = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, e.getCep());
            ps.setString(2, e.getLogradouro());
            ps.setString(3, e.getNumero());
            ps.setString(4, e.getBairro());
            ps.setString(5, e.getComplemento());
            ps.setString(6, e.getUfLog());
            ps.setString(7, e.getCidade());
            ps.setInt(8, e.getId());

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
