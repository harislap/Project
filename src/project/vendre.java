/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Acer ASPIRE
 */
public class vendre extends javax.swing.JFrame {

    /**
     * Creates new form vendre
     */
    public vendre() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(new Point((screenSize.width - 673) / 2,
                              (screenSize.height -600) / 2));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.activeCaption);
        getContentPane().setLayout(null);

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jRadioButton1.setText("Clavier");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(30, 160, 67, 31);

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jRadioButton2.setText("Flash disque");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(30, 200, 97, 31);

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jRadioButton3.setText("Manette");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(30, 240, 69, 31);

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jRadioButton4.setText("Ecran");
        jRadioButton4.setActionCommand("jRadioButton6");
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(230, 240, 59, 31);

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jRadioButton5.setText("Souris");
        jRadioButton5.setActionCommand("jRadioButton4");
        getContentPane().add(jRadioButton5);
        jRadioButton5.setBounds(230, 160, 63, 31);

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jRadioButton6.setText("Carte mémoire");
        jRadioButton6.setActionCommand("jRadioButton5");
        getContentPane().add(jRadioButton6);
        jRadioButton6.setBounds(230, 200, 113, 31);

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jRadioButton7.setText("Cables");
        jRadioButton7.setActionCommand("jRadioButton9");
        getContentPane().add(jRadioButton7);
        jRadioButton7.setBounds(400, 240, 65, 31);

        jRadioButton8.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jRadioButton8.setText("Micro-casque");
        jRadioButton8.setActionCommand("jRadioButton7");
        getContentPane().add(jRadioButton8);
        jRadioButton8.setBounds(400, 160, 105, 31);

        jRadioButton9.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jRadioButton9.setText("CD/DVD");
        jRadioButton9.setActionCommand("jRadioButton8");
        getContentPane().add(jRadioButton9);
        jRadioButton9.setBounds(400, 200, 73, 31);

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("                -Vente pannel-");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 50, 399, 60);

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Quantité :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 360, 92, 34);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(120, 360, 91, 34);

        jButton1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButton1.setText("Vendre");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 360, 99, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/unnamed.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(470, 330, 90, 90);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/123.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 320, 610, 120);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/DSC01065 - Copie.JPG"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 610, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 Choix c=new Choix();
        c.setSize(522,530);
        
        c.setVisible(true);
        this.setVisible(false);    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
   String p = null ;
      String q;
      ImageIcon img = new ImageIcon("C:\\Users\\Acer ASPIRE\\Desktop\\money.png");
        if (jRadioButton1.isSelected())
       { p=jRadioButton1.getText()  ; 
       } 
            if(jRadioButton2.isSelected())
            {p=jRadioButton2.getText();
            }
                if (jRadioButton3.isSelected())
                { p=jRadioButton3.getText();}
                
                if(jRadioButton4.isSelected())
                {p=jRadioButton4.getText();
                }
                    if(jRadioButton5.isSelected())
                    {p=jRadioButton5.getText();
                    }
                        if(jRadioButton6.isSelected())
                        {p=jRadioButton6.getText();}
                        
                        else if(jRadioButton7.isSelected())
                        {p=jRadioButton7.getText();
                        } 
                        if (jRadioButton8.isSelected())
                        {p=jRadioButton8.getText();
                        } 
                            if(jRadioButton9.isSelected())
                            {p=jRadioButton9.getText();
                            }
        q=jTextField1.getText();
        int q1=parseInt(q);
        String rq1="select * from product where Nom= '"+p+"' ;"; 
 try{Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection c= (java.sql.Connection )DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/projet", "root", "");
    
Statement st;
st= c.createStatement();
ResultSet rs= st.executeQuery(rq1);
while(rs.next())
{
String qu = rs.getString("Qnt");
int q2=Integer.parseInt(qu);
if (q2<q1)
        {showMessageDialog(null,"Stock insuffisant");
        }else
{q2=q2-q1;

String req1="select * from product where Nom= '"+p+"' ;"; 
Statement s=c.createStatement();

ResultSet res = s.executeQuery(req1);

while(res.next())
{
String pr = res.getString("prix_v");
int prix_unitaire = parseInt(pr);
int prix_totale=prix_unitaire*q1;
String ptotal=""+prix_totale;

String qun=""+q2;
String req2="update product set Qnt= '"+qun+"' where Nom= '"+p+"' ;";
    int re = s.executeUpdate(req2);
        PrintWriter out = new PrintWriter("C:\\Users\\Acer ASPIRE\\Documents\\NetBeansProjects\\Project\\FACTURE.txt");
        out.println("///////////////////////////////////");
        out.println("        Le produit est : "+p);
        out.println("          La quantité : "+qun);
        out.println("///////////////////////////////////");
out.close();

}

}
    }
}catch (SQLException | ClassNotFoundException e)
{
}       catch (FileNotFoundException ex) {
            Logger.getLogger(vendre.class.getName()).log(Level.SEVERE, null, ex);
        }
 String msg = "               Done !";
javax.swing.JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(vendre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vendre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vendre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vendre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new vendre().setVisible(true);
                vendre v=new vendre();
                v.setSize(593,473);
                v.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
