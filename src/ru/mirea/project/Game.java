package ru.mirea.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Timer;

import static java.lang.System.nanoTime;

public class Game extends JPanel{
    JPanel cards, ui;
    CardLayout cardLayout;
    boolean isRunning = false;
    static ArrayList<Bullet> bullets = new ArrayList<>();
    private ArrayList<Attack> attacks = new ArrayList<>();
    long then;
    JButton menu;
    Foe foe;
    Player player;
    int score = 0;
    Timer timer;
    Timer attackTimer = new Timer();
    enum ATTACKTYPE {SIN, COS, TAN, SPIRAL, CROSS, SPEAR};
    HashMap<Integer, ATTACKTYPE> attackMap = new HashMap<>(){{
        int i = 1;
       for (ATTACKTYPE type : ATTACKTYPE.values()) {
           put(i++, type);
       }
    }};
    String playerName;

    KeyListener control = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_SHIFT){
                player.setSpeed(5);
            }
            if(e.getKeyCode() == KeyEvent.VK_LEFT && withinBorders(player.getCenterX() - player.getSpeed(), player.getCenterY())){
                player.move(-1*player.getSpeed(), 0);
            }
            if(e.getKeyCode() == KeyEvent.VK_RIGHT && withinBorders(player.getCenterX() + player.getSpeed(), player.getCenterY())){
                player.move(player.getSpeed(), 0);
            }
            if(e.getKeyCode() == KeyEvent.VK_UP && withinBorders(player.getCenterX(), player.getCenterY() - player.getSpeed())){
                player.move(0, -1*player.getSpeed());
            }
            if(e.getKeyCode() == KeyEvent.VK_DOWN && withinBorders(player.getCenterX(), player.getCenterY() + player.getSpeed())){
                player.move(0, player.getSpeed());
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_SHIFT){
                player.setSpeed(10);
            };
        }
    };

    boolean withinBorders(int x, int y){
        return x > 0 && x < 1000 && y > 50 && y < 1000;
    }

    Game(JFrame fr, CardLayout cardLayout, JPanel cards, JPanel ui, JButton menu){
        this.ui = ui;
        this.cardLayout = cardLayout;
        this.cards = cards;
        this.menu = menu;
        fr.addKeyListener(control);
        fr.setFocusable(true);
        setLayout(new GridBagLayout());
        setBackground(new Color(45/2, 40/2, 60/2));
    }

    public boolean isColliding(Bullet bullet){
        return bullet.getX() < foe.getX1() && bullet.getY() < foe.getY1() && bullet.getX() > foe.getX0() && bullet.getY() > foe.getY0();
    }

    private boolean isColliding(Attack attack) {
        return attack.getX() < player.getX1() && attack.getY() < player.getY1() && attack.getX() > player.getX0() && attack.getY() > player.getY0();
    }

    public void begin(Main.LEVEL level, String playerName){
        attacks.removeAll(attacks);
        bullets.removeAll(bullets);
        this.playerName = playerName;
        isRunning = true;
        then = nanoTime();
        foe = new Foe(468, 200);
        player = new Player(500, 800, 3);
        score = 0;
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (isRunning){
                    bullets.removeIf(el -> !withinBorders(el.getX(), el.getY()) || isColliding(el));
                    attacks.removeIf(el -> !withinBorders(el.getX(), el.getY()) || isColliding(el));
                }
                else{
                    timer.cancel();
                }
                repaint();
            }
        }, 100, 20);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if (isRunning){
            Graphics2D g2d = (Graphics2D)g.create();
            g2d.drawImage(player.getImage() ,player.getX0(), player.getY0(), this);
            bullets.add(new Bullet(player.getCenterX(), player.getY0()));
            g2d.drawImage(foe.getImage() , foe.getX0(), foe.getY0(), this);
            g2d.setColor(Color.decode("#ff5d00"));
            g2d.fillRect(0, 8, foe.getHp(), 8);
            if (System.nanoTime()  - then > 1e+9){
                for (int i = 0; i <12; i++){
                    attacks.add(new Attack(foe.getCenterX(), foe.getCenterY(), attackMap.get((int)(Math.random()*6)), (double)i*360/12));
                }
                then = System.nanoTime();
            }
            for (Bullet bullet : bullets){
                bullet.move();
                if (isColliding(bullet)){
                    foe.takeDamage(1);
                    score += 5;
                }
                g2d.drawImage(bullet.getImage() , bullet.getX(), bullet.getY(), this);
            }
            for (Attack attack : attacks){
                attack.move();
                if (isColliding(attack)){
                    player.takeDamage();
                }
                g2d.drawImage(attack.getImage() , attack.getX(), attack.getY(), this);
            }
            g2d.dispose();
            if (player.getHp() == 0){
                g.dispose();
                gameOver();
            }
            if (foe.getHp() == 0){
                g.dispose();
                victory();
            }
        }
    }

    public void gameOver(){
        timer.cancel();
        isRunning = false;
        cardLayout.show(cards, "UI");
        ui.add(new JLabel("GAME OVER"));
        ui.add(new Label("SCORE: " + score));
        ui.add(menu);
    }

    public void victory(){
        timer.cancel();
        isRunning = false;
        cardLayout.show(cards, "UI");
        ui.add(new JLabel("CONGRATULATIONS"));
        ui.add(new Label("SCORE: " + score));
        ui.add(menu);
    }

    public Dimension getPreferredSize() {
        return new Dimension(1000, 1000);
    }
}
