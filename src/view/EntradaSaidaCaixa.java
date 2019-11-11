package view;

import dao.DConexao;
import dao.DEntradaSaidaCaixa;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.MEntradaSaidaCaixa;

public class EntradaSaidaCaixa extends javax.swing.JInternalFrame {
    
    public EntradaSaidaCaixa() {
        initComponents();
        preencheDadosDeEntrada();
        verificaCaixaAbertoFechado();
        
    }
    
    private void preencheDadosDeEntrada() {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = new Date();
        lblDataAbertura.setText(sdf.format(dt));
        //  txtValorDeAbertura.setText("R$0,00");
        // txtValorDeAbertura.selectAll();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtValorDeAbertura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblDataAbertura = new javax.swing.JLabel();
        butInserir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblValorDeRetirada = new javax.swing.JLabel();
        txtValorDeRetirada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        radButEntrada = new javax.swing.JRadioButton();
        radButRetirada = new javax.swing.JRadioButton();
        butCancelar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Entradas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Entradas/Saídas"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Abertura de Caixa"));

        jLabel1.setText("Valor(troco)");

        jLabel2.setText("Data");

        lblDataAbertura.setPreferredSize(new java.awt.Dimension(12, 28));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorDeAbertura, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataAbertura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDataAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtValorDeAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        butInserir.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\inserir.png")); // NOI18N
        butInserir.setText("Inserir");
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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Saídas do Caixa"));

        lblValorDeRetirada.setText("Valor de Retirada");

        txtValorDeRetirada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorDeRetiradaKeyPressed(evt);
            }
        });

        jLabel3.setText("Descrição");

        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblValorDeRetirada)
                        .addGap(95, 95, 95))
                    .addComponent(txtDescricao)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtValorDeRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblValorDeRetirada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorDeRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonGroup1.add(radButEntrada);
        radButEntrada.setSelected(true);
        radButEntrada.setText("Entradas");

        buttonGroup1.add(radButRetirada);
        radButRetirada.setText("Saídas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radButEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radButRetirada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radButEntrada)
                    .addComponent(radButRetirada))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        butCancelar.setIcon(new javax.swing.ImageIcon("C:\\ControleDeEstoque\\dist\\icon\\cancel.png")); // NOI18N
        butCancelar.setText("Cancelar");
        butCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarActionPerformed(evt);
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
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(butInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInserirActionPerformed
        
        Connection con = DConexao.abrirConexao();
        MEntradaSaidaCaixa c = new MEntradaSaidaCaixa();
        DEntradaSaidaCaixa d = new DEntradaSaidaCaixa(con);
        
        if (radButEntrada.isSelected()) {
            
            if (txtValorDeAbertura.getText().isEmpty()) {
                
                JOptionPane.showMessageDialog(null, "Informe o valor da para "
                        + "abertura do caixa do dia!", "Atenção", JOptionPane.WARNING_MESSAGE);
                txtValorDeAbertura.requestFocus();
                return;
                
            }
            
            double troco = Double.parseDouble(txtValorDeAbertura.getText().replace(".", "").replace(",", ".").replace("R$", ""));
            c.setValorEntrada(troco);
            c.setDescricao("VALOR DE ABERTURA DE CAIXA");
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String dt = lblDataAbertura.getText();
            Date data = null;
            
            try {
                
                data = sdf.parse(dt);
                
            } catch (ParseException ex) {
                
                Logger.getLogger(EntradaSaidaCaixa.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            c.setDataMovimento(data);
            
            System.out.println(d.salvar(c));
            JOptionPane.showMessageDialog(null, "Movimento salvo com sucesso!");
            verificaCaixaAbertoFechado();
            
        }
        
        if (radButRetirada.isSelected()) {
            
            if (txtValorDeRetirada.getText().isEmpty() || txtDescricao.getText().isEmpty()) {
                
                JOptionPane.showMessageDialog(null, "Informe o valor da retirada e \n"
                        + "a descrição da retirada!", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
                
            }
            
            double retirada = Double.parseDouble(txtValorDeRetirada.getText().replace(".", "").replace(",", ".").replace("R$", ""));
            c.setValorRetirada(retirada);
            c.setDescricao(txtDescricao.getText().toUpperCase());
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String dt = lblDataAbertura.getText();
            Date data = null;
            
            try {
                
                data = sdf.parse(dt);
                
            } catch (ParseException ex) {
                
                Logger.getLogger(EntradaSaidaCaixa.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            c.setDataMovimento(data);
            System.out.println(d.salvar(c));
            
            JOptionPane.showMessageDialog(null, "Movimento salvo com sucesso!");
            
        }
        
        txtValorDeRetirada.setText("");
        txtDescricao.setText("");

    }//GEN-LAST:event_butInserirActionPerformed

    private void txtValorDeRetiradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorDeRetiradaKeyPressed
        
        if (evt.getKeyCode() == evt.VK_ENTER) {
            
            txtDescricao.requestFocus();
            
        }

    }//GEN-LAST:event_txtValorDeRetiradaKeyPressed

    private void txtDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyPressed
        
        if (evt.getKeyCode() == evt.VK_ENTER) {
            
            butInserir.requestFocus();
            
        }

    }//GEN-LAST:event_txtDescricaoKeyPressed

    private void butInserirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_butInserirKeyPressed
        
        if (evt.getKeyCode() == evt.VK_ENTER) {
            
            butInserir.doClick();
            
        }

    }//GEN-LAST:event_butInserirKeyPressed

    private void butCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarActionPerformed
        
        dispose();

    }//GEN-LAST:event_butCancelarActionPerformed
    
    private void verificaCaixaAbertoFechado() {
        
        Connection con = DConexao.abrirConexao();
        MEntradaSaidaCaixa c = new MEntradaSaidaCaixa();
        DEntradaSaidaCaixa d = new DEntradaSaidaCaixa(con);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dt = lblDataAbertura.getText();
        Date data = null;
        try {
            
            data = sdf.parse(dt);
            
        } catch (ParseException ex) {
            
            Logger.getLogger(EntradaSaidaCaixa.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        c.setDataMovimento(data);
        d.verificaSeExisteEntradaNoDia(c);
        
        if (c.getValorEntrada() == 0) {
            
            JOptionPane.showMessageDialog(null, "O caixa ainda não foi aberto", "Informação", JOptionPane.INFORMATION_MESSAGE);
            radButEntrada.setEnabled(true);
            
        } else {
            
            JOptionPane.showMessageDialog(null, "O caixa aberto para essa data com o valor de:" + c.getValorEntrada(), "Informação", JOptionPane.INFORMATION_MESSAGE);
            radButEntrada.setEnabled(false);
            txtValorDeAbertura.setEnabled(false);
            radButRetirada.setSelected(true);
            txtValorDeAbertura.setText("");
            
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCancelar;
    private javax.swing.JButton butInserir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblDataAbertura;
    private javax.swing.JLabel lblValorDeRetirada;
    private javax.swing.JRadioButton radButEntrada;
    private javax.swing.JRadioButton radButRetirada;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtValorDeAbertura;
    private javax.swing.JTextField txtValorDeRetirada;
    // End of variables declaration//GEN-END:variables
}
