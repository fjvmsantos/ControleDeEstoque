package view;

import dao.DConexao;
import dao.DRecebimentoContaEmHaver;
import java.sql.Connection;
import javax.swing.JOptionPane;
import model.MRecebimentoContaEmHaver;

public class RecebimentoContaEmHaver extends javax.swing.JDialog {

    public static LancamentoValorHaver lancamento;

    public RecebimentoContaEmHaver(LancamentoValorHaver parent, boolean modal) {
        this.lancamento = parent;
        this.setModal(modal);
        initComponents();
        
    }

    public void recebeContaParaBaixa(String id, String numCompra, String cliente, String valorConta) {

        txtIdentificacao.setText(id);
        txtNumCompra.setText(numCompra);
        txtCliente.setText(cliente);
        txtValorDaConta.setText(valorConta);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIdentificacao = new javax.swing.JTextField();
        txtNumCompra = new javax.swing.JTextField();
        txtValorDaConta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSaldoDevedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtValorPago = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        butVerificaSaldo = new javax.swing.JButton();
        butValor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recebimento de Conta");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Recebimento de Conta"));

        jLabel1.setText("Identificação");

        jLabel2.setText("Número da Compra");

        jLabel3.setText("Valor da Conta");

        jLabel4.setText("Saldo Devedor");

        txtSaldoDevedor.setEditable(false);
        txtSaldoDevedor.setEnabled(false);

        jLabel5.setText("Valor Pago");

        jLabel6.setText("Cliente");

        butVerificaSaldo.setText("Verifica Saldo");
        butVerificaSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butVerificaSaldoActionPerformed(evt);
            }
        });

        butValor.setText("Baixar Valor");
        butValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butValorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butValor, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtIdentificacao)
                        .addComponent(txtNumCompra)
                        .addComponent(txtValorDaConta)
                        .addComponent(txtSaldoDevedor)
                        .addComponent(txtValorPago)
                        .addComponent(txtCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butVerificaSaldo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtValorDaConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSaldoDevedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butVerificaSaldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(butValor))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butVerificaSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butVerificaSaldoActionPerformed

        txtValorPago.setEnabled(true);
        txtValorPago.requestFocus();
        carregaSaldoDevedor();

    }//GEN-LAST:event_butVerificaSaldoActionPerformed

    private void butValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butValorActionPerformed

        if(txtSaldoDevedor.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Verifique o saldo devedor!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
    }//GEN-LAST:event_butValorActionPerformed

    public void carregaSaldoDevedor() {

        Connection con = DConexao.abrirConexao();
        MRecebimentoContaEmHaver mh = new MRecebimentoContaEmHaver();
        DRecebimentoContaEmHaver dh = new DRecebimentoContaEmHaver(con);

        int numCompra = Integer.parseInt(txtNumCompra.getText());
        int cliente = Integer.parseInt(txtCliente.getText());

        mh.setClientePf(cliente);
        mh.setNumeroCompra(numCompra);

//        dh.pegaUltimoSaldoDevedor(mh);

        mh.setSaldoDevedor(mh.getSaldoDevedor());

        txtSaldoDevedor.setText(String.valueOf(mh.getSaldoDevedor()));

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
            java.util.logging.Logger.getLogger(RecebimentoContaEmHaver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecebimentoContaEmHaver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecebimentoContaEmHaver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecebimentoContaEmHaver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RecebimentoContaEmHaver dialog = new RecebimentoContaEmHaver(lancamento, true);
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
    private javax.swing.JButton butValor;
    private javax.swing.JButton butVerificaSaldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtIdentificacao;
    private javax.swing.JTextField txtNumCompra;
    private javax.swing.JTextField txtSaldoDevedor;
    private javax.swing.JTextField txtValorDaConta;
    private javax.swing.JTextField txtValorPago;
    // End of variables declaration//GEN-END:variables
}
