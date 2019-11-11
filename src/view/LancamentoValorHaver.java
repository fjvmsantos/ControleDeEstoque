package view;

import dao.DConexao;
import dao.DPessoaFisica;
import dao.DPessoaJuridica;
import dao.DLancamentoValorEmHaver;
import dao.DRecebimentoContaEmHaver;
import enums.TipoStatusDaConta;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.MPessoaFisica;
import model.MLancamentoValorEmHaver;
import model.MMovimentoSaidaVenda;
import model.MPessoaJuridica;
import model.MRecebimentoContaEmHaver;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class LancamentoValorHaver extends javax.swing.JInternalFrame {

    public static RecebimentoContaEmHaver recebimento;

    public LancamentoValorHaver() {

        initComponents();
        txtTotalEmHaver.setText("R$0,00");
        dataDoSistema();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        butReceber = new javax.swing.JButton();
        txtSaldoDevedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtValorRecebido = new javax.swing.JTextField();
        txtPagoAteMomento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblValorEmHaver = new javax.swing.JLabel();
        txtValorDaConta = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumCompra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIdentificacao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDataMovimento = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboBoxCliente = new javax.swing.JComboBox<String>();
        butMostrarConta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaConta = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        radButPessoaFisica = new javax.swing.JRadioButton();
        radButPessoaJuridica = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        radButEmAberto = new javax.swing.JRadioButton();
        radButBaixada = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtTotalEmHaver = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Recebimento de Contas");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Recebimento"));

        butReceber.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        butReceber.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\dinheiro.png")); // NOI18N
        butReceber.setText("Receber");
        butReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butReceberActionPerformed(evt);
            }
        });

        txtSaldoDevedor.setEditable(false);
        txtSaldoDevedor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtSaldoDevedor.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Saldo Devedor");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Valor Recebido");

        txtValorRecebido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtValorRecebido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorRecebidoKeyPressed(evt);
            }
        });

        txtPagoAteMomento.setEditable(false);
        txtPagoAteMomento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPagoAteMomento.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Pago Até o Momento");

        lblValorEmHaver.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblValorEmHaver.setText("Valor Conta");

        txtValorDaConta.setEditable(false);
        txtValorDaConta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtValorDaConta.setEnabled(false);

        txtCliente.setEditable(false);
        txtCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCliente.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Cliente");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Número da Compra");

        txtNumCompra.setEditable(false);
        txtNumCompra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNumCompra.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Identificação");

        txtIdentificacao.setEditable(false);
        txtIdentificacao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtIdentificacao.setEnabled(false);

        jLabel9.setText("Data do Movimento");

        txtDataMovimento.setEditable(false);
        txtDataMovimento.setEnabled(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Compra"));

        jLabel1.setText("Cliente");

        comboBoxCliente.setEditable(true);

        butMostrarConta.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\carregar.png")); // NOI18N
        butMostrarConta.setText("Carregar");
        butMostrarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butMostrarContaActionPerformed(evt);
            }
        });

        tabelaConta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificação", "Cliente", "Número da Venda", "Data da Venda", "Situação", "Valor da Conta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaContaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaConta);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(comboBoxCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butMostrarConta))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butMostrarConta))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Cliente"));

        buttonGroup2.add(radButPessoaFisica);
        radButPessoaFisica.setText("Pessoa Física");
        radButPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radButPessoaFisicaActionPerformed(evt);
            }
        });

        buttonGroup2.add(radButPessoaJuridica);
        radButPessoaJuridica.setText("Pessoa Jurídica");
        radButPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radButPessoaJuridicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(radButPessoaFisica)
                .addGap(18, 18, 18)
                .addComponent(radButPessoaJuridica)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radButPessoaFisica)
                    .addComponent(radButPessoaJuridica)))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Status da Conta"));

        buttonGroup1.add(radButEmAberto);
        radButEmAberto.setText("Em Aberto");
        radButEmAberto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radButEmAbertoActionPerformed(evt);
            }
        });

        buttonGroup1.add(radButBaixada);
        radButBaixada.setText("Baixada");
        radButBaixada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radButBaixadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radButEmAberto)
                .addGap(18, 18, 18)
                .addComponent(radButBaixada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radButEmAberto)
                    .addComponent(radButBaixada))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Total em Haver");

        txtTotalEmHaver.setEditable(false);
        txtTotalEmHaver.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTotalEmHaver.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalEmHaver.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalEmHaver, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCliente)
                    .addComponent(txtNumCompra)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(txtPagoAteMomento)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIdentificacao)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtValorDaConta)
                    .addComponent(lblValorEmHaver, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataMovimento)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSaldoDevedor)
                    .addComponent(txtValorRecebido)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTotalEmHaver)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDataMovimento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblValorEmHaver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtValorDaConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSaldoDevedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPagoAteMomento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(butReceber)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butMostrarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butMostrarContaActionPerformed

        limpaCampos();
        limpaTabelaProdutoVendido();
        carregaTabela();

    }//GEN-LAST:event_butMostrarContaActionPerformed

    private void radButPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radButPessoaFisicaActionPerformed

        limpaTabelaProdutoVendido();
        comboBoxCliente.setSelectedItem("");
        try {

            carregaClienteCombox();
            comboBoxCliente.getEditor().selectAll();

        } catch (SQLException ex) {

            Logger.getLogger(LancamentoValorHaver.class.getName()).log(Level.SEVERE, null, ex);

        }
        AutoCompleteDecorator.decorate(comboBoxCliente);

    }//GEN-LAST:event_radButPessoaFisicaActionPerformed

    private void radButPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radButPessoaJuridicaActionPerformed

        limpaTabelaProdutoVendido();
        comboBoxCliente.setSelectedItem("");
        try {

            carregaClienteCombox();
            comboBoxCliente.getEditor().selectAll();

        } catch (SQLException ex) {

            Logger.getLogger(LancamentoValorHaver.class.getName()).log(Level.SEVERE, null, ex);

        }
        AutoCompleteDecorator.decorate(comboBoxCliente);

    }//GEN-LAST:event_radButPessoaJuridicaActionPerformed

    private void tabelaContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaContaMouseClicked

        limpaCampos();

        if (radButEmAberto.isSelected()) {

            butReceber.setEnabled(true);
            txtValorRecebido.setEnabled(true);
            int indice = tabelaConta.getSelectedRow();
            txtIdentificacao.setText(tabelaConta.getValueAt(indice, 0).toString());
            txtCliente.setText(tabelaConta.getValueAt(indice, 1).toString());
            txtNumCompra.setText(tabelaConta.getValueAt(indice, 2).toString());
            txtValorDaConta.setText(tabelaConta.getValueAt(indice, 5).toString());
            carregaTotalPagoAteMomento();
            calculaSaldoDevedor();
            txtValorRecebido.requestFocus();

        }

        if (radButBaixada.isSelected()) {

            txtValorRecebido.setEnabled(false);
            butReceber.setEnabled(false);

        }

        if (evt.getClickCount() == 2) {

            mostraExtrato();

        }
    }//GEN-LAST:event_tabelaContaMouseClicked

    private void butReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butReceberActionPerformed

        int indice = tabelaConta.getSelectedRow();

        if (indice == -1) {

            JOptionPane.showMessageDialog(null, "Selecione uma conta!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;

        }

        if (txtValorRecebido.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Informe o valor pago!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;

        }

        Connection con = DConexao.abrirConexao();
        MLancamentoValorEmHaver mh = new MLancamentoValorEmHaver();
        DLancamentoValorEmHaver dh = new DLancamentoValorEmHaver(con);
        MPessoaFisica pf = new MPessoaFisica();
        MPessoaJuridica pj = new MPessoaJuridica();
        MMovimentoSaidaVenda ms = new MMovimentoSaidaVenda();
        MRecebimentoContaEmHaver mc = new MRecebimentoContaEmHaver();
        DRecebimentoContaEmHaver dc = new DRecebimentoContaEmHaver(con);

        int clientePf = Integer.parseInt(txtCliente.getText());
        int clientePj = Integer.parseInt(txtCliente.getText());
        int idLancamento = Integer.parseInt(txtIdentificacao.getText());
        int numCompra = Integer.parseInt(txtNumCompra.getText());
        double valorDaConta = Double.parseDouble(txtValorDaConta.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        double recebido = Double.parseDouble(txtValorRecebido.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        double saldoDevedor = Double.parseDouble(txtSaldoDevedor.getText().replace(".", "").replace(",", ".").replace("R$", ""));

        if (recebido > saldoDevedor) {

            JOptionPane.showMessageDialog(null, "Valor Recebido é maior que o saldo devedor", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtValorRecebido.setText("");
            txtValorRecebido.requestFocus();
            return;

        }

        if (radButPessoaFisica.isSelected()) {

            mc.setClientePf(clientePf);
            mc.setClientePj(0);
            mc.setValorDaConta(valorDaConta);
            mc.setValorPago(recebido);
            mc.setIdLancamento(idLancamento);
            mc.setNumeroCompra(numCompra);

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String dt = txtDataMovimento.getText();
            Date data = null;

            try {

                data = sdf.parse(dt);

            } catch (ParseException ex) {

                Logger.getLogger(LancamentoValorHaver.class.getName()).log(Level.SEVERE, null, ex);

            }

            mc.setDataMovimento(data);

            System.out.println(dc.salvar(mc));

            JOptionPane.showMessageDialog(null, "Pagamento Salvo com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);

            if (recebido == saldoDevedor) {

                pf.setId(clientePf);
                mh.setClientePf(pf);

                ms.setNum_venda(numCompra);
                mh.setMovimentoSaidaVenda(ms);

                TipoStatusDaConta tp = TipoStatusDaConta.EMABERTO;
                mh.setStatusDaConta(tp);

                dh.pegaIdLancamentoPf(mh);
                mh.setId(mh.getId());

                TipoStatusDaConta tp2 = TipoStatusDaConta.BAIXADA;
                mh.setStatusDaConta(tp2);
                dh.pegaIdLancamentoPf(mh);
                mh.setId(mh.getId());

                System.out.println(dh.alteraStatus(mh));

                JOptionPane.showMessageDialog(null, "O Status dessa conta foi alterado para BAIXADA!", "Atenção", JOptionPane.INFORMATION_MESSAGE);

            }

        }

        if (radButPessoaJuridica.isSelected()) {

            mc.setClientePf(0);
            mc.setClientePj(clientePj);
            mc.setValorDaConta(valorDaConta);
            mc.setValorPago(recebido);
            mc.setIdLancamento(idLancamento);
            mc.setNumeroCompra(numCompra);

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String dt = txtDataMovimento.getText();
            Date data = null;

            try {

                data = sdf.parse(dt);

            } catch (ParseException ex) {

                Logger.getLogger(LancamentoValorHaver.class.getName()).log(Level.SEVERE, null, ex);

            }

            mc.setDataMovimento(data);

            System.out.println(dc.salvar(mc));

            JOptionPane.showMessageDialog(null, "Pagamento Salvo com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);

            if (recebido == saldoDevedor) {

                pj.setId(clientePj);
                mh.setClientePj(pj);

                ms.setNum_venda(numCompra);
                mh.setMovimentoSaidaVenda(ms);

                TipoStatusDaConta tp = TipoStatusDaConta.EMABERTO;
                mh.setStatusDaConta(tp);

                dh.pegaIdLancamentoPj(mh);
                mh.setId(mh.getId());

                TipoStatusDaConta tp2 = TipoStatusDaConta.BAIXADA;
                mh.setStatusDaConta(tp2);
                dh.pegaIdLancamentoPj(mh);
                mh.setId(mh.getId());

                System.out.println(dh.alteraStatus(mh));

                JOptionPane.showMessageDialog(null, "O Status dessa conta foi alterado para BAIXADA!", "Atenção", JOptionPane.INFORMATION_MESSAGE);

            }

        }

        limpaCampos();
        limpaTabelaProdutoVendido();
        txtTotalEmHaver.setText("R$0,00");

    }//GEN-LAST:event_butReceberActionPerformed

    private void txtValorRecebidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorRecebidoKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            double recebido = Double.parseDouble(txtValorRecebido.getText());
            NumberFormat formatoValor = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
            txtValorRecebido.setText(formatoValor.format(recebido));
            butReceber.requestFocus();

        }

    }//GEN-LAST:event_txtValorRecebidoKeyPressed

    private void radButEmAbertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radButEmAbertoActionPerformed

        if (radButEmAberto.isSelected()) {

            limpaTabelaProdutoVendido();

        }

    }//GEN-LAST:event_radButEmAbertoActionPerformed

    private void radButBaixadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radButBaixadaActionPerformed

        if (radButBaixada.isSelected()) {

            limpaTabelaProdutoVendido();

        }

    }//GEN-LAST:event_radButBaixadaActionPerformed

    private void mostraExtrato() {

        if (radButPessoaFisica.isSelected()) {

            if (radButEmAberto.isSelected()) {

                Connection con = DConexao.abrirConexao();

                try {

                    int indice = tabelaConta.getSelectedRow();

                    int clientePf = Integer.parseInt(tabelaConta.getValueAt(indice, 1).toString());
                    int numVenda = Integer.parseInt(tabelaConta.getValueAt(indice, 2).toString());

                    HashMap filtro = new HashMap();
                    filtro.put("idPf", clientePf);
                    filtro.put("numVenda", numVenda);

                    JasperPrint p = JasperFillManager.fillReport("C:/ControleDeEstoque/dist/relatorio/ExtratoContaPf.jasper", filtro, con);

                    JasperViewer.viewReport(p, false);//abre relatório
                    //JasperPrintManager.printPage(p, 0, false);//manda direto para impressão

                } catch (JRException ex) {

                    Logger.getLogger(Pagamento.class.getName()).log(Level.SEVERE, null, ex);

                }
            }

            if (radButBaixada.isSelected()) {

                Connection con = DConexao.abrirConexao();

                try {

                    int indice = tabelaConta.getSelectedRow();

                    int clientePf = Integer.parseInt(tabelaConta.getValueAt(indice, 1).toString());
                    int numVenda = Integer.parseInt(tabelaConta.getValueAt(indice, 2).toString());

                    HashMap filtro = new HashMap();
                    filtro.put("idPf", clientePf);
                    filtro.put("numVenda", numVenda);

                    JasperPrint p = JasperFillManager.fillReport("C:/ControleDeEstoque/dist/relatorio/ExtratoContaPf.jasper", filtro, con);

                    JasperViewer.viewReport(p, false);//abre relatório
                    //  JasperPrintManager.printPage(p, 0, false);//manda direto para impressão

                } catch (JRException ex) {

                    Logger.getLogger(Pagamento.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        }
        
        if (radButPessoaJuridica.isSelected()) {
            
            if (radButEmAberto.isSelected()) {

                Connection con = DConexao.abrirConexao();

                try {

                    int indice = tabelaConta.getSelectedRow();

                    int clientePj = Integer.parseInt(tabelaConta.getValueAt(indice, 1).toString());
                    int numVenda = Integer.parseInt(tabelaConta.getValueAt(indice, 2).toString());

                    HashMap filtro = new HashMap();
                    filtro.put("idPj", clientePj);
                    filtro.put("numVenda", numVenda);

                    JasperPrint p = JasperFillManager.fillReport("C:/ControleDeEstoque/dist/relatorio/ExtratoContaPj.jasper", filtro, con);

                    JasperViewer.viewReport(p, false);//abre relatório
                    //JasperPrintManager.printPage(p, 0, false);//manda direto para impressão

                } catch (JRException ex) {

                    Logger.getLogger(Pagamento.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
            
            if (radButBaixada.isSelected()) {

                Connection con = DConexao.abrirConexao();

                try {

                    int indice = tabelaConta.getSelectedRow();

                    int clientePj = Integer.parseInt(tabelaConta.getValueAt(indice, 1).toString());
                    int numVenda = Integer.parseInt(tabelaConta.getValueAt(indice, 2).toString());

                    HashMap filtro = new HashMap();
                    filtro.put("idPj", clientePj);
                    filtro.put("numVenda", numVenda);

                    JasperPrint p = JasperFillManager.fillReport("C:/ControleDeEstoque/dist/relatorio/ExtratoContaPj.jasper", filtro, con);

                    JasperViewer.viewReport(p, false);//abre relatório
                    //JasperPrintManager.printPage(p, 0, false);//manda direto para impressão

                } catch (JRException ex) {

                    Logger.getLogger(Pagamento.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        }
    }

    private void dataDoSistema() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = new Date();
        txtDataMovimento.setText(sdf.format(dt));

    }

    public void calculaSaldoDevedor() {

        double valorDaConta = Double.parseDouble(txtValorDaConta.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        double pagoAteMomento = Double.parseDouble(txtPagoAteMomento.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        double saldoDevedor;

        saldoDevedor = valorDaConta - pagoAteMomento;
        NumberFormat formatoValor = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        double valor = saldoDevedor;

        txtSaldoDevedor.setText(formatoValor.format(valor));

    }

    public void carregaTotalPagoAteMomento() {

        Connection con = DConexao.abrirConexao();
        MRecebimentoContaEmHaver mh = new MRecebimentoContaEmHaver();
        DRecebimentoContaEmHaver dh = new DRecebimentoContaEmHaver(con);

        int numCompra = Integer.parseInt(txtNumCompra.getText());
        int cliente = Integer.parseInt(txtCliente.getText());

        if (radButPessoaFisica.isSelected()) {

            mh.setClientePf(cliente);
            mh.setNumeroCompra(numCompra);

            dh.totalPagoAteMomento(mh);

            mh.setValorPago(mh.getValorPago());

            NumberFormat formatoValor = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
            double valor = mh.getValorPago();

            txtPagoAteMomento.setText(formatoValor.format(valor));

        }

        if (radButPessoaJuridica.isSelected()) {

            mh.setClientePj(cliente);
            mh.setNumeroCompra(numCompra);

            dh.totalPagoAteMomentoPj(mh);

            mh.setValorPago(mh.getValorPago());

            NumberFormat formatoValor = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
            double valor = mh.getValorPago();

            txtPagoAteMomento.setText(formatoValor.format(valor));

        }

    }

    public void somaColuna() {

        double total = 0;

        for (int linha = 0; linha < tabelaConta.getRowCount(); linha++) {

            String valor = "" + tabelaConta.getValueAt(linha, 5).toString().replace(".", "").replace(",", ".").replace("R$", "");

            if (valor != null) {

                total += Double.parseDouble(valor);

            }

        }

        Locale l = new Locale("pt", "BR");
        NumberFormat df = NumberFormat.getCurrencyInstance(l);
        txtTotalEmHaver.setText(df.format(total));

    }

    private void limpaCampos() {

        txtNumCompra.setText("");
        txtValorDaConta.setText("");

        txtIdentificacao.setText("");
        txtCliente.setText("");
        txtNumCompra.setText("");
        txtValorDaConta.setText("");
        txtPagoAteMomento.setText("");
        txtSaldoDevedor.setText("");
        txtValorRecebido.setText("");

    }

    private void carregaClienteCombox() throws SQLException {

        Connection con = DConexao.abrirConexao();
        if (radButPessoaFisica.isSelected()) {

            DPessoaFisica pf = new DPessoaFisica(con);
            comboBoxCliente.setModel(new DefaultComboBoxModel(pf.carregaComboClientePf()));

        }

        if (radButPessoaJuridica.isSelected()) {

            DPessoaJuridica pj = new DPessoaJuridica(con);
            comboBoxCliente.setModel(new DefaultComboBoxModel(pj.carregaComboClientePj()));

        }

    }

    private void carregaTabela() {

        Connection con = DConexao.abrirConexao();
        MPessoaJuridica mpj = new MPessoaJuridica();
        MPessoaFisica mpf = new MPessoaFisica();
        DPessoaJuridica dpj = new DPessoaJuridica(con);
        DPessoaFisica dpf = new DPessoaFisica(con);

        DLancamentoValorEmHaver dr = new DLancamentoValorEmHaver(con);

        if (radButPessoaFisica.isSelected()) {

            List<MLancamentoValorEmHaver> listaCompra = new ArrayList<MLancamentoValorEmHaver>();
            mpf.setNome(comboBoxCliente.getSelectedItem().toString());
            dpf.pegaIdFornecedor(mpf);
            mpf.setId(mpf.getId());

            if (radButEmAberto.isSelected()) {

                TipoStatusDaConta status = TipoStatusDaConta.EMABERTO;
                listaCompra = dr.carregaContaPf(mpf, status);

            } else {

                TipoStatusDaConta status = TipoStatusDaConta.BAIXADA;
                listaCompra = dr.carregaContaPf(mpf, status);

            }

            DefaultTableModel tbm = (DefaultTableModel) tabelaConta.getModel();

            for (int i = tbm.getRowCount() - 1; i > 0; i--) {

                tbm.removeRow(i);

            }

            int i = 0;

            for (MLancamentoValorEmHaver h : listaCompra) {

                tbm.addRow(new String[1]);

                Date dataMovimento = h.getData_movimento();
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

                NumberFormat formatoValor = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
                double valor = h.getPagamento().getValorPorFormaPg();

                tabelaConta.setValueAt(h.getId(), i, 0);
                tabelaConta.setValueAt(h.getClientePf().getId(), i, 1);
                tabelaConta.setValueAt(h.getMovimentoSaidaVenda().getNum_venda(), i, 2);
                tabelaConta.setValueAt(df.format(dataMovimento), i, 3);
                tabelaConta.setValueAt(h.getStatusDaConta(), i, 4);
                tabelaConta.setValueAt(formatoValor.format(valor), i, 5);

                i++;

            }

        }

        if (radButPessoaJuridica.isSelected()) {

            List<MLancamentoValorEmHaver> listaCompra = new ArrayList<MLancamentoValorEmHaver>();
            mpj.setNomeEmpresarial(comboBoxCliente.getSelectedItem().toString());
            dpj.pegaIdFornecedorPj(mpj);
            mpj.setId(mpj.getId());

            if (radButEmAberto.isSelected()) {

                TipoStatusDaConta status = TipoStatusDaConta.EMABERTO;
                listaCompra = dr.carregaContaPj(mpj, status);

            } else {

                TipoStatusDaConta status = TipoStatusDaConta.BAIXADA;
                listaCompra = dr.carregaContaPj(mpj, status);

            }

            DefaultTableModel tbm = (DefaultTableModel) tabelaConta.getModel();

            for (int i = tbm.getRowCount() - 1; i > 0; i--) {

                tbm.removeRow(i);

            }

            int i = 0;

            for (MLancamentoValorEmHaver h : listaCompra) {

                tbm.addRow(new String[1]);

                Date dataMovimento = h.getData_movimento();
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

                NumberFormat formatoValor = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
                double valor = h.getPagamento().getValorPorFormaPg();

                tabelaConta.setValueAt(h.getId(), i, 0);
                tabelaConta.setValueAt(h.getClientePj().getId(), i, 1);
                tabelaConta.setValueAt(h.getMovimentoSaidaVenda().getNum_venda(), i, 2);
                tabelaConta.setValueAt(df.format(dataMovimento), i, 3);
                tabelaConta.setValueAt(h.getStatusDaConta(), i, 4);
                tabelaConta.setValueAt(formatoValor.format(valor), i, 5);

                i++;

            }

        }

        somaColuna();

    }

    public void limpaTabelaProdutoVendido() {

        while (tabelaConta.getModel().getRowCount() > 0) {

            ((DefaultTableModel) tabelaConta.getModel()).removeRow(0);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butMostrarConta;
    private javax.swing.JButton butReceber;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> comboBoxCliente;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblValorEmHaver;
    private javax.swing.JRadioButton radButBaixada;
    private javax.swing.JRadioButton radButEmAberto;
    private javax.swing.JRadioButton radButPessoaFisica;
    private javax.swing.JRadioButton radButPessoaJuridica;
    private javax.swing.JTable tabelaConta;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDataMovimento;
    private javax.swing.JTextField txtIdentificacao;
    private javax.swing.JTextField txtNumCompra;
    private javax.swing.JTextField txtPagoAteMomento;
    private javax.swing.JTextField txtSaldoDevedor;
    private javax.swing.JTextField txtTotalEmHaver;
    private javax.swing.JTextField txtValorDaConta;
    private javax.swing.JTextField txtValorRecebido;
    // End of variables declaration//GEN-END:variables
}
