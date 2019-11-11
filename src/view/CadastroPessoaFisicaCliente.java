package view;

import dao.DConexao;
import dao.DDadoBancario;
import dao.DDadoComplementar;
import dao.DEndereco;
import dao.DPessoaFisica;
import enums.TipoFornecedorCliente;
import enums.TipoPessoa;
import java.awt.Graphics;
import model.MDadoBancario;
import model.MDadoComplementar;
import model.MEndereco;
import model.MPessoaFisica;
import model.MPessoaJuridica;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroPessoaFisicaCliente extends javax.swing.JInternalFrame {

    PesquisaDeClientePessoaFisica p;

    public CadastroPessoaFisicaCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 =    jDesktopPane1  = new javax.swing.JDesktopPane() {

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(java.awt.Color.lightGray);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        jPanel3 = new javax.swing.JPanel();
        lblCodigoCliente = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblRg = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        lblDataExpedicao = new javax.swing.JLabel();
        formatTxtDataExpedicao = new javax.swing.JFormattedTextField();
        txtOragaoExpedidor = new javax.swing.JTextField();
        lblOrgExpedidor = new javax.swing.JLabel();
        lblUf = new javax.swing.JLabel();
        comboUfRg = new javax.swing.JComboBox();
        lblDataNascimento = new javax.swing.JLabel();
        fomatDataNascimento = new javax.swing.JFormattedTextField();
        lblNomeMae = new javax.swing.JLabel();
        txtNomeMae = new javax.swing.JTextField();
        lblEstadoCivil = new javax.swing.JLabel();
        butCarregar = new javax.swing.JButton();
        comboEstadoCivil = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lblCep = new javax.swing.JLabel();
        lblLogradouro = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumeroCasa = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblComplemento = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        lblUfEndereco = new javax.swing.JLabel();
        comboUfEndereco = new javax.swing.JComboBox();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        formattedCep = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        lblTelFixo = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        formatTelFixo = new javax.swing.JFormattedTextField();
        formatCelular = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblObservacoes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPanelObservacoes = new javax.swing.JTextPane();
        jPanel6 = new javax.swing.JPanel();
        lblBanco = new javax.swing.JLabel();
        txtBanco = new javax.swing.JTextField();
        lblTipoConta = new javax.swing.JLabel();
        txtTipoConta = new javax.swing.JTextField();
        lblAgencia = new javax.swing.JLabel();
        txtAgencia = new javax.swing.JTextField();
        lblOperacao = new javax.swing.JLabel();
        txtOperacao = new javax.swing.JTextField();
        lblNumeroConta = new javax.swing.JLabel();
        txtNumeroConta = new javax.swing.JTextField();
        butSalvar = new javax.swing.JButton();
        butAlterar = new javax.swing.JButton();
        butPesquisar = new javax.swing.JButton();
        butCanelar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Cliente Pessoa Física");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        lblCodigoCliente.setText("Código do Cliente");

        txtCodigoCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoClienteFocusLost(evt);
            }
        });
        txtCodigoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoClienteKeyPressed(evt);
            }
        });

        lblCpf.setText("CPF");

        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });
        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCpfKeyPressed(evt);
            }
        });

        lblNome.setText("Nome");

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        lblRg.setText("RG");

        txtRg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRgKeyPressed(evt);
            }
        });

        lblDataExpedicao.setText("Data Expedição");

        formatTxtDataExpedicao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formatTxtDataExpedicaoKeyPressed(evt);
            }
        });

        txtOragaoExpedidor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOragaoExpedidorKeyPressed(evt);
            }
        });

        lblOrgExpedidor.setText("Orgão Expedidor");

        lblUf.setText("UF");

        comboUfRg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        comboUfRg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboUfRgKeyPressed(evt);
            }
        });

        lblDataNascimento.setText("Data de Nascimento");

        fomatDataNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fomatDataNascimentoKeyPressed(evt);
            }
        });

        lblNomeMae.setText("Nome da Mãe");

        txtNomeMae.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeMaeKeyPressed(evt);
            }
        });

        lblEstadoCivil.setText("Estado Civil");

        butCarregar.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\carregar.png")); // NOI18N
        butCarregar.setText("Carregar");
        butCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCarregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblRg)
                                .addGap(177, 177, 177)
                                .addComponent(lblOrgExpedidor))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDataExpedicao)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(formatTxtDataExpedicao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtOragaoExpedidor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUf)
                            .addComponent(comboUfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fomatDataNascimento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeMae)
                            .addComponent(txtNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(lblEstadoCivil)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCodigoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(butCarregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCpf)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblDataNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fomatDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoCliente)
                            .addComponent(lblCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butCarregar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(lblRg)
                            .addComponent(lblDataExpedicao)
                            .addComponent(lblOrgExpedidor)
                            .addComponent(lblUf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(formatTxtDataExpedicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOragaoExpedidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboUfRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeMae)
                            .addComponent(lblEstadoCivil))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        lblCep.setText("Cep");

        lblLogradouro.setText("Logradouro");

        txtLogradouro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLogradouroKeyPressed(evt);
            }
        });

        lblNumero.setText("Nº");

        txtNumeroCasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumeroCasaKeyPressed(evt);
            }
        });

        lblBairro.setText("Bairro");

        txtBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBairroKeyPressed(evt);
            }
        });

        lblComplemento.setText("Complemento");

        txtComplemento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtComplementoKeyPressed(evt);
            }
        });

        lblUfEndereco.setText("UF");

        comboUfEndereco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        comboUfEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboUfEnderecoKeyPressed(evt);
            }
        });

        lblCidade.setText("Cidade");

        txtCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCidadeKeyPressed(evt);
            }
        });

        formattedCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formattedCepKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCep)
                    .addComponent(formattedCep, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogradouro)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblComplemento)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUfEndereco)
                    .addComponent(comboUfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCidade)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(lblUfEndereco)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboUfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCep)
                                .addComponent(lblLogradouro)
                                .addComponent(lblNumero)
                                .addComponent(lblBairro)
                                .addComponent(lblComplemento))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(formattedCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        lblTelFixo.setText("Telefone Fixo");

        lblCelular.setText("Celular");

        formatTelFixo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formatTelFixoKeyPressed(evt);
            }
        });

        formatCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formatCelularKeyPressed(evt);
            }
        });

        lblEmail.setText("Email");

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        lblObservacoes.setText("Observações");

        txtPanelObservacoes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPanelObservacoesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtPanelObservacoes);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelFixo)
                            .addComponent(formatTelFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(formatCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCelular))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblEmail)
                                .addGap(0, 248, Short.MAX_VALUE))
                            .addComponent(txtEmail)))
                    .addComponent(lblObservacoes)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelFixo)
                    .addComponent(lblCelular)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatTelFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formatCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObservacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Bancários"));

        lblBanco.setText("Banco");

        txtBanco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBancoKeyPressed(evt);
            }
        });

        lblTipoConta.setText("Tipo Conta");

        txtTipoConta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTipoContaKeyPressed(evt);
            }
        });

        lblAgencia.setText("Agência");

        txtAgencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgenciaKeyPressed(evt);
            }
        });

        lblOperacao.setText("Operação");

        txtOperacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOperacaoKeyPressed(evt);
            }
        });

        lblNumeroConta.setText("Nº Conta");

        txtNumeroConta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumeroContaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumeroConta))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOperacao)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBanco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipoConta)
                            .addComponent(txtTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAgencia)
                    .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBanco)
                    .addComponent(lblTipoConta)
                    .addComponent(lblAgencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblNumeroConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblOperacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        butSalvar.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\salvar.png")); // NOI18N
        butSalvar.setText("Salvar");
        butSalvar.setMaximumSize(new java.awt.Dimension(95, 25));
        butSalvar.setMinimumSize(new java.awt.Dimension(95, 25));
        butSalvar.setPreferredSize(new java.awt.Dimension(86, 25));
        butSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSalvarActionPerformed(evt);
            }
        });

        butAlterar.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\alterar.png")); // NOI18N
        butAlterar.setText("Alterar Registro");
        butAlterar.setMaximumSize(new java.awt.Dimension(95, 25));
        butAlterar.setMinimumSize(new java.awt.Dimension(95, 25));
        butAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAlterarActionPerformed(evt);
            }
        });

        butPesquisar.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\pesquisar.png")); // NOI18N
        butPesquisar.setText("Pesquisar");
        butPesquisar.setMaximumSize(new java.awt.Dimension(95, 25));
        butPesquisar.setMinimumSize(new java.awt.Dimension(95, 25));
        butPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPesquisarActionPerformed(evt);
            }
        });

        butCanelar.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\cancel.png")); // NOI18N
        butCanelar.setText("Cancelar");
        butCanelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCanelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butCanelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(butSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butCanelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(butSalvar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(butAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(butPesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(butCanelar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalvarActionPerformed

        if (txtCpf.getText().isEmpty()
                || txtNome.getText().isEmpty()
                || txtRg.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Os seguintes compos são obrigatórios:\n"
                    + " - CPF\n"
                    + " - Nome\n"
                    + " - RG",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
            return;

        }

        Connection con = DConexao.abrirConexao();
        DPessoaFisica dpf = new DPessoaFisica(con);
        DEndereco end = new DEndereco(con);
        DDadoBancario ddb = new DDadoBancario(con);
        DDadoComplementar ddc = new DDadoComplementar(con);
        MPessoaFisica mpf = new MPessoaFisica();

        mpf.setCpf(txtCpf.getText());
        dpf.comparaCpfCadastradoCliente(mpf);
        mpf.setNome(mpf.getNome());

        if (mpf.getNome() == null) {

            TipoPessoa tpPessoa = TipoPessoa.PESSOAFISICA;
            TipoFornecedorCliente tpFornecedorCliente = TipoFornecedorCliente.CLIENTE;

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String dtExpedicao = formatTxtDataExpedicao.getText();
            String dtNascimento = fomatDataNascimento.getText();
            Date dataExpedicao = null;
            Date dataNascimento = null;

            if (!formatTxtDataExpedicao.getText().isEmpty() || formatTxtDataExpedicao.getText() == null) {

                try {

                    dataExpedicao = sdf.parse(dtExpedicao);

                } catch (ParseException ex) {

                    Logger.getLogger(CadastroPessoaFisicaCliente.class.getName()).log(Level.SEVERE, null, ex);

                }

            } else {

                try {

                    dataExpedicao = sdf.parse("11/11/1111");

                } catch (ParseException ex) {

                    Logger.getLogger(CadastroPessoaFisicaCliente.class.getName()).log(Level.SEVERE, null, ex);

                }

            }

            if (!fomatDataNascimento.getText().isEmpty() || fomatDataNascimento.getText() == null) {

                try {

                    dataNascimento = sdf.parse(dtNascimento);

                } catch (ParseException ex) {

                    Logger.getLogger(CadastroPessoaFisicaCliente.class.getName()).log(Level.SEVERE, null, ex);

                }

            } else {

                try {

                    dataNascimento = sdf.parse("11/11/1111");

                } catch (ParseException ex) {

                    Logger.getLogger(CadastroPessoaFisicaCliente.class.getName()).log(Level.SEVERE, null, ex);

                }

            }

            mpf.setNome(txtNome.getText().toUpperCase());
            mpf.setCpf(txtCpf.getText());
            mpf.setRg(txtRg.getText());
            mpf.setOrgaoExpedidor(txtOragaoExpedidor.getText().toUpperCase());
            mpf.setDataExpedicao(dataExpedicao);
            mpf.setUfExpedicao(comboUfRg.getSelectedItem().toString());
            mpf.setDataNascimento(dataNascimento);
            mpf.setNomeMae(txtNomeMae.getText().toUpperCase());
            mpf.setEstadoCivil(comboEstadoCivil.getText().toUpperCase());
            mpf.setTipoFornecedor(tpFornecedorCliente);

            System.out.println(dpf.salvar(mpf));

            dpf.listaMax();
            for (MPessoaFisica p : dpf.pessoas) {

                mpf.setId(p.getId());

            }

            MPessoaJuridica pj = new MPessoaJuridica();
            MEndereco e = new MEndereco();

            e.setCep(formattedCep.getText());
            e.setLogradouro(txtLogradouro.getText().toUpperCase());
            e.setNumero(txtNumeroCasa.getText());
            e.setBairro(txtBairro.getText().toUpperCase());
            e.setComplemento(txtComplemento.getText().toUpperCase());
            e.setUfLog(comboUfEndereco.getSelectedItem().toString());
            e.setCidade(txtCidade.getText());
            e.setPessoaJuridica(pj);
            e.setPessoaFisica(mpf);
            e.setTipoPessoa(tpPessoa);
            e.setTipoFornecedor(tpFornecedorCliente);
            System.out.println(end.salvar(e));

            MDadoBancario mdb = new MDadoBancario();

            mdb.setBanco(txtBanco.getText().toUpperCase());
            mdb.setTpConta(txtTipoConta.getText());
            mdb.setAg(txtAgencia.getText());
            mdb.setOp(txtAgencia.getText());
            mdb.setConta(txtNumeroConta.getText());
            mdb.setPessoaJuridica(pj);
            mdb.setPessoaFisica(mpf);
            mdb.setTipoPessoa(tpPessoa);
            mdb.setTipoFornecedor(tpFornecedorCliente);
            System.out.println(ddb.salvar(mdb));

            MDadoComplementar mdc = new MDadoComplementar();

            mdc.setTelefone(formatTelFixo.getText());
            mdc.setCelular(formatCelular.getText());
            mdc.setEmail(txtEmail.getText());
            mdc.setObservacao(txtPanelObservacoes.getText());
            mdc.setPessoaJuridica(pj);
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

            JOptionPane.showMessageDialog(null, "Esse CPF pertence ao cliente:\n " + mpf.getNome());
            txtCpf.requestFocus();
            return;

        }

    }//GEN-LAST:event_butSalvarActionPerformed

    private void txtCodigoClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoClienteKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtCpf.requestFocus();

        }

    }//GEN-LAST:event_txtCodigoClienteKeyPressed

    private void txtRgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRgKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            formatTxtDataExpedicao.requestFocus();

        }

    }//GEN-LAST:event_txtRgKeyPressed

    private void formatTxtDataExpedicaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formatTxtDataExpedicaoKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtOragaoExpedidor.requestFocus();

        }

    }//GEN-LAST:event_formatTxtDataExpedicaoKeyPressed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtRg.requestFocus();

        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtOragaoExpedidorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOragaoExpedidorKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            comboUfRg.requestFocus();

        }

    }//GEN-LAST:event_txtOragaoExpedidorKeyPressed

    private void comboUfRgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboUfRgKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            fomatDataNascimento.requestFocus();

        }

    }//GEN-LAST:event_comboUfRgKeyPressed

    private void fomatDataNascimentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fomatDataNascimentoKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtNomeMae.requestFocus();

        }


    }//GEN-LAST:event_fomatDataNascimentoKeyPressed

    private void txtNomeMaeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeMaeKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            comboEstadoCivil.requestFocus();

        }

    }//GEN-LAST:event_txtNomeMaeKeyPressed

    private void formattedCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formattedCepKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtLogradouro.requestFocus();

        }

    }//GEN-LAST:event_formattedCepKeyPressed

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

    private void txtComplementoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComplementoKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            comboUfEndereco.requestFocus();

        }

    }//GEN-LAST:event_txtComplementoKeyPressed

    private void txtBairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBairroKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtComplemento.requestFocus();

        }

    }//GEN-LAST:event_txtBairroKeyPressed

    private void comboUfEnderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboUfEnderecoKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtCidade.requestFocus();

        }

    }//GEN-LAST:event_comboUfEnderecoKeyPressed

    private void txtCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCidadeKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            formatTelFixo.requestFocus();

        }

    }//GEN-LAST:event_txtCidadeKeyPressed

    private void formatCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formatCelularKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtEmail.requestFocus();

        }

    }//GEN-LAST:event_formatCelularKeyPressed

    private void formatTelFixoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formatTelFixoKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            formatCelular.requestFocus();

        }
    }//GEN-LAST:event_formatTelFixoKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtPanelObservacoes.requestFocus();

        }

    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtPanelObservacoesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPanelObservacoesKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtBanco.requestFocus();

        }

    }//GEN-LAST:event_txtPanelObservacoesKeyPressed

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

    private void txtCpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtNome.requestFocus();

        }

    }//GEN-LAST:event_txtCpfKeyPressed

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost

        verificaCpfCadastrado();

    }//GEN-LAST:event_txtCpfFocusLost

    private void butAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAlterarActionPerformed

        Connection con = DConexao.abrirConexao();
        MPessoaFisica mp = new MPessoaFisica();
        DPessoaFisica dp = new DPessoaFisica(con);

        int id = Integer.parseInt(txtCodigoCliente.getText());
        mp.setId(id);
        mp.setNome(txtNome.getText().toUpperCase());
        mp.setRg(txtRg.getText());
        mp.setCpf(txtCpf.getText());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dtExpedicao = formatTxtDataExpedicao.getText();
        String dtNascimento = fomatDataNascimento.getText();
        Date dataExpedicao = null;
        Date dataNascimento = null;
        try {

            dataExpedicao = sdf.parse(dtExpedicao);
            dataNascimento = sdf.parse(dtNascimento);

        } catch (ParseException ex) {

            Logger.getLogger(CadastroPessoaFisicaCliente.class.getName()).log(Level.SEVERE, null, ex);

        }
        mp.setOrgaoExpedidor(txtOragaoExpedidor.getText().toUpperCase());
        mp.setDataExpedicao(dataExpedicao);
        mp.setDataNascimento(dataNascimento);
        mp.setUfExpedicao(comboUfRg.getSelectedItem().toString().toUpperCase());
        mp.setNomeMae(txtNomeMae.getText().toUpperCase());
        mp.setEstadoCivil(comboEstadoCivil.getText().toUpperCase());
        System.out.println(dp.alteraClientePf(mp));

        MEndereco me = new MEndereco();
        DEndereco de = new DEndereco(con);
        mp.setNome(txtNome.getText());
        me.setTipoPessoa(TipoPessoa.PESSOAFISICA);
        me.setTipoFornecedor(TipoFornecedorCliente.CLIENTE);
        dp.pegaIdEnderecoPf(mp, me);

        me.setCep(formattedCep.getText());
        me.setLogradouro(txtLogradouro.getText().toUpperCase());
        me.setNumero(txtNumeroCasa.getText().toUpperCase());
        me.setBairro(txtBairro.getText().toUpperCase());
        me.setComplemento(txtComplemento.getText().toUpperCase());
        me.setUfLog(comboUfEndereco.getSelectedItem().toString().toUpperCase());
        me.setCidade(txtCidade.getText().toUpperCase());
        me.setId(me.getId());
        System.out.println(de.alteraEnderecoClientePf(me));

        MDadoComplementar dc = new MDadoComplementar();
        DDadoComplementar dd = new DDadoComplementar(con);

        mp.setNome(txtNome.getText());
        dc.setTipoPessoa(TipoPessoa.PESSOAFISICA);
        dc.setTipoFornecedor(TipoFornecedorCliente.CLIENTE);
        dp.pegaIdDadoCompementarPf(mp, dc);

        dc.setTelefone(formatTelFixo.getText().toUpperCase());
        dc.setCelular(formatCelular.getText().toUpperCase());
        dc.setEmail(txtEmail.getText().toLowerCase());
        dc.setObservacao(txtPanelObservacoes.getText().toUpperCase());
        dc.setId(dc.getId());
        System.out.println(dd.alteraDadoComplementarPf(dc));

        MDadoBancario mb = new MDadoBancario();
        DDadoBancario db = new DDadoBancario(con);
        mp.setNome(txtNome.getText());
        mb.setTipoPessoa(TipoPessoa.PESSOAFISICA);
        mb.setTipoFornecedor(TipoFornecedorCliente.CLIENTE);
        dp.pegaIdDadoBancarioPf(mp, mb);

        mb.setBanco(txtBanco.getText().toUpperCase());
        mb.setTpConta(txtTipoConta.getText().toUpperCase());
        mb.setAg(txtAgencia.getText().toUpperCase());
        mb.setConta(txtNumeroConta.getText().toUpperCase());
        mb.setOp(txtOperacao.getText().toUpperCase());
        mb.setId(mb.getId());
        System.out.println(db.alteraDadoBancarioPf(mb));

        JOptionPane.showMessageDialog(null, "Cliente Pessoa Física Alterado com Sucesso!");

    }//GEN-LAST:event_butAlterarActionPerformed

    private void butCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCarregarActionPerformed

        limpaCampos();
        if (!txtCodigoCliente.getText().isEmpty()) {

            butSalvar.setEnabled(false);
            Connection con = DConexao.abrirConexao();
            MPessoaFisica mp = new MPessoaFisica();
            DPessoaFisica dp = new DPessoaFisica(con);

            int id = Integer.parseInt(txtCodigoCliente.getText());
            mp.setId(id);
            mp.setTipoFornecedor(TipoFornecedorCliente.CLIENTE);
            dp.carregaDadosPf(mp);
            txtCpf.setText(mp.getCpf());
            txtNome.setText(mp.getNome());
            txtRg.setText(mp.getRg());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dtExpedicao = mp.getDataExpedicao();
            Date dtNascimento = mp.getDataNascimento();
            formatTxtDataExpedicao.setText(sdf.format(dtExpedicao));
            txtOragaoExpedidor.setText(mp.getOrgaoExpedidor());
            comboUfRg.setSelectedItem(mp.getUfExpedicao());
            fomatDataNascimento.setText(sdf.format(dtNascimento));
            txtNomeMae.setText(mp.getNomeMae());
            comboEstadoCivil.setText(mp.getEstadoCivil());

            MEndereco me = new MEndereco();
            DEndereco de = new DEndereco(con);

            me.setPessoaFisica(mp);
            me.setTipoPessoa(TipoPessoa.PESSOAFISICA);
            me.setTipoFornecedor(TipoFornecedorCliente.CLIENTE);
            de.carregaEnderecoPf(me);

            formattedCep.setText(me.getCep());
            txtLogradouro.setText(me.getLogradouro());
            txtNumeroCasa.setText(me.getNumero());
            txtBairro.setText(me.getBairro());
            txtComplemento.setText(me.getComplemento());
            comboUfEndereco.setSelectedItem(me.getUfLog());
            txtCidade.setText(me.getCidade());

            MDadoComplementar c = new MDadoComplementar();
            DDadoComplementar d = new DDadoComplementar(con);

            c.setPessoaFisica(mp);
            c.setTipoPessoa(TipoPessoa.PESSOAFISICA);
            c.setTipoFornecedor(TipoFornecedorCliente.CLIENTE);
            d.carregaDadoComplementarPf(c);
            formatTelFixo.setText(c.getTelefone());
            formatCelular.setText(c.getCelular());
            txtEmail.setText(c.getEmail());
            txtPanelObservacoes.setText(c.getObservacao());

            MDadoBancario mBanco = new MDadoBancario();
            DDadoBancario dBanco = new DDadoBancario(con);
            mBanco.setPessoaFisica(mp);
            mBanco.setTipoPessoa(TipoPessoa.PESSOAFISICA);
            mBanco.setTipoFornecedor(TipoFornecedorCliente.CLIENTE);
            dBanco.carregaDadoBancarioPf(mBanco);
            txtBanco.setText(mBanco.getBanco());
            txtTipoConta.setText(mBanco.getTpConta());
            txtAgencia.setText(mBanco.getAg());
            txtNumeroConta.setText(mBanco.getConta());
            txtOperacao.setText(mBanco.getOp());

        } else {

            butSalvar.setEnabled(true);

        }

    }//GEN-LAST:event_butCarregarActionPerformed

    private void butPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPesquisarActionPerformed

        limpaCampos();
        if (p == null) {

            p = new PesquisaDeClientePessoaFisica();
            jDesktopPane1.add(p);
            p.setVisible(true);

        } else {

            p = new PesquisaDeClientePessoaFisica();
            jDesktopPane1.add(p);
            p.setVisible(true);

        }

    }//GEN-LAST:event_butPesquisarActionPerformed

    private void butCanelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCanelarActionPerformed

        dispose();

    }//GEN-LAST:event_butCanelarActionPerformed

    private void txtCodigoClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoClienteFocusLost

        limpaCampos();

    }//GEN-LAST:event_txtCodigoClienteFocusLost

    private void verificaCpfCadastrado() {

        Connection con = DConexao.abrirConexao();
        DPessoaFisica dpf = new DPessoaFisica(con);
        MPessoaFisica mpf = new MPessoaFisica();

        mpf.setCpf(txtCpf.getText());
        dpf.comparaCpfCadastradoCliente(mpf);
        mpf.setNome(mpf.getNome());

        System.out.println("Nome: " + mpf.getNome());

        if (mpf.getNome() == null) {

        } else {

            JOptionPane.showMessageDialog(null, "Esse CPF pertence ao cliente:\n " + mpf.getNome() + "\nCódigo de Cadastro :" + mpf.getId());
            txtCpf.requestFocus();
            txtCpf.setText("");

        }
    }

    private void limpaCampos() {

        txtCpf.setText("");
        txtNome.setText("");
        txtRg.setText("");
        formatTxtDataExpedicao.setText("");
        txtOragaoExpedidor.setText("");
        fomatDataNascimento.setText("");
        txtNomeMae.setText("");
        comboEstadoCivil.setText("");
        formattedCep.setText("");
        txtLogradouro.setText("");
        txtNumeroCasa.setText("");
        txtBairro.setText("");
        txtComplemento.setText("");
        txtCidade.setText("");
        formatTelFixo.setText("");
        formatCelular.setText("");
        txtEmail.setText("");
        txtPanelObservacoes.setText("");
        txtBanco.setText("");
        txtTipoConta.setText("");
        txtAgencia.setText("");
        txtNumeroConta.setText("");
        txtOperacao.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAlterar;
    private javax.swing.JButton butCanelar;
    private javax.swing.JButton butCarregar;
    private javax.swing.JButton butPesquisar;
    private javax.swing.JButton butSalvar;
    private javax.swing.JTextField comboEstadoCivil;
    private javax.swing.JComboBox comboUfEndereco;
    private javax.swing.JComboBox comboUfRg;
    private javax.swing.JFormattedTextField fomatDataNascimento;
    private javax.swing.JFormattedTextField formatCelular;
    private javax.swing.JFormattedTextField formatTelFixo;
    private javax.swing.JFormattedTextField formatTxtDataExpedicao;
    private javax.swing.JFormattedTextField formattedCep;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgencia;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblBanco;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigoCliente;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataExpedicao;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblLogradouro;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeMae;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumeroConta;
    private javax.swing.JLabel lblObservacoes;
    private javax.swing.JLabel lblOperacao;
    private javax.swing.JLabel lblOrgExpedidor;
    private javax.swing.JLabel lblRg;
    private javax.swing.JLabel lblTelFixo;
    private javax.swing.JLabel lblTipoConta;
    private javax.swing.JLabel lblUf;
    private javax.swing.JLabel lblUfEndereco;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtCidade;
    public static javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeMae;
    private javax.swing.JTextField txtNumeroCasa;
    private javax.swing.JTextField txtNumeroConta;
    private javax.swing.JTextField txtOperacao;
    private javax.swing.JTextField txtOragaoExpedidor;
    private javax.swing.JTextPane txtPanelObservacoes;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtTipoConta;
    // End of variables declaration//GEN-END:variables

}
