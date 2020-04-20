package space;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Space extends JFrame implements ActionListener {

    int px = 190, py = 23, dir, ty = -10, tx, tm, score, hiscore;
    boolean start = false, disparo = false, face, down = false, eneDir = true;
    int invx[][] = new int[6][6];
    int invy[][] = new int[6][6];
    boolean invHit[][] = null;
    Timer timer;
    Font bigfont = new Font("digiface", Font.BOLD, 100);

    URL Passo = Space.class.getResource("passo.wav");
    URL Hit = Space.class.getResource("hit.wav");
    URL Tiros = Space.class.getResource("tiro.wav");

    AudioClip passo = Applet.newAudioClip(Passo);
    AudioClip hit = Applet.newAudioClip(Hit);
    AudioClip tiros = Applet.newAudioClip(Tiros);

    ImageIcon Nave = new ImageIcon(getClass().getResource("nave.png"));
    ImageIcon Tiro = new ImageIcon(getClass().getResource("tiro.png"));
    ImageIcon Fundo = new ImageIcon(getClass().getResource("fundo.png"));
    ImageIcon invader[][][] = new ImageIcon[2][6][6];

    JLabel nave = new JLabel(Nave);
    JLabel tiro = new JLabel(Tiro);
    JLabel fundo = new JLabel(Fundo);
    JLabel[][] enemy = new JLabel[6][6];
    JLabel hscore = new JLabel(" re");
    JLabel nscore = new JLabel("*      ");
    JLabel pontos = new JLabel("  1UP ");
    JLabel npntos = new JLabel("*");

    public Space() {
        setTitle("      Space Invaders    JAVA");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1024, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        hscore.setBounds(760, 5, 280, 150);
        nscore.setBounds(850, 70, 280, 150);
        pontos.setBounds(780, 170, 280, 150);
        npntos.setBounds(850, 270, 280, 150);
        hscore.setFont(bigfont);
        nscore.setFont(bigfont);
        pontos.setFont(bigfont);
        npntos.setFont(bigfont);
        add(hscore);
        add(nscore);
        add(pontos);
        add(npntos);
        add(nave);
        add(tiro);
        nave.setBounds(px * 24, 580, 60, 60);
        for (int i = 0; i < 6; ++i) {
            for (int j = 0; j < 6; ++j) {
                invx[j][i] = 130 + i * 102;
                invy[j][i] = 80 + j * 58;
                switch (j) {
                    case 0:
                        invader[0][j][i] = new ImageIcon(getClass().getResource("invasor1.png"));
                        invader[1][j][i] = new ImageIcon(getClass().getResource("invasor1b.png"));
                        break;
                    case 1:
                        invader[0][j][i] = new ImageIcon(getClass().getResource("invasor2.png"));
                        invader[1][j][i] = new ImageIcon(getClass().getResource("invasor2b.png"));
                        break;
                    case 2:
                        invader[0][j][i] = new ImageIcon(getClass().getResource("invasor3.png"));
                        invader[1][j][i] = new ImageIcon(getClass().getResource("invasor3b.png"));
                        break;
                    case 3:
                        invader[0][j][i] = new ImageIcon(getClass().getResource("invasor4.png"));
                        invader[1][j][i] = new ImageIcon(getClass().getResource("invasor4b.png"));
                        break;
                    case 4:
                        invader[0][j][i] = new ImageIcon(getClass().getResource("invasor5.png"));
                        invader[1][j][i] = new ImageIcon(getClass().getResource("invasor5b.png"));
                        break;
                    case 5:
                        invader[0][j][i] = new ImageIcon(getClass().getResource("invasor6.png"));
                        invader[1][j][i] = new ImageIcon(getClass().getResource("invasor6b.png"));
                        break;
                }
                enemy[j][i] = new JLabel(invader[0][j][i]);
                enemy[j][i].setBounds(invx[j][i], invy[j][i], 50, 50);
                add(enemy[j][i]);
            }
        }
        add(fundo);
        fundo.setBounds(0, 0, 1024, 700);
        timer = new Timer(50, this);
        timer.start();
        
    }

    public void Jogo() {
    
        //npntos.setText(Integer.toString(score));
        if (score > hiscore) {
            hiscore = score;
            nscore.setText(Integer.toString(hiscore));
        };
        if (dir == 1 && px < 750) {
            px += 10;
        }
        if (dir == 2 && px > 190) {
            px -= 10;
        }
        if (disparo) {
            ty -= 20;
        }
        if (ty <= 50) {
            ty = -10;
        }
        if (tm > 10) {
            passo.play();
            tm = 0;
            face = !face;

            if (eneDir) {
                for (int i = 5; i >= 0; --i) {
                    for (int j = 5; j >= 0; --j) {
                        //Limite dos inimigos    
                        invx[j][i] += 10;
                        if (down) {
                            invy[j][i] += 30;
                        }

                        if (invx[j][i] >= 840 && !down) {
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

                        //Limite dos inimigos             
                        if (down) {
                            invy[j][i] += 30;
                        }
                        invx[j][i] -= 10;
                        if (invx[j][i] <= 100 && !down) {
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
        for (int i = 0; i < 6; ++i) {
            for (int j = 0; j < 6; ++j) {
                // colicindo com o tiro da nave
                if (tx >= invx[j][i] && tx < invx[j][i] + 50 && ty >= invy[j][i] && ty < invy[j][i] + 50) {
                    score += 10;
                    invy[j][i] = 1000;
                    ty = -10;
                    enemy[j][i].setBounds(invx[j][i], invy[j][i], 50, 50);
                    hit.play();
                }
            }
        }

        tiro.setBounds(tx, ty, 7, 10);
        nave.setBounds(px, 580, 50, 50);
        addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                if (ty < 50) {
                    ty = 580;
                    tx = px + 25;
                    disparo = true;
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                start = true;
                if (e.getKeyCode() == 39) {
                    dir = 1;
                }
                if (e.getKeyCode() == 37) {
                    dir = 2;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                dir = 0;
            }
        });
    }

    public static void main(String[] args) {
        Space splay = new Space();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Jogo();
    }
}
