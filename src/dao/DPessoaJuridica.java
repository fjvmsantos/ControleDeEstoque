package dao;

import enums.TipoFornecedorCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.MPessoaJuridica;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import model.MDadoBancario;
import model.MDadoComplementar;
import model.MEndereco;
import model.MPessoaFisica;

public class DPessoaJuridica {

    public List<MPessoaJuridica> pessoas = new ArrayList<MPessoaJuridica>();

    private Connection con;

    public DPessoaJuridica(Connection con) {

        setCon(con);

    }

    public Connection getCon() {

        return con;

    }

    public void setCon(Connection con) {

        this.con = con;

    }

    public String salvar(MPessoaJuridica p) {

        String sql = "INSERT INTO estoque.pessoa_juridica(cnpj,abertura,"
                + "nomeEmpresarial,tituloEstabelecimento,"
                + "inscricaoMunicipal,inscricaoEstadual,tpFornecedorCliente)"
                + "VALUES(?,?,?,?,?,?,?)";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, p.getCnpj());
            ps.setDate(2, new Date(p.getAbertura().getTime()));
            ps.setString(3, p.getNomeEmpresarial());
            ps.setString(4, p.getTituloEstabelecimento());
            ps.setString(5, p.getIncricaoMunicipal());
            ps.setString(6, p.getIncricaoEstadual());
            ps.setInt(7, p.getTipoFornecedor().valorFornecedor);

            if (ps.executeUpdate() > 0) {
                return "Pessoa Jurídica salva com sucesso!";
            } else {
                return "Erro ao tentar inserir Pessoa Jurídica!";
            }

        } catch (SQLException e) {

            return e.getMessage();

        }

    }

    public void listarMax() {

        ResultSet rs = null;

        try {

            PreparedStatement ps = getCon().prepareStatement("SELECT id FROM "
                    + "estoque.pessoa_juridica ORDER BY ID DESC LIMIT 1");
            rs = ps.executeQuery();

            while (rs.next()) {

                MPessoaJuridica pessoa = new MPessoaJuridica();
                pessoa.setId(rs.getInt("id"));
                pessoas.add(pessoa);

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public Vector<MPessoaJuridica> carregaComboPj() throws SQLException {

        Vector<MPessoaJuridica> pj = new Vector<MPessoaJuridica>();
        String sql = "SELECT * FROM estoque.pessoa_juridica where "
                + "tpFornecedorCliente = 2  order by nomeEmpresarial asc";

        PreparedStatement ps = getCon().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            MPessoaJuridica mpj = new MPessoaJuridica();
            mpj.setNomeEmpresarial(rs.getString(4));
            pj.add(mpj);

        }

        return pj;

    }

    public Vector<MPessoaJuridica> carregaComboClientePj() throws SQLException {

        Vector<MPessoaJuridica> pj = new Vector<MPessoaJuridica>();
        String sql = "SELECT * FROM estoque.pessoa_juridica where "
                + "tpFornecedorCliente = 1  order by nomeEmpresarial asc";

        PreparedStatement ps = getCon().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            MPessoaJuridica mpj = new MPessoaJuridica();
            mpj.setNomeEmpresarial(rs.getString(4));
            pj.add(mpj);

        }

        return pj;

    }

    public void pegaIdFornecedorPj(MPessoaJuridica pj) {

        ResultSet rs = null;
        String sql = "SELECT id FROM estoque.pessoa_juridica "
                + "where nomeEmpresarial = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, pj.getNomeEmpresarial());
            rs = ps.executeQuery();

            if (rs.next()) {

                pj.setId(rs.getInt(1));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public void comparaCnpjCadastradoCliente(MPessoaJuridica pj) {

        ResultSet rs = null;
        String sql = "SELECT * from estoque.pessoa_juridica where cnpj = ? "
                + "and tpFornecedorCliente = 1";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, pj.getCnpj());
            rs = ps.executeQuery();

            if (rs.next()) {

                pj.setId(rs.getInt(1));
                pj.setNomeEmpresarial(rs.getString(4));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public void comparaCnpjCadastradoFornecedor(MPessoaJuridica pj) {

        ResultSet rs = null;
        String sql = "SELECT * from estoque.pessoa_juridica where cnpj = ? "
                + "and tpFornecedorCliente = 2";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, pj.getCnpj());
            rs = ps.executeQuery();

            if (rs.next()) {

                pj.setId(rs.getInt(1));
                pj.setNomeEmpresarial(rs.getString(4));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public List<MPessoaJuridica> pesquisaPj(String cliente, TipoFornecedorCliente id) {

        String sql = "SELECT * FROM estoque.pessoa_juridica where nomeEmpresarial like ? and tpFornecedorCliente = ?";

        List<MPessoaJuridica> listPj = new ArrayList<MPessoaJuridica>();

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, "%" + cliente + "%");
            ps.setInt(2, id.valorFornecedor);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    MPessoaJuridica pj = new MPessoaJuridica();
                    pj.setId(rs.getInt(1));
                    pj.setCnpj(rs.getString(2));
                    pj.setNomeEmpresarial(rs.getString(4));

                    listPj.add(pj);

                }

                return listPj;

            } else {

                return null;

            }

        } catch (SQLException e) {

            return null;

        }

    }

    public void carregaDadosPj(MPessoaJuridica p) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.pessoa_juridica where id = ? and "
                + "tpFornecedorCliente = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, p.getId());
            ps.setInt(2, p.getTipoFornecedor().valorFornecedor);
            rs = ps.executeQuery();

            while (rs.next()) {

                p.setCnpj(rs.getString("cnpj"));
                p.setAbertura(rs.getDate("abertura"));
                p.setNomeEmpresarial(rs.getString("nomeEmpresarial"));
                p.setTituloEstabelecimento(rs.getString("tituloEstabelecimento"));
                p.setIncricaoMunicipal(rs.getString("inscricaoMunicipal"));
                p.setIncricaoEstadual(rs.getString("inscricaoEstadual"));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public String alteraClientePj(MPessoaJuridica p) {

        String sql = "update estoque.pessoa_juridica set cnpj=?,abertura=?,"
                + "nomeEmpresarial=?,tituloEstabelecimento=?,inscricaoMunicipal=?,"
                + "inscricaoEstadual=? where id = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, p.getCnpj());
            ps.setDate(2, new Date(p.getAbertura().getTime()));
            ps.setString(3, p.getNomeEmpresarial());
            ps.setString(4, p.getTituloEstabelecimento());
            ps.setString(5, p.getIncricaoMunicipal());
            ps.setString(6, p.getIncricaoEstadual());
            ps.setInt(7, p.getId());

            if (ps.executeUpdate() > 0) {

                return "Pessoa Jurdica alterada com sucesso!";

            } else {

                return "Falha ao alterar Pessoa ´Juridica!";

            }

        } catch (SQLException e) {

            return e.getMessage();

        }

    }

    public String pegaIdEnderecoPj(MPessoaJuridica pj, MEndereco end) {

        ResultSet rs = null;
        String sql = "SELECT e.id FROM pessoa_juridica p join endereco e on "
                + "p.id = e.pessoa_juridica_id where p.nomeEmpresarial = ? "
                + "and e.tipoPessoa = ? and e.tpFornecedorCliente = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, pj.getNomeEmpresarial());
            ps.setInt(2, end.getTipoPessoa().valorPessoa);
            ps.setInt(3, end.getTipoFornecedor().valorFornecedor);
            rs = ps.executeQuery();

            if (rs.next()) {

                end.setId(rs.getInt(1));

            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return null;

    }

    public String pegaIdDadoComplentarPj(MPessoaJuridica pj, MDadoComplementar dc) {

        ResultSet rs = null;
        String sql = "SELECT d.id FROM pessoa_juridica p join dado_complementar "
                + "d on p.id = d.pessoa_juridica_id where p.nomeEmpresarial = ? "
                + "and d.tipoPessoa = ? and d.tpFornecedorCliente = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, pj.getNomeEmpresarial());
            ps.setInt(2, dc.getTipoPessoa().valorPessoa);
            ps.setInt(3, dc.getTipoFornecedor().valorFornecedor);
            rs = ps.executeQuery();

            if (rs.next()) {

                dc.setId(rs.getInt(1));

            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return null;

    }

    public String pegaIdDadoBancarioPj(MPessoaJuridica pj, MDadoBancario db) {

        ResultSet rs = null;
        String sql = "SELECT b.id FROM pessoa_juridica p join dado_bancario b on"
                + " p.id = b.pessoa_juridica_id where p.nomeEmpresarial = ? and "
                + "b.tipoPessoa = ? and b.tpFornecedorCliente = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, pj.getNomeEmpresarial());
            ps.setInt(2, db.getTipoPessoa().valorPessoa);
            ps.setInt(3, db.getTipoFornecedor().valorFornecedor);
            rs = ps.executeQuery();

            if (rs.next()) {

                db.setId(rs.getInt(1));

            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return null;

    }

}
