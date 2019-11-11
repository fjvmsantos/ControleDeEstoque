package view;

import dao.DConexao;
import dao.DDadoBancario;
import dao.DDadoComplementar;
import dao.DEndereco;
import dao.DPessoaJuridica;
import enums.TipoFornecedorCliente;
import enums.TipoPessoa;
import java.awt.Graphics;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.MDadoBancario;
import model.MDadoComplementar;
import model.MEndereco;
import model.MFornecedorPessoaJuridica;
import model.MPessoaFisica;
import model.MPessoaJuridica;

public class CadastroPessoaJuridicaCliente extends javax.swing.JInternalFrame {

    PesquisaDeClientePessoaJuridica ppj;

    public CadastroPessoaJuridicaCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butGroupClienteFornecedor = new javax.swing.ButtonGroup();
        jDesktopPanePj =    jDesktopPanePj  = new javax.swing.JDesktopPane() {

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(java.awt.Color.lightGray);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtBanco = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtTipoConta = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtAgencia = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtNumeroConta = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtOperacao = new javax.swing.JTextField();
        butSalvar = new javax.swing.JButton();
        butAlteraRegistro = new javax.swing.JButton();
        butPesquisar = new javax.swing.JButton();
        butCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtTelefoneFixo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPaneObservacoes = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNumeroCasa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        comboUf = new javax.swing.JComboBox<String>();
        jLabel13 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        formatCep = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        lblCodigoEmpresa = new javax.swing.JLabel();
        txtCodigoEmpresa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeEmpresarial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        formatDataAbertura = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTituloEstabelecimento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtInscricaoMunicipal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtInscricaoEstadual = new javax.swing.JTextField();
        formatCnpj = new javax.swing.JFormattedTextField();
        butCarregar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Cliente Pessoa Jurídica");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Bancários"));

        jLabel18.setText("Banco");

        txtBanco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBancoKeyPressed(evt);
            }
        });

        jLabel19.setText("Tipo de Conta");

        txtTipoConta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTipoContaKeyPressed(evt);
            }
        });

        jLabel20.setText("Agência");

        txtAgencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgenciaKeyPressed(evt);
            }
        });

        jLabel21.setText("Nº Conta");

        txtNumeroConta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumeroContaKeyPressed(evt);
            }
        });

        jLabel22.setText("Operação");

        txtOperacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOperacaoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(79, 79, 79))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtOperacao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAgencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNumeroConta))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(97, 97, 97)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtTipoConta)
                                .addContainerGap())))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        jLabel14.setText("Telefone Fixo");

        txtTelefoneFixo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefoneFixoKeyPressed(evt);
            }
        });

        jLabel15.setText("Celular");

        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCelularKeyPressed(evt);
            }
        });

        jLabel16.setText("Email");

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        jLabel17.setText("Observações");

        txtPaneObservacoes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPaneObservacoesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtPaneObservacoes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabel7.setText("CEP");

        jLabel8.setText("Logradouro");

        txtLogradouro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLogradouroKeyPressed(evt);
            }
        });

        jLabel9.setText("Nº");

        txtNumeroCasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumeroCasaKeyPressed(evt);
            }
        });

        jLabel10.setText("Bairro");

        txtBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBairroKeyPressed(evt);
            }
        });

        jLabel11.setText("Complemento");

        txtComplemento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtComplementoKeyPressed(evt);
            }
        });

        jLabel12.setText("UF");

        comboUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        comboUf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboUfKeyPressed(evt);
            }
        });

        jLabel13.setText("Cidade");

        txtCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCidadeKeyPressed(evt);
            }
        });

        formatCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formatCepKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formatCep, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(comboUf, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formatCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Empresa"));

        lblCodigoEmpresa.setText("Código da Empresa");

        jLabel1.setText("CNPJ");

        jLabel2.setText("Nome Empresarial");

        txtNomeEmpresarial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeEmpresarialKeyPressed(evt);
            }
        });

        jLabel3.setText("Data de Abertura");

        formatDataAbertura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formatDataAberturaKeyPressed(evt);
            }
        });

        jLabel4.setText("Título do Estabelecimento");

        txtTituloEstabelecimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTituloEstabelecimentoKeyPressed(evt);
            }
        });

        jLabel5.setText("Inscrição Municipal");

        txtInscricaoMunicipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtInscricaoMunicipalKeyPressed(evt);
            }
        });

        jLabel6.setText("Inscrição Estadual ");

        txtInscricaoEstadual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtInscricaoEstadualKeyPressed(evt);
            }
        });

        formatCnpj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formatCnpjFocusLost(evt);
            }
        });
        formatCnpj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formatCnpjKeyPressed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNomeEmpresarial, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTituloEstabelecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(formatDataAbertura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtInscricaoMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigoEmpresa)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodigoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(butCarregar)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(formatCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoEmpresa)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(formatCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butCarregar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTituloEstabelecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeEmpresarial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInscricaoMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(formatDataAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDesktopPanePjLayout = new javax.swing.GroupLayout(jDesktopPanePj);
        jDesktopPanePj.setLayout(jDesktopPanePjLayout);
        jDesktopPanePjLayout.setHorizontalGroup(
            jDesktopPanePjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPanePjLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPanePjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPanePjLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPanePjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butAlteraRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPanePjLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPanePjLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jDesktopPanePjLayout.setVerticalGroup(
            jDesktopPanePjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPanePjLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPanePjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPanePjLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jDesktopPanePjLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jDesktopPanePjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPanePjLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(butSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(butAlteraRegistro)
                                .addGap(13, 13, 13)
                                .addComponent(butPesquisar)
                                .addGap(18, 18, 18)
                                .addComponent(butCancelar))
                            .addGroup(jDesktopPanePjLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6))))
        );
        jDesktopPanePj.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePj.setLayer(butSalvar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePj.setLayer(butAlteraRegistro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePj.setLayer(butPesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePj.setLayer(butCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePj.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePj.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePj.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPanePj)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPanePj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formatCnpjKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formatCnpjKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtNomeEmpresarial.requestFocus();

        }

    }//GEN-LAST:event_formatCnpjKeyPressed

    private void txtNomeEmpresarialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeEmpresarialKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtTituloEstabelecimento.requestFocus();

        }

    }//GEN-LAST:event_txtNomeEmpresarialKeyPressed

    private void txtTituloEstabelecimentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloEstabelecimentoKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            formatDataAbertura.requestFocus();

        }

    }//GEN-LAST:event_txtTituloEstabelecimentoKeyPressed

    private void formatDataAberturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formatDataAberturaKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtInscricaoEstadual.requestFocus();

        }

    }//GEN-LAST:event_formatDataAberturaKeyPressed

    private void txtInscricaoEstadualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInscricaoEstadualKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtInscricaoMunicipal.requestFocus();

        }

    }//GEN-LAST:event_txtInscricaoEstadualKeyPressed

    private void txtInscricaoMunicipalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInscricaoMunicipalKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            formatCep.requestFocus();

        }

    }//GEN-LAST:event_txtInscricaoMunicipalKeyPressed

    private void formatCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formatCepKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtLogradouro.requestFocus();

        }

    }//GEN-LAST:event_formatCepKeyPressed

    private void txtLogradouroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLogradouroKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtNumeroCasa.requestFocus();

        }

    }//GEN-LAST:event_txtLogradouroKeyPressed

    private void txtNumeroCasaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroCasaKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtBairro.requestFocus();

        }

    }//GEN-LAST:event_txtNumeroCasaKeyPressed

    private void txtBairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBairroKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtComplemento.requestFocus();

        }

    }//GEN-LAST:event_txtBairroKeyPressed

    private void txtComplementoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComplementoKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            comboUf.requestFocus();

        }

    }//GEN-LAST:event_txtComplementoKeyPressed

    private void comboUfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboUfKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtCidade.requestFocus();

        }

    }//GEN-LAST:event_comboUfKeyPressed

    private void txtCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCidadeKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtTelefoneFixo.requestFocus();

        }

    }//GEN-LAST:event_txtCidadeKeyPressed

    private void txtTelefoneFixoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneFixoKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtCelular.requestFocus();

        }

    }//GEN-LAST:event_txtTelefoneFixoKeyPressed

    private void txtCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtEmail.requestFocus();

        }

    }//GEN-LAST:event_txtCelularKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtPaneObservacoes.requestFocus();

        }

    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtPaneObservacoesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaneObservacoesKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtBanco.requestFocus();

        }

    }//GEN-LAST:event_txtPaneObservacoesKeyPressed

    private void txtBancoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBancoKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtTipoConta.requestFocus();

        }

    }//GEN-LAST:event_txtBancoKeyPressed

    private void txtTipoContaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoContaKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtAgencia.requestFocus();

        }

    }//GEN-LAST:event_txtTipoContaKeyPressed

    private void txtAgenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgenciaKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtNumeroConta.requestFocus();

        }

    }//GEN-LAST:event_txtAgenciaKeyPressed

    private void txtNumeroContaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroContaKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtOperacao.requestFocus();

        }

    }//GEN-LAST:event_txtNumeroContaKeyPressed

    private void txtOperacaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOperacaoKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            butSalvar.requestFocus();

        }

    }//GEN-LAST:event_txtOperacaoKeyPressed

    private void butSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalvarActionPerformed

        if (txtNomeEmpresarial.getText().isEmpty() || formatCnpj.getText().length() != 14) {

            JOptionPane.showMessageDialog(null, "Os seguintes campos são obrigatórios:\n"
                    + " - CNPJ\n"
                    + " - Nome Empresarial",
                    "Atenção", JOptionPane.WARNING_MESSAGE, frameIcon);
            return;

        }

        Connection con = DConexao.abrirConexao();
        DPessoaJuridica df = new DPessoaJuridica(con);
        DEndereco end = new DEndereco(con);
        DDadoBancario ddb = new DDadoBancario(con);
        DDadoComplementar ddc = new DDadoComplementar(con);
        MFornecedorPessoaJuridica mfpj = new MFornecedorPessoaJuridica();

        mfpj.setCnpj(formatCnpj.getText());
        df.comparaCnpjCadastradoCliente(mfpj);
        mfpj.setNomeEmpresarial(mfpj.getNomeEmpresarial());

        if (mfpj.getNomeEmpresarial() == null) {

            TipoPessoa tpPessoa = TipoPessoa.PESSOAJURIDICA;
            TipoFornecedorCliente tpFornecedorCliente = TipoFornecedorCliente.CLIENTE;

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String dt = formatDataAbertura.getText();
            Date data = null;

            if (!formatDataAbertura.getText().isEmpty() || formatDataAbertura.getText() == null) {

                try {

                    data = sdf.parse(dt);

                } catch (ParseException ex) {

                    Logger.getLogger(CadastroPessoaFisicaFornecedor.class.getName()).log(Level.SEVERE, null, ex);

                }

            } else {

                try {

                    data = sdf.parse("11/11/1111");

                } catch (ParseException ex) {

                    Logger.getLogger(CadastroPessoaJuridicaCliente.class.getName()).log(Level.SEVERE, null, ex);

                }

            }

            mfpj.setCnpj(formatCnpj.getText());
            mfpj.setNomeEmpresarial(txtNomeEmpresarial.getText().toUpperCase());
            mfpj.setTituloEstabelecimento(txtTituloEstabelecimento.getText().toUpperCase());
            mfpj.setAbertura(data);
            mfpj.setIncricaoEstadual(txtInscricaoEstadual.getText());
            mfpj.setIncricaoMunicipal(txtInscricaoMunicipal.getText());
            mfpj.setTipoFornecedor(tpFornecedorCliente);
            System.out.println(df.salvar(mfpj));

            df.listarMax();
            for (MPessoaJuridica p : df.pessoas) {
                mfpj.setId(p.getId());
            }

            MPessoaFisica mpf = new MPessoaFisica();
            MEndereco mend = new MEndereco();

            mend.setCep(formatCep.getText());
            mend.setLogradouro(txtLogradouro.getText().toUpperCase());
            mend.setNumero(txtNumeroCasa.getText());
            mend.setBairro(txtBairro.getText().toUpperCase());
            mend.setComplemento(txtComplemento.getText().toUpperCase());
            mend.setUfLog(comboUf.getSelectedItem().toString());
            mend.setCidade(txtCidade.getText().toUpperCase());
            mend.setPessoaJuridica(mfpj);
            mend.setPessoaFisica(mpf);
            mend.setTipoPessoa(tpPessoa);
            mend.setTipoFornecedor(tpFornecedorCliente);
            System.out.println(end.salvar(mend));

            MDadoBancario mdb = new MDadoBancario();

            mdb.setBanco(txtBanco.getText());
            mdb.setTpConta(txtTipoConta.getText());
            mdb.setAg(txtAgencia.getText());
            mdb.setConta(txtNumeroConta.getText());
            mdb.setOp(txtOperacao.getText());
            mdb.setPessoaJuridica(mfpj);
            mdb.setPessoaFisica(mpf);
            mdb.setTipoPessoa(tpPessoa);
            mdb.setTipoFornecedor(tpFornecedorCliente);
            System.out.println(ddb.salvar(mdb));

            MDadoComplementar mdc = new MDadoComplementar();

            mdc.setTelefone(txtTelefoneFixo.getText());
            mdc.setCelular(txtCelular.getText());
            mdc.setEmail(txtEmail.getText());
            mdc.setObservacao(txtPaneObservacoes.getText().toUpperCase());
            mdc.setPessoaJuridica(mfpj);
            mdc.setPessoaFisica(mpf);
            mdc.setTipoPessoa(tpPessoa);
            mdc.setTipoFornecedor(tpFornecedorCliente);
            System.out.println(ddc.salvar(mdc));

            if (!ddc.equals(0)) {

                JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!",
                        "Sucesso!", JOptionPane.WIDTH);
                return;

            }

        } else {

            JOptionPane.showMessageDialog(null, "Esse CNPJ pertence ao cliente:\n " + mfpj.getNomeEmpresarial());
            formatCnpj.requestFocus();
            return;

        }

    }//GEN-LAST:event_butSalvarActionPerformed

    private void formatCnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formatCnpjFocusLost

        verificaCnpjCadastrado();

    }//GEN-LAST:event_formatCnpjFocusLost

    private void butPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPesquisarActionPerformed

        if (ppj == null) {

            ppj = new PesquisaDeClientePessoaJuridica();
            jDesktopPanePj.add(ppj);
            ppj.setVisible(true);

        } else {

            ppj = new PesquisaDeClientePessoaJuridica();
            jDesktopPanePj.add(ppj);
            ppj.setVisible(true);

        }

    }//GEN-LAST:event_butPesquisarActionPerformed

    private void butCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarActionPerformed

        dispose();

    }//GEN-LAST:event_butCancelarActionPerformed

    private void butAlteraRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAlteraRegistroActionPerformed

        Connection con = DConexao.abrirConexao();
        MEndereco me = new MEndereco();
        DEndereco de = new DEndereco(con);
        MPessoaJuridica mj = new MPessoaJuridica();
        DPessoaJuridica dp = new DPessoaJuridica(con);
        MDadoComplementar dc = new MDadoComplementar();
        DDadoComplementar dd = new DDadoComplementar(con);
        MDadoBancario mb = new MDadoBancario();
        DDadoBancario db = new DDadoBancario(con);

        int id = Integer.parseInt(txtCodigoEmpresa.getText());
        mj.setId(id);
        mj.setCnpj(formatCnpj.getText());
        mj.setNomeEmpresarial(txtNomeEmpresarial.getText());
        mj.setTituloEstabelecimento(txtTituloEstabelecimento.getText());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String abertura = formatDataAbertura.getText();
        Date data = null;
        try {

            data = sdf.parse(abertura);

        } catch (ParseException ex) {

            Logger.getLogger(CadastroPessoaJuridicaCliente.class.getName()).log(Level.SEVERE, null, ex);

        }
        mj.setAbertura(data);
        mj.setIncricaoEstadual(txtInscricaoEstadual.getText());
        mj.setIncricaoMunicipal(txtInscricaoMunicipal.getText());
        System.out.println(dp.alteraClientePj(mj));

        mj.setNomeEmpresarial(txtNomeEmpresarial.getText());
        me.setTipoPessoa(TipoPessoa.PESSOAJURIDICA);
        me.setTipoFornecedor(TipoFornecedorCliente.CLIENTE);
        dp.pegaIdEnderecoPj(mj, me);

        me.setCep(formatCep.getText());
        me.setLogradouro(txtLogradouro.getText());
        me.setNumero(txtNumeroCasa.getText());
        me.setBairro(txtBairro.getText());
        me.setComplemento(txtComplemento.getText());
        me.setUfLog(comboUf.getSelectedItem().toString());
        me.setCidade(txtCidade.getText());
        me.setId(me.getId());
        System.out.println(de.alteraEnderecoClientePj(me));

        mj.setNomeEmpresarial(txtNomeEmpresarial.getText());
        dc.setTipoPessoa(TipoPessoa.PESSOAJURIDICA);
        dc.setTipoFornecedor(TipoFornecedorCliente.CLIENTE);
        dp.pegaIdDadoComplentarPj(mj, dc);

        dc.setTelefone(txtTelefoneFixo.getText());
        dc.setCelular(txtCelular.getText());
        dc.setEmail(txtEmail.getText());
        dc.setObservacao(txtPaneObservacoes.getText());
        dc.setId(dc.getId());
        System.out.println(dd.alteraDadoComplementarPj(dc));

        mj.setNomeEmpresarial(txtNomeEmpresarial.getText());
        mb.setTipoPessoa(TipoPessoa.PESSOAJURIDICA);
        mb.setTipoFornecedor(TipoFornecedorCliente.CLIENTE);
        dp.pegaIdDadoBancarioPj(mj, mb);

        mb.setBanco(txtBanco.getText());
        mb.setTpConta(txtTipoConta.getText());
        mb.setAg(txtAgencia.getText());
        mb.setConta(txtNumeroConta.getText());
        mb.setOp(txtOperacao.getText());
        mb.setId(mb.getId());
        System.out.println(db.alteraDadoBancarioPf(mb));

        JOptionPane.showMessageDialog(null, "Cliente Pessoa Jurídica Alterado com Sucesso!");

    }//GEN-LAST:event_butAlteraRegistroActionPerformed

    private void butCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCarregarActionPerformed

        if (!txtCodigoEmpresa.getText().isEmpty()) {

            Connection con = DConexao.abrirConexao();
            MPessoaJuridica mpj = new MPessoaJuridica();
            DPessoaJuridica dpj = new DPessoaJuridica(con);

            int id = Integer.parseInt(txtCodigoEmpresa.getText());
            mpj.setId(id);
            mpj.setTipoFornecedor(TipoFornecedorCliente.CLIENTE);
            dpj.carregaDadosPj(mpj);

            formatCnpj.setText(mpj.getCnpj());
            txtNomeEmpresarial.setText(mpj.getNomeEmpresarial());
            txtTituloEstabelecimento.setText(mpj.getTituloEstabelecimento());
            txtInscricaoMunicipal.setText(mpj.getIncricaoMunicipal());
            txtInscricaoEstadual.setText(mpj.getIncricaoEstadual());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date abertura = mpj.getAbertura();
            formatDataAbertura.setText(sdf.format(abertura));

            MEndereco me = new MEndereco();
            DEndereco de = new DEndereco(con);
            me.setPessoaJuridica(mpj);
            me.setTipoPessoa(TipoPessoa.PESSOAJURIDICA);
            me.setTipoFornecedor(TipoFornecedorCliente.CLIENTE);
            de.carregaEnderecoPj(me);
            formatCep.setText(me.getCep());
            txtLogradouro.setText(me.getLogradouro());
            txtNumeroCasa.setText(me.getNumero());
            txtBairro.setText(me.getBairro());
            txtComplemento.setText(me.getComplemento());
            comboUf.setSelectedItem(me.getUfLog());
            txtCidade.setText(me.getCidade());

            MDadoComplementar md = new MDadoComplementar();
            DDadoComplementar dd = new DDadoComplementar(con);
            md.setPessoaJuridica(mpj);
            md.setTipoPessoa(TipoPessoa.PESSOAJURIDICA);
            md.setTipoFornecedor(TipoFornecedorCliente.CLIENTE);
            dd.carregaDadoComplementarPj(md);

            txtTelefoneFixo.setText(md.getTelefone());
            txtCelular.setText(md.getCelular());
            txtEmail.setText(md.getEmail());
            txtPaneObservacoes.setText(md.getObservacao());

            MDadoBancario mdb = new MDadoBancario();
            DDadoBancario ddb = new DDadoBancario(con);
            mdb.setPessoaJuridica(mpj);
            mdb.setTipoPessoa(TipoPessoa.PESSOAJURIDICA);
            mdb.setTipoFornecedor(TipoFornecedorCliente.CLIENTE);
            ddb.carregaDadoBancarioPj(mdb);
            txtBanco.setText(mdb.getBanco());
            txtTipoConta.setText(mdb.getTpConta());
            txtAgencia.setText(mdb.getAg());
            txtOperacao.setText(mdb.getOp());
            txtNumeroConta.setText(mdb.getConta());

        } else {

            butSalvar.setEnabled(true);

        }


    }//GEN-LAST:event_butCarregarActionPerformed

    private void verificaCnpjCadastrado() {

        Connection con = DConexao.abrirConexao();
        DPessoaJuridica dpj = new DPessoaJuridica(con);
        MPessoaJuridica mpj = new MPessoaJuridica();

        mpj.setCnpj(formatCnpj.getText());
        dpj.comparaCnpjCadastradoCliente(mpj);
        mpj.setNomeEmpresarial(mpj.getNomeEmpresarial());

        System.out.println("Nome: " + mpj.getNomeEmpresarial());

        if (mpj.getNomeEmpresarial() != null) {

            JOptionPane.showMessageDialog(null, "Esse CNPJ pertence ao cliente:\n" + mpj.getNomeEmpresarial() + "\nCódigo de Cadastro: " + mpj.getId());
            formatCnpj.requestFocus();
            formatCnpj.setText("");

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAlteraRegistro;
    private javax.swing.JButton butCancelar;
    private javax.swing.JButton butCarregar;
    private javax.swing.ButtonGroup butGroupClienteFornecedor;
    private javax.swing.JButton butPesquisar;
    private javax.swing.JButton butSalvar;
    private javax.swing.JComboBox<String> comboUf;
    private javax.swing.JFormattedTextField formatCep;
    private javax.swing.JFormattedTextField formatCnpj;
    private javax.swing.JFormattedTextField formatDataAbertura;
    private javax.swing.JDesktopPane jDesktopPanePj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JLabel lblCodigoEmpresa;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    public static javax.swing.JTextField txtCodigoEmpresa;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtInscricaoEstadual;
    private javax.swing.JTextField txtInscricaoMunicipal;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNomeEmpresarial;
    private javax.swing.JTextField txtNumeroCasa;
    private javax.swing.JTextField txtNumeroConta;
    private javax.swing.JTextField txtOperacao;
    private javax.swing.JTextPane txtPaneObservacoes;
    private javax.swing.JTextField txtTelefoneFixo;
    private javax.swing.JTextField txtTipoConta;
    private javax.swing.JTextField txtTituloEstabelecimento;
    // End of variables declaration//GEN-END:variables
}
