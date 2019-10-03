/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg2048;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import javax.swing.*;

/**
 *
 * @author Andrea
 */
public class FrmInterfaccia extends JFrame implements KeyListener {
    Griglia griglia;
    HashMap<Integer, Color> sfondi;
    Color TEXT_LIGHT, TEXT_DARK;
    JLabel[][] gr;
    final int SIZE = 4;
    
    public FrmInterfaccia() {
        initComponents();
        addKeyListener(this);
        gr = new JLabel[SIZE][SIZE];
        gr[0][0] = a1; gr[0][1] = a2; gr[0][2] = a3; gr[0][3] = a4;
        gr[1][0] = a5; gr[1][1] = a6; gr[1][2] = a7; gr[1][3] = a8;
        gr[2][0] = a9; gr[2][1] = a10; gr[2][2] = a11; gr[2][3] = a12;
        gr[3][0] = a13; gr[3][1] = a14; gr[3][2] = a15; gr[3][3] = a16;
        sfondi = new HashMap();
        TEXT_DARK = Color.decode("#786a5f");
        TEXT_LIGHT = Color.decode("#f9fbfa");
        caricaSfondi();
        griglia = new Griglia();
        caricaGriglia();
    }
    
    private void caricaSfondi(){
        String[] str = {"f5f5f5", "f5f5dc", "ffa07a", "ff7f50", "ff6347", "ff0000", "FFF060", "F0E050", "F0E010", "F0D000", "F0C000", "000000"};
        sfondi.put(0, Color.decode("#cdc0b4"));
        for(int i=0; i<12; i++){
            sfondi.put((int)Math.pow(2, i+1), Color.decode("#"+str[i]));
        }
    }
    
    private void caricaGriglia(){
        int n;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                n = griglia.g[i][j];
                if(n==0)
                    gr[i][j].setText("");
                else
                    gr[i][j].setText(n + "");
                
                gr[i][j].setBackground(sfondi.get(n));
                gr[i][j].setForeground(TEXT_DARK);
                if(n>4)
                    gr[i][j].setForeground(TEXT_LIGHT);
            }
        }
        punti.setText(griglia.getPunti()+"");
        record.setText(griglia.getRecord()+"");
    }

    
    @Override
    public void keyPressed(KeyEvent e){
        switch(e.getKeyCode()){
            case 10:
                if (griglia.isFinita())
                    griglia = new Griglia();
                break;
            case 37:
                griglia.sposta('l');
                break;
            case 38:
                griglia.sposta('u');
                break;
            case 39:
                griglia.sposta('r');
                break;
            case 40:
                griglia.sposta('d');
                break;
        }
        caricaGriglia();
    }
    
    @Override
    public void keyReleased(KeyEvent e){}
    
    @Override
    public void keyTyped(KeyEvent e){}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a7 = new javax.swing.JLabel();
        a8 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        a9 = new javax.swing.JLabel();
        a13 = new javax.swing.JLabel();
        a10 = new javax.swing.JLabel();
        a14 = new javax.swing.JLabel();
        a11 = new javax.swing.JLabel();
        a15 = new javax.swing.JLabel();
        a12 = new javax.swing.JLabel();
        a16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        punti = new javax.swing.JLabel();
        record = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(187, 173, 160));

        a1.setBackground(new java.awt.Color(205, 192, 180));
        a1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        a1.setForeground(new java.awt.Color(115, 104, 94));
        a1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a1.setOpaque(true);

        a2.setBackground(new java.awt.Color(205, 192, 180));
        a2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        a2.setForeground(new java.awt.Color(115, 104, 94));
        a2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a2.setOpaque(true);

        a3.setBackground(new java.awt.Color(205, 192, 180));
        a3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        a3.setForeground(new java.awt.Color(115, 104, 94));
        a3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a3.setOpaque(true);

        a4.setBackground(new java.awt.Color(205, 192, 180));
        a4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        a4.setForeground(new java.awt.Color(115, 104, 94));
        a4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a4.setOpaque(true);

        a7.setBackground(new java.awt.Color(205, 192, 180));
        a7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        a7.setForeground(new java.awt.Color(115, 104, 94));
        a7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a7.setOpaque(true);

        a8.setBackground(new java.awt.Color(205, 192, 180));
        a8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        a8.setForeground(new java.awt.Color(115, 104, 94));
        a8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a8.setOpaque(true);

        a6.setBackground(new java.awt.Color(205, 192, 180));
        a6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        a6.setForeground(new java.awt.Color(115, 104, 94));
        a6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a6.setOpaque(true);

        a5.setBackground(new java.awt.Color(205, 192, 180));
        a5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        a5.setForeground(new java.awt.Color(115, 104, 94));
        a5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a5.setOpaque(true);

        a9.setBackground(new java.awt.Color(205, 192, 180));
        a9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        a9.setForeground(new java.awt.Color(115, 104, 94));
        a9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a9.setOpaque(true);

        a13.setBackground(new java.awt.Color(205, 192, 180));
        a13.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        a13.setForeground(new java.awt.Color(115, 104, 94));
        a13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a13.setOpaque(true);

        a10.setBackground(new java.awt.Color(205, 192, 180));
        a10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        a10.setForeground(new java.awt.Color(115, 104, 94));
        a10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a10.setOpaque(true);

        a14.setBackground(new java.awt.Color(205, 192, 180));
        a14.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        a14.setForeground(new java.awt.Color(115, 104, 94));
        a14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a14.setOpaque(true);

        a11.setBackground(new java.awt.Color(205, 192, 180));
        a11.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        a11.setForeground(new java.awt.Color(115, 104, 94));
        a11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a11.setOpaque(true);

        a15.setBackground(new java.awt.Color(205, 192, 180));
        a15.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        a15.setForeground(new java.awt.Color(115, 104, 94));
        a15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a15.setOpaque(true);

        a12.setBackground(new java.awt.Color(205, 192, 180));
        a12.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        a12.setForeground(new java.awt.Color(115, 104, 94));
        a12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a12.setOpaque(true);

        a16.setBackground(new java.awt.Color(205, 192, 180));
        a16.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        a16.setForeground(new java.awt.Color(115, 104, 94));
        a16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a16.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(249, 251, 250));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(249, 251, 250));
        jLabel1.setText("PUNTEGGIO:");

        punti.setBackground(new java.awt.Color(249, 251, 250));
        punti.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        punti.setForeground(new java.awt.Color(249, 251, 250));
        punti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        punti.setText("0");

        record.setBackground(new java.awt.Color(249, 251, 250));
        record.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        record.setForeground(new java.awt.Color(249, 251, 250));
        record.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        record.setText("0");

        jLabel2.setBackground(new java.awt.Color(249, 251, 250));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(249, 251, 250));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RECORD:");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel3.setText("2048");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(a13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(punti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(record, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(punti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(record)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(a13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmInterfaccia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInterfaccia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInterfaccia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInterfaccia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInterfaccia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a10;
    private javax.swing.JLabel a11;
    private javax.swing.JLabel a12;
    private javax.swing.JLabel a13;
    private javax.swing.JLabel a14;
    private javax.swing.JLabel a15;
    private javax.swing.JLabel a16;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JLabel a7;
    private javax.swing.JLabel a8;
    private javax.swing.JLabel a9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel punti;
    private javax.swing.JLabel record;
    // End of variables declaration//GEN-END:variables

}
