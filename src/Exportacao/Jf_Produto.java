/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exportacao;

/**
 *
 * @author luizr
 */
public class Jf_Produto extends javax.swing.JFrame {

    /**
     * Creates new form Produto
     */
    public Jf_Produto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_cadastrar_produto = new javax.swing.JButton();
        lbl_cadastro_produto = new javax.swing.JLabel();
        lbl_id_produto = new javax.swing.JLabel();
        txt_id_produto = new javax.swing.JTextField();
        lbl_nm_produto = new javax.swing.JLabel();
        txt_nm_produto = new javax.swing.JTextField();
        lbl_qt_produto = new javax.swing.JLabel();
        txt_qt_produto = new javax.swing.JTextField();
        lbl_qt_peso_carga = new javax.swing.JLabel();
        txt_qt_peso_carga = new javax.swing.JTextField();
        lbl_vl_carga = new javax.swing.JLabel();
        txt_vl_carga = new javax.swing.JTextField();
        lbl_cd_cnpj_empresa1 = new javax.swing.JLabel();
        js_ds_produto = new javax.swing.JScrollPane();
        txta_ds_produto = new javax.swing.JTextArea();
        lbl_nm_transportadora = new javax.swing.JLabel();
        txt_nm_transportadora = new javax.swing.JComboBox();
        lbl_cd_placa = new javax.swing.JLabel();
        txt_cd_placa = new javax.swing.JTextField();
        lbl_qt_peso_caminhao = new javax.swing.JLabel();
        txt_vl_carga2 = new javax.swing.JTextField();
        lbl_vl_carga3 = new javax.swing.JLabel();
        txt_nm_transportadora1 = new javax.swing.JComboBox();
        lbl_nm_armazem = new javax.swing.JLabel();
        cmg_nm_armazem = new javax.swing.JComboBox();
        btn_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_cadastrar_produto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_cadastrar_produto.setText("Cadastrar");
        btn_cadastrar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrar_produtoActionPerformed(evt);
            }
        });

        lbl_cadastro_produto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_cadastro_produto.setText("CADASTRO DO PRODUTO");

        lbl_id_produto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_id_produto.setText("Código do produto:");

        txt_id_produto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_id_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_produtoActionPerformed(evt);
            }
        });

        lbl_nm_produto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_nm_produto.setText("Nome do produto:");

        txt_nm_produto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_qt_produto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_qt_produto.setText("Quantidade do produto:");

        txt_qt_produto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_qt_peso_carga.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_qt_peso_carga.setText("Quantidade da carga:");

        txt_qt_peso_carga.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_vl_carga.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_vl_carga.setText("Valor da Carga:");

        txt_vl_carga.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_cd_cnpj_empresa1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_cd_cnpj_empresa1.setText("Descrição do produto:");

        txta_ds_produto.setColumns(20);
        txta_ds_produto.setRows(5);
        js_ds_produto.setViewportView(txta_ds_produto);

        lbl_nm_transportadora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_nm_transportadora.setText("Transportadora:");

        txt_nm_transportadora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_nm_transportadora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yara" }));

        lbl_cd_placa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_cd_placa.setText("Placa da caminhao:");

        txt_cd_placa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_qt_peso_caminhao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_qt_peso_caminhao.setText("Peso do caminhao:");

        txt_vl_carga2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_vl_carga3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_vl_carga3.setText("Transporte:");

        txt_nm_transportadora1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_nm_transportadora1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rodoviário", "Ferroviário" }));

        lbl_nm_armazem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_nm_armazem.setText("Armazém:");

        cmg_nm_armazem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmg_nm_armazem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SP - SANTOS TUF" }));

        btn_voltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_id_produto)
                            .addComponent(btn_voltar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_id_produto))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(lbl_cadastro_produto)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_nm_produto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nm_produto))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_qt_produto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_qt_produto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_qt_peso_carga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_qt_peso_carga, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(js_ds_produto)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_vl_carga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_vl_carga, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_nm_transportadora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nm_transportadora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_cd_placa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cd_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_cd_cnpj_empresa1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_vl_carga3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nm_transportadora1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_nm_armazem)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_qt_peso_caminhao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_vl_carga2))
                            .addComponent(cmg_nm_armazem, 0, 361, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cadastrar_produto)
                .addGap(294, 294, 294))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cadastro_produto)
                    .addComponent(btn_voltar))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id_produto)
                    .addComponent(txt_id_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nm_produto)
                    .addComponent(txt_nm_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_qt_produto)
                    .addComponent(txt_qt_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_qt_peso_carga)
                    .addComponent(txt_qt_peso_carga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_vl_carga)
                    .addComponent(txt_vl_carga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nm_transportadora)
                    .addComponent(txt_nm_transportadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cd_placa)
                    .addComponent(txt_cd_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_qt_peso_caminhao)
                    .addComponent(txt_vl_carga2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_nm_armazem)
                        .addComponent(cmg_nm_armazem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_vl_carga3)
                        .addComponent(txt_nm_transportadora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_cd_cnpj_empresa1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(js_ds_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cadastrar_produto)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrar_produtoActionPerformed
        
    }//GEN-LAST:event_btn_cadastrar_produtoActionPerformed

    private void txt_id_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_produtoActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        Jf_IndexInterna cadastro = new Jf_IndexInterna();
        hide();
        cadastro.show();
    }//GEN-LAST:event_btn_voltarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Jf_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jf_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jf_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jf_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jf_Produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrar_produto;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JComboBox cmg_nm_armazem;
    private javax.swing.JScrollPane js_ds_produto;
    private javax.swing.JLabel lbl_cadastro_produto;
    private javax.swing.JLabel lbl_cd_cnpj_empresa1;
    private javax.swing.JLabel lbl_cd_placa;
    private javax.swing.JLabel lbl_id_produto;
    private javax.swing.JLabel lbl_nm_armazem;
    private javax.swing.JLabel lbl_nm_produto;
    private javax.swing.JLabel lbl_nm_transportadora;
    private javax.swing.JLabel lbl_qt_peso_caminhao;
    private javax.swing.JLabel lbl_qt_peso_carga;
    private javax.swing.JLabel lbl_qt_produto;
    private javax.swing.JLabel lbl_vl_carga;
    private javax.swing.JLabel lbl_vl_carga3;
    private javax.swing.JTextField txt_cd_placa;
    private javax.swing.JTextField txt_id_produto;
    private javax.swing.JTextField txt_nm_produto;
    private javax.swing.JComboBox txt_nm_transportadora;
    private javax.swing.JComboBox txt_nm_transportadora1;
    private javax.swing.JTextField txt_qt_peso_carga;
    private javax.swing.JTextField txt_qt_produto;
    private javax.swing.JTextField txt_vl_carga;
    private javax.swing.JTextField txt_vl_carga2;
    private javax.swing.JTextArea txta_ds_produto;
    // End of variables declaration//GEN-END:variables
}