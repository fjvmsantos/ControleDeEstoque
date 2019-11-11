package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.MRecebimentoContaEmHaver;

public class DRecebimentoContaEmHaver {

    private Connection con;

    public DRecebimentoContaEmHaver(Connection con) {

        setCon(con);

    }

    public Connection getCon() {

        return con;

    }

    public void setCon(Connection con) {

        this.con = con;
    }

    public String salvar(MRecebimentoContaEmHaver receb) {

        String sql = "insert into estoque.extrato_conta_emhaver values"
                + "(null,?,?,?,?,?,?,?)";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, receb.getClientePf());
            ps.setInt(2, receb.getClientePj());
            ps.setDouble(3, receb.getValorDaConta());
            ps.setDouble(4, receb.getValorPago());
            ps.setInt(5, receb.getIdLancamento());
            ps.setInt(6, receb.getNumeroCompra());
            ps.setDate(7, new Date(receb.getDataMovimento().getTime()));

            if (ps.executeUpdate() > 0) {

                return "Valor Recebido";

            } else {

                return "Erro ao salvar Recebimento!";

            }

        } catch (SQLException e) {

            return e.getMessage();

        }

    }

    public void totalPagoAteMomento(MRecebimentoContaEmHaver r) {

        ResultSet rs = null;
        String sql = "SELECT sum(valor_pago) from estoque.extrato_conta_emhaver where cliente_pf = ? and num_venda = ? order by id desc limit 1";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, r.getClientePf());
            ps.setInt(2, r.getNumeroCompra());
            rs = ps.executeQuery();

            if (rs.next()) {

                r.setValorPago(rs.getDouble(1));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public void totalPagoAteMomentoPj(MRecebimentoContaEmHaver r) {

        ResultSet rs = null;
        String sql = "SELECT sum(valor_pago) from estoque.extrato_conta_emhaver where cliente_pj = ? and num_venda = ? order by id desc limit 1";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, r.getClientePj());
            ps.setInt(2, r.getNumeroCompra());
            rs = ps.executeQuery();

            if (rs.next()) {

                r.setValorPago(rs.getDouble(1));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

}
