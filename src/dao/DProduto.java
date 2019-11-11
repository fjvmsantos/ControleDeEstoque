package dao;

import model.MProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.MCategoria;

public class DProduto {
    
    public List<MProduto> produto = new ArrayList<MProduto>();
    
    private Connection con;
    
    public DProduto(Connection con) {
        
        setCon(con);
        
    }
    
    public Connection getCon() {
        
        return con;
        
    }
    
    public void setCon(Connection con) {
        
        this.con = con;
    }
    
    public String salvar(MProduto p) {
        
        String sql = "INSERT INTO estoque.produto VALUES(null,?,?,?,?,?,?,?,?)";
        
        try {
            
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, p.getProduto());
            ps.setString(2, p.getUnidade());
            ps.setString(3, p.getCodigoBarra());
            ps.setString(4, p.getModelo());
            ps.setString(5, p.getMarca());
            ps.setDouble(6, p.getEstoqueMinimo());
            ps.setString(7, p.getApresentacao());
            ps.setInt(8, p.getCategoria().getId());
            
            if (ps.executeUpdate() > 0) {
                
                return "Produto salvo com sucesso!";
                
            } else {
                
                return "Erro ao salvar produto!";
                
            }
            
        } catch (SQLException e) {
            
            return e.getMessage();
            
        }
        
    }
    
    public void listaUltimoId() {
        
        ResultSet rs = null;
        
        try {
            
            PreparedStatement ps = getCon().prepareStatement("SELECT id FROM "
                    + "estoque.produto ORDER BY ID DESC LIMIT 1");
            
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                MProduto p = new MProduto();
                p.setId(rs.getInt("id"));
                produto.add(p);
                
            }
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
    }
    
    public void carregaDadosProdutoVenda(MProduto p) {
        
        ResultSet rs = null;
        
        try {
            
            PreparedStatement ps = getCon().prepareStatement("SELECT produto_id "
                    + "FROM  estoque.saida_venda where codigoBarras = ?");
            
            ps.setString(1, p.getCodigoBarra());
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                p.setCodigoBarra(rs.getString("codigoBarras"));
                p.setUnidade(rs.getString("unidade"));
                p.setId(rs.getInt("produto_id"));
                
            }
            
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
        
    }
    
    public void pegaIdProduto(MProduto p) {
        
        ResultSet rs = null;
        String sql = "SELECT * from estoque.produto where produto = ?";
        
        try {
            
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, p.getProduto());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                
                p.setId(rs.getInt(1));
                
            }
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
    }

    //CARREGANDO DADOS DO BANCO COM NA VIEW COM JOIN
    public void carregaDadosProduto(MProduto p, MCategoria c) {
        
        ResultSet rs = null;
        String sql = "SELECT * FROM produto p join categoria c on"
                + " p.categoria_id = c.id where codigoBarra = ?";
        
        try {
            
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, p.getCodigoBarra());
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                p.setProduto(rs.getString(11));
                
                c.setCategoria(rs.getString(2));
                
            }
            
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
        
    }
    
    public void pegaNomeUnidadeProduto(MProduto p) {
        
        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.produto WHERE codigoBarra = ?";
        
        try {
            
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, p.getCodigoBarra());
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                p.setProduto(rs.getString(2));
                p.setUnidade(rs.getString(3));
            }
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
    }
    
    public List<MProduto> carregaListaProduto(String p) {
        
        String sql = "SELECT * FROM estoque.produto where produto like ?";
        List<MProduto> listProd = new ArrayList<MProduto>();
        
        try {
            
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, "%" + p + "%");
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                
                while (rs.next()) {
                    
                    MProduto prod = new MProduto();
                    prod.setId(rs.getInt("id"));
                    prod.setProduto(rs.getString("produto"));
                    
                    listProd.add(prod);
                    
                }
                
                return listProd;
                
            } else {
                
                return null;
                
            }
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
        return null;
        
    }
    
    public void carregaDadosProduto(MProduto p) {
        
        ResultSet rs = null;
        String sql = "SELECT produto,unidade,codigoBarra,modelo,marca,"
                + "minimo_estoque,apresentacao,Categoria FROM produto p "
                + "join categoria c on c.id = p.categoria_id where p.id=?";
        
        try {
            
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, p.getId());
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                p.setProduto(rs.getString("produto"));
                p.setUnidade(rs.getString("unidade"));
                p.setCodigoBarra(rs.getString("codigoBarra"));
                p.setModelo(rs.getString("modelo"));
                p.setMarca(rs.getString("marca"));
                p.setEstoqueMinimo(rs.getDouble("minimo_estoque"));
                p.setApresentacao(rs.getString("apresentacao"));
                MCategoria c = new MCategoria();
                c.setCategoria(rs.getString(8));
                p.setCategoria(c);
                
            }
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
    }
    
    public String alteraProduto(MProduto p) {
        
        String sql = "update estoque.produto set produto=?,unidade=?,codigoBarra=?,modelo=?,marca=?,"
                + "minimo_estoque=?,apresentacao=?,categoria_id=? where id = ?";
        
        try {
            
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, p.getProduto());
            ps.setString(2, p.getUnidade());
            ps.setString(3, p.getCodigoBarra());
            ps.setString(4, p.getModelo());
            ps.setString(5, p.getMarca());
            ps.setDouble(6, p.getEstoqueMinimo());
            ps.setString(7, p.getApresentacao());
            ps.setInt(8, p.getCategoria().getId());
            ps.setInt(9, p.getId());
            
            if (ps.executeUpdate() > 0) {
                
                return "Produto alterado com sucesso!";
                
            } else {
                
                return "Falha ao alterar Produto!";
                
            }
            
        } catch (SQLException e) {
            
            return e.getMessage();
            
        }
        
    }
    
    public void verificaProdutoCadastrado(MProduto p) {
        
        ResultSet rs = null;
        String sql = "SELECT * FROM estoque.produto where produto = ? and modelo = ? and marca = ?";
        
        try {
            
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, p.getProduto());
            ps.setString(2, p.getModelo());
            ps.setString(3, p.getMarca());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                
                p.setId(rs.getInt(1));
                
            }
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
    }
    
}
