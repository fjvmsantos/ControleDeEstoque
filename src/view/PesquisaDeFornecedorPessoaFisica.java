package view;

import dao.DConexao;
import dao.DPessoaFisica;
import enums.TipoFornecedorCliente;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.MPessoaFisica;
import static view.CadastroPessoaFisicaFornecedor.txtCodigoFornecedor;

public class PesquisaDeFornecedorPessoaFisica extends javax.swing.JInternalFrame {

    public PesquisaDeFornecedorPessoaFisica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFornecedor = new javax.swing.JTable();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jLabel1.setText("Id");

        txtId.setEditable(false);
        txtId.setEnabled(false);

        jLabel2.setText("Cliente");

        txtFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFornecedorKeyPressed(evt);
            }
        });

        tblFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFornecedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFornecedor);
        if (tblFornecedor.getColumnModel().getColumnCount() > 0) {
            tblFornecedor.getColumnModel().getColumn(0).setResizable(false);
            tblFornecedor.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblFornecedor.getColumnModel().getColumn(1).setResizable(false);
            tblFornecedor.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblFornecedor.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void txtFornecedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFornecedorKeyPressed

        limpaTabelaProdutoVendido();
        Connection con = DConexao.abrirConexao();
        DPessoaFisica dpf = new DPessoaFisica(con);
        List<MPessoaFisica> listaCliente = new ArrayList<MPessoaFisica>();
        String cliente = txtFornecedor.getText();
        TipoFornecedorCliente id = TipoFornecedorCliente.FORNECEDOR;

        listaCliente = dpf.pesquisaPf(cliente, id);

        DefaultTableModel tbm = (DefaultTableModel) tblFornecedor.getModel();

        for (int i = tbm.getRowCount() - 1; i > 0; i--) {

            tbm.removeRow(i);

        }

        int i = 0;

        for (MPessoaFisica mpf : listaCliente) {

            tbm.addRow(new String[1]);

            tblFornecedor.setValueAt(mpf.getId(), i, 0);
            tblFornecedor.setValueAt(mpf.getNome(), i, 1);
            tblFornecedor.setValueAt(mpf.getCpf(), i, 2);

            i++;

        }

    }//GEN-LAST:event_txtFornecedorKeyPressed

    private void tblFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFornecedorMouseClicked

        int indice = tblFornecedor.getSelectedRow();
        txtId.setText(tblFornecedor.getValueAt(indice, 0).toString());
        txtFornecedor.setText(tblFornecedor.getValueAt(indice, 1).toString());

        if (evt.getClickCount() == 2) {

            txtCodigoFornecedor.setText(txtId.getText());
            dispose();

        }

    }//GEN-LAST:event_tblFornecedorMouseClicked

    public void limpaTabelaProdutoVendido() {

        while (tblFornecedor.getModel().getRowCount() > 0) {

            ((DefaultTableModel) tblFornecedor.getModel()).removeRow(0);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFornecedor;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
