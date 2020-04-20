package space;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Space extends JFrame implements ActionListener {

    int px = 190, py = 584, dir, ty = -10, tx, t1y, t1x = -10, t2y, t2x = -10, tm, score, hits, passos = 50, discox = 3000, out = 2000, rnd;
    boolean start = false, disparo = false, face, down = false, eneDir = true, barreiras = true, gover = false, t1r = false, t2r = false;
    int invx[][] = new int[6][6];
    int invy[][] = new int[6][6];
    int barry[][][] = new int[3][6][8];
    int barrx[][][] = new int[3][6][8];
    Timer timer;
    Color p0 = new Color(0, 128, 0);
    Color p1 = new Color(180, 128, 0);
    Font bigfont = new Font("Space Invaders", Font.BOLD, 40);


    ImageIcon Nave = new ImageIcon(getClass().getResource("tank.png"));
    ImageIcon Nave1 = new ImageIcon(getClass().getResource("nave1.png"));
    ImageIcon Disco = new ImageIcon(getClass().getResource("disco.png"));
    ImageIcon Tiro = new ImageIcon(getClass().getResource("tiro.png"));
    ImageIcon Fondo = new ImageIcon(getClass().getResource("fondo.jpg"));
    ImageIcon barra[][][] = new ImageIcon[3][6][8];
    ImageIcon invader[][][] = new ImageIcon[2][6][6];

    JLabel nave = new JLabel(Nave);
    JLabel disco = new JLabel(Disco);
    JLabel tiro = new JLabel(Tiro);
    JLabel tiro1 = new JLabel(Tiro);
    JLabel tiro2 = new JLabel(Tiro);

    JLabel fondo = new JLabel(Fondo);
    JLabel enemy[][] = new JLabel[6][6];
    JLabel barr[][][] = new JLabel[3][6][8];
    JLabel pontos_0 = new JLabel("0 0 0 0");


    public void components() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1024, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        pontos_0.setBounds(100, 15, 360, 50);
        pontos_0.setForeground(p0);

        pontos_0.setFont(bigfont);
    
        add(pontos_0);
     
        add(nave);
        add(disco);
        add(tiro);
        add(tiro1);
        add(tiro2);
        nave.setBounds(px * 24, 590, 60, 60);
        disco.setBounds(100, 10, 60, 60);
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 8; ++j) {
                for (int k = 0; k < 6; ++k) {
                    barrx[i][k][j] = 266 + j * 6 + i * 204;
                    barry[i][k][j] = 502 + k * 10;
                    barra[i][k][j] = new ImageIcon(getClass().getResource("barra.png"));
                    barr[i][k][j] = new JLabel(barra[i][k][j]);
                    barry[i][0][0] = out;
                    barry[i][0][1] = out;
                    barry[i][0][6] = out;
                    barry[i][0][7] = out;
                    barry[i][1][0] = out;
                    barry[i][1][7] = out;
                    barry[i][2][0] = out;
                    barry[i][2][7] = out;
                    barry[i][5][1] = out;
                    barry[i][5][2] = out;
                    barry[i][5][3] = out;
                    barry[i][5][4] = out;
                    barry[i][5][5] = out;
                    barry[i][5][6] = out;
                    barr[i][k][j].setBounds(barrx[i][k][j], barry[i][k][j], 6, 10);
                    add(barr[i][k][j]);
                }
            }
        }
        for (int i = 0; i < 6; ++i) {
            for (int j = 0; j < 6; ++j) {
                invx[j][i] = 130 + i * 102;
                invy[j][i] = 80 + j * 58;
                switch (j) {
                    case 0:
                        invader[0][j][i] = new ImageIcon(getClass().getResource("invaders1a.png"));
                        invader[1][j][i] = new ImageIcon(getClass().getResource("invaders1b.png"));
                        break;
                    case 1:
                        invader[0][j][i] = new ImageIcon(getClass().getResource("invaders2a.png"));
                        invader[1][j][i] = new ImageIcon(getClass().getResource("invaders2b.png"));
                        break;
                    case 2:
                        invader[0][j][i] = new ImageIcon(getClass().getResource("invaders3a.png"));
                        invader[1][j][i] = new ImageIcon(getClass().getResource("invaders3b.png"));
                        break;                    
                }
                enemy[j][i] = new JLabel(invader[0][j][i]);
                enemy[j][i].setBounds(invx[j][i], invy[j][i], 50, 50);
                add(enemy[j][i]);
            }
        }
        add(fondo);
        fondo.setBounds(0, 0, 1024, 700);
        timer = new Timer(9, this);
        timer.start();
    }

    public void Juego() {              
        if ((t1x >= px && t1x < px + 50 && t1y >= py && t1y < py + 50) || (t1x >= px && t1x < px + 50 && t1y >= py && t1y < py + 50)) {
            
            nave.setIcon(Nave1);
            timer.stop();
        }
        rnd = (int) (Math.random() * 56);
        if (t1y < 620) {
            t1y += 2;
        }
        if (t1y >= 620) {
            t1r = false;
            t1y = out;
        }
        if (t2y < 620) {
            t2y += 2;
        }
        if (t2y >= 620) {
            t2r = false;
            t2y = out;
        }

        if (discox == 1100) {
           
            pontos_0.setBounds(100, out, 240, 50);

        }
        if (discox < - 20) {
            discox = 4000;
            
            pontos_0.setBounds(100, 15, 360, 50);
  
        }
        discox--;
        disco.setBounds(discox, 10, 60, 60);
        switch (hits) {
            case 15:
                passos = 30;
                break;
            case 29:
                passos = 10;
                break;
            case 32:
                passos = 4;
                break;
            case 33:
                passos = 2;
                break;
            case 35:
                passos = 0;
                break;
            case 36:
                timer.stop();
                break;
            default:
                break;
        }
        String s = Integer.toString(score);
        s = s.replaceAll("(.)", "$1 ");
        if (score < 100 && score > 9) {
            pontos_0.setText("0 0 " + s);
        } else if (score < 1000 && score > 99) {
            pontos_0.setText("0 " + s);
        } else if (score > 9999) {
            pontos_0.setText(s);
        }

        if (dir == 1 && px < 750) {
            px += 2;
        }
        if (dir == 2 && px > 190) {
            px -= 2;
        }
        if (disparo) {
            ty -= 4;
        }

        if (ty <= 55 && discox > 1100) {
            ty = -20;
        } else if (ty < 10) {
            ty = -20;
        }

        if (tm > passos) {
            
            tm = 0;
            face = !face;
            if (eneDir) {
                for (int i = 5; i >= 0; --i) {
                    for (int j = 5; j >= 0; --j) {
                          
                        invx[j][i] += 10;
                        if (down) {
                            invy[j][i] += 30;
                        }
                        if (invx[j][i] >= 840 && invy[j][i] < out && !down) {
                            down = true;
                            invy[j][i] += 30;
                        }
                        enemy[j][i].setBounds(invx[j][i], invy[j][i], 50, 50);
                        if (face) {
                            enemy[j][i].setIcon(invader[0][j][i]);
                        } else {
                            enemy[j][i].setIcon(invader[1][j][i]);
                        }
                    }
                }
            } else {
                for (int i = 0; i < 6; ++i) {
                    for (int j = 0; j < 6; ++j) {
                                   
                        if (down) {
                            invy[j][i] += 30;
                        }
                        invx[j][i] -= 10;
                        if (invx[j][i] <= 100 && invy[j][i] < 2000 && !down) {
                            down = true;
                            invy[j][i] += 30;
                        }
                        enemy[j][i].setBounds(invx[j][i], invy[j][i], 50, 50);
                        if (face) {
                            enemy[j][i].setIcon(invader[0][j][i]);
                        } else {
                            enemy[j][i].setIcon(invader[1][j][i]);
                        }
                    }
                }
            }
            if (down) {
                eneDir = !eneDir;
                down = false;
            }

        } else {
            tm++;
        }
        for (int i = 2; i >= 0; --i) {
            for (int j = 7; j >= 0; --j) {
                for (int k = 5; k >= 0; --k) {
                    
                    if (i == 0 && j < 6) {
                        if (!t2r && invy[k][j] < out && rnd == k * j) {
                            t2y = invy[k][j] + 22;
                            t2x = invx[k][j] + 40;
                            t2r = true;
                        }
                        if (px >= invx[k][j] && px < invx[k][j] + 50 && invy[k][j] < out && !t1r) {
                            t1x = invx[k][j] + 22;
                            t1y = invy[k][j] + 40;
                            t1r = true;
                        }
                        if (tx >= invx[k][j] && tx < invx[k][j] + 50 && ty >= invy[k][j] && ty < invy[k][j] + 50) {
                            score += 10;
                            invy[k][j] = out;
                            ty = -20;
                            enemy[k][j].setBounds(invx[k][j], invy[k][j], 50, 50);
                            
                            hits++;
                        }
                        if (invy[k][j] < out) {
                            if (invy[k][j] > 530) {
                                gover = true;
                            }
                            if (invy[k][j] > 450) {
                                barreiras = false;
                            }
                        }
                    }
                    

                    if (t1x - 1 >= barrx[i][k][j] && t1x < barrx[i][k][j] + 8 && t1y >= barry[i][k][j] && t1y < barry[i][k][j] + 25) {
                        barry[i][k][j] = out;
                        t1y = out;
                        barr[i][k][j].setBounds(barrx[i][k][j], barry[i][k][j], 8, 10);
                    }
                    if (t2x - 1 >= barrx[i][k][j] && t2x < barrx[i][k][j] + 8 && t2y >= barry[i][k][j] && t2y < barry[i][k][j] + 25) {
                        barry[i][k][j] = out;
                        t2y = out;
                        barr[i][k][j].setBounds(barrx[i][k][j], barry[i][k][j], 8, 10);
                    }
                    if (tx - 1 >= barrx[i][k][j] && tx < barrx[i][k][j] + 8 && ty >= barry[i][k][j] && ty < barry[i][k][j] + 25) {
                        barry[i][k][j] = out;
                        ty = -20;
                        barr[i][k][j].setBounds(barrx[i][k][j], barry[i][k][j], 8, 10);
                    }
                }
            }
        }
        if (tx >= discox && tx < discox + 60 && ty <= 50 && ty > 1) {
            score += 300;
            discox = -40;
            ty = -20;
          
        }
        if (gover) {
            for (int i = 0; i < 6; ++i) {
                for (int j = 0; j < 6; ++j) {
                    if (invy[j][i] < out) {
                        invy[j][i] += 28;
                        enemy[j][i].setBounds(invx[j][i], invy[j][i], 50, 50);
                    }
                }
            }
            nave.setBounds(px * 24, out, 60, 60);
            
            timer.stop();
        }
        if (!barreiras) {
            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 8; ++j) {
                    for (int k = 0; k < 6; ++k) {
                        barry[i][k][j] = out;
                        barr[i][k][j].setBounds(barrx[i][k][j], barry[i][k][j], 8, 10);
                    }
                }
            }
            barreiras = true;
        }
        tiro1.setBounds(t1x, t1y, 5, 20);
        tiro2.setBounds(t2x, t2y, 5, 20);
        tiro.setBounds(tx, ty, 5, 20);
        nave.setBounds(px, py, 50, 50);
    }

    public void control() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e
            ) {
                if (ty < 50) {
                    ty = 580;
                    tx = px + 25;
                    
                    disparo = true;
                }
            }

            @Override
            public void keyPressed(KeyEvent e
            ) {
                start = true;
                if (e.getKeyCode() == 68) {
                    dir = 1;
                }
                if (e.getKeyCode() == 65d) {
                    dir = 2;
                }
            }

            @Override
            public void keyReleased(KeyEvent e
            ) {
                if (dir != 0) {
                    dir = 0;
                }
            }
        }
        );
    }

    public static void main(String[] args) {
        Space gerar = new Space();
        gerar.components();
        gerar.control();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Juego();

    }
}
