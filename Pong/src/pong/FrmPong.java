package pong;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;


public class FrmPong extends javax.swing.JFrame implements KeyListener {
    
    int pelotaX= 340 , pelotaY=200;
    int signo=1;
    int paleta1=185;
    int paleta2=185;
    int puntoj1,puntoj2=0;

    
    /**
     * Creates new form FrmPong
     */
    public FrmPong() {
        initComponents();
        addKeyListener(this);
    }
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
    
    public void keyPressed(KeyEvent e)
    {
       if(e.getKeyCode()==87)
       {
           paleta1-=10;
       }
       if(e.getKeyCode()==83)
       {
           paleta1+=10;
       }
       if(e.getKeyCode()==38)
       {
           paleta2-=10;
       }
       if(e.getKeyCode()==40)
       {
           paleta2+=10;
       }
       
    }

    public void paint(Graphics g)
        {
            super.paint(g);
            g.drawLine(350, 0, 350, 400);
            g.drawLine(20, 0, 20, 400);
            g.drawLine(680, 0, 680, 400);
            g.fillOval(pelotaX, pelotaY, 20, 20);
            g.fillRect(0, paleta1, 20, 60);
            g.fillRect(680, paleta2, 20, 60);
            if (puntoj1==1)
            {
                g.setColor(Color.MAGENTA);
            g.setFont(new Font("Arial",Font.BOLD,20));
            g.drawString("Punto para el j1 ", 150, 150);
            puntoj1=0;
            }
            if (puntoj2==1)
            {
                g.setColor(Color.MAGENTA);
            g.setFont(new Font("Arial",Font.BOLD,20));
            g.drawString("Punto para el j2 ", 450, 150);
            puntoj2=0;
            }
            repaint();
            
        }
    
    Timer temporizador = new Timer(5,new ActionListener()
    {
            public void actionPerformed(ActionEvent e)
            {
                //Pelota mov inicial
                pelotaX+=signo*2;
                if (pelotaX <=0 || pelotaX+20>=700)
                {
                    signo*=-1;
                }
                pelotaY+=signo*1;
                if(pelotaY+20>=400 || pelotaY<=30)
                {
                   signo*=-1;
                }
                //Paletas
                if(paleta1<=1 )
                {
                    paleta1=400;  
                }
                else if(paleta1>=399)
                {
                    paleta1=0;                   
                }
                if(paleta2<=1 )
                {
                    paleta2=400;
                    
                }
                else if(paleta2>=399)
                {
                    paleta2=0;                   
                }
                //juego j2
                if (pelotaX>=690 && pelotaY<=paleta2+20)
                {    
                    pelotaX-=signo*2;
                    if (pelotaX <=0 || pelotaX >=695)
                    {
                       signo*=-1;
                    }
                    pelotaY-=signo*2;
                    if (pelotaY <=30 || pelotaY >=380)
                    {
                       signo*=-1;
                    }                           
                }
                else if (pelotaX>=690 && pelotaY<=(paleta2+20)+20)
                {
                    pelotaX-=signo*3;
                    if (pelotaX <=0 || pelotaX >=695)
                    {
                       signo*=-1;
                    }
                }
                else if (pelotaX>=690 && pelotaY<=(paleta2+40)+20)
                {
                    pelotaX-=signo*2;
                    if (pelotaX <=0 || pelotaX >=695)
                    {
                       signo*=-1;
                    }
                    pelotaY+=signo*2;
                    if (pelotaY <=30 || pelotaY >=380)
                    {
                       signo*=-1;
                    }
                }
                else if(pelotaX>=680 && pelotaY<paleta2 || pelotaY>paleta2+60)
                {
                    puntoj1=1;   
                }
//                //juego j1
                if (pelotaX<=10 && pelotaY<=paleta1+20)
                {    
                    pelotaX+=signo*2;
                    if (pelotaX >=695 || pelotaX <=10)
                    {
                       signo*=-1;
                    }
                    pelotaY-=signo*2;
                    if (pelotaY <=30 || pelotaY >=380)
                    {
                       signo*=-1;
                    }                           
                }
                else if (pelotaX<=10 && pelotaY<=(paleta1+20)+20)
                {
                    pelotaX+=signo*3;
                    if (pelotaX >=695 || pelotaX <=10)
                    {
                       signo*=-1;
                    }
                }
                else if (pelotaX<=10 && pelotaY<=(paleta1+40)+20)
                {
                    pelotaX+=signo*2;
                    if (pelotaX >=695 || pelotaX <=10)
                    {
                       signo*=-1;
                    }
                    pelotaY+=signo*2;
                    if (pelotaY >=380 || pelotaY <=30)
                    {
                       signo*=-1;
                    }
                }
                else if(pelotaX<=10 && pelotaY<paleta1 || pelotaY>paleta1+60)
                {
                    puntoj2=1;
                    
                }
            }
            
    });
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    temporizador.start(); 
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    if(puntoj1==1 || puntoj2==1)
    {
        temporizador.stop();
        temporizador.restart();
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(FrmPong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
