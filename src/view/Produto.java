package view;

import dao.DConexao;
import dao.DProduto;
import dao.DTotalProduto;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.MCategoria;
import model.MProduto;
import model.MTotalProduto;
import dao.DCategoria;
import java.awt.Graphics;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Produto extends javax.swing.JInternalFrame {

    PesquisaProduto produto;

    public Produto() throws SQLException {
        initComponents();
        carregaComboBox();

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
        txtCodigoProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoBarras = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUnidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtApresentacao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEstoqueMinimo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<String>();
        butCarregar = new javax.swing.JButton();
        butSalvar = new javax.swing.JButton();
        butAlteraRegistro = new javax.swing.JButton();
        butPesquisar = new javax.swing.JButton();
        butCancelar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Produtos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Produtos"));

        jLabel1.setText("Código do Produto");

        txtCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoProdutoKeyPressed(evt);
            }
        });

        jLabel2.setText("Código de Barras");

        txtCodigoBarras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoBarrasKeyPressed(evt);
            }
        });

        jLabel3.setText("Produto");

        txtProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProdutoKeyPressed(evt);
            }
        });

        jLabel4.setText("Marca");

        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMarcaKeyPressed(evt);
            }
        });

        jLabel5.setText("Modelo");

        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtModeloKeyPressed(evt);
            }
        });

        jLabel6.setText("Unidade");

        txtUnidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUnidadeKeyPressed(evt);
            }
        });

        jLabel7.setText("Apresentação");

        txtApresentacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApresentacaoKeyPressed(evt);
            }
        });

        jLabel8.setText("Estoque Mínimo");

        txtEstoqueMinimo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEstoqueMinimoFocusLost(evt);
            }
        });
        txtEstoqueMinimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEstoqueMinimoKeyPressed(evt);
            }
        });

        jLabel9.setText("Categoria");

        comboCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboCategoriaKeyPressed(evt);
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodigoBarras))
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtModelo)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(butCarregar)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtEstoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboCategoria, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 135, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(butCarregar)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
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

        butPesquisar.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\alterar.png")); // NOI18N
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

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butAlteraRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(butSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(butAlteraRegistro)
                        .addGap(15, 15, 15)
                        .addComponent(butPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(butCancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(butSalvar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(butAlteraRegistro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(butPesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(butCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

        verificaProdutoCadastrado();
        if (txtCodigoBarras.getText().isEmpty()
                || txtProduto.getText().isEmpty()
                || txtMarca.getText().isEmpty()
                || txtModelo.getText().isEmpty()
                || txtApresentacao.getText().isEmpty()
                || txtUnidade.getText().isEmpty()
                || txtEstoqueMinimo.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos",
                    "Atenção", JOptionPane.WARNING_MESSAGE, frameIcon);

            return;

        }

        if (comboCategoria.getSelectedItem() == null) {

            JOptionPane.showMessageDialog(null, "É necessário informar uma \ncategoria para o produto!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;

        }

        Connection con = DConexao.abrirConexao();
        DProduto dp = new DProduto(con);
        MProduto mp = new MProduto();
        MCategoria cat = new MCategoria();
        DCategoria cd = new DCategoria(con);

        MTotalProduto tp = new MTotalProduto();
        DTotalProduto dtp = new DTotalProduto(con);

        mp.setProduto(txtProduto.getText().toUpperCase());
        mp.setUnidade(txtUnidade.getText().toUpperCase());
        mp.setCodigoBarra(txtCodigoBarras.getText());
        mp.setModelo(txtModelo.getText().toUpperCase());
        mp.setMarca(txtMarca.getText().toUpperCase());

        double estMin = Double.parseDouble(txtEstoqueMinimo.getText().replace(",", "."));
        mp.setEstoqueMinimo(estMin);
        mp.setApresentacao(txtApresentacao.getText().toUpperCase());

        cat.setCategoria(comboCategoria.getSelectedItem().toString());
        cd.pegaIdCategoria(cat);
        cat.setId(cat.getId());
        mp.setCategoria(cat);

        System.out.println(dp.salvar(mp));

        JOptionPane.showMessageDialog(null, "Produto Salvo com Sucesso!");

        dp.listaUltimoId();
        List<MProduto> p = dp.produto;
        if (!p.isEmpty()) {

            for (MProduto pr : dp.produto) {
                mp.setId(pr.getId());
                mp.setProduto(pr.getCodigoBarra());
                tp.setProduto(mp);

            }

        }

        System.out.println(dtp.salvar(tp));


    }//GEN-LAST:event_butSalvarActionPerformed

    private void txtCodigoProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProdutoKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtCodigoBarras.requestFocus();

        }

    }//GEN-LAST:event_txtCodigoProdutoKeyPressed

    private void txtCodigoBarrasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoBarrasKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtProduto.requestFocus();

        }
    }//GEN-LAST:event_txtCodigoBarrasKeyPressed

    private void txtProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdutoKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtMarca.requestFocus();

        }


    }//GEN-LAST:event_txtProdutoKeyPressed

    private void txtMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtModelo.requestFocus();

        }

    }//GEN-LAST:event_txtMarcaKeyPressed

    private void txtModeloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtApresentacao.requestFocus();

        }

    }//GEN-LAST:event_txtModeloKeyPressed

    private void txtApresentacaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApresentacaoKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtUnidade.requestFocus();

        }

    }//GEN-LAST:event_txtApresentacaoKeyPressed

    private void txtUnidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidadeKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtEstoqueMinimo.requestFocus();

        }

    }//GEN-LAST:event_txtUnidadeKeyPressed

    private void txtEstoqueMinimoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstoqueMinimoKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            comboCategoria.requestFocus();

        }

    }//GEN-LAST:event_txtEstoqueMinimoKeyPressed

    private void comboCategoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboCategoriaKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            butSalvar.requestFocus();

        }

    }//GEN-LAST:event_comboCategoriaKeyPressed

    private void txtEstoqueMinimoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEstoqueMinimoFocusLost

        DecimalFormat df = new DecimalFormat("###0.00");
        double vl = Double.parseDouble(txtEstoqueMinimo.getText().replace(",", "."));
        txtEstoqueMinimo.setText(df.format(vl));

    }//GEN-LAST:event_txtEstoqueMinimoFocusLost

    private void butPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPesquisarActionPerformed

        if (produto == null) {

            produto = new PesquisaProduto();
            jDesktopPane1.add(produto);
            produto.setVisible(true);

        } else {

            produto = new PesquisaProduto();
            jDesktopPane1.add(produto);
            produto.setVisible(true);

        }

    }//GEN-LAST:event_butPesquisarActionPerformed

    private void butCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCarregarActionPerformed

        if (!txtCodigoProduto.getText().isEmpty()) {

            butSalvar.setEnabled(false);
            Connection con = DConexao.abrirConexao();
            MProduto mp = new MProduto();
            MCategoria c = new MCategoria();
            DProduto dp = new DProduto(con);

            int id = Integer.parseInt(txtCodigoProduto.getText());
            mp.setId(id);
            dp.carregaDadosProduto(mp);

            txtProduto.setText(mp.getProduto());
            txtUnidade.setText(mp.getUnidade());
            txtCodigoBarras.setText(mp.getCodigoBarra());
            txtModelo.setText(mp.getModelo());
            txtMarca.setText(mp.getMarca());
            txtEstoqueMinimo.setText(String.valueOf(mp.getEstoqueMinimo()));
            txtApresentacao.setText(mp.getApresentacao());
            comboCategoria.setSelectedItem(null);
            System.out.println(mp);

        } else {

            butSalvar.setEnabled(true);

        }

    }//GEN-LAST:event_butCarregarActionPerformed

    private void butAlteraRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAlteraRegistroActionPerformed

        if (comboCategoria.getSelectedItem() == null) {

            JOptionPane.showMessageDialog(null, "Informe a categoria desse produto!");
            return;

        }

        Connection con = DConexao.abrirConexao();
        MProduto mp = new MProduto();
        DProduto dp = new DProduto(con);
        MCategoria cat = new MCategoria();
        DCategoria cd = new DCategoria(con);

        mp.setProduto(txtProduto.getText().toUpperCase());
        mp.setUnidade(txtUnidade.getText().toUpperCase());
        mp.setCodigoBarra(txtCodigoBarras.getText());
        mp.setModelo(txtModelo.getText().toUpperCase());
        mp.setMarca(txtMarca.getText().toUpperCase());
        double minEstoque = Double.parseDouble(txtEstoqueMinimo.getText().replace(",", "."));
        mp.setEstoqueMinimo(minEstoque);
        mp.setApresentacao(txtApresentacao.getText().toUpperCase());

        cat.setCategoria(comboCategoria.getSelectedItem().toString());
        cd.pegaIdCategoria(cat);
        cat.setId(cat.getId());
        mp.setCategoria(cat);

        int id = Integer.parseInt(txtCodigoProduto.getText());
        mp.setId(id);

        System.out.println(dp.alteraProduto(mp));

        JOptionPane.showMessageDialog(null, "Produto Alterado com Sucesso!");

    }//GEN-LAST:event_butAlteraRegistroActionPerformed

    private void butCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarActionPerformed

        dispose();

    }//GEN-LAST:event_butCancelarActionPerformed
    
    //CARREGA DADOS DO BANCO PARA UM COMBOBOX
    //NÃO ESQUECER DE FAZER A CHAMADA DO MÉTODO
    public void carregaComboBox() throws SQLException {

        Connection con = DConexao.abrirConexao();
        DCategoria d = new DCategoria(con);
        comboCategoria.setModel(new DefaultComboBoxModel(d.carregaComboBox()));

    }

    private void verificaProdutoCadastrado() {

        Connection con = DConexao.abrirConexao();
        MProduto mp = new MProduto();
        DProduto dp = new DProduto(con);

        mp.setProduto(txtProduto.getText());
        mp.setModelo(txtModelo.getText());
        mp.setMarca(txtMarca.getText());
        dp.verificaProdutoCadastrado(mp);
        mp.setProduto(mp.getProduto());
        mp.setModelo(mp.getModelo());
        mp.setMarca(mp.getMarca());

        if (mp.getProduto() != null && mp.getModelo() != null && mp.getMarca() != null) {

            JOptionPane.showMessageDialog(null, "Esse produto já está cadastrada:\n " + "Código do Produto: " + mp.getId());
            txtProduto.requestFocus();
            txtProduto.setText("");
            txtMarca.setText("");
            txtModelo.setText("");
            return;

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAlteraRegistro;
    private javax.swing.JButton butCancelar;
    private javax.swing.JButton butCarregar;
    private javax.swing.JButton butPesquisar;
    private javax.swing.JButton butSalvar;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApresentacao;
    private javax.swing.JTextField txtCodigoBarras;
    public static javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextField txtEstoqueMinimo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtUnidade;
    // End of variables declaration//GEN-END:variables
}
