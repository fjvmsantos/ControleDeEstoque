package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.MCadastroDeUsuario;

public class DCadastroDeUsuario {

    private Connection con;

    public DCadastroDeUsuario(Connection con) {

        setCon(con);

    }

    public Connection getCon() {

        return con;

    }

    public void setCon(Connection con) {

        this.con = con;
    }

    public String salvar(MCadastroDeUsuario u) {

        String sql = "INSERT INTO estoque.usuario VALUES(null,?,?)";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, u.getNomeUsuario());
            ps.setString(2, u.getSenha());

            if (ps.executeUpdate() > 0) {

                return "Usuário salvo com sucesso!";

            } else {

                return "Erro ao salvar usuário";

            }

        } catch (SQLException e) {

            return e.getMessage();

        }

    }

    public void verificaNomeUsuarioCadastrado(MCadastroDeUsuario u) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.usuario where nomeUsuario = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, u.getNomeUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {

                u.setNomeUsuario(rs.getString(2));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
    
    public void verificaSenhaUsuario(MCadastroDeUsuario u) {

        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.usuario where nomeUsuario = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, u.getNomeUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {

                u.setSenha(rs.getString(3));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
    
    

}
