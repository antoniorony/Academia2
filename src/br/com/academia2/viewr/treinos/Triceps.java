/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academia2.viewr.treinos;

import academia2.HibernateUtil;
import java.awt.Color;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ANTONIO RONY
 */
public class Triceps extends javax.swing.JDialog {
private  DefaultTableModel tmResultSet = new DefaultTableModel(null, new String[]{"ID","EXCERCICIO"});;
  java.util.List<br.com.academia2.model.Triceps> resultado;  
      private ListSelectionModel lsmResult;
      private DefaultTableModel tabela;
      private int idDescricaoControle;
    /**
     * Creates new form Triceps
     */
    public Triceps(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jBAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);          lsmResult = jTable1.getSelectionModel();          lsmResult.addListSelectionListener(new ListSelectionListener() {               public void valueChanged(ListSelectionEvent e) {                                        if (! e.getValueIsAdjusting()){                           jTTabelaLinhaSelecionada(jTable1);                       }                                    }          });
        jBExcluir = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EXCERCICIO: ");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jBAdicionar.setBackground(new Color(0,0,0,1));
        jBAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/academia2/icone/add_icon.png"))); // NOI18N
        jBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionarActionPerformed(evt);
            }
        });

        jTable1.setModel(tmResultSet);
        jScrollPane1.setViewportView(jTable1);

        jBExcluir.setBackground(new Color(0,0,0,1));
        jBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/academia2/icone/remove.png"))); // NOI18N
        jBExcluir.setPreferredSize(new java.awt.Dimension(65, 36));
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBEditar.setBackground(new Color(0,0,0,1));
        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/academia2/icone/EDITAR.png"))); // NOI18N
        jBEditar.setPreferredSize(new java.awt.Dimension(65, 35));
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jButton4.setBackground(new Color(0,0,0,1));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/academia2/icone/pesquisa.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(519, 352));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    buscar();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarActionPerformed
    salvar();        // TODO add your handling code here:
    }//GEN-LAST:event_jBAdicionarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
    int confirma = JOptionPane.showConfirmDialog(this, "Realmente Deseja Alterar?");
        if (confirma == 0) {
            editar();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
    int confirma = JOptionPane.showConfirmDialog(this, "Realmente Deseja Alterar?");
        if (confirma == 0) {
            excluir();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jBExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(Triceps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Triceps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Triceps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Triceps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Triceps dialog = new Triceps(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBAdicionar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    // End of variables declaration//GEN-END:variables
private void salvar() {
        br.com.academia2.model.Triceps model = new br.com.academia2.model.Triceps();
        model.setDescricao(jTextField1.getText());
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(model);
        session.getTransaction().commit();
        JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso.");
        jTextField1.setText("");
        buscar();

    }

    private void buscar() {
       tabela = (DefaultTableModel)jTable1.getModel();
        tabela.setNumRows(0);
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Criteria crit = sesion.createCriteria(br.com.academia2.model.Triceps.class);
     //   crit.add(Restrictions.like("nomeMarca",text+"%"));
        java.util.List results = crit.list();
        for (Iterator iterator = results.iterator(); iterator.hasNext();){
        br.com.academia2.model.Triceps Sal = (br.com.academia2.model.Triceps) iterator.next(); 
        tmResultSet.addRow(new Object[]{
            //`enter code here`columns
           // Sal.getIdUsuario(),
            Sal.getId(),
            Sal.getDescricao(),
           
            
            
            
        });
        }
    }
    private void jTTabelaLinhaSelecionada(JTable tabela) {
        if (jTable1.getSelectedRow()!= -1) {     
          String cod = (jTable1.getValueAt(jTable1.getSelectedRow(),0)).toString();
          this.idDescricaoControle = Integer.parseInt(cod);
          jTextField1.setText((jTable1.getValueAt(jTable1.getSelectedRow(),1)).toString());
          // jTMarca.setText(nomeMarca);
        habilidatos();
        jBAdicionar.setEnabled(false);
        }

     }

    private void excluir() {
        br.com.academia2.model.Triceps model = new br.com.academia2.model.Triceps();
        model.setId(this.idDescricaoControle);
        model.setDescricao(jTextField1.getText());
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(model);
        session.getTransaction().commit();
        JOptionPane.showMessageDialog(rootPane, "EXCLUIDO com sucesso.");
        jBAdicionar.setEnabled(true);
        desabilitados();
        jTextField1.setText("");
        buscar();
    }

    private void editar() {
        br.com.academia2.model.Triceps model = new br.com.academia2.model.Triceps();
        model.setDescricao(jTextField1.getText());
        model.setId(this.idDescricaoControle);
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(model);
        session.getTransaction().commit();
        JOptionPane.showMessageDialog(rootPane, "Editado com sucesso.");
        jBAdicionar.setEnabled(true);
        desabilitados();
        jTextField1.setText("");
        buscar();
    }
    
   public void desabilitados(){
       jBEditar.setEnabled(false);
       jBExcluir.setEnabled(false);
   }
   public void habilidatos(){
       jBEditar.setEnabled(true);
       jBExcluir.setEnabled(true);      
   }
}
