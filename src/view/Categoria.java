package view;

import dao.DCategoria;
import dao.DConexao;
import java.awt.Graphics;
import model.MCategoria;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Categoria extends javax.swing.JInternalFrame {

    PesquisaCategoria cat;

    public Categoria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 =    jDesktopPane1  = new javax.swing.JDesktopPane() {

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(java.awt.Color.lightGray);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoCategoria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescricaoCategoria = new javax.swing.JTextField();
        butCarregar = new javax.swing.JButton();
        butSalvar = new javax.swing.JButton();
        butAlteraRegistro = new javax.swing.JButton();
        butPesquisar = new javax.swing.JButton();
        butCancelar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Categoria de Produtos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Categorias"));

        jLabel1.setText("Código da Categoria");

        txtCodigoCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoCategoriaKeyPressed(evt);
            }
        });

        jLabel2.setText("Descrição da Categoria");

        txtDescricaoCategoria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescricaoCategoriaFocusLost(evt);
            }
        });
        txtDescricaoCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescricaoCategoriaKeyPressed(evt);
            }
        });

        butCarregar.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\carregar.png")); // NOI18N
        butCarregar.setText("Carregar");
        butCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCarregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCodigoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butCarregar)
                        .addGap(0, 116, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDescricaoCategoria))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butCarregar))
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricaoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        butSalvar.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\salvar.png")); // NOI18N
        butSalvar.setText("Salvar");
        butSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSalvarActionPerformed(evt);
            }
        });

        butAlteraRegistro.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\alterar.png")); // NOI18N
        butAlteraRegistro.setText("Alterar Registro");
        butAlteraRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAlteraRegistroActionPerformed(evt);
            }
        });

        butPesquisar.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\pesquisar.png")); // NOI18N
        butPesquisar.setText("Pesquisar");
        butPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPesquisarActionPerformed(evt);
            }
        });

        butCancelar.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\cancel.png")); // NOI18N
        butCancelar.setText("Cancelar");
        butCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(butSalvar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(butAlteraRegistro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(butPesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(butCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butAlteraRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(butSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(butAlteraRegistro)
                        .addGap(18, 18, 18)
                        .addComponent(butPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(butCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Categorias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalvarActionPerformed

        if (txtDescricaoCategoria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Descrição!",
                    "Atenção", JOptionPane.WARNING_MESSAGE, frameIcon);
            return;
        }

        Connection con = DConexao.abrirConexao();
        DCategoria dc = new DCategoria(con);
        MCategoria mc = new MCategoria();
        mc.setCategoria(txtDescricaoCategoria.getText().toUpperCase());

        System.out.println(dc.salvar(mc));

        if (!dc.equals(0)) {

            JOptionPane.showMessageDialog(null, "Categoria salva com sucesso!",
                    "Sucesso!", JOptionPane.WIDTH);
            return;

        }

    }//GEN-LAST:event_butSalvarActionPerformed

    private void txtCodigoCategoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoCategoriaKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtDescricaoCategoria.requestFocus();

        }

    }//GEN-LAST:event_txtCodigoCategoriaKeyPressed

    private void txtDescricaoCategoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoCategoriaKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            butSalvar.requestFocus();

        }
    }//GEN-LAST:event_txtDescricaoCategoriaKeyPressed

    private void butPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPesquisarActionPerformed

        if (cat == null) {

            cat = new PesquisaCategoria();
            jDesktopPane1.add(cat);
            cat.setVisible(true);

        } else {

            cat = new PesquisaCategoria();
            jDesktopPane1.add(cat);
            cat.setVisible(true);

        }

    }//GEN-LAST:event_butPesquisarActionPerformed

    private void butCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCarregarActionPerformed

        if (!txtCodigoCategoria.getText().isEmpty()) {

            butSalvar.setEnabled(false);
            Connection con = DConexao.abrirConexao();
            MCategoria mc = new MCategoria();
            DCategoria md = new DCategoria(con);

            int id = Integer.parseInt(txtCodigoCategoria.getText());
            mc.setId(id);
            md.carregaDadosCategoria(mc);

            txtDescricaoCategoria.setText(mc.getCategoria().toUpperCase());

        } else {

            butSalvar.setEnabled(true);

        }

    }//GEN-LAST:event_butCarregarActionPerformed

    private void butAlteraRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAlteraRegistroActionPerformed

        Connection con = DConexao.abrirConexao();
        MCategoria mc = new MCategoria();
        DCategoria dc = new DCategoria(con);

        int id = Integer.parseInt(txtCodigoCategoria.getText());
        mc.setId(id);
        mc.setCategoria(txtDescricaoCategoria.getText().toUpperCase());
        System.out.println(dc.alteraCategoria(mc));

        JOptionPane.showMessageDialog(null, "Categoria Alterada com Sucesso!");

    }//GEN-LAST:event_butAlteraRegistroActionPerformed

    private void butCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarActionPerformed

        dispose();

    }//GEN-LAST:event_butCancelarActionPerformed

    private void txtDescricaoCategoriaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescricaoCategoriaFocusLost

        verificaSeCategoriaJaExiste();

    }//GEN-LAST:event_txtDescricaoCategoriaFocusLost

    private void verificaSeCategoriaJaExiste() {

        Connection con = DConexao.abrirConexao();
        DCategoria dcat = new DCategoria(con);
        MCategoria mcat = new MCategoria();
        
        mcat.setCategoria(txtDescricaoCategoria.getText());
        dcat.verificaSeCategoriaEstaCadastrado(mcat);
        mcat.setId(mcat.getId());
        
        System.out.println("Categoria: "+mcat.getId());

        if (mcat.getId() == 0) {
            
        } else {

            JOptionPane.showMessageDialog(null, "Essa categoria já está cadastrada!\n" + "Codigo dessa categoria: " + mcat.getId());
            txtDescricaoCategoria.requestFocus();
            txtDescricaoCategoria.setText("");

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAlteraRegistro;
    private javax.swing.JButton butCancelar;
    private javax.swing.JButton butCarregar;
    private javax.swing.JButton butPesquisar;
    private javax.swing.JButton butSalvar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtCodigoCategoria;
    private javax.swing.JTextField txtDescricaoCategoria;
    // End of variables declaration//GEN-END:variables
}
