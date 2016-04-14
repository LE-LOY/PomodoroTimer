//@author LE-LOY

package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Utilities extends javax.swing.JFrame {
    
    public Utilities() {
        initComponents();
        
        this.getContentPane().setBackground(new Color(51, 51, 55) );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_back = new javax.swing.JButton();
        pnl_activity = new JPanel(){
            ArrayList squares = new ArrayList();
            int squareSize;

            private void populate(){
                ArrayList marks = DateTime.marks;
            }

            private void paintSquares(Graphics g) {
                squares = DateTime.marks;
                int size = squares.size();

                for(int i=0; i<size; ++i){
                    ActiveMark square = (ActiveMark) squares.get(i);
                    square.draw(g);
                }
            }

            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                paintSquares(g);
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(300, 550));
        setMinimumSize(new java.awt.Dimension(300, 550));
        setSize(new java.awt.Dimension(300, 550));

        btn_back.setBackground(new java.awt.Color(53, 53, 53));
        btn_back.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText(" Back ");
        btn_back.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_back.setContentAreaFilled(false);
        btn_back.setMargin(new java.awt.Insets(2, 7, 2, 7));
        btn_back.setMaximumSize(new java.awt.Dimension(42, 25));
        btn_back.setMinimumSize(new java.awt.Dimension(42, 25));
        btn_back.setName("btn_back"); // NOI18N
        btn_back.setOpaque(true);
        btn_back.setPreferredSize(new java.awt.Dimension(34, 25));
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back_onClick(evt);
            }
        });

        pnl_activity.setBackground(new java.awt.Color(51, 51, 51));
        pnl_activity.setForeground(new java.awt.Color(255, 255, 255));
        pnl_activity.setMaximumSize(new java.awt.Dimension(288, 70));
        pnl_activity.setMinimumSize(new java.awt.Dimension(288, 70));
        pnl_activity.setName("pnl_activity"); // NOI18N
        pnl_activity.setPreferredSize(new java.awt.Dimension(288, 70));

        javax.swing.GroupLayout pnl_activityLayout = new javax.swing.GroupLayout(pnl_activity);
        pnl_activity.setLayout(pnl_activityLayout);
        pnl_activityLayout.setHorizontalGroup(
            pnl_activityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );
        pnl_activityLayout.setVerticalGroup(
            pnl_activityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnl_activity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 431, Short.MAX_VALUE)
                .addComponent(pnl_activity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_back_onClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back_onClick
        Pomodoro.pomodoro.setEnabled(true);
        Pomodoro.pomodoro.firstTask();
        this.dispose();
    }//GEN-LAST:event_btn_back_onClick

    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Utilities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utilities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utilities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utilities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            Pomodoro.utilities.setVisible(true);
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JPanel pnl_activity;
    // End of variables declaration//GEN-END:variables
}
