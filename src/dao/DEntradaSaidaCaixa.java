package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import model.MEntradaSaidaCaixa;

public class DEntradaSaidaCaixa {
    
    private Connection con;
    
    public DEntradaSaidaCaixa(Connection con) {
        
        setCon(con);
        
    }
    
    public Connection getCon() {
        
        return con;
        
    }
    
    public void setCon(Connection con) {
        
        this.con = con;
    }
    
    public String salvar(MEntradaSaidaCaixa c) {
        
        String sql = "INSERT INTO estoque.caixa VALUES(null,?,?,?,?);";
        
        try {
            
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setDouble(1, c.getValorEntrada());
            ps.setDouble(2, c.getValorRetirada());
            ps.setDate(3, new Date(c.getDataMovimento().getTime()));
            ps.setString(4, c.getDescricao());
            
            if (ps.executeUpdate() > 0) {
                
                return "Movimento Salvo com sucesso!";
                
            } else {
                
                return "Erro ao salvar Movimento!";
                
            }
            
        } catch (SQLException e) {
            
            return e.getMessage();
            
        }
        
    }
    
    public String verificaSeExisteEntradaNoDia(MEntradaSaidaCaixa c) {
        
        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.caixa where dataMovimento = ?";
        
        try {
            
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setDate(1, new Date(c.getDataMovimento().getTime()));
            rs = ps.executeQuery();
            
            if (rs.next()) {
                
                c.setValorEntrada(rs.getDouble(2));
                
            }
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        return null;
        
    }
    
}
