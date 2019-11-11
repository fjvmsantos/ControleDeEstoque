package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.MFormaPagamento;

public class DFormaPagamento {

    private Connection con;

    public DFormaPagamento(Connection con) {

        setCon(con);

    }

    public Connection getCon() {

        return con;

    }

    public void setCon(Connection con) {

        this.con = con;
    }

    public String salvar(MFormaPagamento formaPg) {

        String sql = "insert into pagamento values(null,?,?,?,?,?,?,?,?)";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, formaPg.getNum_venda());
            ps.setInt(2, formaPg.getTipoPagamento().formaPagamento);
            ps.setDouble(3, formaPg.getValorPorFormaPg());
            ps.setDouble(4, formaPg.getTotal_venda());
            ps.setInt(5, formaPg.getPessoaFisica().getId());
            ps.setInt(6, formaPg.getPessoaJuridica().getId());
            ps.setInt(7, formaPg.getStatusDaConta().valorStatus);
            ps.setDate(8, new Date(formaPg.getDataVenda().getTime()));

            if (ps.executeUpdate() > 0) {

                return "Pagamento salva com sucesso!";

            } else {

                return "Erro ao salvar pagamento";

            }

        } catch (SQLException e) {

            return e.getMessage();
        }

    }

    public void pegaValorEmHaver(MFormaPagamento f) {

        ResultSet rs = null;
        String sql = "SELECT * from estoque.pagamento where num_venda = ? and "
                + "forma_pagamento = ? and statusPagamento = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, f.getNum_venda());
            ps.setInt(2, f.getTipoPagamento().formaPagamento);
            ps.setInt(3, f.getStatusDaConta().valorStatus);
            rs = ps.executeQuery();

            if (rs.next()) {

                f.setValorPorFormaPg(rs.getDouble(4));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

}
