//@author LE-LOY

package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.util.HashMap;
import javax.swing.JButton;

public class Utilities extends javax.swing.JFrame {
    String[] date = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    
    public Utilities() {
        initComponents();
        
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if(Pomodoro.pomodoro.btn_startpause.getText()==" Pause ")
                    DateTime.saveNow("Paused:");
                DateTime.saveNow("Closed:");
                System.exit(0);
            }
        });
        this.getContentPane().setBackground(new Color(51, 51, 55) );
        
        String temp = DateTime.now("u");
        int i = Integer.parseInt(temp);
        lbl_day6.setText( date[ (i-1+7)%7 ] );
        lbl_day5.setText( date[ (i-2+7)%7 ] );
        lbl_day4.setText( date[ (i-3+7)%7 ] );
        lbl_day3.setText( date[ (i-4+7)%7 ] );
        lbl_day2.setText( date[ (i-5+7)%7 ] );
        lbl_day1.setText( date[ (i-6+7)%7 ] );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_back = new javax.swing.JButton();
        lbl_sessions = new javax.swing.JLabel();
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
        cbx_settings = new javax.swing.JComboBox<>();
        btn_set = new javax.swing.JButton();
        lbl_61 = new javax.swing.JLabel();
        lbl_62 = new javax.swing.JLabel();
        lbl_63 = new javax.swing.JLabel();
        lbl_64 = new javax.swing.JLabel();
        lbl_day1 = new javax.swing.JLabel();
        lbl_day2 = new javax.swing.JLabel();
        lbl_day3 = new javax.swing.JLabel();
        lbl_day4 = new javax.swing.JLabel();
        lbl_day5 = new javax.swing.JLabel();
        lbl_day6 = new javax.swing.JLabel();
        lbl_today = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(300, 550));
        setMinimumSize(new java.awt.Dimension(300, 550));
        setResizable(false);
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
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                onMousePress(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                onMouseRelease(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                onMouseExit(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                onMouseEnter(evt);
            }
        });
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back_onClick(evt);
            }
        });

        lbl_sessions.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        lbl_sessions.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sessions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sessions.setText("Sessions");
        lbl_sessions.setName("lbl_sessions"); // NOI18N

        pnl_activity.setBackground(new java.awt.Color(51, 51, 51));
        pnl_activity.setForeground(new java.awt.Color(255, 255, 255));
        pnl_activity.setMaximumSize(new java.awt.Dimension(210, 360));
        pnl_activity.setMinimumSize(new java.awt.Dimension(210, 360));
        pnl_activity.setName("pnl_activity"); // NOI18N
        pnl_activity.setPreferredSize(new java.awt.Dimension(210, 360));

        javax.swing.GroupLayout pnl_activityLayout = new javax.swing.GroupLayout(pnl_activity);
        pnl_activity.setLayout(pnl_activityLayout);
        pnl_activityLayout.setHorizontalGroup(
            pnl_activityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        pnl_activityLayout.setVerticalGroup(
            pnl_activityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        cbx_settings.setBackground(new java.awt.Color(255, 255, 255));
        cbx_settings.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recomended Settings", "Focus", "Lazy" }));
        cbx_settings.setName("cbx_settings"); // NOI18N

        btn_set.setBackground(new java.awt.Color(53, 53, 53));
        btn_set.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btn_set.setForeground(new java.awt.Color(255, 255, 255));
        btn_set.setText("Set");
        btn_set.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_set.setContentAreaFilled(false);
        btn_set.setMargin(new java.awt.Insets(2, 7, 2, 7));
        btn_set.setMaximumSize(new java.awt.Dimension(42, 25));
        btn_set.setMinimumSize(new java.awt.Dimension(42, 25));
        btn_set.setName("btn_set"); // NOI18N
        btn_set.setOpaque(true);
        btn_set.setPreferredSize(new java.awt.Dimension(34, 25));
        btn_set.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                onMousePress(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                onMouseRelease(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                onMouseExit(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                onMouseEnter(evt);
            }
        });
        btn_set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_set_onClick(evt);
            }
        });

        lbl_61.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_61.setForeground(new java.awt.Color(255, 255, 255));
        lbl_61.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_61.setText("   6 ");
        lbl_61.setName("lbl_61"); // NOI18N

        lbl_62.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_62.setForeground(new java.awt.Color(255, 255, 255));
        lbl_62.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_62.setText("   6 ");
        lbl_62.setName("lbl_62"); // NOI18N

        lbl_63.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_63.setForeground(new java.awt.Color(255, 255, 255));
        lbl_63.setText(" 6   ");
        lbl_63.setName("lbl_63"); // NOI18N

        lbl_64.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_64.setForeground(new java.awt.Color(255, 255, 255));
        lbl_64.setText(" 6   ");
        lbl_64.setName("lbl_64"); // NOI18N

        lbl_day1.setFont(new java.awt.Font("Droid Sans Mono", 0, 11)); // NOI18N
        lbl_day1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_day1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_day1.setText("EEE");
        lbl_day1.setMaximumSize(new java.awt.Dimension(30, 15));
        lbl_day1.setMinimumSize(new java.awt.Dimension(30, 15));
        lbl_day1.setName("lbl_day1"); // NOI18N
        lbl_day1.setPreferredSize(new java.awt.Dimension(30, 15));

        lbl_day2.setFont(new java.awt.Font("Droid Sans Mono", 0, 11)); // NOI18N
        lbl_day2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_day2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_day2.setText("EEE");
        lbl_day2.setMaximumSize(new java.awt.Dimension(30, 15));
        lbl_day2.setMinimumSize(new java.awt.Dimension(30, 15));
        lbl_day2.setName("lbl_day2"); // NOI18N
        lbl_day2.setPreferredSize(new java.awt.Dimension(30, 15));

        lbl_day3.setFont(new java.awt.Font("Droid Sans Mono", 0, 11)); // NOI18N
        lbl_day3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_day3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_day3.setText("EEE");
        lbl_day3.setMaximumSize(new java.awt.Dimension(30, 15));
        lbl_day3.setMinimumSize(new java.awt.Dimension(30, 15));
        lbl_day3.setName("lbl_day3"); // NOI18N
        lbl_day3.setPreferredSize(new java.awt.Dimension(30, 15));

        lbl_day4.setFont(new java.awt.Font("Droid Sans Mono", 0, 11)); // NOI18N
        lbl_day4.setForeground(new java.awt.Color(255, 255, 255));
        lbl_day4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_day4.setText("EEE");
        lbl_day4.setMaximumSize(new java.awt.Dimension(30, 15));
        lbl_day4.setMinimumSize(new java.awt.Dimension(30, 15));
        lbl_day4.setName("lbl_day4"); // NOI18N
        lbl_day4.setPreferredSize(new java.awt.Dimension(30, 15));

        lbl_day5.setFont(new java.awt.Font("Droid Sans Mono", 0, 11)); // NOI18N
        lbl_day5.setForeground(new java.awt.Color(255, 255, 255));
        lbl_day5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_day5.setText("EEE");
        lbl_day5.setMaximumSize(new java.awt.Dimension(30, 15));
        lbl_day5.setMinimumSize(new java.awt.Dimension(30, 15));
        lbl_day5.setName("lbl_day5"); // NOI18N
        lbl_day5.setPreferredSize(new java.awt.Dimension(30, 15));

        lbl_day6.setFont(new java.awt.Font("Droid Sans Mono", 0, 11)); // NOI18N
        lbl_day6.setForeground(new java.awt.Color(255, 255, 255));
        lbl_day6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_day6.setText("EEE");
        lbl_day6.setMaximumSize(new java.awt.Dimension(30, 15));
        lbl_day6.setMinimumSize(new java.awt.Dimension(30, 15));
        lbl_day6.setName("lbl_day6"); // NOI18N
        lbl_day6.setPreferredSize(new java.awt.Dimension(30, 15));

        lbl_today.setFont(new java.awt.Font("Droid Sans Mono", 1, 12)); // NOI18N
        lbl_today.setForeground(new java.awt.Color(255, 255, 255));
        lbl_today.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_today.setText("TDY");
        lbl_today.setMaximumSize(new java.awt.Dimension(30, 15));
        lbl_today.setMinimumSize(new java.awt.Dimension(30, 15));
        lbl_today.setName("lbl_today"); // NOI18N
        lbl_today.setPreferredSize(new java.awt.Dimension(30, 15));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_sessions, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbx_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_set, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_62, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_61, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_day1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(lbl_day2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(lbl_day3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(lbl_day4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(lbl_day5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(lbl_day6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(lbl_today, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnl_activity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_63)
                                    .addComponent(lbl_64))))))
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_sessions))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_day1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_day2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_day3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_day4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_day5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_day6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_today, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_61, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_64, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_62, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_63, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbx_settings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_set, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnl_activity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_back_onClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back_onClick
        Pomodoro.pomodoro.setEnabled(true);
        Pomodoro.pomodoro.firstTask();
        this.dispose();
    }//GEN-LAST:event_btn_back_onClick

    private void btn_set_onClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_set_onClick
        if(cbx_settings.getSelectedIndex()==1){
            Settings.spans[0] = new TimeSpan(0, 50, 0);
            Settings.spans[1] = new TimeSpan(0, 10, 0);
            Settings.spans[2] = new TimeSpan(0, 10, 0);
        }else if(cbx_settings.getSelectedIndex()==2){
            Settings.spans[0] = new TimeSpan(0, 30, 0);
            Settings.spans[1] = new TimeSpan(0, 30, 0);
            Settings.spans[2] = new TimeSpan(0, 30, 0);
        }
    }//GEN-LAST:event_btn_set_onClick

    private void onMouseEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onMouseEnter
        JButton button = (JButton) evt.getSource();
        button.setBackground(new Color(35, 35, 40));
    }//GEN-LAST:event_onMouseEnter

    private void onMouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onMouseExit
        JButton button = (JButton) evt.getSource();
        button.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_onMouseExit

    private void onMousePress(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onMousePress
        JButton button = (JButton) evt.getSource();
        button.setBackground(new Color(15, 15, 20));
    }//GEN-LAST:event_onMousePress

    private void onMouseRelease(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onMouseRelease
        JButton button = (JButton) evt.getSource();
        button.setBackground(new Color(35, 35, 40));
    }//GEN-LAST:event_onMouseRelease
    
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
    private javax.swing.JButton btn_set;
    private javax.swing.JComboBox<String> cbx_settings;
    private javax.swing.JLabel lbl_61;
    private javax.swing.JLabel lbl_62;
    private javax.swing.JLabel lbl_63;
    private javax.swing.JLabel lbl_64;
    private javax.swing.JLabel lbl_day1;
    private javax.swing.JLabel lbl_day2;
    private javax.swing.JLabel lbl_day3;
    private javax.swing.JLabel lbl_day4;
    private javax.swing.JLabel lbl_day5;
    private javax.swing.JLabel lbl_day6;
    private javax.swing.JLabel lbl_sessions;
    private javax.swing.JLabel lbl_today;
    private javax.swing.JPanel pnl_activity;
    // End of variables declaration//GEN-END:variables
}
