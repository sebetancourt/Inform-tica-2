package personaje;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian
 */
public class FrmPersonaje extends javax.swing.JFrame implements KeyListener {

    public int filas,columnas;
    int movimiento=20;
    int movimientoc=100;
    public static int o=new Color(255,255,255).getRGB();
    public static int x=new Color(255,45,0).getRGB();
    public static int v=new Color(77,251,10).getRGB();
    public static int n=new Color(251, 152, 10 ).getRGB();
    public static int a=new Color(10, 213, 251  ).getRGB();
    public static int m=new Color(246, 183, 107  ).getRGB();
    public static int l=new Color(0,0,0 ).getRGB();

    
    public FrmPersonaje() {
        
        initComponents();
        
        addKeyListener(this);
        this.getContentPane().setBackground(Color.white);
    }
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode()==68)
        {
            movimiento+=2;
            repaint();
        }
        if(e.getKeyCode()==65)
        {
            movimiento-=2;
            repaint();
        }
        if(e.getKeyCode()==87)
        {
            movimientoc+=2;
            repaint();
        }
        if(e.getKeyCode()==83)
        {
            movimientoc-=2;
            repaint();
        }
    }
    public void paint(Graphics g)
    {      
        
        int [][] derecha=           {{o,o,o,o,o,o,o,o,o,o,o,l,l,l,l,l,l,l,l,l,l,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,l,x,x,x,x,x,x,x,x,x,l,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,l,x,x,x,x,x,x,x,x,x,x,x,l,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,l,x,x,v,v,v,v,v,v,v,v,v,v,l,o,o,o,o,o,o,o},
                                   {o,o,l,o,o,o,o,l,x,x,x,x,x,v,v,v,v,v,v,v,v,l,o,o,o,o,o,o,o},
                                   {o,l,n,l,o,o,o,l,x,x,x,x,x,x,x,v,v,v,v,v,l,o,o,o,o,o,o,o,o},
                                   {l,n,n,n,l,o,o,l,x,x,x,x,x,x,x,x,v,v,v,l,o,o,o,o,o,o,o,o,o},
                                   {l,n,n,n,n,l,o,o,l,x,x,x,x,x,x,x,x,x,x,l,l,l,l,l,l,l,l,l,o},
                                   {l,n,n,n,n,n,l,o,o,l,x,x,x,x,x,x,x,l,l,n,n,n,n,l,a,a,a,a,l,},
                                   {o,l,n,n,l,n,n,l,o,l,l,l,l,l,l,l,l,n,n,n,n,n,n,l,a,a,a,a,l},
                                   {o,l,n,l,n,n,n,n,l,n,n,n,n,n,n,n,n,n,n,n,n,n,n,l,a,a,a,a,l},
                                   {o,o,l,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,l,a,a,a,a,l},
                                   {o,o,l,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,l,l,l,l,l,o},
                                   {o,o,o,l,l,n,n,n,n,n,m,m,m,m,m,m,m,m,l,l,l,l,l,o,o,o,o,o,o},
                                   {o,o,o,o,l,n,n,n,n,n,n,m,m,m,m,m,m,m,m,l,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,l,n,n,n,n,m,m,m,m,m,m,m,m,m,l,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,l,n,n,n,m,m,m,m,m,m,m,m,n,n,n,l,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,l,n,n,m,m,m,m,m,m,m,m,m,m,n,n,l,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,l,n,n,n,n,m,m,m,m,l,l,m,m,m,n,n,n,l,o,o,o,o,o,o,o},
                                   {o,o,o,o,l,n,n,n,n,n,n,n,l,o,l,m,m,n,n,n,n,n,l,o,o,o,o,o,o},
                                   {o,o,o,o,l,n,n,n,n,n,l,l,o,o,o,l,n,n,n,n,n,n,l,o,o,o,o,o,o},
                                   {o,o,o,o,l,n,n,n,n,l,o,o,o,o,o,l,n,n,n,n,l,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,l,n,n,n,n,l,o,o,o,o,o,o,l,n,n,n,n,l,o,o,o,o,o,o,o},
                                   {o,o,o,o,l,l,n,n,n,l,o,o,o,o,o,o,l,n,n,n,n,n,l,o,o,o,o,o,o},
                                   {o,o,o,o,l,l,n,n,n,n,l,o,o,o,o,l,n,n,n,n,n,n,l,l,o,o,o,o,o},
                                   {o,o,o,o,o,l,n,n,n,n,n,l,o,o,o,l,n,n,n,n,n,n,n,n,l,o,o,o,o},
                                   {o,o,o,o,o,o,l,n,n,n,n,l,o,o,o,l,n,n,n,n,n,n,n,n,l,o,o,o,o},
                                   {o,o,o,o,o,o,l,n,n,n,n,l,o,o,o,l,l,l,l,l,l,l,l,l,o,o,o,o,o},
                                   {o,o,o,o,o,o,l,m,n,n,m,l,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,l,m,m,m,m,l,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,l,m,m,l,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,l,l,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o}};
        super.paint(g);
        
        
        for(filas=0;filas<32*3;filas++)
        {
            for(columnas=0;columnas<29*3;columnas++)
            {
                g.setColor(new Color(derecha[filas/3][columnas/3]));
                g.drawRect(movimiento+columnas,movimientoc+filas,1,1);
                
            }
        }
        
        
        int [][] izquierda=        {{o,o,o,o,o,o,o,o,o,o,o,l,l,l,l,l,l,l,l,l,l,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,l,x,x,x,x,x,x,x,x,x,l,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,l,x,x,x,x,x,x,x,x,x,x,x,l,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,l,x,x,v,v,v,v,v,v,v,v,v,v,l,o,o,o,o,o,o,o},
                                   {o,o,l,o,o,o,o,l,x,x,x,x,x,v,v,v,v,v,v,v,v,l,o,o,o,o,o,o,o},
                                   {o,l,n,l,o,o,o,l,x,x,x,x,x,x,x,v,v,v,v,v,l,o,o,o,o,o,o,o,o},
                                   {l,n,n,n,l,o,o,l,x,x,x,x,x,x,x,x,v,v,v,l,o,o,o,o,o,o,o,o,o},
                                   {l,n,n,n,n,l,o,o,l,x,x,x,x,x,x,x,x,x,x,l,l,l,l,l,l,l,l,l,o},
                                   {l,n,n,n,n,n,l,o,o,l,x,x,x,x,x,x,x,l,l,n,n,n,n,l,a,a,a,a,l,},
                                   {o,l,n,n,l,n,n,l,o,l,l,l,l,l,l,l,l,n,n,n,n,n,n,l,a,a,a,a,l},
                                   {o,l,n,l,n,n,n,n,l,n,n,n,n,n,n,n,n,n,n,n,n,n,n,l,a,a,a,a,l},
                                   {o,o,l,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,l,a,a,a,a,l},
                                   {o,o,l,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,l,l,l,l,l,o},
                                   {o,o,o,l,l,n,n,n,n,n,m,m,m,m,m,m,m,m,l,l,l,l,l,o,o,o,o,o,o},
                                   {o,o,o,o,l,n,n,n,n,n,n,m,m,m,m,m,m,m,m,l,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,l,n,n,n,n,m,m,m,m,m,m,m,m,m,l,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,l,n,n,n,m,m,m,m,m,m,m,m,n,n,n,l,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,l,n,n,m,m,m,m,m,m,m,m,m,m,n,n,l,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,l,n,n,n,n,m,m,m,m,l,l,m,m,m,n,n,n,l,o,o,o,o,o,o,o},
                                   {o,o,o,o,l,n,n,n,n,n,n,n,l,o,l,m,m,n,n,n,n,n,l,o,o,o,o,o,o},
                                   {o,o,o,o,l,n,n,n,n,n,l,l,o,o,o,l,n,n,n,n,n,n,l,o,o,o,o,o,o},
                                   {o,o,o,o,l,n,n,n,n,l,o,o,o,o,o,l,n,n,n,n,l,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,l,n,n,n,n,l,o,o,o,o,o,o,l,n,n,n,n,l,o,o,o,o,o,o,o},
                                   {o,o,o,o,l,l,n,n,n,l,o,o,o,o,o,o,l,n,n,n,n,n,l,o,o,o,o,o,o},
                                   {o,o,o,o,l,l,n,n,n,n,l,o,o,o,o,l,n,n,n,n,n,n,l,l,o,o,o,o,o},
                                   {o,o,o,o,o,l,n,n,n,n,n,l,o,o,o,l,n,n,n,n,n,n,n,n,l,o,o,o,o},
                                   {o,o,o,o,o,o,l,n,n,n,n,l,o,o,o,l,n,n,n,n,n,n,n,n,l,o,o,o,o},
                                   {o,o,o,o,o,o,l,n,n,n,n,l,o,o,o,l,l,l,l,l,l,l,l,l,o,o,o,o,o},
                                   {o,o,o,o,o,o,l,m,n,n,m,l,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,l,m,m,m,m,l,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,l,m,m,l,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,l,l,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o}};
        super.paint(g);
                 
        for(filas=0;filas<32*3;filas++)
        {
            for(columnas=0;columnas<29*3;columnas++)
            {
                g.setColor(new Color(izquierda[filas/3][columnas/3]));
                g.drawRect(1-(movimiento+columnas),movimientoc+filas,1,1);
               
            }
        }
        
        int [][] parado=           {{o,o,o,o,o,o,o,l,l,l,l,l,l,l,l,l,l,l,l,l,l,l,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,l,x,x,x,x,x,x,x,x,x,x,x,x,x,x,l,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,l,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,l,o,o,o,o,o},
                                   {o,o,o,o,o,o,l,x,v,v,v,v,v,v,v,v,v,v,v,v,v,v,x,l,o,o,o,o,o},
                                   {o,o,o,o,l,x,x,x,x,v,v,v,v,v,v,v,v,v,v,v,v,x,x,x,x,l,o,o,o},
                                   {o,o,o,o,o,l,x,x,x,x,x,x,v,v,v,v,v,v,v,x,x,x,x,x,l,o,o,o,o},
                                   {o,o,o,o,o,l,l,l,x,x,x,x,x,x,v,v,v,x,x,x,x,x,l,o,o,o,o,o,o},
                                   {o,o,o,l,n,n,n,n,n,x,x,x,x,x,x,v,x,x,x,x,n,n,n,n,n,l,o,o,o},
                                   {o,o,l,n,n,n,n,n,n,n,x,x,x,x,x,x,x,x,x,x,x,n,n,n,n,n,n,l,o,},
                                   {o,l,n,n,n,n,n,n,n,n,n,n,n,x,x,x,x,n,n,n,n,n,n,n,n,n,n,n,l},
                                   {o,o,l,n,n,n,n,n,n,n,x,x,x,x,x,x,x,x,x,x,x,n,n,n,n,n,l,o,o},
                                   {o,o,o,o,l,n,n,n,n,x,x,v,v,v,x,x,x,v,v,v,x,x,n,n,n,n,n,l,o},
                                   {o,o,o,o,o,l,n,n,n,n,n,x,x,x,v,v,v,x,x,n,n,n,n,n,n,n,l,o,o},
                                   {o,o,o,o,l,n,a,a,a,a,a,l,x,x,x,x,x,x,x,x,x,n,n,l,o,o,o,o,o},
                                   {o,o,o,o,l,n,n,a,a,a,l,x,x,v,v,v,v,v,v,x,x,x,x,n,n,l,o,o,o},
                                   {o,o,o,o,o,l,n,a,a,a,l,v,v,v,x,x,x,x,v,v,v,x,x,x,n,l,o,o,o},
                                   {o,o,o,o,o,l,n,a,a,l,n,n,n,n,n,n,n,n,n,n,n,n,n,l,o,o,o,o,o},
                                   {o,o,o,o,o,l,n,n,a,a,l,m,m,m,m,m,m,m,m,m,m,m,n,n,l,o,o,o,o},
                                   {o,o,o,o,l,n,n,a,a,a,a,l,m,m,m,m,m,m,m,m,m,n,n,l,o,o,o,o,o},
                                   {o,o,o,o,o,l,l,l,a,a,a,l,m,m,m,m,m,m,m,n,n,n,l,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,l,l,a,a,l,m,m,m,m,m,m,m,n,n,n,l,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,l,n,l,a,a,l,m,m,m,m,m,m,n,n,l,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,l,n,m,l,l,m,n,n,n,m,m,m,m,m,n,l,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,l,n,n,m,m,m,m,n,n,n,n,m,m,m,m,n,n,l,o,o,o,o,o,o},
                                   {o,o,o,o,l,l,n,n,m,m,n,n,l,l,l,n,n,m,m,m,n,n,l,o,o,o,o,o,o},
                                   {o,o,o,l,n,n,n,m,m,m,n,n,l,o,l,n,n,m,m,m,n,n,n,l,o,o,o,o,o},
                                   {o,o,l,n,n,n,n,m,m,n,n,l,o,o,o,l,n,n,m,m,n,n,n,n,l,o,o,o,o},
                                   {o,o,l,n,n,n,m,m,m,m,n,l,o,o,o,l,n,m,m,m,m,n,n,n,l,o,o,o,o},
                                   {o,l,n,m,m,m,m,m,m,n,n,l,o,o,o,l,n,n,m,m,m,m,m,m,n,l,o,o,o},
                                   {o,l,n,m,m,m,m,m,n,l,o,o,o,o,o,o,o,l,n,m,m,m,m,m,n,l,o,o,o},
                                   {o,o,l,n,n,n,n,n,n,l,o,o,o,o,o,o,o,l,n,n,n,n,n,n,l,o,o,o,o},
                                   {o,o,o,l,l,l,l,l,l,o,o,o,o,o,o,o,o,o,l,l,l,l,l,l,o,o,o,o,o}};
        super.paint(g);
        
        for(filas=0;filas<32*3;filas++)
        {
            for(columnas=0;columnas<29*3;columnas++)
            {
                g.setColor(new Color(parado[filas/3][columnas/3]));
                if(movimiento<=20)
                {
                    g.drawRect(movimiento+columnas,100+filas,1,1);
                }
                else 
                {
                    g.drawRect(movimiento+columnas,100+filas,1,1);
                }
                
            }
        }
        }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPersonaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
