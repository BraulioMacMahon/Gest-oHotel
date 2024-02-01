
package hotelproject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class CheckInOut extends javax.swing.JFrame {

  
    public CheckInOut() {
        initComponents();
    }
    
    public void listarProductos()throws Exception{
        
        DefaultTableModel modelo = (DefaultTableModel)TabelaCheck.getModel();
        modelo.setRowCount(0);
        TabelaCheck.setShowGrid(true);
      
        String query = "SELECT * FROM reservas";
        
        
        try{
            
            Statement stmnt = Conection.conexao().createStatement();
            ResultSet rs = stmnt.executeQuery(query);
           
            while(rs.next()){
            
            
                modelo.addRow(new Object[]{rs.getObject(1),rs.getObject(2),rs.getObject(3),
                    rs.getObject(4), rs.getObject(8)});
            }
            
           TabelaCheck.selectAll();
        
        }
        
         catch(SQLException msg){
         
             JOptionPane.showMessageDialog(null,"Não Houve Qualquer Acção na Base de Dados Devido O Erro "+msg.getMessage());
         }
       
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCheck = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jLabel13.setBackground(new java.awt.Color(46, 49, 49));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Check-In/Out");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(470, 10, 180, 32);

        TabelaCheck.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CheckIn", "CheckOut", "telefone"
            }
        ));
        TabelaCheck.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TabelaCheckAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(TabelaCheck);
        if (TabelaCheck.getColumnModel().getColumnCount() > 0) {
            TabelaCheck.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 1050, 450);

        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(945, 510, 100, 23);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Braulio MacMahon\\Desktop\\Trabalho de base de dados e programação\\Programação\\Hotelaria\\build\\classes\\Imagens\\Fundo\\png-transparent-hotel-staff-attendant-woman-holding-keys-removebg-preview.png")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(470, -70, 613, 407);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1066, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TabelaCheckAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TabelaCheckAncestorAdded
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel)TabelaCheck.getModel();
        modelo.setRowCount(0);
        TabelaCheck.setShowGrid(true);
      
        String query = "SELECT * FROM reservas";
        
        
        try{
            
            Statement stmnt = Conection.conexao().createStatement();
            ResultSet rs = stmnt.executeQuery(query);
           
            while(rs.next()){
            
            
                modelo.addRow(new Object[]{rs.getObject(1),rs.getObject(2),rs.getObject(3),
                    rs.getObject(4),rs.getObject(8)});
            }
            
           TabelaCheck.selectAll();
        
        }
        
         catch(SQLException msg){
         
             JOptionPane.showMessageDialog(null,"Não Houve Qualquer Acção na Base de Dados Devido O Erro "+msg.getMessage());
         }
        
    }//GEN-LAST:event_TabelaCheckAncestorAdded

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaCheck;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
