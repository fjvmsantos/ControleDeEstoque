package dao;

import enums.TipoFornecedorCliente;
import model.MPessoaFisica;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import model.MDadoBancario;
import model.MDadoComplementar;
import model.MEndereco;

public class DPessoaFisica {

    public List<MPessoaFisica> pessoas = new ArrayList<MPessoaFisica>();

    private Connection con;

    public DPessoaFisica(Connection con) {

        setCon(con);

    }

    public Connection getCon() {

        return con;

    }

    public void setCon(Connection con) {

        this.con = con;
    }

    public String salvar(MPessoaFisica pf) {

        String sql = "INSERT INTO estoque.pessoa_fisica(nome, cpf, rg, orgaoExpedidor, "
                + "dataExpedicao,ufExpedicao,dataNascimento,nomeMae, estadoCivil,"
                + "tpFornecedorCliente)VALUES(?,?,?,?,?,?,?,?,?,?)";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, pf.getNome());
            ps.setString(2, pf.getCpf());
            ps.setString(3, pf.getRg());
            ps.setString(4, pf.getOrgaoExpedidor());
            ps.setDate(5, new Date(pf.getDataExpedicao().getTime()));
            ps.setString(6, pf.getUfExpedicao());
            ps.setDate(7, new Date(pf.getDataNascimento().getTime()));
            ps.setString(8, pf.getNomeMae());
            ps.setString(9, pf.getEstadoCivil());
            ps.setInt(10, pf.getTipoFornecedor().valorFornecedor);

            if (ps.executeUpdate() > 0) {

                return "Pessoa Física salva com sucesso!";

            } else {

                return "Erro ao salvar Pessoa Física!";

            }

        } catch (SQLException e) {

            return e.getMessage();

        }

    }

    public void listaMax() {

        ResultSet rs = null;
        String sql = "SELECT id FROM estoque.pessoa_fisica ORDER BY ID DESC LIMIT 1";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                MPessoaFisica pessoa = new MPessoaFisica();
                pessoa.setId(rs.getInt("id"));
                pessoas.add(pessoa);

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public Vector<MPessoaFisica> carregaComboPf() throws SQLException {

        Vector<MPessoaFisica> pf = new Vector<MPessoaFisica>();
        String sql = "SELECT * FROM estoque.pessoa_fisica where "
                + "tpFornecedorCliente = 2  order by nome asc";

        PreparedStatement ps = getCon().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            MPessoaFisica mpf = new MPessoaFisica();
            mpf.setNome(rs.getString("nome"));
            pf.add(mpf);

        }
        return pf;
    }

    public Vector<MPessoaFisica> carregaComboClientePf() throws SQLException {

        Vector<MPessoaFisica> pf = new Vector<MPessoaFisica>();
        String sql = "SELECT * FROM estoque.pessoa_fisica where "
                + "tpFornecedorCliente = 1  order by nome asc";

        PreparedStatement ps = getCon().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            MPessoaFisica mpf = new MPessoaFisica();
            mpf.setNome(rs.getString("nome"));
            pf.add(mpf);

        }
        return pf;
    }

    public void pegaIdFornecedor(MPessoaFisica pf) {

        ResultSet rs = null;
        String sql = "SELECT id from estoque.pessoa_fisica where nome = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, pf.getNome());
            rs = ps.executeQuery();

            if (rs.next()) {

                pf.setId(rs.getInt(1));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public void comparaCpfCadastradoCliente(MPessoaFisica pf) {

        ResultSet rs = null;
        String sql = "SELECT * from estoque.pessoa_fisica where cpf = ? "
                + "and tpFornecedorCliente = 1";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, pf.getCpf());
            rs = ps.executeQuery();

            if (rs.next()) {

                pf.setId(rs.getInt(1));
                pf.setNome(rs.getString(2));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public void comparaCpfCadastradoFornecedor(MPessoaFisica pf) {

        ResultSet rs = null;
        String sql = "SELECT * from estoque.pessoa_fisica where cpf = ? "
                + "and tpFornecedorCliente = 2";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, pf.getCpf());
            rs = ps.executeQuery();

            if (rs.next()) {

                pf.setId(rs.getInt(1));
                pf.setNome(rs.getString(2));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public void carregaDadosPf(MPessoaFisica p) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.pessoa_fisica where id = ? "
                + "and tpFornecedorCliente = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, p.getId());
            ps.setInt(2, p.getTipoFornecedor().valorFornecedor);
            rs = ps.executeQuery();

            while (rs.next()) {

                p.setCpf(rs.getString("cpf"));
                p.setNome(rs.getString("nome"));
                p.setRg(rs.getString("rg"));
                p.setDataExpedicao(rs.getDate("dataExpedicao"));
                p.setOrgaoExpedidor(rs.getString("orgaoExpedidor"));
                p.setUfExpedicao(rs.getString("ufExpedicao"));
                p.setDataNascimento(rs.getDate("dataNascimento"));
                p.setNomeMae(rs.getString("nomeMae"));
                p.setEstadoCivil(rs.getString("estadoCivil"));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public String alteraClientePf(MPessoaFisica p) {

        String sql = "update estoque.pessoa_fisica set nome=?,cpf=?, rg=?, orgaoExpedidor=?,dataExpedicao=?, "
                + "ufExpedicao=?,dataNascimento=?,nomeMae=?,estadoCivil=? where id = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, p.getNome());
            ps.setString(2, p.getCpf());
            ps.setString(3, p.getRg());
            ps.setString(4, p.getOrgaoExpedidor());
            ps.setDate(5, new Date(p.getDataExpedicao().getTime()));
            ps.setString(6, p.getUfExpedicao());
            ps.setDate(7, new Date(p.getDataNascimento().getTime()));
            ps.setString(8, p.getNomeMae());
            ps.setString(9, p.getEstadoCivil());
            ps.setInt(10, p.getId());

            if (ps.executeUpdate() > 0) {

                return "Pessoa fisica alterada com sucesso!";

            } else {

                return "Falha ao alterar Pessoa Fisica!";

            }

        } catch (SQLException e) {

            return e.getMessage();

        }

    }

    public List<MPessoaFisica> pesquisaPf(String cliente, TipoFornecedorCliente id) {

        String sql = "SELECT * FROM estoque.pessoa_fisica where nome like  ? and tpFornecedorCliente = ?";

        List<MPessoaFisica> listPf = new ArrayList<MPessoaFisica>();

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, "%" + cliente + "%");
            ps.setInt(2, id.valorFornecedor);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    MPessoaFisica pf = new MPessoaFisica();
                    pf.setId(rs.getInt(1));
                    pf.setNome(rs.getString(2));
                    pf.setCpf(rs.getString(3));

                    listPf.add(pf);

                }

                return listPf;

            } else {

                return null;

            }

        } catch (SQLException e) {

            return null;

        }

    }

    public String pegaIdEnderecoPf(MPessoaFisica pf, MEndereco end) {

        ResultSet rs = null;
        String sql = "SELECT e.id FROM pessoa_fisica p join endereco e on "
                + "p.id = e.pessoa_fisica_id where p.nome = ? "
                + "and e.tipoPessoa = ? and e.tpFornecedorCliente = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, pf.getNome());
            ps.setInt(2, end.getTipoPessoa().valorPessoa);
            ps.setInt(3, end.getTipoFornecedor().valorFornecedor);
            rs = ps.executeQuery();

            if (rs.next()) {

                end.setId(rs.getInt(1));

            }

            System.out.println(pf);

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return null;

    }

    public String pegaIdDadoCompementarPf(MPessoaFisica pf, MDadoComplementar dc) {

        ResultSet rs = null;
        String sql = "SELECT d.id FROM pessoa_fisica p join dado_complementar d "
                + "on p.id = d.pessoa_fisica_id where p.nome = ? "
                + "and d.tipoPessoa = ? and d.tpFornecedorCliente = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, pf.getNome());
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

    public String pegaIdDadoBancarioPf(MPessoaFisica pf, MDadoBancario db) {

        ResultSet rs = null;
        String sql = "SELECT b.id FROM pessoa_fisica p join dado_bancario b on "
                + "p.id = b.pessoa_fisica_id where p.nome = ? "
                + "and b.tipoPessoa = ? and b.tpFornecedorCliente = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, pf.getNome());
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
