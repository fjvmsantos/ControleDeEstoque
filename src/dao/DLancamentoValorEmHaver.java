package dao;

import enums.TipoStatusDaConta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.MFormaPagamento;
import model.MMovimentoSaidaVenda;
import model.MPessoaFisica;
import model.MLancamentoValorEmHaver;
import model.MPessoaJuridica;

public class DLancamentoValorEmHaver {

    private Connection con;

    public DLancamentoValorEmHaver(Connection con) {

        setCon(con);

    }

    public Connection getCon() {

        return con;

    }

    public void setCon(Connection con) {

        this.con = con;
    }

    public String salvar(MLancamentoValorEmHaver recebe) {

        String sql = "insert into estoque.lancamento_em_haver_venda values(null,?,?,?,?,?,?);";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, recebe.getClientePf().getId());
            ps.setInt(2, recebe.getClientePj().getId());
            ps.setInt(3, recebe.getMovimentoSaidaVenda().getNum_venda());
            ps.setDouble(4, recebe.getPagamento().getValorPorFormaPg());
            ps.setInt(5, recebe.getStatusDaConta().valorStatus);
            ps.setDate(6, new Date(recebe.getData_movimento().getTime()));

            if (ps.executeUpdate() > 0) {

                return "Pagamento salvo com sucesso!";

            } else {

                return "Erro ao salvar pagamento";

            }

        } catch (SQLException e) {

            return e.getMessage();
        }

    }

    public List<MLancamentoValorEmHaver> carregaContaPf(MPessoaFisica idCliente, TipoStatusDaConta satus) {

        String sql = "SELECT * FROM estoque.lancamento_em_haver_venda where cliente_pf = ? and statusDaConta = ?";

        List<MLancamentoValorEmHaver> carregaConta = new ArrayList<MLancamentoValorEmHaver>();

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, idCliente.getId());
            ps.setInt(2, satus.valorStatus);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    MPessoaFisica pf = new MPessoaFisica();
                    pf.setId(rs.getInt(2));

                    MMovimentoSaidaVenda ms = new MMovimentoSaidaVenda();
                    ms.setNum_venda(rs.getInt(4));

                    MFormaPagamento form = new MFormaPagamento();
                    form.setValorPorFormaPg(rs.getInt(5));

                    MLancamentoValorEmHaver mr = new MLancamentoValorEmHaver();
                    mr.setId(rs.getInt(1));
                    mr.setClientePf(pf);
                    mr.setStatusDaConta(satus);
                    mr.setData_movimento(rs.getDate(7));
                    mr.setMovimentoSaidaVenda(ms);
                    mr.setPagamento(form);

                    carregaConta.add(mr);

                }

                return carregaConta;

            } else {

                return null;

            }

        } catch (SQLException e) {

            return null;

        }

    }

    public List<MLancamentoValorEmHaver> carregaContaPj(MPessoaJuridica idCliente, TipoStatusDaConta satus) {

        String sql = "SELECT * FROM estoque.lancamento_em_haver_venda where cliente_pj = ? and statusDaConta = ?";

        List<MLancamentoValorEmHaver> carregaConta = new ArrayList<MLancamentoValorEmHaver>();

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, idCliente.getId());
            ps.setInt(2, satus.valorStatus);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    MPessoaJuridica pj = new MPessoaJuridica();
                    pj.setId(rs.getInt(3));

                    MMovimentoSaidaVenda ms = new MMovimentoSaidaVenda();
                    ms.setNum_venda(rs.getInt(4));

                    MFormaPagamento form = new MFormaPagamento();
                    form.setValorPorFormaPg(rs.getInt(5));

                    MLancamentoValorEmHaver mr = new MLancamentoValorEmHaver();
                    mr.setId(rs.getInt(1));
                    mr.setClientePj(pj);
                    mr.setStatusDaConta(satus);
                    mr.setData_movimento(rs.getDate(7));
                    mr.setMovimentoSaidaVenda(ms);
                    mr.setPagamento(form);

                    carregaConta.add(mr);

                }

                return carregaConta;

            } else {

                return null;

            }

        } catch (SQLException e) {

            return null;

        }

    }

    public void pegaIdLancamentoPf(MLancamentoValorEmHaver haver) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.lancamento_em_haver_venda where "
                + "cliente_pf = ? and num_venda = ? and statusDaConta = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, haver.getClientePf().getId());
            ps.setInt(2, haver.getMovimentoSaidaVenda().getNum_venda());
            ps.setInt(3, haver.getStatusDaConta().valorStatus);
            rs = ps.executeQuery();

            if (rs.next()) {

                haver.setId(rs.getInt(1));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public void pegaIdLancamentoPj(MLancamentoValorEmHaver haver) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.lancamento_em_haver_venda where "
                + "cliente_pj = ? and num_venda = ? and statusDaConta = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, haver.getClientePj().getId());
            ps.setInt(2, haver.getMovimentoSaidaVenda().getNum_venda());
            ps.setInt(3, haver.getStatusDaConta().valorStatus);
            rs = ps.executeQuery();

            if (rs.next()) {

                haver.setId(rs.getInt(1));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public String alteraStatus(MLancamentoValorEmHaver haver) {

        String sql = "UPDATE estoque.lancamento_em_haver_venda SET "
                + "statusDaConta=? where id=?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, haver.getStatusDaConta().valorStatus);
            ps.setInt(2, haver.getId());

            if (ps.executeUpdate() > 0) {

                return "Status atualizado com sucesso!";

            } else {

                return "Erro ao tentar atualizar Status";

            }

        } catch (SQLException e) {

            return e.getMessage() + "Exceção ao alterar Status";

        }

    }

}
