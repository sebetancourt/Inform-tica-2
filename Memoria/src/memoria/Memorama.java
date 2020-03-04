package memoria;

import javax.swing.ImageIcon;


public class Memorama extends javax.swing.JFrame {

  int [] cartas= new int [17];
 
  int aleatorio,contador,vuelta,cambio,j1,j2,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,posicion1,posicion2,exit;
  int posicion;
  
    public Memorama() {
        initComponents();
        
        cartas[1]=(int)(Math.random()*8+1);
        while(posicion <=16){
            aleatorio =(int)(Math.random()*8+1);
            for(int anterior=1;anterior<=posicion;anterior++)
            {
                    if(cartas[anterior]==aleatorio){
                        contador++;
                    }
            }
                if(contador<2){
                    cartas[posicion]=aleatorio;
                    posicion++;
                }
                contador=0;
        }
        
        for(int posicion=1;posicion<=16;posicion++){
            System.out.printf("%d  ",cartas[posicion]);
        }
        System.out.print(cambio);       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/inicio.png"))); // NOI18N
        btn1.setText("jButton1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn17.setText("Comenzar de Nuevo");
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/inicio.png"))); // NOI18N
        btn2.setText("jButton1");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/inicio.png"))); // NOI18N
        btn4.setText("jButton1");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/inicio.png"))); // NOI18N
        btn5.setText("jButton1");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/inicio.png"))); // NOI18N
        btn3.setText("jButton1");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/inicio.png"))); // NOI18N
        btn7.setText("jButton1");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/inicio.png"))); // NOI18N
        btn8.setText("jButton1");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/inicio.png"))); // NOI18N
        btn6.setText("jButton1");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/inicio.png"))); // NOI18N
        btn15.setText("jButton1");
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btn16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/inicio.png"))); // NOI18N
        btn16.setText("jButton1");
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        btn14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/inicio.png"))); // NOI18N
        btn14.setText("jButton1");
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        btn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/inicio.png"))); // NOI18N
        btn10.setText("jButton1");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/inicio.png"))); // NOI18N
        btn12.setText("jButton1");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/inicio.png"))); // NOI18N
        btn9.setText("jButton1");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/inicio.png"))); // NOI18N
        btn13.setText("jButton1");
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/inicio.png"))); // NOI18N
        btn11.setText("jButton1");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(btn17)))
                .addGap(0, 62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

       
    }//GEN-LAST:event_formWindowActivated

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
    a=cartas[1];
   //btn1.setEnabled(false);
    cambio++;
    btn1.setText(String.valueOf(a));
    switch(a)
    {
    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("apple.png")));
                    break;
                    case 2: btn1.setIcon(new ImageIcon(this.getClass().getResource("cereal.png")));
                    break;
                    case 3: btn1.setIcon(new ImageIcon(this.getClass().getResource("corn.png")));
                    break;
                    case 4: btn1.setIcon(new ImageIcon(this.getClass().getResource("fish.png")));
                    break;
                    case 5: btn1.setIcon(new ImageIcon(this.getClass().getResource("milk.png")));
                    break;
                    case 6: btn1.setIcon(new ImageIcon(this.getClass().getResource("orange.png")));
                    break;
                    case 7: btn1.setIcon(new ImageIcon(this.getClass().getResource("pineapple.png")));
                    break;
                    case 8: btn1.setIcon(new ImageIcon(this.getClass().getResource("watermelon.png")));
                    break;
    }
    if (cambio==1)
    {
        j1=cartas[1];
        posicion1=1;
        
    }
    else if (cambio==2)
    {
        j2=cartas[1];  
        posicion2=1;
        if(posicion1==1)
        {
            cambio=1;
        }
    }
    else if(cambio==3 && posicion1!=1 && posicion2!=1)
    {
        
        if(j1!=j2)
        {
            switch(posicion1)
            {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("iicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
                switch(posicion2)
                {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
            }
        else  if (j1==j2)
        {
            exit++;
            switch(posicion1)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            switch(posicion2)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
        }
        cambio=1;
        j1=cartas[1];
        posicion1=1;
    }
    else
     {
             cambio=2;
             }
    if(exit==7)
    {
        System.exit(0);
    }System.out.print(exit);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
    b=cartas[2];
    //btn2.setEnabled(false);
    vuelta++;
    cambio++;
    btn2.setText(String.valueOf(b));
    switch(b)
    {
    case 1: btn2.setIcon(new ImageIcon(this.getClass().getResource("apple.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("cereal.png")));
                    break;
                    case 3: btn2.setIcon(new ImageIcon(this.getClass().getResource("corn.png")));
                    break;
                    case 4: btn2.setIcon(new ImageIcon(this.getClass().getResource("fish.png")));
                    break;
                    case 5: btn2.setIcon(new ImageIcon(this.getClass().getResource("milk.png")));
                    break;
                    case 6: btn2.setIcon(new ImageIcon(this.getClass().getResource("orange.png")));
                    break;
                    case 7: btn2.setIcon(new ImageIcon(this.getClass().getResource("pineapple.png")));
                    break;
                    case 8: btn2.setIcon(new ImageIcon(this.getClass().getResource("watermelon.png")));
                    break;
    }
    if(cambio==1)
    {
        j1=cartas[2];
        posicion1=2;
        
    }
    else if (cambio==2)
    {
        j2=cartas[2];   
        posicion2=2;
        if(posicion1==2)
        {
            cambio=1;
        }
    }
    else if(cambio==3 && posicion1!=2 && posicion2!=2)
    {
        
        if(j1!=j2)
        {
            switch(posicion1)
            {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
                switch(posicion2)
                {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
            }
        else  if (j1==j2)
        {
            exit++;
            switch(posicion1)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            switch(posicion2)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
        }
        
        cambio=1;
        j1=cartas[2];
        posicion1=2;
    }
    else
     {
             cambio=2;
             }
    if(exit==7)
    {
        System.exit(0);
    }System.out.print(exit);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
    c=cartas[3];
    //btn1.setEnabled(false);
    vuelta++;
    cambio++;
    btn3.setText(String.valueOf(c));
    switch(c)
    {
    case 1: btn3.setIcon(new ImageIcon(this.getClass().getResource("apple.png")));
                    break;
                    case 2: btn3.setIcon(new ImageIcon(this.getClass().getResource("cereal.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("corn.png")));
                    break;
                    case 4: btn3.setIcon(new ImageIcon(this.getClass().getResource("fish.png")));
                    break;
                    case 5: btn3.setIcon(new ImageIcon(this.getClass().getResource("milk.png")));
                    break;
                    case 6: btn3.setIcon(new ImageIcon(this.getClass().getResource("orange.png")));
                    break;
                    case 7: btn3.setIcon(new ImageIcon(this.getClass().getResource("pineapple.png")));
                    break;
                    case 8: btn3.setIcon(new ImageIcon(this.getClass().getResource("watermelon.png")));
                    break;
    }
    
   if (cambio==1)
    {
        j1=cartas[3];
        posicion1=3;
        
    }
    else if (cambio==2)
    {
        j2=cartas[3];   
        posicion2=3;
        if(posicion1==3)
        {
            cambio=1;
        }
    }
    else if(cambio==3 && posicion1!=3 && posicion2!=3)
    {
        
        if(j1!=j2)
        {
            switch(posicion1)
            {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
                switch(posicion2)
                {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
            }
        else  if (j1==j2)
        {
            exit++;
            switch(posicion1)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            switch(posicion2)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            
        }
        cambio=1;
        j1=cartas[3];
        posicion1=3;
    }
   else
     {
             cambio=2;
             }
    if(exit==7)
    {
        System.exit(0);
    }System.out.print(exit);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
     d=cartas[4];
     cambio++;
    switch(d)
    {
    case 1: btn4.setIcon(new ImageIcon(this.getClass().getResource("apple.png")));
                    break;
                    case 2: btn4.setIcon(new ImageIcon(this.getClass().getResource("cereal.png")));
                    break;
                    case 3: btn4.setIcon(new ImageIcon(this.getClass().getResource("corn.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("fish.png")));
                    break;
                    case 5: btn4.setIcon(new ImageIcon(this.getClass().getResource("milk.png")));
                    break;
                    case 6: btn4.setIcon(new ImageIcon(this.getClass().getResource("orange.png")));
                    break;
                    case 7: btn4.setIcon(new ImageIcon(this.getClass().getResource("pineapple.png")));
                    break;
                     case 8: btn4.setIcon(new ImageIcon(this.getClass().getResource("watermelon.png")));
                    break;
    }
     if (cambio==1)
    {
        j1=cartas[4];
        posicion1=4;
        
    }
    else if (cambio==2)
    {
        j2=cartas[4];   
        posicion2=4;
        if(posicion1==4)
        {
            cambio=1;
        }
    }
    else if(cambio==3 && posicion1!=4 && posicion2!=4)
    {
        
        if(j1!=j2)
        {
            switch(posicion1)
            {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
                switch(posicion2)
                {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
            }
        else  if (j1==j2)
        {
            exit++;
            switch(posicion1)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            switch(posicion2)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            
        }
        cambio=1;
        j1=cartas[4];
        posicion1=4;
    }
     else
     {
             cambio=2;
             }
    if(exit==7)
    {
        System.exit(0);
    }System.out.print(exit);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        e=cartas[5];
        cambio++;
    switch(e)
    {
    case 1: btn5.setIcon(new ImageIcon(this.getClass().getResource("apple.png")));
                    break;
                    case 2: btn5.setIcon(new ImageIcon(this.getClass().getResource("cereal.png")));
                    break;
                    case 3: btn5.setIcon(new ImageIcon(this.getClass().getResource("corn.png")));
                    break;
                    case 4: btn5.setIcon(new ImageIcon(this.getClass().getResource("fish.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("milk.png")));
                    break;
                    case 6: btn5.setIcon(new ImageIcon(this.getClass().getResource("orange.png")));
                    break;
                    case 7: btn5.setIcon(new ImageIcon(this.getClass().getResource("pineapple.png")));
                    break;
                    case 8: btn5.setIcon(new ImageIcon(this.getClass().getResource("watermelon.png")));
                    break;
    }
     if (cambio==1)
    {
        j1=cartas[5];
        posicion1=5;
        
    }
    else if (cambio==2)
    {
        j2=cartas[5];   
        posicion2=5;
        if(posicion1==5)
        {
            cambio=1;
        }
    }
    else if(cambio==3 && posicion1!=5 && posicion2!=5)
    {
        
        if(j1!=j2)
        {
            switch(posicion1)
            {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
                switch(posicion2)
                {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
            }
        else  if (j1==j2)
        {
            exit++;
            switch(posicion1)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            switch(posicion2)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            
        }
        cambio=1;
        j1=cartas[5];
        posicion1=5;
    }
     else
     {
             cambio=2;
             }
    if(exit==7)
    {
        System.exit(0);
    }System.out.print(exit);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
      f=cartas[6];
      cambio++;
    switch(f)
    {
    case 1: btn6.setIcon(new ImageIcon(this.getClass().getResource("apple.png")));
                    break;
                    case 2: btn6.setIcon(new ImageIcon(this.getClass().getResource("cereal.png")));
                    break;
                    case 3: btn6.setIcon(new ImageIcon(this.getClass().getResource("corn.png")));
                    break;
                    case 4: btn6.setIcon(new ImageIcon(this.getClass().getResource("fish.png")));
                    break;
                    case 5: btn6.setIcon(new ImageIcon(this.getClass().getResource("milk.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("orange.png")));
                    break;
                    case 7: btn6.setIcon(new ImageIcon(this.getClass().getResource("pineapple.png")));
                    break;
                    case 8: btn6.setIcon(new ImageIcon(this.getClass().getResource("watermelon.png")));
                    break;
    }
     if (cambio==1)
    {
        j1=cartas[6];
        posicion1=6;
        
    }
    else if (cambio==2)
    {
        j2=cartas[6];   
        posicion2=6;
        if(posicion1==6)
        {
            cambio=1;
        }
    }
    else if(cambio==3 && posicion1!=6 && posicion2!=6)
    {
        
        if(j1!=j2)
        {
            switch(posicion1)
            {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
                switch(posicion2)
                {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
            }
        else  if (j1==j2)
        {
            exit++;
            switch(posicion1)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            switch(posicion2)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            
        }
        cambio=1;
        j1=cartas[6];
        posicion1=6;
    }
     else
     {
             cambio=2;
             }
    if(exit==7)
    {
        System.exit(0);
    }System.out.print(exit);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        g=cartas[7];
        cambio++;
    switch(g)
    {
    case 1: btn7.setIcon(new ImageIcon(this.getClass().getResource("apple.png")));
                    break;
                    case 2: btn7.setIcon(new ImageIcon(this.getClass().getResource("cereal.png")));
                    break;
                    case 3: btn7.setIcon(new ImageIcon(this.getClass().getResource("corn.png")));
                    break;
                    case 4: btn7.setIcon(new ImageIcon(this.getClass().getResource("fish.png")));
                    break;
                    case 5: btn7.setIcon(new ImageIcon(this.getClass().getResource("milk.png")));
                    break;
                    case 6: btn7.setIcon(new ImageIcon(this.getClass().getResource("orange.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("pineapple.png")));
                    break;
                    case 8: btn7.setIcon(new ImageIcon(this.getClass().getResource("watermelon.png")));
                    break;
    }
     if (cambio==1)
    {
        j1=cartas[7];
        posicion1=7;
        
    }
    else if (cambio==2)
    {
        j2=cartas[7];   
        posicion2=7;
        if(posicion1==7)
        {
            cambio=1;
        }
    }
    else if(cambio==3 && posicion1!=7 && posicion2!=7)
    {
        
        if(j1!=j2)
        {
            switch(posicion1)
            {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
                switch(posicion2)
                {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
            }
        else  if (j1==j2)
        {
            exit++;
            switch(posicion1)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            switch(posicion2)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            
        }
        cambio=1;
        j1=cartas[7];
        posicion1=7;
    }
     else
     {
             cambio=2;
             }
    if(exit==7)
     {
         System.exit(0);
     }
    System.out.print(exit);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
         h=cartas[8];
         cambio++;
    switch(h)
    {
    case 1: btn8.setIcon(new ImageIcon(this.getClass().getResource("apple.png")));
                    break;
                    case 2: btn8.setIcon(new ImageIcon(this.getClass().getResource("cereal.png")));
                    break;
                    case 3: btn8.setIcon(new ImageIcon(this.getClass().getResource("corn.png")));
                    break;
                    case 4: btn8.setIcon(new ImageIcon(this.getClass().getResource("fish.png")));
                    break;
                    case 5: btn8.setIcon(new ImageIcon(this.getClass().getResource("milk.png")));
                    break;
                    case 6: btn8.setIcon(new ImageIcon(this.getClass().getResource("orange.png")));
                    break;
                    case 7: btn8.setIcon(new ImageIcon(this.getClass().getResource("pineapple.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("watermelon.png")));
                    break;
    }
     if (cambio==1)
    {
        j1=cartas[8];
        posicion1=8;
        
    }
    else if (cambio==2)
    {
        j2=cartas[8];   
        posicion2=8;
        if(posicion1==8)
        {
            cambio=1;
        }
    }
    else if(cambio==3 && posicion1!=8 && posicion2!=8)
    {
        
        if(j1!=j2)
        {
            switch(posicion1)
            {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
                switch(posicion2)
                {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
            }
        else  if (j1==j2)
        {
            exit++;
            switch(posicion1)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            switch(posicion2)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            
        }
        cambio=1;
        j1=cartas[8];
        posicion1=8;
    }
     else
     {
             cambio=2;
             }
    if(exit==7)
     {
         System.exit(0);
     }
    System.out.print(exit);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
      i=cartas[9];
      cambio++;
    switch(i)
    {
    case 1: btn9.setIcon(new ImageIcon(this.getClass().getResource("apple.png")));
                    break;
                    case 2: btn9.setIcon(new ImageIcon(this.getClass().getResource("cereal.png")));
                    break;
                    case 3: btn9.setIcon(new ImageIcon(this.getClass().getResource("corn.png")));
                    break;
                    case 4: btn9.setIcon(new ImageIcon(this.getClass().getResource("fish.png")));
                    break;
                    case 5: btn9.setIcon(new ImageIcon(this.getClass().getResource("milk.png")));
                    break;
                    case 6: btn9.setIcon(new ImageIcon(this.getClass().getResource("orange.png")));
                    break;
                    case 7: btn9.setIcon(new ImageIcon(this.getClass().getResource("pineapple.png")));
                    break;
                    case 8: btn9.setIcon(new ImageIcon(this.getClass().getResource("watermelon.png")));
                    break;
    }
     if (cambio==1)
    {
        j1=cartas[9];
        posicion1=9;
        
    }
    else if (cambio==2)
    {
        j2=cartas[9];   
        posicion2=9;
        if(posicion1==9)
        {
            cambio=1;
        }
    }
    else if(cambio==3 && posicion1!=9 && posicion2!=9)
    {
        
        if(j1!=j2)
        {
            switch(posicion1)
            {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
                switch(posicion2)
                {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
            }
        else  if (j1==j2)
        {
            exit++;
            switch(posicion1)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            switch(posicion2)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            
        }
        cambio=1;
        j1=cartas[9];
        posicion1=9;
    }
     else
     {
             cambio=2;
             }
    if(exit==7)
     {
         System.exit(0);
     }
    System.out.print(exit);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
    j=cartas[10];
    cambio++;
    switch(j)
    {
    case 1: btn10.setIcon(new ImageIcon(this.getClass().getResource("apple.png")));
                    break;
                    case 2: btn10.setIcon(new ImageIcon(this.getClass().getResource("cereal.png")));
                    break;
                    case 3: btn10.setIcon(new ImageIcon(this.getClass().getResource("corn.png")));
                    break;
                    case 4: btn10.setIcon(new ImageIcon(this.getClass().getResource("fish.png")));
                    break;
                    case 5: btn10.setIcon(new ImageIcon(this.getClass().getResource("milk.png")));
                    break;
                    case 6: btn10.setIcon(new ImageIcon(this.getClass().getResource("orange.png")));
                    break;
                    case 7: btn10.setIcon(new ImageIcon(this.getClass().getResource("pineapple.png")));
                    break;
                    case 8: btn10.setIcon(new ImageIcon(this.getClass().getResource("watermelon.png")));
                    break;
    }
     if (cambio==1)
    {
        j1=cartas[10];
        posicion1=10;
        
    }
    else if (cambio==2)
    {
        j2=cartas[10];   
        posicion2=10;
        if(posicion1==10)
        {
            cambio=1;
        }
    }
    else if(cambio==3 && posicion1!=10 && posicion2!=10)
    {
        
        if(j1!=j2)
        {
            switch(posicion1)
            {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
                switch(posicion2)
                {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
            }
        else  if (j1==j2)
        {
            exit++;
            switch(posicion1)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            switch(posicion2)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            
        }
        cambio=1;
        j1=cartas[10];
        posicion1=10;
    }
     else
    {
        cambio=2;
    }
    if(exit==7)
     {
         System.exit(0);
     }
    System.out.print(exit);
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
       k=cartas[11];
       cambio++;
    switch(k)
    {
    case 1: btn11.setIcon(new ImageIcon(this.getClass().getResource("apple.png")));
                    break;
                    case 2: btn11.setIcon(new ImageIcon(this.getClass().getResource("cereal.png")));
                    break;
                    case 3: btn11.setIcon(new ImageIcon(this.getClass().getResource("corn.png")));
                    break;
                    case 4: btn11.setIcon(new ImageIcon(this.getClass().getResource("fish.png")));
                    break;
                    case 5: btn11.setIcon(new ImageIcon(this.getClass().getResource("milk.png")));
                    break;
                    case 6: btn11.setIcon(new ImageIcon(this.getClass().getResource("orange.png")));
                    break;
                    case 7: btn11.setIcon(new ImageIcon(this.getClass().getResource("pineapple.png")));
                    break;
                    case 8: btn11.setIcon(new ImageIcon(this.getClass().getResource("watermelon.png")));
                    break;
    }
     if (cambio==1)
    {
        j1=cartas[11];
        posicion1=11;
        
    }
    else if (cambio==2)
    {
        j2=cartas[11];   
        posicion2=11;
        if(posicion1==11)
        {
            cambio=1;
        }
    }
    else if(cambio==3 && posicion1!=11 && posicion2!=11)
    {
        
        if(j1!=j2)
        {
            switch(posicion1)
            {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
                switch(posicion2)
                {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
            }
        else  if (j1==j2)
        {
            exit++;
            switch(posicion1)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            switch(posicion2)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            
        }
        cambio=1;
        j1=cartas[11];
        posicion1=11;
    }
     else
    {
        cambio=2;
    }
    if(exit==7)
     {
         System.exit(0);
     }
    System.out.print(exit);
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
         l=cartas[12];
         cambio++;
    switch(l)
    {
    case 1: btn12.setIcon(new ImageIcon(this.getClass().getResource("apple.png")));
                    break;
                    case 2: btn12.setIcon(new ImageIcon(this.getClass().getResource("cereal.png")));
                    break;
                    case 3: btn12.setIcon(new ImageIcon(this.getClass().getResource("corn.png")));
                    break;
                    case 4: btn12.setIcon(new ImageIcon(this.getClass().getResource("fish.png")));
                    break;
                    case 5: btn12.setIcon(new ImageIcon(this.getClass().getResource("milk.png")));
                    break;
                    case 6: btn12.setIcon(new ImageIcon(this.getClass().getResource("orange.png")));
                    break;
                    case 7: btn12.setIcon(new ImageIcon(this.getClass().getResource("pineapple.png")));
                    break;
                    case 8: btn12.setIcon(new ImageIcon(this.getClass().getResource("watermelon.png")));
                    break;
    }
     if (cambio==1)
    {
        j1=cartas[12];
        posicion1=12;
        
    }
    else if (cambio==2)
    {
        j2=cartas[12];   
        posicion2=12;
        if(posicion1==12)
        {
            cambio=1;
        }
    }
    else if(cambio==3 && posicion1!=12 && posicion2!=12)
    {
        
        if(j1!=j2)
        {
            switch(posicion1)
            {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
                switch(posicion2)
                {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
            }
        else  if (j1==j2)
        {
            exit++;
            switch(posicion1)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            switch(posicion2)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            
        }
        cambio=1;
        j1=cartas[12];
        posicion1=12;
    }
     else
    {
        cambio=2;
    }
    if(exit==7)
     {
         System.exit(0);
     }
    System.out.print(exit);
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        m=cartas[13];
        cambio++;
    switch(m)
    {
    case 1: btn13.setIcon(new ImageIcon(this.getClass().getResource("apple.png")));
                    break;
                    case 2: btn13.setIcon(new ImageIcon(this.getClass().getResource("cereal.png")));
                    break;
                    case 3: btn13.setIcon(new ImageIcon(this.getClass().getResource("corn.png")));
                    break;
                    case 4: btn13.setIcon(new ImageIcon(this.getClass().getResource("fish.png")));
                    break;
                    case 5: btn13.setIcon(new ImageIcon(this.getClass().getResource("milk.png")));
                    break;
                    case 6: btn13.setIcon(new ImageIcon(this.getClass().getResource("orange.png")));
                    break;
                    case 7: btn13.setIcon(new ImageIcon(this.getClass().getResource("pineapple.png")));
                    break;
                    case 8: btn13.setIcon(new ImageIcon(this.getClass().getResource("watermelon.png")));
                    break;
    }
     if (cambio==1)
    {
        j1=cartas[13];
        posicion1=13;
        
    }
    else if (cambio==2)
    {
        j2=cartas[13];   
        posicion2=13;
        if(posicion1==13)
        {
            cambio=1;
        }
    }
    else if(cambio==3 && posicion1!=13 && posicion2!=13)
    {
        
        if(j1!=j2)
        {
            switch(posicion1)
            {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
                switch(posicion2)
                {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
            }
        else  if (j1==j2)
        {
            exit++;
            switch(posicion1)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            switch(posicion2)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            
        }
        cambio=1;
        j1=cartas[13];
        posicion1=13;
    }
     else
    {
        cambio=2;
    }
    if(exit==7)
     {
         System.exit(0);
     }
    System.out.print(exit);
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
     n=cartas[14];
     cambio++;
    switch(n)
    {
    case 1: btn14.setIcon(new ImageIcon(this.getClass().getResource("apple.png")));
                    break;
                    case 2: btn14.setIcon(new ImageIcon(this.getClass().getResource("cereal.png")));
                    break;
                    case 3: btn14.setIcon(new ImageIcon(this.getClass().getResource("corn.png")));
                    break;
                    case 4: btn14.setIcon(new ImageIcon(this.getClass().getResource("fish.png")));
                    break;
                    case 5: btn14.setIcon(new ImageIcon(this.getClass().getResource("milk.png")));
                    break;
                    case 6: btn14.setIcon(new ImageIcon(this.getClass().getResource("orange.png")));
                    break;
                    case 7: btn14.setIcon(new ImageIcon(this.getClass().getResource("pineapple.png")));
                    break;
                    case 8: btn14.setIcon(new ImageIcon(this.getClass().getResource("watermelon.png")));
                    break;
    }
     if (cambio==1)
    {
        j1=cartas[14];
        posicion1=14;
        
    }
    else if (cambio==2)
    {
        j2=cartas[14];   
        posicion2=14;
        if(posicion1==14)
        {
            cambio=1;
        }
    }
    else if(cambio==3 && posicion1!=14 && posicion2!=14)
    {
        
        if(j1!=j2)
        {
            switch(posicion1)
            {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
                switch(posicion2)
                {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
            }
        else  if (j1==j2)
        {
            exit++;
            switch(posicion1)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            switch(posicion2)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            
        }
        cambio=1;
        j1=cartas[14];
        posicion1=14;
    }
     else
    {
        cambio=2;
    }
    if(exit==7)
     {
         System.exit(0);
     }
    System.out.print(exit);
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
    o=cartas[15];
    cambio++;
    switch(o)
    {
    case 1: btn15.setIcon(new ImageIcon(this.getClass().getResource("apple.png")));
                    break;
                    case 2: btn15.setIcon(new ImageIcon(this.getClass().getResource("cereal.png")));
                    break;
                    case 3: btn15.setIcon(new ImageIcon(this.getClass().getResource("corn.png")));
                    break;
                    case 4: btn15.setIcon(new ImageIcon(this.getClass().getResource("fish.png")));
                    break;
                    case 5: btn15.setIcon(new ImageIcon(this.getClass().getResource("milk.png")));
                    break;
                    case 6: btn15.setIcon(new ImageIcon(this.getClass().getResource("orange.png")));
                    break;
                    case 7: btn15.setIcon(new ImageIcon(this.getClass().getResource("pineapple.png")));
                    break;
                    case 8: btn15.setIcon(new ImageIcon(this.getClass().getResource("watermelon.png")));
                    break;
    }
     if (cambio==1)
    {
        j1=cartas[15];
        posicion1=15;
        
    }
    else if (cambio==2)
    {
        j2=cartas[15];   
        posicion2=15;
        if(posicion1==15)
        {
            cambio=1;
        }
    }
    else if(cambio==3 && posicion1!=15 && posicion2!=15)
    {
        
        if(j1!=j2)
        {
            switch(posicion1)
            {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
                switch(posicion2)
                {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
            }
        else  if (j1==j2)
        {
            exit++;
            switch(posicion1)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            switch(posicion2)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            
        }
        cambio=1;
        j1=cartas[15];
        posicion1=15;
    }
    else
    {
        cambio=2;
    }
    if(exit==7)
     {
         System.exit(0);
     }
    System.out.print(exit);
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
      p=cartas[16];
      cambio++;
    switch(p)
   {
    case 1: btn16.setIcon(new ImageIcon(this.getClass().getResource("apple.png")));
                    break;
                    case 2: btn16.setIcon(new ImageIcon(this.getClass().getResource("cereal.png")));
                    break;
                    case 3: btn16.setIcon(new ImageIcon(this.getClass().getResource("corn.png")));
                    break;
                    case 4: btn16.setIcon(new ImageIcon(this.getClass().getResource("fish.png")));
                    break;
                    case 5: btn16.setIcon(new ImageIcon(this.getClass().getResource("milk.png")));
                    break;
                    case 6: btn16.setIcon(new ImageIcon(this.getClass().getResource("orange.png")));
                    break;
                    case 7: btn16.setIcon(new ImageIcon(this.getClass().getResource("pineapple.png")));
                    break;
                    case 8: btn16.setIcon(new ImageIcon(this.getClass().getResource("watermelon.png")));
                    break;
    }
     if (cambio==1)
    {
        j1=cartas[16];
        posicion1=16;
        
    }
    else if (cambio==2)
    {
        j2=cartas[16];   
        posicion2=16;
        if(posicion1==16)
        {
            cambio=1;
        }
    }
    else if(cambio==3 && posicion1!=16 && posicion2!=16)
    {
        
        if(j1!=j2)
        {
            switch(posicion1)
            {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
                switch(posicion2)
                {
                    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 2: btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 3: btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 4: btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 5: btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 6: btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 7: btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 8: btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 9: btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 10: btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 11: btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 12: btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 13: btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 14: btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 15: btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    case 16: btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
                    break;
                    
                }
            }
        else  if (j1==j2)
        {
            exit++;
            switch(posicion1)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            switch(posicion2)
            {
                    case 1: btn1.setEnabled(false);
                    break;
                    case 2: btn2.setEnabled(false); 
                    break;
                    case 3: btn3.setEnabled(false);
                    break;
                    case 4: btn4.setEnabled(false);
                    break;
                    case 5: btn5.setEnabled(false);
                    break;
                    case 6: btn6.setEnabled(false);
                    break;
                    case 7: btn7.setEnabled(false);
                    break;
                    case 8: btn8.setEnabled(false);
                    break;
                    case 9: btn9.setEnabled(false);
                    break;
                    case 10: btn10.setEnabled(false);
                    break;
                    case 11: btn11.setEnabled(false);
                    break;
                    case 12: btn12.setEnabled(false);
                    break;
                    case 13: btn13.setEnabled(false);
                    break;
                    case 14: btn14.setEnabled(false);
                    break;
                    case 15: btn15.setEnabled(false);
                    break;
                    case 16: btn16.setEnabled(false);
                    break;
                    
            }
            
        }
        cambio=1;
        j1=cartas[16];
        posicion1=16;
    }
    else
    {
        cambio=2;
    }
     if(exit==17)
     {
         System.exit(0);
     }
     System.out.print(exit);
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
       
       btn16.setIcon(new ImageIcon(this.getClass().getResource("inicio.png ")));
       btn1.setIcon(new ImageIcon(this.getClass().getResource("inicio.png ")));
       btn14.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
       btn10.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
       btn12.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
       btn9.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
       btn13.setIcon(new ImageIcon(this.getClass().getResource("inicio.png ")));
       btn11.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
       btn4.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
       btn2.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
       btn5.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
       btn3.setIcon(new ImageIcon(this.getClass().getResource("inicio.png ")));
       btn7.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
       btn8.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
       btn6.setIcon(new ImageIcon(this.getClass().getResource("inicio.png ")));
       btn15.setIcon(new ImageIcon(this.getClass().getResource("inicio.png")));
       btn1.setEnabled(true);
       btn2.setEnabled(true);
       btn3.setEnabled(true);
       btn4.setEnabled(true);
       btn5.setEnabled(true);
       btn6.setEnabled(true);
       btn7.setEnabled(true);
       btn8.setEnabled(true);
       btn9.setEnabled(true);
       btn10.setEnabled(true);
       btn11.setEnabled(true);
       btn12.setEnabled(true);
       btn13.setEnabled(true);
       btn14.setEnabled(true);
       btn15.setEnabled(true);
       btn16.setEnabled(true);
       cambio=0;
       posicion1=0;
       posicion2=0;
       j1=0;
       for (j2=0;j2<=16;j2++)
       {
           cartas[j2]=0;
       }
       j2=0;
       posicion=0;
       aleatorio=0;
       contador=0;
       exit=0;
      cartas[1]=(int)(Math.random()*8+1);
        while(posicion <=16){
            aleatorio =(int)(Math.random()*8+1);
            for(int anterior=1;anterior<=posicion;anterior++)
            {
                    if(cartas[anterior]==aleatorio){
                        contador++;
                    }
            }
                if(contador<2){
                    cartas[posicion]=aleatorio;
                    posicion++;
                }
                contador=0;
        }
        
        for(int posicion=1;posicion<=16;posicion++){
            System.out.printf("%d  ",cartas[posicion]);
        }
       
               
    }//GEN-LAST:event_btn17ActionPerformed




















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
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Memorama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    // End of variables declaration//GEN-END:variables
}
