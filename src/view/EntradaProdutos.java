package view;

import dao.DCategoria;
import dao.DConexao;
import dao.DMovimentoEntradaProduto;
import dao.DPessoaFisica;
import dao.DPessoaJuridica;
import dao.DProduto;
import dao.DTotalProduto;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.MCategoria;
import model.MFornecedorPessoaFisica;
import model.MFornecedorPessoaJuridica;
import model.MMovimentoEntradaProduto;
import model.MPessoaFisica;
import model.MPessoaJuridica;
import model.MProduto;
import model.MTotalProduto;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class EntradaProdutos extends javax.swing.JInternalFrame {

    public EntradaProdutos() throws SQLException {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboFornecedor = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtNotaFiscal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dtNotaFiscal = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoBarra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMargemVenda = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrecoCusto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPrecoVenda = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        dataValidade = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        txtLote = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtNumCalcado = new javax.swing.JTextField();
        txtProduto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        butSalvar = new javax.swing.JButton();
        butPesquisar = new javax.swing.JButton();
        butCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEntradaProduto = new javax.swing.JTable();
        jblTotalNotaFiscal = new javax.swing.JLabel();
        lblValorNota = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        radButPessoaFisica = new javax.swing.JRadioButton();
        radButPessoaJuridica = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Entrada no Estoque");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fornecedor"));

        jLabel1.setText("Fornecedor");

        comboFornecedor.setEditable(true);

        jLabel15.setText("Nota Fiscal");

        txtNotaFiscal.setBackground(new java.awt.Color(255, 255, 153));

        jLabel2.setText("Data da Nota Fiscal");

        dtNotaFiscal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dtNotaFiscalKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txtNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(dtNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(comboFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtNotaFiscal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto"));

        jLabel3.setText("Código de Barras");

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

        jLabel4.setText("Produto");

        jLabel7.setText("Data de Validade");

        jLabel8.setText("Margem de Venda(%)");

        txtMargemVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMargemVendaFocusLost(evt);
            }
        });
        txtMargemVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMargemVendaKeyPressed(evt);
            }
        });

        jLabel9.setText("Preço de Custo");

        txtPrecoCusto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecoCustoKeyPressed(evt);
            }
        });

        jLabel10.setText("Preço de Venda");

        txtPrecoVenda.setEditable(false);
        txtPrecoVenda.setEnabled(false);

        jLabel11.setText("Quantidade");

        txtQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantidadeFocusLost(evt);
            }
        });
        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyPressed(evt);
            }
        });

        jLabel12.setText("Total");

        txtTotal.setEditable(false);
        txtTotal.setEnabled(false);

        dataValidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dataValidadeKeyPressed(evt);
            }
        });

        jLabel14.setText("Lote");

        txtLote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoteKeyPressed(evt);
            }
        });

        jLabel16.setText("Nº Calçado");

        txtNumCalcado.setEnabled(false);
        txtNumCalcado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumCalcadoKeyPressed(evt);
            }
        });

        txtProduto.setEditable(false);
        txtProduto.setBackground(new java.awt.Color(255, 255, 153));
        txtProduto.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(txtCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(txtNumCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMargemVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(dataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel12)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMargemVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria"));

        jLabel6.setText("Categoria");

        txtCategoria.setEditable(false);
        txtCategoria.setBackground(new java.awt.Color(255, 255, 153));
        txtCategoria.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtCategoria))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        butSalvar.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\salvar.png")); // NOI18N
        butSalvar.setText("Salvar");
        butSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSalvarActionPerformed(evt);
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

        tabelaEntradaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Apresentação", "Quantidade", "Preco Custo", "Preço de venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaEntradaProduto.getTableHeader().setReorderingAllowed(false);
        tabelaEntradaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaEntradaProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaEntradaProduto);
        if (tabelaEntradaProduto.getColumnModel().getColumnCount() > 0) {
            tabelaEntradaProduto.getColumnModel().getColumn(0).setResizable(false);
            tabelaEntradaProduto.getColumnModel().getColumn(1).setResizable(false);
            tabelaEntradaProduto.getColumnModel().getColumn(2).setResizable(false);
            tabelaEntradaProduto.getColumnModel().getColumn(3).setResizable(false);
            tabelaEntradaProduto.getColumnModel().getColumn(4).setResizable(false);
        }

        jblTotalNotaFiscal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jblTotalNotaFiscal.setText("Total da Nota Fiscal");

        lblValorNota.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValorNota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Fornecedor"));

        buttonGroup1.add(radButPessoaFisica);
        radButPessoaFisica.setText("Pessoa Física");
        radButPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radButPessoaFisicaActionPerformed(evt);
            }
        });

        buttonGroup1.add(radButPessoaJuridica);
        radButPessoaJuridica.setText("Pessoa Jurídica");
        radButPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radButPessoaJuridicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radButPessoaFisica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radButPessoaJuridica)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radButPessoaFisica)
                    .addComponent(radButPessoaJuridica))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(butPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(butCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jblTotalNotaFiscal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jblTotalNotaFiscal)
                        .addComponent(lblValorNota, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(butPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(butCancelar))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalvarActionPerformed

        if (comboFornecedor.getItemCount() == 0) {

            JOptionPane.showMessageDialog(null, "Marque o tipo de fornecedor!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;

        }

        if (txtNotaFiscal.getText().isEmpty()
                || txtProduto.getText().isEmpty()
                || txtCategoria.getText().isEmpty()
                || txtPrecoVenda.getText().isEmpty()
                || txtTotal.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Os seguintes campos são obrigatórios:\n"
                    + "-Nota Fiscal\n"
                    + "-Produto\n"
                    + "-Categoria\n"
                    + "-Preço de Venda\n"
                    + "-Total", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;

        }

        Connection con = DConexao.abrirConexao();
        MCategoria cat = new MCategoria();
        MFornecedorPessoaJuridica f = new MFornecedorPessoaJuridica();
        MFornecedorPessoaFisica pf = new MFornecedorPessoaFisica();
        MMovimentoEntradaProduto mep = new MMovimentoEntradaProduto();
        MProduto prod = new MProduto();

        DCategoria c = new DCategoria(con);
        DProduto dp = new DProduto(con);
        DPessoaFisica dpf = new DPessoaFisica(con);
        DPessoaJuridica dpj = new DPessoaJuridica(con);
        DMovimentoEntradaProduto dep = new DMovimentoEntradaProduto(con);

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dtNf = dtNotaFiscal.getDate();
        Date dtValidade = dataValidade.getDate();

        if (dtNf == null) {

            JOptionPane.showMessageDialog(null, "Preencha os campos data!",
                    "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;

        }

        if (dtValidade == null) {

            JOptionPane.showMessageDialog(null, "Preencha os campos data!",
                    "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;

        }

        formato.format(dtNf);
        formato.format(dtValidade);

        mep.setNumeroNotaFiscal(txtNotaFiscal.getText());
        mep.setDataNotaFiscal(dtNf);

        if (radButPessoaFisica.isSelected()) {

            pf.setNome(comboFornecedor.getSelectedItem().toString());
            dpf.pegaIdFornecedor(pf);
            pf.setId(pf.getId());
            mep.setFornecedorPf(pf);
            mep.setFornecedor(f);

        }

        if (radButPessoaJuridica.isSelected()) {

            f.setNomeEmpresarial(comboFornecedor.getSelectedItem().toString());
            dpj.pegaIdFornecedorPj(f);
            f.setId(f.getId());
            mep.setFornecedor(f);
            mep.setFornecedorPf(pf);

        }

        cat.setCategoria(txtCategoria.getText());
        c.pegaIdCategoria(cat);
        cat.setId(cat.getId());
        mep.setCategoria(cat);

        prod.setProduto(txtProduto.getText());
        dp.pegaIdProduto(prod);
        prod.setId(prod.getId());
        mep.setProduto(prod);

        prod.setCodigoBarra(txtCodigoBarra.getText());

        mep.setLote(txtLote.getText());

        mep.setNumeroCalcado(txtNumCalcado.getText());
        mep.setDataValidade(dtValidade);

        double pc = Double.parseDouble(txtPrecoCusto.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        mep.setPrecoCusto(pc);

        double mv = Double.parseDouble(txtMargemVenda.getText().replace(".", "").replace(",", "."));
        mep.setMargemVenda(mv);

        double pv = Double.parseDouble(txtPrecoVenda.getText().replace(".", "").replace(".", "").replace(",", ".").replace("R$", ""));
        mep.setPrecoVenda(pv);

        double qtd = Double.parseDouble(txtQuantidade.getText().replace(".", "").replace(",", "."));
        mep.setQuantidade(qtd);

        double total = Double.parseDouble(txtTotal.getText().replace(".", "").replace(".", "").replace(",", ".").replace("R$", ""));
        mep.setTotal(total);

        System.out.println(dep.salvar(mep));

        MTotalProduto tp = new MTotalProduto();
        DTotalProduto dtp = new DTotalProduto(con);
        MProduto p = new MProduto();

        prod.setProduto(txtProduto.getText());
        dp.pegaIdProduto(prod);
        prod.setId(prod.getId());

        prod.setCodigoBarra(txtCodigoBarra.getText());

        p.setId(prod.getId());
        p.setCodigoBarra(txtCodigoBarra.getText());
        tp.setProduto(p);
        dtp.pegaTotalProduto(tp);
        tp.setTotalProduto(tp.getTotalProduto() + qtd);

        System.out.println(dtp.atualizaTotal(tp));

        limparTabelaContaLancada();
        carregaTabelaEntradaProduto();
        limparCampos();
        somaColuna();

    }//GEN-LAST:event_butSalvarActionPerformed

    private void radButPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radButPessoaFisicaActionPerformed

        txtNotaFiscal.setText("");
        dtNotaFiscal.setDate(null);
        dataValidade.setDate(null);
        limparTabelaContaLancada();
        comboFornecedor.setSelectedItem("");
        try {

            carregaFornecedorComboBox();

        } catch (SQLException ex) {

            Logger.getLogger(EntradaProdutos.class.getName()).log(Level.SEVERE, null, ex);

        }

        AutoCompleteDecorator.decorate(comboFornecedor);

    }//GEN-LAST:event_radButPessoaFisicaActionPerformed

    private void radButPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radButPessoaJuridicaActionPerformed

        txtNotaFiscal.setText("");
        dtNotaFiscal.setDate(null);
        dataValidade.setDate(null);
        limparTabelaContaLancada();
        comboFornecedor.setSelectedItem("");
        comboFornecedor.setSelectedItem("");
        try {

            carregaFornecedorComboBox();

        } catch (SQLException ex) {

            Logger.getLogger(EntradaProdutos.class.getName()).log(Level.SEVERE, null, ex);

        }

        AutoCompleteDecorator.decorate(comboFornecedor);

    }//GEN-LAST:event_radButPessoaJuridicaActionPerformed

    private void txtMargemVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMargemVendaKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtQuantidade.requestFocus();

        }

    }//GEN-LAST:event_txtMargemVendaKeyPressed

    private void txtQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            butSalvar.requestFocus();
            carregaMargemVenda();

        }
    }//GEN-LAST:event_txtQuantidadeKeyPressed

    private void txtCodigoBarraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoBarraFocusLost

        verificaProdutoCadastrado();

    }//GEN-LAST:event_txtCodigoBarraFocusLost

    private void txtMargemVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMargemVendaFocusLost

    }//GEN-LAST:event_txtMargemVendaFocusLost

    private void txtCodigoBarraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoBarraKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtLote.requestFocus();
            carregaCategoriaProduto();

            if (txtCategoria.getText().equals("CALÇADO")
                    || txtCategoria.getText().equals("CALÇADOS")) {

                txtNumCalcado.setEnabled(true);

            } else {

                txtNumCalcado.setEnabled(false);

            }

        }

    }//GEN-LAST:event_txtCodigoBarraKeyPressed

    private void txtQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeFocusLost

        if (txtQuantidade.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Informe a quantidade", "Atenção!",
                    JOptionPane.WARNING_MESSAGE);
            return;

        }
        carregaMargemVenda();

    }//GEN-LAST:event_txtQuantidadeFocusLost

    private void dtNotaFiscalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtNotaFiscalKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            comboFornecedor.requestFocus();

        }

    }//GEN-LAST:event_dtNotaFiscalKeyPressed

    private void txtLoteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoteKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtNumCalcado.requestFocus();

        }

    }//GEN-LAST:event_txtLoteKeyPressed

    private void txtNumCalcadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumCalcadoKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtPrecoCusto.requestFocus();

        }

    }//GEN-LAST:event_txtNumCalcadoKeyPressed

    private void dataValidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dataValidadeKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            dataValidade.requestFocus();

        }

    }//GEN-LAST:event_dataValidadeKeyPressed

    private void txtPrecoCustoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoCustoKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtMargemVenda.requestFocus();

        }

    }//GEN-LAST:event_txtPrecoCustoKeyPressed

    private void butPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPesquisarActionPerformed

        if (txtNotaFiscal.getText().isEmpty() || dtNotaFiscal.getDate() == null || comboFornecedor.getSelectedItem() == null) {

            JOptionPane.showMessageDialog(null, "Para realizar a pesquisa de nota fiscal são necessários:"
                    + "\n-Número da Nota Fiscal"
                    + "\n-Data da Nota Fiscal"
                    + "\n-Nome do Fornecedor", "Atenção", JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_butPesquisarActionPerformed

    private void tabelaEntradaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEntradaProdutoMouseClicked

        if (evt.getClickCount() == 2) {

            if (radButPessoaFisica.isSelected()) {
                Connection con = DConexao.abrirConexao();
                MMovimentoEntradaProduto mep = new MMovimentoEntradaProduto();
                DMovimentoEntradaProduto dep = new DMovimentoEntradaProduto(con);
                MProduto mp = new MProduto();
                DProduto dp = new DProduto(con);
                MFornecedorPessoaFisica mpf = new MFornecedorPessoaFisica();
                DPessoaFisica dpf = new DPessoaFisica(con);

                mep.setNumeroNotaFiscal(txtNotaFiscal.getText());
                mep.setDataNotaFiscal(dtNotaFiscal.getDate());

                mpf.setNome(comboFornecedor.getSelectedItem().toString());
                dpf.pegaIdFornecedor(mpf);
                mpf.setId(mpf.getId());
                mep.setFornecedorPf(mpf);

                DefaultTableModel tbm = (DefaultTableModel) tabelaEntradaProduto.getModel();
                Integer indice = tabelaEntradaProduto.getSelectedRow();
                tbm.getValueAt(indice, 0);
                mp.setProduto(tbm.getValueAt(indice, 0).toString());
                dp.pegaIdProduto(mp);
                mp.setId(mp.getId());
                mep.setProduto(mp);

                dep.pegaIdEntradaProdutoPf(mep);
                mep.setId(mep.getId());

                System.out.println(dep.delataProdutoDaNota(mep));

                MTotalProduto tp = new MTotalProduto();
                DTotalProduto dtp = new DTotalProduto(con);

                tbm.getValueAt(indice, 0);
                mp.setProduto(tbm.getValueAt(indice, 0).toString());
                dp.pegaIdProduto(mp);
                mp.setId(mp.getId());

                tp.setProduto(mp);
                dtp.pegaTotalProdutoExclusao(tp);
                tp.setTotalProduto(tp.getTotalProduto());

                double t = (double) tbm.getValueAt(indice, 2);
                tp.setTotalProduto(tp.getTotalProduto() - t);

                System.out.println(dtp.atualizaTotalExclusao(tp));

                limparTabelaContaLancada();
                carregaTabelaEntradaProduto();
                JOptionPane.showMessageDialog(null, "Produto Excluído com sucesso!", "Atenção", JOptionPane.WARNING_MESSAGE);

            }

            if (radButPessoaJuridica.isSelected()) {

                Connection con = DConexao.abrirConexao();
                MMovimentoEntradaProduto mep = new MMovimentoEntradaProduto();
                DMovimentoEntradaProduto dep = new DMovimentoEntradaProduto(con);
                MProduto mp = new MProduto();
                DProduto dp = new DProduto(con);
                MFornecedorPessoaJuridica mpj = new MFornecedorPessoaJuridica();
                DPessoaJuridica dpj = new DPessoaJuridica(con);

                mep.setNumeroNotaFiscal(txtNotaFiscal.getText());
                mep.setDataNotaFiscal(dtNotaFiscal.getDate());

                mpj.setNomeEmpresarial(comboFornecedor.getSelectedItem().toString());
                dpj.pegaIdFornecedorPj(mpj);
                mpj.setId(mpj.getId());
                mep.setFornecedor(mpj);

                DefaultTableModel tbm = (DefaultTableModel) tabelaEntradaProduto.getModel();
                Integer indice = tabelaEntradaProduto.getSelectedRow();
                tbm.getValueAt(indice, 0);
                mp.setProduto(tbm.getValueAt(indice, 0).toString());
                dp.pegaIdProduto(mp);
                mp.setId(mp.getId());
                mep.setProduto(mp);

                dep.pegaIdEntradaProdutoPj(mep);
                mep.setId(mep.getId());

                System.out.println(dep.delataProdutoDaNota(mep));

                MTotalProduto tp = new MTotalProduto();
                DTotalProduto dtp = new DTotalProduto(con);

                tbm.getValueAt(indice, 0);
                mp.setProduto(tbm.getValueAt(indice, 0).toString());
                dp.pegaIdProduto(mp);
                mp.setId(mp.getId());

                tp.setProduto(mp);
                dtp.pegaTotalProdutoExclusao(tp);
                tp.setTotalProduto(tp.getTotalProduto());

                double t = (double) tbm.getValueAt(indice, 2);
                tp.setTotalProduto(tp.getTotalProduto() - t);

                System.out.println(dtp.atualizaTotalExclusao(tp));

                limparTabelaContaLancada();
                carregaTabelaEntradaProduto();
                JOptionPane.showMessageDialog(null, "Produto Excluído com sucesso!", "Atenção", JOptionPane.WARNING_MESSAGE);

            }

        }

        somaColuna();

    }//GEN-LAST:event_tabelaEntradaProdutoMouseClicked

    private void butCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarActionPerformed

        dispose();

    }//GEN-LAST:event_butCancelarActionPerformed

    private void carregaMargemVenda() {

        Locale l = new Locale("pt", "BR");
        NumberFormat df = NumberFormat.getCurrencyInstance(l);
        MMovimentoEntradaProduto mep = new MMovimentoEntradaProduto();

        double pc = Double.parseDouble(txtPrecoCusto.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        double mv = Double.parseDouble(txtMargemVenda.getText().replace(".", "").replace(",", ".").replace("R$", ""));
        double qt = Double.parseDouble(txtQuantidade.getText().replace(".", "").replace(",", ".").replace("R$", ""));

        mep.setPrecoCusto(pc);
        mep.setMargemVenda(mv);
        mep.setPrecoVenda(mep.getPrecoVenda());

        mep.setQuantidade(qt);
        mep.setTotal(mep.getTotal());

        txtPrecoVenda.setText(df.format(mep.getPrecoVenda()));
        txtTotal.setText(df.format(mep.getTotal()));
        txtPrecoCusto.setText(df.format(pc));

        DecimalFormat decForm = new DecimalFormat("###00.00");
        txtMargemVenda.setText(decForm.format(mv));
        txtQuantidade.setText(decForm.format(qt));

    }

    private void carregaCategoriaProduto() {

        Connection con = DConexao.abrirConexao();
        MProduto p = new MProduto();
        MCategoria c = new MCategoria();
        DProduto dp = new DProduto(con);

        p.setCodigoBarra(txtCodigoBarra.getText());
        dp.carregaDadosProduto(p, c);

        txtProduto.setText(c.getCategoria());
        txtCategoria.setText(p.getProduto());
    }

    private void carregaFornecedorComboBox() throws SQLException {

        Connection con = DConexao.abrirConexao();
        if (radButPessoaFisica.isSelected()) {

            DPessoaFisica pf = new DPessoaFisica(con);
            comboFornecedor.setModel(new DefaultComboBoxModel(pf.carregaComboPf()));

        }

        if (radButPessoaJuridica.isSelected()) {

            DPessoaJuridica pj = new DPessoaJuridica(con);
            comboFornecedor.setModel(new DefaultComboBoxModel(pj.carregaComboPj()));

        }

    }

    private void carregaTabelaEntradaProduto() {

        Locale l = new Locale("pt", "BR");
        NumberFormat df = NumberFormat.getCurrencyInstance(l);

        if (radButPessoaFisica.isSelected()) {
            Connection con = DConexao.abrirConexao();
            List<MMovimentoEntradaProduto> listaEntrada = new ArrayList<MMovimentoEntradaProduto>();
            String nota = txtNotaFiscal.getText();

            java.util.Date pega = dtNotaFiscal.getDate();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            String dtNf = formato.format(pega);

            MPessoaFisica mpf = new MPessoaFisica();
            DPessoaFisica dpf = new DPessoaFisica(con);
            mpf.setNome(comboFornecedor.getSelectedItem().toString());
            dpf.pegaIdFornecedor(mpf);
            mpf.setId(mpf.getId());

            DMovimentoEntradaProduto em = new DMovimentoEntradaProduto(con);
            listaEntrada = em.carregaTabelaEntradaProdutoPf(nota, dtNf, mpf.getId());

            DefaultTableModel tbm = (DefaultTableModel) tabelaEntradaProduto.getModel();

            for (int i = tbm.getRowCount() - 1; i > 0; i--) {

                tbm.removeRow(i);

            }

            int i = 0;

            for (MMovimentoEntradaProduto e : listaEntrada) {

                tbm.addRow(new String[1]);

                tabelaEntradaProduto.setValueAt(e.getProduto().getProduto(), i, 0);
                tabelaEntradaProduto.setValueAt(e.getProduto().getApresentacao(), i, 1);
                tabelaEntradaProduto.setValueAt(e.getQuantidade(), i, 2);
                tabelaEntradaProduto.setValueAt(df.format(e.getPrecoCusto()), i, 3);
                tabelaEntradaProduto.setValueAt(df.format(e.getPrecoVenda()), i, 4);

                i++;

            }
        }

        if (radButPessoaJuridica.isSelected()) {

            Connection con = DConexao.abrirConexao();
            List<MMovimentoEntradaProduto> listaEntrada = new ArrayList<MMovimentoEntradaProduto>();
            String nota = txtNotaFiscal.getText();

            java.util.Date pega = dtNotaFiscal.getDate();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            String dtNf = formato.format(pega);

            MPessoaJuridica mpj = new MPessoaJuridica();
            DPessoaJuridica dpj = new DPessoaJuridica(con);
            mpj.setNomeEmpresarial(comboFornecedor.getSelectedItem().toString());
            dpj.pegaIdFornecedorPj(mpj);
            mpj.setId(mpj.getId());

            DMovimentoEntradaProduto em = new DMovimentoEntradaProduto(con);
            listaEntrada = em.carregaTabelaEntradaProdutoPj(nota, dtNf, mpj.getId());

            DefaultTableModel tbm = (DefaultTableModel) tabelaEntradaProduto.getModel();

            for (int i = tbm.getRowCount() - 1; i > 0; i--) {

                tbm.removeRow(i);

            }

            int i = 0;

            for (MMovimentoEntradaProduto e : listaEntrada) {

                tbm.addRow(new String[1]);

                tabelaEntradaProduto.setValueAt(e.getProduto().getProduto(), i, 0);
                tabelaEntradaProduto.setValueAt(e.getProduto().getApresentacao(), i, 1);
                tabelaEntradaProduto.setValueAt(e.getQuantidade(), i, 2);
                tabelaEntradaProduto.setValueAt(df.format(e.getPrecoCusto()), i, 3);
                tabelaEntradaProduto.setValueAt(df.format(e.getPrecoVenda()), i, 4);

                i++;

            }

        }

    }

    public void limparTabelaContaLancada() {

        while (tabelaEntradaProduto.getModel().getRowCount() > 0) {

            ((DefaultTableModel) tabelaEntradaProduto.getModel()).removeRow(0);

        }

    }

    public void limparCampos() {

        txtCategoria.setText("");
        txtCodigoBarra.setText("");
        txtProduto.setText("");
        txtLote.setText("");
        txtNumCalcado.setText("");
        txtPrecoCusto.setText("");
        txtMargemVenda.setText("");
        txtQuantidade.setText("");
        txtPrecoVenda.setText("");
        txtTotal.setText("");
        txtCodigoBarra.requestFocus();

    }

    public void somaColuna() {

        double total = 0;
        for (int linha = 0; linha < tabelaEntradaProduto.getRowCount(); linha++) {
            String valor = "" + tabelaEntradaProduto.getValueAt(linha, 3);
            if (valor != null) {
                total += Double.parseDouble(valor.replace(",", ".").replace("R$", ""));
            }
        }

        Locale l = new Locale("pt", "BR");
        NumberFormat df = NumberFormat.getCurrencyInstance(l);
        lblValorNota.setText(df.format(total));

    }

    private void verificaProdutoCadastrado() {

        Connection con = DConexao.abrirConexao();
        DPessoaJuridica dpj = new DPessoaJuridica(con);
        MPessoaJuridica mpj = new MPessoaJuridica();

        DPessoaFisica dpf = new DPessoaFisica(con);
        MPessoaFisica mpf = new MPessoaFisica();

        if (radButPessoaJuridica.isSelected()) {

            mpj.setNomeEmpresarial(comboFornecedor.getSelectedItem().toString());
            dpj.pegaIdFornecedorPj(mpj);
            mpj.setId(mpj.getId());

            System.out.println(mpj.getId());

            List<MMovimentoEntradaProduto> listaEntrada = new ArrayList<MMovimentoEntradaProduto>();
            String nota = txtNotaFiscal.getText();
            int fornec = mpj.getId();
            DMovimentoEntradaProduto em = new DMovimentoEntradaProduto(con);
            listaEntrada = em.verificaProdutoCadastradoNaNotaPj(nota, fornec);

            for (MMovimentoEntradaProduto entrada : listaEntrada) {

                if (entrada.getProduto().getCodigoBarra().equals(txtCodigoBarra.getText())) {

                    JOptionPane.showMessageDialog(null, "Produto já cadastrado para esta nota fiscal!");
                    txtCodigoBarra.setText("");
                    txtProduto.setText("");
                    txtCategoria.setText("");
                    txtCodigoBarra.requestFocus();
                    return;

                }

            }

            System.out.println(listaEntrada);

        }

        if (radButPessoaFisica.isSelected()) {

            mpf.setNome(comboFornecedor.getSelectedItem().toString());
            dpf.pegaIdFornecedor(mpf);
            mpf.setId(mpf.getId());

            System.out.println(mpf.getId());

            List<MMovimentoEntradaProduto> listaEntrada = new ArrayList<MMovimentoEntradaProduto>();
            String nota = txtNotaFiscal.getText();
            int fornec = mpf.getId();
            DMovimentoEntradaProduto em = new DMovimentoEntradaProduto(con);
            listaEntrada = em.verificaProdutoCadastradoNaNotaPf(nota, fornec);

            for (MMovimentoEntradaProduto entrada : listaEntrada) {

                if (entrada.getProduto().getCodigoBarra().equals(txtCodigoBarra.getText())) {

                    JOptionPane.showMessageDialog(null, "Produto já cadastrado para esta nota fiscal!");
                    txtCodigoBarra.setText("");
                    txtProduto.setText("");
                    txtCategoria.setText("");
                    return;

                }

            }

            System.out.println(listaEntrada);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCancelar;
    private javax.swing.JButton butPesquisar;
    private javax.swing.JButton butSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboFornecedor;
    private com.toedter.calendar.JDateChooser dataValidade;
    private com.toedter.calendar.JDateChooser dtNotaFiscal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblTotalNotaFiscal;
    private javax.swing.JLabel lblValorNota;
    private javax.swing.JRadioButton radButPessoaFisica;
    private javax.swing.JRadioButton radButPessoaJuridica;
    private javax.swing.JTable tabelaEntradaProduto;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigoBarra;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtMargemVenda;
    private javax.swing.JTextField txtNotaFiscal;
    private javax.swing.JTextField txtNumCalcado;
    private javax.swing.JTextField txtPrecoCusto;
    private javax.swing.JTextField txtPrecoVenda;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
