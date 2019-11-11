package view;

import dao.DConexao;
import dao.DMovimentoEntradaProduto;
import dao.DMovimentoSaidaVenda;
import dao.DProduto;
import dao.DTotalProduto;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.JobName;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import model.MMovimentoEntradaProduto;
import model.MMovimentoSaidaVenda;
import model.MProduto;
import model.MTotalProduto;

public class VendaProduto extends javax.swing.JInternalFrame {

    Pagamento telaPg;
    public static Pagamento pagamento;

    public VendaProduto() {
        initComponents();

        txtDesconto.setText("0.00");
        txtItem.setText("0");
        txtQuantidade.setText("1");
        txtDesconto.setText("R$0,00");
        dataDoSistema();
        numeroDaUltimaVendaMaisUm();
        focoEmCodigoBarra();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCodigoBarra = new javax.swing.JLabel();
        txtCodigoBarra = new javax.swing.JTextField();
        lblProduto = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        lblPrecoVenda = new javax.swing.JLabel();
        txtPrecoVenda = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutoVendido = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtDesconto = new javax.swing.JTextField();
        txtUnidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTotalVenda = new javax.swing.JLabel();
        etiquetaTotalVenda = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDataCompra = new javax.swing.JLabel();
        lblVendaNumero = new javax.swing.JLabel();
        lblSequenciaVenda = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtItem = new javax.swing.JTextField();
        butInserir = new javax.swing.JButton();
        butCancelarCompra = new javax.swing.JButton();
        butFinalizarCompra = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setTitle("Vendas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Venda"));

        lblCodigoBarra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCodigoBarra.setText("Código de Barras");

        txtCodigoBarra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCodigoBarra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoBarraFocusLost(evt);
            }
        });
        txtCodigoBarra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoBarraKeyPressed(evt);
            }
        });

        lblProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProduto.setText("Produto");

        txtProduto.setEditable(false);
        txtProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProduto.setEnabled(false);

        lblPrecoVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrecoVenda.setText("Preço de Venda");

        txtPrecoVenda.setEditable(false);
        txtPrecoVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPrecoVenda.setEnabled(false);

        txtQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantidadeFocusLost(evt);
            }
        });
        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Quantidade");

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setText("Total");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTotal.setEnabled(false);

        tblProdutoVendido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblProdutoVendido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Código de Barras", "Produtos", "Quantidade", "Preço", "Desconto", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdutoVendido.setEditingRow(6);
        tblProdutoVendido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutoVendidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProdutoVendido);
        if (tblProdutoVendido.getColumnModel().getColumnCount() > 0) {
            tblProdutoVendido.getColumnModel().getColumn(0).setResizable(false);
            tblProdutoVendido.getColumnModel().getColumn(0).setPreferredWidth(7);
            tblProdutoVendido.getColumnModel().getColumn(1).setResizable(false);
            tblProdutoVendido.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblProdutoVendido.getColumnModel().getColumn(2).setResizable(false);
            tblProdutoVendido.getColumnModel().getColumn(2).setPreferredWidth(290);
            tblProdutoVendido.getColumnModel().getColumn(3).setResizable(false);
            tblProdutoVendido.getColumnModel().getColumn(3).setPreferredWidth(30);
            tblProdutoVendido.getColumnModel().getColumn(4).setResizable(false);
            tblProdutoVendido.getColumnModel().getColumn(4).setPreferredWidth(30);
            tblProdutoVendido.getColumnModel().getColumn(5).setResizable(false);
            tblProdutoVendido.getColumnModel().getColumn(5).setPreferredWidth(30);
            tblProdutoVendido.getColumnModel().getColumn(6).setResizable(false);
            tblProdutoVendido.getColumnModel().getColumn(6).setPreferredWidth(30);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Desconto");

        txtDesconto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescontoFocusGained(evt);
            }
        });
        txtDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescontoKeyPressed(evt);
            }
        });

        txtUnidade.setEditable(false);
        txtUnidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUnidade.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Unidade");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Compra"));

        lblTotalVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotalVenda.setForeground(new java.awt.Color(51, 51, 255));

        etiquetaTotalVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaTotalVenda.setText("Total de Venda");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Data da Compra");

        lblDataCompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDataCompra.setForeground(new java.awt.Color(51, 51, 255));

        lblVendaNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblVendaNumero.setText("Número da Venda");

        lblSequenciaVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSequenciaVenda.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaTotalVenda)
                    .addComponent(lblTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblDataCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblVendaNumero)
                    .addComponent(lblSequenciaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblVendaNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSequenciaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(etiquetaTotalVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Item");

        txtItem.setEditable(false);
        txtItem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtItem.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCodigoBarra))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblProduto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtUnidade)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecoVenda))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotal))
                        .addGap(580, 580, 580))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoBarra)
                            .addComponent(lblProduto)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtItem)))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotal)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(lblPrecoVenda)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        butInserir.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\inserir.png")); // NOI18N
        butInserir.setText("Inserir Item Venda");
        butInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butInserirActionPerformed(evt);
            }
        });
        butInserir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                butInserirKeyPressed(evt);
            }
        });

        butCancelarCompra.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\cancela_compra.png")); // NOI18N
        butCancelarCompra.setText("Cancelar Compra");
        butCancelarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarCompraActionPerformed(evt);
            }
        });

        butFinalizarCompra.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\finalizar_compra.png")); // NOI18N
        butFinalizarCompra.setText("Finalizar Compra");
        butFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butFinalizarCompraActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\cancel.png")); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butInserir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butCancelarCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(574, 574, 574))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butCancelarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(butInserir)
                                .addComponent(butFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void focoEmCodigoBarra() {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                txtCodigoBarra.requestFocus();
            }
        });

    }

    private void txtCodigoBarraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoBarraKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtQuantidade.requestFocus();

        }

    }//GEN-LAST:event_txtCodigoBarraKeyPressed

    private void txtCodigoBarraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoBarraFocusLost

        carregaUltimoPrecoVendaProduto();

    }//GEN-LAST:event_txtCodigoBarraFocusLost

    private void txtQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtDesconto.requestFocus();

            calculaTotalVenda();

        }

    }//GEN-LAST:event_txtQuantidadeKeyPressed

    private void txtDescontoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescontoKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            butInserir.requestFocus();
            calculaTotalVenda();
            calculaDesconto();

        }

    }//GEN-LAST:event_txtDescontoKeyPressed

    private void txtQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeFocusLost

        verificaProdutoDisponivel();

    }//GEN-LAST:event_txtQuantidadeFocusLost

    private void txtDescontoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescontoFocusGained

        txtDesconto.selectAll();

    }//GEN-LAST:event_txtDescontoFocusGained

    private void txtQuantidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeFocusGained

        txtQuantidade.setText("1");
        txtQuantidade.selectAll();

    }//GEN-LAST:event_txtQuantidadeFocusGained

    private void butFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butFinalizarCompraActionPerformed

        if (lblTotalVenda.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Informe pelo menos um produto "
                    + "para venda!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;

        } else {

            pagamento = new Pagamento(this, true);
            pagamento.recebeNumeroCompraTotalCompra(lblSequenciaVenda.getText(), lblTotalVenda.getText(), lblDataCompra.getText());
            pagamento.setVisible(true);

        }

    }//GEN-LAST:event_butFinalizarCompraActionPerformed

    private void butInserirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_butInserirKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            butInserir.doClick();

        }
    }//GEN-LAST:event_butInserirKeyPressed

    private void butInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInserirActionPerformed

        if (txtItem.getText().isEmpty()
                || txtCodigoBarra.getText().isEmpty()
                || txtProduto.getText().isEmpty()
                || txtUnidade.getText().isEmpty()
                || txtPrecoVenda.getText().isEmpty()
                || txtQuantidade.getText().isEmpty()
                || txtDesconto.getText().isEmpty()
                || txtTotal.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos!",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
            return;

        }

        Connection con = DConexao.abrirConexao();
        MMovimentoSaidaVenda msv = new MMovimentoSaidaVenda();
        DMovimentoSaidaVenda dsv = new DMovimentoSaidaVenda(con);
        MProduto prod = new MProduto();
        MProduto mp = new MProduto();
        DProduto dp = new DProduto(con);

        mp.setCodigoBarra(txtCodigoBarra.getText());
        mp.setProduto(txtProduto.getText());
        dp.pegaIdProduto(mp);
        mp.setUnidade(txtUnidade.getText());
        msv.setProduto(mp);

        double pv = Double.parseDouble(txtPrecoVenda.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        msv.setPrecoVenda(pv);

        double qt = Double.parseDouble(txtQuantidade.getText());
        msv.setQuantidadeVenda(qt);

        double desc = Double.parseDouble(txtDesconto.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        msv.setDesconto(desc);

        double total = Double.parseDouble(txtTotal.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        msv.setTotal(total);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dt = lblDataCompra.getText();
        Date data = null;

        try {
            data = sdf.parse(dt);
        } catch (ParseException ex) {
            Logger.getLogger(VendaProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        msv.setDataVenda(data);

        int nv = Integer.parseInt(lblSequenciaVenda.getText());
        msv.setNum_venda(nv);

        contadorItem();
        int item = Integer.parseInt(txtItem.getText());
        msv.setItemProduto(item);

        System.out.println(dsv.salvar(msv));

        MTotalProduto tp = new MTotalProduto();
        DTotalProduto dtp = new DTotalProduto(con);
        MProduto p = new MProduto();

        prod.setProduto(txtProduto.getText());
        dp.pegaIdProduto(prod);
        prod.setId(prod.getId());
        msv.setProduto(prod);

        prod.setCodigoBarra(txtCodigoBarra.getText());

        p.setId(prod.getId());
        p.setCodigoBarra(txtCodigoBarra.getText());
        tp.setProduto(p);
        dtp.pegaTotalProduto(tp);
        tp.setTotalProduto(tp.getTotalProduto() - qt);

        System.out.println(dtp.atualizaTotal(tp));

        limpaCampos();
        txtCodigoBarra.requestFocus();
        txtDesconto.setText("R$0,00");
        limpaTabelaProdutoVendido();
        carregaProdutoVendido();
        somaColuna();

    }//GEN-LAST:event_butInserirActionPerformed

    private void butCancelarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarCompraActionPerformed

        /* JOptionPane.showMessageDialog(null, "Botão Inoperante no momento!\n"
                + " - Caso queira fechar essa tela EXCLUA todos os produtos da lista\n"
                + " clicando duas vezes no produto antes de fechar.", "Atenção", JOptionPane.ERROR_MESSAGE);
        return;*/
        Connection con = DConexao.abrirConexao();
        List<MMovimentoSaidaVenda> listaVenda = new ArrayList<MMovimentoSaidaVenda>();

        int venda = Integer.parseInt(lblSequenciaVenda.getText());

        DMovimentoSaidaVenda dm = new DMovimentoSaidaVenda(con);
        listaVenda = dm.carregaVendaDoDia(venda);

        DefaultTableModel tbm = (DefaultTableModel) tblProdutoVendido.getModel();

        int i = 0;

        for (MMovimentoSaidaVenda m : listaVenda) {

            m.setId(m.getId());
            System.out.println(dm.deletaItemDaVenda(m));

        }

        limpaTabelaProdutoVendido();
        lblSequenciaVenda.setText("");
        lblTotalVenda.setText("");

        JOptionPane.showMessageDialog(null, "Venda cancelada com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_butCancelarCompraActionPerformed

    private void tblProdutoVendidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutoVendidoMouseClicked

        if (evt.getClickCount() == 2) {

            Connection con = DConexao.abrirConexao();
            MMovimentoSaidaVenda mv = new MMovimentoSaidaVenda();
            DMovimentoSaidaVenda dv = new DMovimentoSaidaVenda(con);

            MProduto mp = new MProduto();
            DProduto dp = new DProduto(con);

            DefaultTableModel tbm = (DefaultTableModel) tblProdutoVendido.getModel();
            Integer indice = tblProdutoVendido.getSelectedRow();

            tbm.getValueAt(indice, 1);
            mp.setCodigoBarra(tbm.getValueAt(indice, 1).toString());
            mv.setProduto(mp);

            int numVenda = Integer.parseInt(lblSequenciaVenda.getText());
            mv.setNum_venda(numVenda);

            int ip = (int) tbm.getValueAt(indice, 0);
            mv.setItemProduto(ip);

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String dt = lblDataCompra.getText();

            try {

                mv.setDataVenda(sdf.parse(dt));

            } catch (ParseException ex) {

                Logger.getLogger(VendaProduto.class.getName()).log(Level.SEVERE, null, ex);

            }

            dv.pegaIdVendaProduto(mv);
            mv.setId(mv.getId());

            System.out.println(mv.getId());

            System.out.println(dv.deletaItemDaVenda(mv));

            MTotalProduto tp = new MTotalProduto();
            DTotalProduto dtp = new DTotalProduto(con);

            tbm.getValueAt(indice, 0);
            mp.setProduto(tbm.getValueAt(indice, 2).toString());
            dp.pegaIdProduto(mp);
            mp.setId(mp.getId());

            tp.setProduto(mp);
            dtp.pegaTotalProdutoExclusao(tp);
            tp.setTotalProduto(tp.getTotalProduto());

            double t = (double) tbm.getValueAt(indice, 3);
            tp.setTotalProduto(tp.getTotalProduto() + t);

            System.out.println(dtp.atualizaTotalExclusao(tp));

            limpaTabelaProdutoVendido();
            carregaProdutoVendido();
            JOptionPane.showMessageDialog(null, "Item Excluído com sucesso!", "Atenção", JOptionPane.WARNING_MESSAGE);

            limpaTabelaProdutoVendido();
            carregaProdutoVendido();
            somaColuna();

        }

    }//GEN-LAST:event_tblProdutoVendidoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void somaColuna() {

        double total = 0;

        for (int linha = 0; linha < tblProdutoVendido.getRowCount(); linha++) {

            String valor = "" + tblProdutoVendido.getValueAt(linha, 6);

            if (valor != null) {

                total += Double.parseDouble(valor.replace(",", ".").replace("R$", ""));

            }

        }

        Locale l = new Locale("pt", "BR");
        NumberFormat df = NumberFormat.getCurrencyInstance(l);
        lblTotalVenda.setText(df.format(total));

    }

    public void limpaTabelaProdutoVendido() {

        while (tblProdutoVendido.getModel().getRowCount() > 0) {

            ((DefaultTableModel) tblProdutoVendido.getModel()).removeRow(0);

        }

    }

    private void contadorItem() {

        int cont = Integer.parseInt(txtItem.getText());
        int soma = cont + 1;

        txtItem.setText(String.valueOf(soma));

    }

    private void verificaProdutoDisponivel() {

        Connection con = DConexao.abrirConexao();
        MMovimentoSaidaVenda msv = new MMovimentoSaidaVenda();
        MProduto p = new MProduto();
        MTotalProduto mtp = new MTotalProduto();
        DTotalProduto dtp = new DTotalProduto(con);

        p.setCodigoBarra(txtCodigoBarra.getText());
        mtp.setProduto(p);
        dtp.pegaTotalProduto(mtp);
        mtp.setTotalProduto(mtp.getTotalProduto());

        if (mtp.getTotalProduto() <= 0) {

            JOptionPane.showMessageDialog(null, "Produto Indiponível", "Aviso", JOptionPane.WARNING_MESSAGE);
            txtCodigoBarra.requestFocus();
            limpaCampos();
            return;

        }

        System.out.println(mtp.getTotalProduto());
        double qt = Double.parseDouble(txtQuantidade.getText());
        msv.setQuantidadeVenda(qt);
        System.out.println(qt);

        if (qt > mtp.getTotalProduto()) {

            JOptionPane.showMessageDialog(
                    null, "Quantidade vendida maior que a quantidade em estoque!\n\n"
                    + "ESTOQUE ATUAL:  " + mtp.getTotalProduto() + "0",
                    "Aviso", JOptionPane.WARNING_MESSAGE);
            txtQuantidade.requestFocus();
            txtQuantidade.selectAll();
            return;

        }
    }

    public void limpaCampos() {

        txtCodigoBarra.setText("");
        txtProduto.setText("");
        txtPrecoVenda.setText("");
        txtQuantidade.setText("");
        txtTotal.setText("");

    }

    public void executadoPelaTelaDePagamento() {

        lblSequenciaVenda.setText("");
        lblTotalVenda.setText("");
        txtItem.setText("0");
        limpaTabelaProdutoVendido();
        carregaUltimoPrecoVendaProduto();
        numeroDaUltimaVendaMaisUm();

    }

    private void calculaDesconto() {

        Locale l = new Locale("pt", "BR");
        NumberFormat df = NumberFormat.getCurrencyInstance(l);

        double total = Double.parseDouble(txtTotal.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        double desconto = Double.parseDouble(txtDesconto.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        double totDesc = total - desconto;
        txtTotal.setText("");
        txtTotal.setText(df.format(totDesc));
        txtDesconto.setText(df.format(desconto));

    }

    private void calculaTotalVenda() {

        Locale l = new Locale("pt", "BR");
        NumberFormat df = NumberFormat.getCurrencyInstance(l);
        double pv = Double.parseDouble(txtPrecoVenda.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        double qt = Double.parseDouble(txtQuantidade.getText());
        double tot = pv * qt;

        txtTotal.setText(df.format(tot));

    }

    public void carregaUltimoPrecoVendaProduto() {

        Connection con = DConexao.abrirConexao();
        MMovimentoEntradaProduto ent = new MMovimentoEntradaProduto();
        DMovimentoEntradaProduto dme = new DMovimentoEntradaProduto(con);
        MProduto p = new MProduto();
        DProduto dp = new DProduto(con);
        Locale l = new Locale("pt", "BR");
        NumberFormat df = NumberFormat.getCurrencyInstance(l);

        p.setCodigoBarra(txtCodigoBarra.getText());
        ent.setProduto(p);
        dme.pegaUltimoPrecoVenda(ent);
        dp.pegaNomeUnidadeProduto(p);

        txtProduto.setText(p.getProduto());
        txtPrecoVenda.setText(df.format(ent.getPrecoVenda()));
        txtUnidade.setText(p.getUnidade());

    }

    private void dataDoSistema() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = new Date();
        lblDataCompra.setText(sdf.format(dt));

    }

    public void numeroDaUltimaVendaMaisUm() {

        Connection con = DConexao.abrirConexao();
        DMovimentoSaidaVenda dms = new DMovimentoSaidaVenda(con);
        MMovimentoSaidaVenda msv = new MMovimentoSaidaVenda();

        dms.pegaNumeroDaUltimaComra();

        if (lblSequenciaVenda.getText().isEmpty()) {

            lblSequenciaVenda.setText("1");

        }

        for (MMovimentoSaidaVenda s : dms.venda) {

            msv.setNum_venda(s.getNum_venda());
            lblSequenciaVenda.setText(String.valueOf(s.getNum_venda() + 1));

        }

    }

    private void carregaProdutoVendido() {

        Connection con = DConexao.abrirConexao();
        DMovimentoSaidaVenda dms = new DMovimentoSaidaVenda(con);
        List<MMovimentoSaidaVenda> listaProdutoVendido = new ArrayList<MMovimentoSaidaVenda>();
        String nv = lblSequenciaVenda.getText();

        listaProdutoVendido = dms.tabelaProdutoVendido(nv);

        DefaultTableModel tbm = (DefaultTableModel) tblProdutoVendido.getModel();

        for (int i = tbm.getRowCount() - 1; i > 0; i--) {

            tbm.removeRow(i);

        }

        int i = 0;

        for (MMovimentoSaidaVenda m : listaProdutoVendido) {

            tbm.addRow(new String[1]);

            tblProdutoVendido.setValueAt(m.getItemProduto(), i, 0);
            tblProdutoVendido.setValueAt(m.getProduto().getCodigoBarra(), i, 1);
            tblProdutoVendido.setValueAt(m.getProduto().getProduto(), i, 2);
            tblProdutoVendido.setValueAt(m.getQuantidadeVenda(), i, 3);
            tblProdutoVendido.setValueAt(m.getPrecoVenda(), i, 4);
            tblProdutoVendido.setValueAt(m.getDesconto(), i, 5);
            tblProdutoVendido.setValueAt(m.getTotal(), i, 6);

            i++;

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCancelarCompra;
    private javax.swing.JButton butFinalizarCompra;
    private javax.swing.JButton butInserir;
    private javax.swing.JLabel etiquetaTotalVenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoBarra;
    private javax.swing.JLabel lblDataCompra;
    private javax.swing.JLabel lblPrecoVenda;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblSequenciaVenda;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalVenda;
    private javax.swing.JLabel lblVendaNumero;
    private javax.swing.JTable tblProdutoVendido;
    private javax.swing.JTextField txtCodigoBarra;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtPrecoVenda;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUnidade;
    // End of variables declaration//GEN-END:variables
}
