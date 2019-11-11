package view;

import dao.DConexao;
import dao.DPessoaJuridica;
import enums.TipoFornecedorCliente;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.MPessoaJuridica;
import static view.CadastroPessoaJuridicaCliente.txtCodigoEmpresa;

public class PesquisaDeClientePessoaJuridica extends javax.swing.JInternalFrame {

    public PesquisaDeClientePessoaJuridica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtClientePessoaJuridica = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdPessoaJuridica = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPessoaJuridica = new javax.swing.JTable();

        setClosable(true);
        setTitle("Pesquisa de Pessoa Juridica");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jLabel1.setText("Cliente");

        txtClientePessoaJuridica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClientePessoaJuridicaKeyPressed(evt);
            }
        });

        jLabel2.setText("Id");

        txtIdPessoaJuridica.setEditable(false);
        txtIdPessoaJuridica.setEnabled(false);

        tblPessoaJuridica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome Empresarial", "CNPJ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPessoaJuridica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPessoaJuridicaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPessoaJuridica);
        if (tblPessoaJuridica.getColumnModel().getColumnCount() > 0) {
            tblPessoaJuridica.getColumnModel().getColumn(0).setResizable(false);
            tblPessoaJuridica.getColumnModel().getColumn(1).setResizable(false);
            tblPessoaJuridica.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClientePessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtClientePessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClientePessoaJuridicaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClientePessoaJuridicaKeyPressed

        limpaTabela();
        Connection con = DConexao.abrirConexao();
        DPessoaJuridica dpj = new DPessoaJuridica(con);
        List<MPessoaJuridica> listaClientePj = new ArrayList<MPessoaJuridica>();
        String clientePj = txtClientePessoaJuridica.getText();
        TipoFornecedorCliente id = TipoFornecedorCliente.CLIENTE;

        listaClientePj = dpj.pesquisaPj(clientePj, id);

        DefaultTableModel tbm = (DefaultTableModel) tblPessoaJuridica.getModel();

        for (int i = tbm.getRowCount() - 1; i > 0; i--) {

            tbm.removeRow(i);

        }

        int i = 0;

        for (MPessoaJuridica mpj : listaClientePj) {

            tbm.addRow(new String[1]);

            tblPessoaJuridica.setValueAt(mpj.getId(), i, 0);
            tblPessoaJuridica.setValueAt(mpj.getNomeEmpresarial(), i, 1);
            tblPessoaJuridica.setValueAt(mpj.getCnpj(), i, 2);

            i++;

        }

    }//GEN-LAST:event_txtClientePessoaJuridicaKeyPressed

    private void tblPessoaJuridicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPessoaJuridicaMouseClicked
        
        int indice = tblPessoaJuridica.getSelectedRow();
        txtIdPessoaJuridica.setText(tblPessoaJuridica.getValueAt(indice, 0).toString());
        txtClientePessoaJuridica.setText(tblPessoaJuridica.getValueAt(indice, 1).toString());
        
        if(evt.getClickCount() == 2){
            
            txtCodigoEmpresa.setText(txtIdPessoaJuridica.getText());
            dispose();
            
        }
        
    }//GEN-LAST:event_tblPessoaJuridicaMouseClicked

    public void limpaTabela() {

        while (tblPessoaJuridica.getModel().getRowCount() > 0) {

            ((DefaultTableModel) tblPessoaJuridica.getModel()).removeRow(0);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPessoaJuridica;
    private javax.swing.JTextField txtClientePessoaJuridica;
    private javax.swing.JTextField txtIdPessoaJuridica;
    // End of variables declaration//GEN-END:variables
}
