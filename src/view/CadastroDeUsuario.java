package view;

import dao.DConexao;
import dao.DCadastroDeUsuario;
import java.sql.Connection;
import java.util.Arrays;
import javax.swing.JOptionPane;
import model.MCadastroDeUsuario;

public class CadastroDeUsuario extends javax.swing.JInternalFrame {

    public CadastroDeUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNomeDeUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        passConfirmacaoSenha = new javax.swing.JPasswordField();
        butPesquisar = new javax.swing.JButton();
        butCancelar = new javax.swing.JButton();
        butExcluir = new javax.swing.JButton();
        butSalvar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Usuário");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Usuário"));

        jLabel1.setText("Código de Usuário");

        jLabel2.setText("Nome de Usuário");

        txtNomeDeUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeDeUsuarioFocusLost(evt);
            }
        });
        txtNomeDeUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeDeUsuarioKeyPressed(evt);
            }
        });

        jLabel3.setText("Senha");

        passSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passSenhaKeyPressed(evt);
            }
        });

        jLabel4.setText("Confirmação de Senha");

        passConfirmacaoSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passConfirmacaoSenhaKeyPressed(evt);
            }
        });

        butPesquisar.setText("Pesquisar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNomeDeUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(275, 275, 275)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passConfirmacaoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butPesquisar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomeDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passConfirmacaoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        butCancelar.setText("Cancelar");
        butCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarActionPerformed(evt);
            }
        });

        butExcluir.setText("Excluir");

        butSalvar.setText("Salvar");
        butSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSalvarActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butExcluir)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(butCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalvarActionPerformed

        String senha = String.valueOf(passSenha.getPassword());
        String confSenha = String.valueOf(passConfirmacaoSenha.getPassword());

        if (txtNomeDeUsuario.getText().isEmpty() || txtNomeDeUsuario.getText().length() < 5) {

            JOptionPane.showMessageDialog(null, "O nome de usuário não pode ser:\n"
                    + "-Ser vazio\n"
                    + "    ou   \n"
                    + "-Ou ter menos que 5 caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtNomeDeUsuario.requestFocus();
            txtNomeDeUsuario.setText("");
            return;

        }else if (senha == null ? confSenha != null : !senha.equals(confSenha)
                || senha.isEmpty() ||confSenha.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Os campos senha e confirmação\n"
                    + "de senha não podem ser:\n"
                    + "-Diferentes\n"
                    + "   ou\n"
                    + "-Vazios", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;

        }else{
            
            salvarUsuario();
            
        }

        /*    if (passSenha.getPassword().length == 0 || passConfirmacaoSenha.getPassword().length == 0) {

         JOptionPane.showMessageDialog(null, "O campo senha e confirmação de\n senha não pode ser vazio!", "Atenção", JOptionPane.WARNING_MESSAGE);
         passSenha.requestFocus();
         return;

         }
        
         if (passSenha.getPassword() != passConfirmacaoSenha.getPassword()) {

         JOptionPane.showMessageDialog(null, "O campo senha e confirmação precisam ser iguais!", "Atenção", JOptionPane.WARNING_MESSAGE);
         passSenha.setText("");
         passConfirmacaoSenha.setText("");
         passSenha.requestFocus();
         return;

         } else {

         salvarUsuario();

         }*/

    }//GEN-LAST:event_butSalvarActionPerformed

    private void txtNomeDeUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeDeUsuarioFocusLost

        /*      Connection con = DConexao.abrirConexao();
         MCadastroDeUsuario mu = new MCadastroDeUsuario();
         DCadastroDeUsuario du = new DCadastroDeUsuario(con);

         mu.setNomeUsuario(txtNomeDeUsuario.getText());
         du.verificaNomeUsuarioCadastrado(mu);
         mu.setNomeUsuario(mu.getNomeUsuario());
        
         System.out.println(mu.getNomeUsuario());

         if (du != null) {

         JOptionPane.showMessageDialog(null, "Nome de usuário já cadastrado!", "Atenção", JOptionPane.WARNING_MESSAGE);
         txtNomeDeUsuario.requestFocus();
         txtNomeDeUsuario.setText("");
         return;

         }*/

    }//GEN-LAST:event_txtNomeDeUsuarioFocusLost

    private void txtNomeDeUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeDeUsuarioKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            passSenha.requestFocus();

        }

    }//GEN-LAST:event_txtNomeDeUsuarioKeyPressed

    private void passConfirmacaoSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passConfirmacaoSenhaKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            butSalvar.requestFocus();

        }

    }//GEN-LAST:event_passConfirmacaoSenhaKeyPressed

    private void passSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passSenhaKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            passConfirmacaoSenha.requestFocus();

        }

    }//GEN-LAST:event_passSenhaKeyPressed

    private void butCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarActionPerformed

        limpaCampos();

    }//GEN-LAST:event_butCancelarActionPerformed

    private void limpaCampos() {

        txtCodigoUsuario.setText("");
        txtNomeDeUsuario.setText("");
        passSenha.setText("");
        passConfirmacaoSenha.setText("");
        dispose();

    }

    private void salvarUsuario() {

        Connection con = DConexao.abrirConexao();
        MCadastroDeUsuario mu = new MCadastroDeUsuario();
        DCadastroDeUsuario du = new DCadastroDeUsuario(con);

        mu.setNomeUsuario(txtNomeDeUsuario.getText());
        mu.setSenha(String.valueOf(passSenha.getPassword()));

        System.out.println(du.salvar(mu));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCancelar;
    private javax.swing.JButton butExcluir;
    private javax.swing.JButton butPesquisar;
    private javax.swing.JButton butSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passConfirmacaoSenha;
    private javax.swing.JPasswordField passSenha;
    private javax.swing.JTextField txtCodigoUsuario;
    private javax.swing.JTextField txtNomeDeUsuario;
    // End of variables declaration//GEN-END:variables
}
