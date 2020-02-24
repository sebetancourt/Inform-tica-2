package tragamo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
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
public class Juegotra extends javax.swing.JFrame {

    int a,a1,a2,c,cont,cont1,cont2,apues=0;
    int b=100;
    Timer temporizador=new Timer(250, new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {        
            a=(int)(Math.random()*10+1);
                       
            switch(a)
            {
                case 1: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("apple.png")));
                        break;
                case 2: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("milk.png")));
                        break;
                case 3: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("fish.png")));
                        break; 
                case 4: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("cereal.png")));
                        break;
                case 5: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("corn.png")));
                        break;
                case 6: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("orange.png")));
                        break;
                case 7: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("pineapple.png")));
                        break;
                case 8: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("rice.png")));
                        break;
                case 9: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("soy.png")));
                        break;
                case 10: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("watermelon.png")));
                        break;
            }
            cont+=1; 
            if (cont==15)
            {    
                temporizador.stop();
            }
            
        }
        
    });
     Timer temporizador1=new Timer(150, new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {        
            a1=(int)(Math.random()*10+1);
                       
            switch(a1)
            {
                case 1: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("apple.png")));
                        break;
                case 2: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("milk.png")));
                        break;
                case 3: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("fish.png")));
                        break; 
                case 4: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("cereal.png")));
                        break;
                case 5: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("corn.png")));
                        break;
                case 6: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("orange.png")));
                        break;
                case 7: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("pineapple.png")));
                        break;
                case 8: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("rice.png")));
                        break;
                case 9: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("soy.png")));
                        break;
                case 10:lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("watermelon.png")));
                        break;         
            }
            cont1+=1; 
            if (cont1==30)
            {    
                temporizador1.stop();
            }
           
        }
    });
     Timer temporizador2=new Timer(50, new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {        
            a2=(int)(Math.random()*10+1);                      
            switch(a2)
            {
                case 1: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("apple.png")));
                        break;
                case 2: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("milk.png")));
                        break;
                case 3: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("fish.png")));
                        break; 
                case 4: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("cereal.png")));
                        break;
                case 5: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("corn.png")));
                        break;
                case 6: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("orange.png")));
                        break;
                case 7: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("pineapple.png")));
                        break;
                case 8: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("rice.png")));
                        break;
                case 9: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("soy.png")));
                        break;
                case 10:lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("watermelon.png")));
                        break;     
                
                   
            }
            
            cont2+=1;
            lblProgresivo.setText(String.valueOf(b));
            if (Integer.parseInt(lblProgresivo.getText())==0 || Integer.parseInt(lblProgresivo.getText())<apues )
            {
                JOptionPane.showMessageDialog(null,"No tienes suficinte credito");
                System.exit( 0 );
            }
            if (cont2==100)
            {    
                temporizador2.stop();
                
                String c= (String) lblApues.getSelectedItem();
                apues=Integer.parseInt(c);
             if (a==a1 && a==a2 && a1==a2)
             {
                JOptionPane.showMessageDialog(null,"Ganaste");
                b=Integer.parseInt(lblProgresivo.getText())+(apues*2);
                lblProgresivo.setText(String.valueOf(b));
             }
             else if (a==1 && a1==1 && a2==1)
             {
                JOptionPane.showMessageDialog(null,"Ganaste Premio mayor");
                b=Integer.parseInt(lblProgresivo.getText())+(apues*3);
                lblProgresivo.setText(String.valueOf(b));
             }
             else if (a==a1 || a==a2 || a1==a2)
             {
                if (a==2 || a1==2 || a2==2)
                {
                  JOptionPane.showMessageDialog(null,"Ganas Comodín");
                  b=Integer.parseInt(lblProgresivo.getText())+apues;
                  lblProgresivo.setText(String.valueOf(b)); 
                }
                else
                {  
                 JOptionPane.showMessageDialog(null,"Pierdes");
                 b=Integer.parseInt(lblProgresivo.getText())-apues;
                 lblProgresivo.setText(String.valueOf(b));   
                }
             }
             
             else
             {
                 JOptionPane.showMessageDialog(null,"Pierdes");
                 b=Integer.parseInt(lblProgresivo.getText())-apues;
                 lblProgresivo.setText(String.valueOf(b));   
             }
            
            }    
        }
        
    });
    public Juegotra() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING:NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImagen1 = new javax.swing.JLabel();
        lblImagen2 = new javax.swing.JLabel();
        lblImagen3 = new javax.swing.JLabel();
        lblApues = new javax.swing.JComboBox<>();
        lblProgresivo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicio.png"))); // NOI18N

        lblImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicio.png"))); // NOI18N

        lblImagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicio.png"))); // NOI18N

        lblApues.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5 ", "10", "20", "50", "100" }));
        lblApues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblApuesActionPerformed(evt);
            }
        });

        lblProgresivo.setText("100");
        lblProgresivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblProgresivoActionPerformed(evt);
            }
        });

        jButton1.setText("Jugar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pmayor.png"))); // NOI18N
        jLabel1.setText("Premio Mayor");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comodin.png"))); // NOI18N
        jLabel2.setText("Comodín");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(lblImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(170, 170, 170)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblProgresivo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblApues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblImagen3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImagen1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(lblImagen2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblApues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblProgresivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblApuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblApuesActionPerformed

    }//GEN-LAST:event_lblApuesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        temporizador.start();
        temporizador1.start();
        temporizador2.start();
        cont=cont1=cont2=0;
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblProgresivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblProgresivoActionPerformed

       
    }//GEN-LAST:event_lblProgresivoActionPerformed

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
            java.util.logging.Logger.getLogger(Juegotra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juegotra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juegotra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juegotra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juegotra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> lblApues;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblImagen3;
    private javax.swing.JTextField lblProgresivo;
    // End of variables declaration//GEN-END:variables
}
