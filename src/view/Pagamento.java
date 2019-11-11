package view;

import dao.DConexao;
import dao.DFormaPagamento;
import dao.DMovimentoSaidaVenda;
import dao.DPessoaFisica;
import dao.DPessoaJuridica;
import dao.DLancamentoValorEmHaver;
import static enums.TipoPagamento.AVISTA;
import static enums.TipoPagamento.CREDITO;
import static enums.TipoPagamento.DEBITO;
import static enums.TipoPagamento.EMHAVER;
import enums.TipoStatusDaConta;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.MEntradaSaidaCaixa;
import model.MFormaPagamento;
import model.MMovimentoSaidaVenda;
import model.MPessoaFisica;
import model.MPessoaJuridica;
import model.MLancamentoValorEmHaver;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class Pagamento extends javax.swing.JDialog {

    VendaProduto vp;
    public static VendaProduto venda;

    public Pagamento(VendaProduto parent, boolean modal) {
        this.venda = parent;
        this.setModal(modal);
        initComponents();
        txtDinheiro.requestFocus();
        setaValoresIniciais();
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

    public void recebeNumeroCompraTotalCompra(String numVenda, String totalVenda, String dataCompra) {

        lblNumeroVenda.setText(numVenda);
        lblTotalVenda.setText(totalVenda);
        lblDataVenda.setText(dataCompra);

    }

    private void setaValoresIniciais() {

        txtCredito.setText("R$0,00");
        txtDebito.setText("R$0,00");
        txtDinheiro.setText("R$0,00");
        txtEmHaver.setText("R$0,00");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTotalVenda = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNumeroVenda = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblDataVenda = new javax.swing.JLabel();
        lblValorDinheiro = new javax.swing.JLabel();
        txtDinheiro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDebito = new javax.swing.JTextField();
        lblCredito = new javax.swing.JLabel();
        txtCredito = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmHaver = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        comboBoxCliente = new javax.swing.JComboBox<String>();
        jLabel5 = new javax.swing.JLabel();
        radButPessoaFisica = new javax.swing.JRadioButton();
        radButPessoaJuridica = new javax.swing.JRadioButton();
        butFinalizarCompra = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recebimento");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Forma de Pagamento"));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Total da Venda");

        lblTotalVenda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Número da Venda");

        lblNumeroVenda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Data da Venda");

        lblDataVenda.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblNumeroVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDataVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblTotalVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNumeroVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                            .addComponent(lblDataVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblValorDinheiro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblValorDinheiro.setText("Dinheiro");

        txtDinheiro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtDinheiro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDinheiroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDinheiroFocusLost(evt);
            }
        });
        txtDinheiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDinheiroKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Débito");

        txtDebito.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtDebito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDebitoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDebitoFocusLost(evt);
            }
        });
        txtDebito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDebitoKeyPressed(evt);
            }
        });

        lblCredito.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCredito.setText("Crédito");

        txtCredito.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCredito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCreditoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCreditoFocusLost(evt);
            }
        });
        txtCredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCreditoKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Em haver");

        txtEmHaver.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEmHaver.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmHaverFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmHaverFocusLost(evt);
            }
        });
        txtEmHaver.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmHaverKeyPressed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do Cliente"));

        comboBoxCliente.setEditable(true);
        comboBoxCliente.setEnabled(false);

        jLabel5.setText("Cliente");

        buttonGroup1.add(radButPessoaFisica);
        radButPessoaFisica.setText("Pessoa Física");
        radButPessoaFisica.setEnabled(false);
        radButPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radButPessoaFisicaActionPerformed(evt);
            }
        });

        buttonGroup1.add(radButPessoaJuridica);
        radButPessoaJuridica.setText("Pessoa Jurídica");
        radButPessoaJuridica.setEnabled(false);
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(radButPessoaFisica)
                        .addGap(18, 18, 18)
                        .addComponent(radButPessoaJuridica)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(comboBoxCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radButPessoaFisica)
                    .addComponent(radButPessoaJuridica))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        butFinalizarCompra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        butFinalizarCompra.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\dinheiro.png")); // NOI18N
        butFinalizarCompra.setText("Finalizar Compra");
        butFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butFinalizarCompraActionPerformed(evt);
            }
        });
        butFinalizarCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                butFinalizarCompraKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblValorDinheiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDinheiro, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCredito))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtEmHaver, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butFinalizarCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblValorDinheiro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmHaver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblCredito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butFinalizarCompra)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDinheiroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDinheiroFocusGained

        txtDinheiro.selectAll();

    }//GEN-LAST:event_txtDinheiroFocusGained

    private void txtDinheiroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDinheiroFocusLost

        verificaCampoNulo();
        Locale l = new Locale("pt", "BR");
        NumberFormat df = NumberFormat.getCurrencyInstance(l);
        double dinheiro = Double.parseDouble(txtDinheiro.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        txtDinheiro.setText(df.format(dinheiro));

    }//GEN-LAST:event_txtDinheiroFocusLost

    private void txtDinheiroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDinheiroKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtDebito.requestFocus();

        }
    }//GEN-LAST:event_txtDinheiroKeyPressed

    private void txtDebitoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDebitoFocusGained

        txtDebito.selectAll();

    }//GEN-LAST:event_txtDebitoFocusGained

    private void txtDebitoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDebitoFocusLost

        verificaCampoNulo();
        Locale l = new Locale("pt", "BR");
        NumberFormat df = NumberFormat.getCurrencyInstance(l);
        double debito = Double.parseDouble(txtDebito.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        txtDebito.setText(df.format(debito));
    }//GEN-LAST:event_txtDebitoFocusLost

    private void txtDebitoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDebitoKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtCredito.requestFocus();

        }
    }//GEN-LAST:event_txtDebitoKeyPressed

    private void txtCreditoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCreditoFocusGained

        txtCredito.selectAll();

    }//GEN-LAST:event_txtCreditoFocusGained

    private void txtCreditoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCreditoFocusLost

        verificaCampoNulo();
        Locale l = new Locale("pt", "BR");
        NumberFormat df = NumberFormat.getCurrencyInstance(l);
        double credito = Double.parseDouble(txtCredito.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        txtCredito.setText(df.format(credito));
    }//GEN-LAST:event_txtCreditoFocusLost

    private void txtCreditoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreditoKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtEmHaver.requestFocus();

        }
    }//GEN-LAST:event_txtCreditoKeyPressed

    private void txtEmHaverFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmHaverFocusGained

        txtEmHaver.selectAll();

    }//GEN-LAST:event_txtEmHaverFocusGained

    private void txtEmHaverFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmHaverFocusLost

        verificaCampoNulo();
        Locale l = new Locale("pt", "BR");
        NumberFormat df = NumberFormat.getCurrencyInstance(l);
        double emhaver = Double.parseDouble(txtEmHaver.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        txtEmHaver.setText(df.format(emhaver));

        if (emhaver != 0) {

            radButPessoaFisica.setEnabled(false);
            radButPessoaJuridica.setEnabled(false);
            comboBoxCliente.setEnabled(false);
            radButPessoaFisica.setEnabled(true);
            radButPessoaJuridica.setEnabled(true);
            comboBoxCliente.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Informe o tipo de cliente e o nome do cliente!", "Informação", JOptionPane.INFORMATION_MESSAGE);

        } else {

            radButPessoaFisica.setEnabled(false);
            radButPessoaJuridica.setEnabled(false);
            comboBoxCliente.setEnabled(false);
            butFinalizarCompra.requestFocus();

        }
    }//GEN-LAST:event_txtEmHaverFocusLost

    private void txtEmHaverKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmHaverKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            radButPessoaFisica.requestFocus();

        }
    }//GEN-LAST:event_txtEmHaverKeyPressed

    private void radButPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radButPessoaFisicaActionPerformed

        comboBoxCliente.setSelectedItem("");
        try {

            carregaClienteCombox();
            comboBoxCliente.getEditor().selectAll();

        } catch (SQLException e) {

            Logger.getLogger(EntradaProdutos.class.getName()).log(Level.SEVERE, null, e);

        }
        AutoCompleteDecorator.decorate(comboBoxCliente);
    }//GEN-LAST:event_radButPessoaFisicaActionPerformed

    private void radButPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radButPessoaJuridicaActionPerformed

        comboBoxCliente.setSelectedItem("");
        try {

            carregaClienteCombox();
            comboBoxCliente.getEditor().selectAll();

        } catch (SQLException e) {

            Logger.getLogger(EntradaProdutos.class.getName()).log(Level.SEVERE, null, e);

        }
        AutoCompleteDecorator.decorate(comboBoxCliente);
    }//GEN-LAST:event_radButPessoaJuridicaActionPerformed

    private void butFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butFinalizarCompraActionPerformed

        Connection con = DConexao.abrirConexao();
        MFormaPagamento mpg1 = new MFormaPagamento();
        MFormaPagamento mpg2 = new MFormaPagamento();
        MFormaPagamento mpg3 = new MFormaPagamento();
        MFormaPagamento mpg4 = new MFormaPagamento();
        DFormaPagamento dpg = new DFormaPagamento(con);
        MPessoaFisica mpf = new MPessoaFisica();
        MEntradaSaidaCaixa c = new MEntradaSaidaCaixa();
        MPessoaJuridica mpj = new MPessoaJuridica();
        DPessoaJuridica dpj = new DPessoaJuridica(con);
        DPessoaFisica dpf = new DPessoaFisica(con);

        double dinheiro = Double.parseDouble(txtDinheiro.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        double debito = Double.parseDouble(txtDebito.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        double credito = Double.parseDouble(txtCredito.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        double emhaver = Double.parseDouble(txtEmHaver.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        double totVenda = Double.parseDouble(lblTotalVenda.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        int numVenda = Integer.parseInt(lblNumeroVenda.getText());
        double total = Double.parseDouble(lblTotalVenda.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        double subTotal;
        double dif;
        subTotal = dinheiro + credito + debito + emhaver;
        dif = total - subTotal;

        if (dif != 0) {

            JOptionPane.showMessageDialog(null, "Os valores de pagamento estão\ndiferentes do total da compra!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;

        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dt = lblDataVenda.getText();
        Date data = null;

        try {

            data = sdf.parse(dt);

        } catch (ParseException ex) {

            Logger.getLogger(EntradaSaidaCaixa.class.getName()).log(Level.SEVERE, null, ex);

        }

        if (dinheiro > 0) {

            mpg1.setNum_venda(numVenda);
            mpg1.setValorPorFormaPg(dinheiro);
            mpg1.setTotal_venda(totVenda);
            mpg1.setTipoPagamento(AVISTA);
            mpg1.setPessoaFisica(mpf);
            mpg1.setPessoaJuridica(mpj);
            mpg1.setStatusDaConta(TipoStatusDaConta.BAIXADA);
            mpg1.setDataVenda(data);

            System.out.println(dpg.salvar(mpg1));

        }

        if (debito > 0) {

            mpg2.setNum_venda(numVenda);
            mpg2.setValorPorFormaPg(debito);
            mpg2.setTotal_venda(totVenda);
            mpg2.setTipoPagamento(DEBITO);
            mpg2.setPessoaFisica(mpf);
            mpg2.setPessoaJuridica(mpj);
            mpg2.setStatusDaConta(TipoStatusDaConta.BAIXADA);
            mpg2.setDataVenda(data);
            System.out.println(dpg.salvar(mpg2));

        }

        if (credito > 0) {

            mpg3.setNum_venda(numVenda);
            mpg3.setValorPorFormaPg(credito);
            mpg3.setTotal_venda(totVenda);
            mpg3.setTipoPagamento(CREDITO);
            mpg3.setPessoaFisica(mpf);
            mpg3.setPessoaJuridica(mpj);
            mpg3.setStatusDaConta(TipoStatusDaConta.BAIXADA);
            mpg3.setDataVenda(data);
            System.out.println(dpg.salvar(mpg3));

        }

        if (emhaver > 0) {

            mpg4.setNum_venda(numVenda);
            mpg4.setValorPorFormaPg(emhaver);
            mpg4.setTotal_venda(totVenda);
            mpg4.setTipoPagamento(EMHAVER);

            if (radButPessoaFisica.isSelected()) {

                mpf.setNome(comboBoxCliente.getSelectedItem().toString());
                dpf.pegaIdFornecedor(mpf);
                mpf.setId(mpf.getId());
                mpg4.setPessoaFisica(mpf);
                mpg4.setPessoaJuridica(mpj);
                mpg4.setDataVenda(data);
                salvaContaEmHaver();

            }

            if (radButPessoaJuridica.isSelected()) {

                mpj.setNomeEmpresarial(comboBoxCliente.getSelectedItem().toString());
                dpj.pegaIdFornecedorPj(mpj);
                mpj.setId(mpj.getId());
                mpg4.setPessoaFisica(mpf);
                mpg4.setPessoaJuridica(mpj);
                mpg4.setDataVenda(data);
                salvaContaEmHaver();

            }

            mpg4.setStatusDaConta(TipoStatusDaConta.EMABERTO);

            System.out.println(dpg.salvar(mpg4));

        }

        limpaCamposVendasProduto();
        imprimiRecibo();
        dispose();
        
        JOptionPane.showMessageDialog(null, "Imprimindo recibo de compra.");

    }//GEN-LAST:event_butFinalizarCompraActionPerformed

    private void salvaContaEmHaver() {

        Connection con = DConexao.abrirConexao();
        MLancamentoValorEmHaver mr = new MLancamentoValorEmHaver();
        DLancamentoValorEmHaver dr = new DLancamentoValorEmHaver(con);
        MPessoaFisica mpf = new MPessoaFisica();
        DPessoaFisica dpf = new DPessoaFisica(con);
        MPessoaJuridica mpj = new MPessoaJuridica();
        DPessoaJuridica dpj = new DPessoaJuridica(con);
        MMovimentoSaidaVenda msv = new MMovimentoSaidaVenda();
        DMovimentoSaidaVenda dsv = new DMovimentoSaidaVenda(con);
        MFormaPagamento fp = new MFormaPagamento();

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        String dt2 = lblDataVenda.getText();
        Date data2 = null;

        int numVenda = Integer.parseInt(lblNumeroVenda.getText());
        double valorEmHaver = Double.parseDouble(txtEmHaver.getText().replace(".", "").replace(",", ".").replace("R$", ""));

        if (radButPessoaFisica.isSelected()) {

            mpf.setNome(comboBoxCliente.getSelectedItem().toString());
            dpf.pegaIdFornecedor(mpf);
            mpf.setId(mpf.getId());
            mr.setClientePf(mpf);

            mr.setClientePj(mpj);

            msv.setNum_venda(numVenda);
            dsv.carregaPrecoVenda(msv);
            msv.setPrecoVenda(msv.getPrecoVenda());
            mr.setMovimentoSaidaVenda(msv);

            fp.setValorPorFormaPg(valorEmHaver);
            mr.setPagamento(fp);
            mr.setValorPago(0);
            mr.setSaldoDevedor(valorEmHaver);
            mr.setStatusDaConta(TipoStatusDaConta.EMABERTO);

            try {

                data2 = sdf2.parse(dt2);

            } catch (ParseException ex) {

                Logger.getLogger(EntradaSaidaCaixa.class.getName()).log(Level.SEVERE, null, ex);

            }

            mr.setData_movimento(data2);

            System.out.println(dr.salvar(mr));

        }

        if (radButPessoaJuridica.isSelected()) {

            mpj.setNomeEmpresarial(comboBoxCliente.getSelectedItem().toString());
            dpj.pegaIdFornecedorPj(mpj);
            mpj.setId(mpj.getId());
            mr.setClientePj(mpj);

            mr.setClientePf(mpf);

            msv.setNum_venda(numVenda);
            dsv.carregaPrecoVenda(msv);
            msv.setPrecoVenda(msv.getPrecoVenda());
            mr.setMovimentoSaidaVenda(msv);

            fp.setValorPorFormaPg(valorEmHaver);
            mr.setPagamento(fp);
            mr.setValorPago(0);
            mr.setSaldoDevedor(mr.getSaldoDevedor());
            mr.setStatusDaConta(TipoStatusDaConta.EMABERTO);

            try {

                data2 = sdf2.parse(dt2);

            } catch (ParseException ex) {

                Logger.getLogger(EntradaSaidaCaixa.class.getName()).log(Level.SEVERE, null, ex);

            }
            mr.setData_movimento(data2);

            System.out.println(dr.salvar(mr));

        }
    }

    public void limpaCamposVendasProduto() {

        venda.executadoPelaTelaDePagamento();

    }

    private void butFinalizarCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_butFinalizarCompraKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            butFinalizarCompra.doClick();

        }
    }//GEN-LAST:event_butFinalizarCompraKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void verificaCampoNulo() {

        if (txtDinheiro.getText().isEmpty()) {

            txtDinheiro.setText("R$0,00");
            return;

        }

        if (txtDebito.getText().isEmpty()) {

            txtDebito.setText("R$0,00");
            return;

        }

        if (txtCredito.getText().isEmpty()) {

            txtCredito.setText("R$0,00");
            return;

        }

        if (txtEmHaver.getText().isEmpty()) {

            txtEmHaver.setText("R$0,00");
            return;

        }

        if (lblTotalVenda.getText().isEmpty()) {

            lblTotalVenda.setText("R$0,00");
            return;

        }

        if (lblNumeroVenda.getText().isEmpty()) {

            lblNumeroVenda.setText("R$0,00");
            return;

        }

    }

    private void calculaPagamento() {

        double emhaver = Double.parseDouble(txtEmHaver.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        double credito = Double.parseDouble(txtCredito.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        double debito = Double.parseDouble(txtDebito.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        double dinheiro = Double.parseDouble(txtDinheiro.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        double total = Double.parseDouble(lblTotalVenda.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        double subTotal;
        double dif;
        subTotal = dinheiro + credito + debito + emhaver;
        dif = total - subTotal;

        if (dif != 0) {

            JOptionPane.showMessageDialog(null, "Os valores de pagamento estão\ndiferentes do total da compra!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;

        } else {

            JOptionPane.showMessageDialog(null, "Compra Finalizada com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;

        }

    }

    private void imprimiRecibo() {

        Connection con = DConexao.abrirConexao();

        try {

            int num = Integer.parseInt(lblNumeroVenda.getText());

            HashMap filtro = new HashMap();
            filtro.put("numVenda", num);

            JasperPrint p = JasperFillManager.fillReport("C:/ControleDeEstoque/dist/relatorio/Recibo.jasper", filtro, con);

            // JasperViewer.viewReport(p, false);//abre relatório
            JasperPrintManager.printPage(p, 0, false);//manda direto para impressão

        } catch (JRException ex) {

            Logger.getLogger(Pagamento.class.getName()).log(Level.SEVERE, null, ex);

        }

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
            java.util.logging.Logger.getLogger(Pagamento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pagamento dialog = new Pagamento(venda, true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butFinalizarCompra;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboBoxCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCredito;
    private javax.swing.JLabel lblDataVenda;
    private javax.swing.JLabel lblNumeroVenda;
    private javax.swing.JLabel lblTotalVenda;
    private javax.swing.JLabel lblValorDinheiro;
    private javax.swing.JRadioButton radButPessoaFisica;
    private javax.swing.JRadioButton radButPessoaJuridica;
    private javax.swing.JTextField txtCredito;
    private javax.swing.JTextField txtDebito;
    private javax.swing.JTextField txtDinheiro;
    private javax.swing.JTextField txtEmHaver;
    // End of variables declaration//GEN-END:variables
}
