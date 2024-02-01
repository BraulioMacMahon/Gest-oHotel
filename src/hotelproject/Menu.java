
package hotelproject;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;



public class Menu extends javax.swing.JFrame {

  
    public Menu() {
        initComponents();
        
        JButton [] btns = {btnHome, btnReserva, btnListaReserva, btnFinancas, btnCheckInOut, btnExit};
        for (JButton btn : btns) {
            btn.setBackground(new Color(60,102,102));
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent me) {
               }

                @Override
                public void mousePressed(MouseEvent me) {
                }

                @Override
                public void mouseReleased(MouseEvent me) {
                }

                @Override
                public void mouseEntered(MouseEvent me) {
                }

                @Override
                public void mouseExited(MouseEvent me) {
               }
            });
        }
       
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PriRoot = new javax.swing.JPanel();
        PriSide = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnReserva = new javax.swing.JButton();
        btnListaReserva = new javax.swing.JButton();
        btnFinancas = new javax.swing.JButton();
        btnCheckInOut = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        PriCenter = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setMaximumSize(new java.awt.Dimension(1070, 600));
        setPreferredSize(new java.awt.Dimension(1070, 600));
        setSize(new java.awt.Dimension(0, 0));

        PriRoot.setLayout(new java.awt.BorderLayout());

        PriSide.setBackground(new java.awt.Color(60, 102, 102));
        PriSide.setMinimumSize(new java.awt.Dimension(0, 0));
        PriSide.setPreferredSize(new java.awt.Dimension(80, 100));

        jPanel1.setBackground(new java.awt.Color(60, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(50, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        PriSide.add(jPanel1);

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/baseline_home_black_18.png"))); // NOI18N
        btnHome.setBorder(null);
        btnHome.setMaximumSize(new java.awt.Dimension(40, 40));
        btnHome.setMinimumSize(new java.awt.Dimension(40, 40));
        btnHome.setPreferredSize(new java.awt.Dimension(40, 40));
        PriSide.add(btnHome);

        btnReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/baseline_app_registration_black_24dp.png"))); // NOI18N
        btnReserva.setBorder(null);
        btnReserva.setMaximumSize(new java.awt.Dimension(40, 40));
        btnReserva.setMinimumSize(new java.awt.Dimension(40, 40));
        btnReserva.setPreferredSize(new java.awt.Dimension(40, 40));
        PriSide.add(btnReserva);

        btnListaReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/sharp_file_copy_black_18dp.png"))); // NOI18N
        btnListaReserva.setBorder(null);
        btnListaReserva.setMaximumSize(new java.awt.Dimension(40, 40));
        btnListaReserva.setMinimumSize(new java.awt.Dimension(40, 40));
        btnListaReserva.setPreferredSize(new java.awt.Dimension(40, 40));
        PriSide.add(btnListaReserva);

        btnFinancas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/twotone_request_quote_black_18dp.png"))); // NOI18N
        btnFinancas.setBorder(null);
        btnFinancas.setMaximumSize(new java.awt.Dimension(40, 40));
        btnFinancas.setMinimumSize(new java.awt.Dimension(40, 40));
        btnFinancas.setPreferredSize(new java.awt.Dimension(40, 40));
        PriSide.add(btnFinancas);

        btnCheckInOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/twotone_loop_black_18dp.png"))); // NOI18N
        btnCheckInOut.setBorder(null);
        btnCheckInOut.setMaximumSize(new java.awt.Dimension(40, 40));
        btnCheckInOut.setMinimumSize(new java.awt.Dimension(40, 40));
        btnCheckInOut.setPreferredSize(new java.awt.Dimension(40, 40));
        PriSide.add(btnCheckInOut);

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/baseline_exit_to_app_black_18dp.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setMaximumSize(new java.awt.Dimension(40, 40));
        btnExit.setMinimumSize(new java.awt.Dimension(40, 40));
        btnExit.setPreferredSize(new java.awt.Dimension(40, 40));
        PriSide.add(btnExit);

        PriRoot.add(PriSide, java.awt.BorderLayout.WEST);

        PriCenter.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PriCenterLayout = new javax.swing.GroupLayout(PriCenter);
        PriCenter.setLayout(PriCenterLayout);
        PriCenterLayout.setHorizontalGroup(
            PriCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 884, Short.MAX_VALUE)
        );
        PriCenterLayout.setVerticalGroup(
            PriCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PriRoot.add(PriCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(PriRoot, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PriCenter;
    private javax.swing.JPanel PriRoot;
    private javax.swing.JPanel PriSide;
    private javax.swing.JButton btnCheckInOut;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFinancas;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnListaReserva;
    private javax.swing.JButton btnReserva;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
