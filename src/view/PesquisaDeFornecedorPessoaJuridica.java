package view;

import dao.DConexao;
import dao.DPessoaJuridica;
import enums.TipoFornecedorCliente;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.MPessoaJuridica;
import static view.CadastroPessoaJuridicaFornecedor.txtCodigoEmpresaPj;

public class PesquisaDeFornecedorPessoaJuridica extends javax.swing.JInternalFrame {

    public PesquisaDeFornecedorPessoaJuridica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdFornecedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFornecdorPj = new javax.swing.JTable();

        setClosable(true);
        setTitle("Pesquisa de Fornecedor Pessoa Juridica");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jLabel1.setText("Fornecedor");

        txtFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFornecedorKeyPressed(evt);
            }
        });

        jLabel2.setText("Id");

        tblFornecdorPj.setModel(new javax.swing.table.DefaultTableModel(
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
        tblFornecdorPj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFornecdorPjMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFornecdorPj);
        if (tblFornecdorPj.getColumnModel().getColumnCount() > 0) {
            tblFornecdorPj.getColumnModel().getColumn(0).setResizable(false);
            tblFornecdorPj.getColumnModel().getColumn(1).setResizable(false);
            tblFornecdorPj.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 153, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        limpaTabela();
        Connection con = DConexao.abrirConexao();
        DPessoaJuridica dpj = new DPessoaJuridica(con);
        List<MPessoaJuridica> listaClientePj = new ArrayList<MPessoaJuridica>();
        String clientePj = txtFornecedor.getText();
        TipoFornecedorCliente id = TipoFornecedorCliente.FORNECEDOR;

        listaClientePj = dpj.pesquisaPj(clientePj, id);

        DefaultTableModel tbm = (DefaultTableModel) tblFornecdorPj.getModel();

        for (int i = tbm.getRowCount() - 1; i > 0; i--) {

            tbm.removeRow(i);

        }

        int i = 0;

        for (MPessoaJuridica mpj : listaClientePj) {

            tbm.addRow(new String[1]);

            tblFornecdorPj.setValueAt(mpj.getId(), i, 0);
            tblFornecdorPj.setValueAt(mpj.getNomeEmpresarial(), i, 1);
            tblFornecdorPj.setValueAt(mpj.getCnpj(), i, 2);

            i++;

        }

    }//GEN-LAST:event_txtFornecedorKeyPressed

    private void tblFornecdorPjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFornecdorPjMouseClicked

        int indice = tblFornecdorPj.getSelectedRow();
        txtIdFornecedor.setText(tblFornecdorPj.getValueAt(indice, 0).toString());
        txtFornecedor.setText(tblFornecdorPj.getValueAt(indice, 1).toString());

        if (evt.getClickCount() == 2) {

            txtCodigoEmpresaPj.setText(txtIdFornecedor.getText());
            dispose();

        }

    }//GEN-LAST:event_tblFornecdorPjMouseClicked

    public void limpaTabela() {

        while (tblFornecdorPj.getModel().getRowCount() > 0) {

            ((DefaultTableModel) tblFornecdorPj.getModel()).removeRow(0);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFornecdorPj;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtIdFornecedor;
    // End of variables declaration//GEN-END:variables
}
