package view;

import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal extends javax.swing.JFrame {

    CadastroPessoaFisicaCliente cadPessoaFisicaCliente;
    CadastroPessoaFisicaFornecedor cadPessoaFisicaFornecedor;
    CadastroPessoaJuridicaCliente cadPessoaJuridicaCliente;
    CadastroPessoaJuridicaFornecedor cadPessoaJuridicaFornecedor;
    Categoria cat;
    CadastroDeUsuario usuario;
    EntradaSaidaCaixa caixa;
    EntradaProdutos entProd;
    Produto prod;
    LancamentoValorHaver recebimentoEmHaver;
    VendaProduto vendaProduto;
    RelatorioEntradasNoEstoque geraEntradaEstoque;
    RelatorioSaidaVenda saidaEstoqueVenda;

    public Principal() {
        initComponents();
        setIconSistema();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuItemCategoria = new javax.swing.JMenuItem();
        menuItemClientes = new javax.swing.JMenu();
        menuItemClientePessoaFisica = new javax.swing.JMenuItem();
        menuItemClientePessoaJuridica = new javax.swing.JMenuItem();
        menuFornecedores = new javax.swing.JMenu();
        menuItemPessoaFisicaa = new javax.swing.JMenuItem();
        menuItemFornecedorPessoaJuridicaa = new javax.swing.JMenuItem();
        menuItemProduto = new javax.swing.JMenuItem();
        menuItemUsuario = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuItemEntradaEstoque = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        menuCaixa = new javax.swing.JMenu();
        menuItemAberturaCaixa = new javax.swing.JMenuItem();
        menuItemRecebimento = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Estoque");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(6);

        jDesktopPane1.setBackground(new java.awt.Color(240, 240, 240));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jDesktopPane1.setForeground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 640, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(347, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        menuCadastro.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\cadastro.png")); // NOI18N
        menuCadastro.setText("Cadastro");

        menuItemCategoria.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\categoria.png")); // NOI18N
        menuItemCategoria.setText("Categorias");
        menuItemCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCategoriaActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemCategoria);

        menuItemClientes.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\cliente.png")); // NOI18N
        menuItemClientes.setText("Clientes");

        menuItemClientePessoaFisica.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\pessoa_fisica.png")); // NOI18N
        menuItemClientePessoaFisica.setText("Pessoa Física");
        menuItemClientePessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClientePessoaFisicaActionPerformed(evt);
            }
        });
        menuItemClientes.add(menuItemClientePessoaFisica);

        menuItemClientePessoaJuridica.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\pessoa_juridica.png")); // NOI18N
        menuItemClientePessoaJuridica.setText("Pessoa Jurídica");
        menuItemClientePessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClientePessoaJuridicaActionPerformed(evt);
            }
        });
        menuItemClientes.add(menuItemClientePessoaJuridica);

        menuCadastro.add(menuItemClientes);

        menuFornecedores.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\fornecedor.png")); // NOI18N
        menuFornecedores.setText("Fornecedor");

        menuItemPessoaFisicaa.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\pessoa_fisica.png")); // NOI18N
        menuItemPessoaFisicaa.setText("Pessoa Física");
        menuItemPessoaFisicaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPessoaFisicaaActionPerformed(evt);
            }
        });
        menuFornecedores.add(menuItemPessoaFisicaa);

        menuItemFornecedorPessoaJuridicaa.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\pessoa_juridica.png")); // NOI18N
        menuItemFornecedorPessoaJuridicaa.setText("Pessoa Jurídica");
        menuItemFornecedorPessoaJuridicaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFornecedorPessoaJuridicaaActionPerformed(evt);
            }
        });
        menuFornecedores.add(menuItemFornecedorPessoaJuridicaa);

        menuCadastro.add(menuFornecedores);

        menuItemProduto.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\produto.png")); // NOI18N
        menuItemProduto.setText("Produtos");
        menuItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProdutoActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemProduto);

        menuItemUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabio\\Downloads\\Documents\\NetBeansProjects\\v24\\ControleDeEstoque\\src\\icon\\usuario.png")); // NOI18N
        menuItemUsuario.setText("Usuário");
        menuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemUsuario);

        jMenuBar2.add(menuCadastro);

        jMenu4.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\movimento.png")); // NOI18N
        jMenu4.setText("Movimentos");

        menuItemEntradaEstoque.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\entrada_estoque.png")); // NOI18N
        menuItemEntradaEstoque.setText("Entrada Estoque");
        menuItemEntradaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEntradaEstoqueActionPerformed(evt);
            }
        });
        jMenu4.add(menuItemEntradaEstoque);

        jMenuItem6.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\venda.png")); // NOI18N
        jMenuItem6.setText("Venda");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuBar2.add(jMenu4);

        menuCaixa.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\caixa.png")); // NOI18N
        menuCaixa.setText("Caixa");

        menuItemAberturaCaixa.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\entrada_saida_caixa.png")); // NOI18N
        menuItemAberturaCaixa.setText("Entradas/Saída");
        menuItemAberturaCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAberturaCaixaActionPerformed(evt);
            }
        });
        menuCaixa.add(menuItemAberturaCaixa);

        menuItemRecebimento.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\recebimento.png")); // NOI18N
        menuItemRecebimento.setText("Recebimentos");
        menuItemRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRecebimentoActionPerformed(evt);
            }
        });
        menuCaixa.add(menuItemRecebimento);

        jMenuBar2.add(menuCaixa);

        jMenu6.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\relatorio.png")); // NOI18N
        jMenu6.setText("Relatórios");

        jMenu1.setText("Gerencial");

        jMenuItem1.setText("Entradas no Estoque");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Vendas/Saída do Estoque");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenu6.add(jMenu1);

        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemClientePessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClientePessoaJuridicaActionPerformed

        if (cadPessoaJuridicaCliente == null) {

            cadPessoaJuridicaCliente = new CadastroPessoaJuridicaCliente();
            jDesktopPane1.add(cadPessoaJuridicaCliente);
            cadPessoaJuridicaCliente.setVisible(true);

        } else {

            cadPessoaJuridicaCliente = new CadastroPessoaJuridicaCliente();
            jDesktopPane1.add(cadPessoaJuridicaCliente);
            cadPessoaJuridicaCliente.setVisible(true);

        }

    }//GEN-LAST:event_menuItemClientePessoaJuridicaActionPerformed

    private void menuItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProdutoActionPerformed

        if (prod == null) {
            try {
                prod = new Produto();
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            jDesktopPane1.add(prod);
            prod.setVisible(true);
        } else {
            try {
                prod = new Produto();
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            jDesktopPane1.add(prod);
            prod.setVisible(true);
        }

    }//GEN-LAST:event_menuItemProdutoActionPerformed

    private void menuItemCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCategoriaActionPerformed

        if (cat == null) {

            cat = new Categoria();
            jDesktopPane1.add(cat);
            cat.setVisible(true);

        } else {

            cat = new Categoria();
            jDesktopPane1.add(cat);
            cat.setVisible(true);

        }

    }//GEN-LAST:event_menuItemCategoriaActionPerformed

    private void menuItemClientePessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClientePessoaFisicaActionPerformed

        if (cadPessoaFisicaCliente == null) {

            cadPessoaFisicaCliente = new CadastroPessoaFisicaCliente();
            jDesktopPane1.add(cadPessoaFisicaCliente);
            cadPessoaFisicaCliente.setVisible(true);

        } else {

            cadPessoaFisicaCliente = new CadastroPessoaFisicaCliente();
            jDesktopPane1.add(cadPessoaFisicaCliente);
            cadPessoaFisicaCliente.setVisible(true);

        }

    }//GEN-LAST:event_menuItemClientePessoaFisicaActionPerformed

    private void menuItemEntradaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEntradaEstoqueActionPerformed

        if (entProd == null) {

            try {
                entProd = new EntradaProdutos();
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            jDesktopPane1.add(entProd);
            entProd.setVisible(true);

        } else {

            try {
                entProd = new EntradaProdutos();
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            jDesktopPane1.add(entProd);
            entProd.setVisible(true);

        }

    }//GEN-LAST:event_menuItemEntradaEstoqueActionPerformed

    private void menuItemPessoaFisicaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPessoaFisicaaActionPerformed

        if (cadPessoaFisicaFornecedor == null) {

            cadPessoaFisicaFornecedor = new CadastroPessoaFisicaFornecedor();
            jDesktopPane1.add(cadPessoaFisicaFornecedor);
            cadPessoaFisicaFornecedor.setVisible(true);

        } else {

            cadPessoaFisicaFornecedor = new CadastroPessoaFisicaFornecedor();
            jDesktopPane1.add(cadPessoaFisicaFornecedor);
            cadPessoaFisicaFornecedor.setVisible(true);

        }

    }//GEN-LAST:event_menuItemPessoaFisicaaActionPerformed

    private void menuItemFornecedorPessoaJuridicaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFornecedorPessoaJuridicaaActionPerformed

        if (cadPessoaJuridicaFornecedor == null) {

            cadPessoaJuridicaFornecedor = new CadastroPessoaJuridicaFornecedor();
            jDesktopPane1.add(cadPessoaJuridicaFornecedor);
            cadPessoaJuridicaFornecedor.setVisible(true);

        } else {

            cadPessoaJuridicaFornecedor = new CadastroPessoaJuridicaFornecedor();
            jDesktopPane1.add(cadPessoaJuridicaFornecedor);
            cadPessoaJuridicaFornecedor.setVisible(true);

        }

    }//GEN-LAST:event_menuItemFornecedorPessoaJuridicaaActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

        if (vendaProduto == null) {

            vendaProduto = new VendaProduto();
            jDesktopPane1.add(vendaProduto);
            vendaProduto.setVisible(true);

        } else {

            vendaProduto = new VendaProduto();
            jDesktopPane1.add(vendaProduto);
            vendaProduto.setVisible(true);
        }

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void menuItemAberturaCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAberturaCaixaActionPerformed

        if (caixa == null) {

            caixa = new EntradaSaidaCaixa();
            jDesktopPane1.add(caixa);
            caixa.setVisible(true);

        } else {

            caixa = new EntradaSaidaCaixa();
            jDesktopPane1.add(caixa);
            caixa.setVisible(true);

        }

    }//GEN-LAST:event_menuItemAberturaCaixaActionPerformed

    private void menuItemRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRecebimentoActionPerformed

        if (recebimentoEmHaver == null) {

            recebimentoEmHaver = new LancamentoValorHaver();
            jDesktopPane1.add(recebimentoEmHaver);
            recebimentoEmHaver.setVisible(true);

        } else {

            recebimentoEmHaver = new LancamentoValorHaver();
            jDesktopPane1.add(recebimentoEmHaver);
            recebimentoEmHaver.setVisible(true);

        }

    }//GEN-LAST:event_menuItemRecebimentoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        if (geraEntradaEstoque == null) {

            geraEntradaEstoque = new RelatorioEntradasNoEstoque();
            jDesktopPane1.add(geraEntradaEstoque);
            geraEntradaEstoque.setVisible(true);

        } else {

            geraEntradaEstoque = new RelatorioEntradasNoEstoque();
            jDesktopPane1.add(geraEntradaEstoque);
            geraEntradaEstoque.setVisible(true);

        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        if (saidaEstoqueVenda == null) {

            saidaEstoqueVenda = new RelatorioSaidaVenda();
            jDesktopPane1.add(saidaEstoqueVenda);
            saidaEstoqueVenda.setVisible(true);

        } else {

            saidaEstoqueVenda = new RelatorioSaidaVenda();
            jDesktopPane1.add(saidaEstoqueVenda);
            saidaEstoqueVenda.setVisible(true);

        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUsuarioActionPerformed

        if (usuario == null) {

            usuario = new CadastroDeUsuario();
            jDesktopPane1.add(usuario);
            usuario.setVisible(true);

        } else {

            usuario = new CadastroDeUsuario();
            jDesktopPane1.add(usuario);
            usuario.setVisible(true);

        }

    }//GEN-LAST:event_menuItemUsuarioActionPerformed

    public void setIconSistema() {

        setIconImage(Toolkit.getDefaultToolkit().createImage("C:/ControleDeEstoque/dist/icon/sistema.png"));

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuCaixa;
    private javax.swing.JMenu menuFornecedores;
    private javax.swing.JMenuItem menuItemAberturaCaixa;
    private javax.swing.JMenuItem menuItemCategoria;
    private javax.swing.JMenuItem menuItemClientePessoaFisica;
    private javax.swing.JMenuItem menuItemClientePessoaJuridica;
    private javax.swing.JMenu menuItemClientes;
    private javax.swing.JMenuItem menuItemEntradaEstoque;
    private javax.swing.JMenuItem menuItemFornecedorPessoaJuridicaa;
    private javax.swing.JMenuItem menuItemPessoaFisicaa;
    private javax.swing.JMenuItem menuItemProduto;
    private javax.swing.JMenuItem menuItemRecebimento;
    private javax.swing.JMenuItem menuItemUsuario;
    // End of variables declaration//GEN-END:variables

}
