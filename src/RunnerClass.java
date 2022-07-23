/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.cryptoProject.GUIFrames.BaseFrame;
import java.awt.Font;
import java.io.File;


/**
 *
 * @author Priyansu
 */
public class RunnerClass {
    
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
            java.util.logging.Logger.getLogger(BaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Custom Fonts setting code ">
        /* Set extra custom fonts to be used */
        
        try {
            java.awt.GraphicsEnvironment fontGraphics = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
            java.awt.Font Comfortaa_SemiBold = java.awt.Font.createFont(Font.TRUETYPE_FONT,new File("/Resources/Fonts/Comfortaa-SemiBold.ttf")).deriveFont(16f);       
            fontGraphics.registerFont(Comfortaa_SemiBold);
        } catch (java.io.IOException e) {
        } catch (java.awt.FontFormatException e) {
        } catch (Exception e) {
        }
        
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BaseFrame().setVisible(true);
            }
        });
    }
}
